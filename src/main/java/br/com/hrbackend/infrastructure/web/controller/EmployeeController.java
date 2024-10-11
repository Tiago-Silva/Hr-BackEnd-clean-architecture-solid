package br.com.hrbackend.infrastructure.web.controller;

import br.com.hrbackend.application.usecases.Employee.CreateEmployeeUseCase;
import br.com.hrbackend.application.usecases.Employee.DeleteEmployeeUseCase;
import br.com.hrbackend.application.usecases.Employee.GetEmployeeByIdUseCase;
import br.com.hrbackend.application.usecases.Employee.UpdateEmployeeUseCase;
import br.com.hrbackend.domain.entity.Employee;
import br.com.hrbackend.infrastructure.core.mapper.EmployeeMapper;
import br.com.hrbackend.infrastructure.core.mapper.EmpressMapper;
import br.com.hrbackend.infrastructure.core.mapper.PeriodMapper;
import br.com.hrbackend.infrastructure.web.dto.EmployeeRequestDTO;
import br.com.hrbackend.infrastructure.web.dto.EmployeeResponseDTO;
import br.com.hrbackend.infrastructure.web.dto.EmpresaResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final CreateEmployeeUseCase createEmployeeUseCase;
    private final UpdateEmployeeUseCase updateEmployeeUseCase;
    private final DeleteEmployeeUseCase deleteEmployeeUseCase;
    private final GetEmployeeByIdUseCase getEmployeeByIdUseCase;
    private final EmployeeMapper mapper;
    private final EmpressMapper empressMapper;
    private final PeriodMapper periodMapper;
    public EmployeeController(CreateEmployeeUseCase createEmployeeUseCase, UpdateEmployeeUseCase updateEmployeeUseCase, DeleteEmployeeUseCase deleteEmployeeUseCase, GetEmployeeByIdUseCase getEmployeeByIdUseCase, EmployeeMapper mapper, EmpressMapper empressMapper, PeriodMapper periodMapper) {
        this.createEmployeeUseCase = createEmployeeUseCase;
        this.updateEmployeeUseCase = updateEmployeeUseCase;
        this.deleteEmployeeUseCase = deleteEmployeeUseCase;
        this.getEmployeeByIdUseCase = getEmployeeByIdUseCase;
        this.mapper = mapper;
        this.empressMapper = empressMapper;
        this.periodMapper = periodMapper;
    }

    @PostMapping
    public ResponseEntity<HttpStatus> createEmployee (@RequestBody EmployeeRequestDTO requestDTO) {
        Employee employee = this.mapper.requestDTOToDomainObject(requestDTO);
        this.createEmployeeUseCase.execute(employee);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<HttpStatus> updateEmployee (@RequestBody EmployeeResponseDTO responseDTO) {
        Employee employee = this.mapper.responseDTOToDomainObject(responseDTO);
        this.updateEmployeeUseCase.execute(employee);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<HttpStatus> deleteEmployee (@RequestBody EmployeeResponseDTO responseDTO) {
        Employee employee = this.mapper.responseDTOToDomainObject(responseDTO);
        this.deleteEmployeeUseCase.execute(employee);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/id/{employeeId}")
    public ResponseEntity<EmployeeResponseDTO> getEmployeeById (@PathVariable("employeeId") int employeeID) {
        Employee employee = this.getEmployeeByIdUseCase.execute(employeeID);
        EmpresaResponseDTO empresaResponseDTO = this.empressMapper.domainObjecToResponseDTO(employee.getEmpress());
        return ResponseEntity.ok(
                this.mapper.domainObjectToResponseDTO(
                        employee,
                        empresaResponseDTO,
                        this.periodMapper.domainObjectToResponseDTO(
                                employee.getPeriodo(),
                                empresaResponseDTO
                        )
                )
        );
    }
}
