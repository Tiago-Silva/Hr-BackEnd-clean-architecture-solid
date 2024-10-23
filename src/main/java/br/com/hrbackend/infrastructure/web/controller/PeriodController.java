package br.com.hrbackend.infrastructure.web.controller;

import br.com.hrbackend.application.usecases.Period.CreatePeriodUseCase;
import br.com.hrbackend.application.usecases.Period.DeletePeriodUseCase;
import br.com.hrbackend.application.usecases.Period.GetPeriodByIdUseCase;
import br.com.hrbackend.application.usecases.Period.UpdatePeriodUseCase;
import br.com.hrbackend.domain.entity.Period;
import br.com.hrbackend.infrastructure.web.dto.PeriodRequestDTO;
import br.com.hrbackend.infrastructure.web.dto.PeriodResponseDTO;
import br.com.hrbackend.infrastructure.core.mapper.EnterpriseMapper;
import br.com.hrbackend.infrastructure.core.mapper.PeriodMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/period")
public class PeriodController {

    private final CreatePeriodUseCase createPeriodUseCase;
    private final UpdatePeriodUseCase updatePeriodUseCase;
    private final DeletePeriodUseCase deletePeriodUseCase;
    private final GetPeriodByIdUseCase getPeriodByIdUseCase;
    private final PeriodMapper mapper;
    private final EnterpriseMapper enterpriseMapper;
    public PeriodController(CreatePeriodUseCase createPeriodUseCase, UpdatePeriodUseCase updatePeriodUseCase, DeletePeriodUseCase deletePeriodUseCase, GetPeriodByIdUseCase getPeriodByIdUseCase, PeriodMapper mapper, EnterpriseMapper empressMapper) {
        this.createPeriodUseCase = createPeriodUseCase;
        this.updatePeriodUseCase = updatePeriodUseCase;
        this.deletePeriodUseCase = deletePeriodUseCase;
        this.getPeriodByIdUseCase = getPeriodByIdUseCase;
        this.mapper = mapper;
        this.enterpriseMapper = empressMapper;
    }

    @PostMapping
    public ResponseEntity<HttpStatus> createPeriod(@RequestBody PeriodRequestDTO requestDTO) {
        Period periodo = this.mapper.requestDTOToDomainObject(requestDTO);
        this.createPeriodUseCase.execute(periodo);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<HttpStatus> updatePeriod(@RequestBody PeriodRequestDTO requestDTO) {
        Period periodo = this.mapper.requestDTOToDomainObject(requestDTO);
        this.updatePeriodUseCase.execute(periodo);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<HttpStatus> deletePeriod(@RequestBody PeriodRequestDTO requestDTO) {
        Period periodo = this.mapper.requestDTOToDomainObject(requestDTO);
        this.deletePeriodUseCase.execute(periodo);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/id/{idperiodo}")
    public ResponseEntity<PeriodResponseDTO> getPeriodById(@RequestParam("idperiodo") int idperiodo) {
        Period periodo = this.getPeriodByIdUseCase.execute(idperiodo);
        return ResponseEntity.ok(
            this.mapper.domainObjectToResponseDTO(periodo, this.enterpriseMapper.domainObjecToResponseDTO(periodo.getEnterprise()))
        );
    }
}
