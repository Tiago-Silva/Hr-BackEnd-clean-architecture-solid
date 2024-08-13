package br.com.hrbackend.infrastructure.controller;

import br.com.hrbackend.application.usecases.PeriodInteract;
import br.com.hrbackend.domain.entity.Periodo;
import br.com.hrbackend.infrastructure.dto.PeriodRequestDTO;
import br.com.hrbackend.infrastructure.dto.PeriodResponseDTO;
import br.com.hrbackend.infrastructure.mapper.EmpressMapper;
import br.com.hrbackend.infrastructure.mapper.PeriodMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/period")
public class PeriodController {

    private final PeriodInteract periodInteract;
    private final PeriodMapper mapper;
    private final EmpressMapper empressMapper;
    public PeriodController(PeriodInteract periodInteract, PeriodMapper mapper, EmpressMapper empressMapper) {
        this.periodInteract = periodInteract;
        this.mapper = mapper;
        this.empressMapper = empressMapper;
    }

    @PostMapping
    public ResponseEntity<HttpStatus> createPeriod(@RequestBody PeriodRequestDTO requestDTO) {
        Periodo periodo = this.mapper.requestDTOToDomainObject(requestDTO);
        this.periodInteract.createPeriod(periodo);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<HttpStatus> updatePeriod(@RequestBody PeriodRequestDTO requestDTO) {
        Periodo periodo = this.mapper.requestDTOToDomainObject(requestDTO);
        this.periodInteract.updatePeriod(periodo);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<HttpStatus> deletePeriod(@RequestBody PeriodRequestDTO requestDTO) {
        Periodo periodo = this.mapper.requestDTOToDomainObject(requestDTO);
        this.periodInteract.deletePeriod(periodo);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/id/{idperiodo}")
    public ResponseEntity<PeriodResponseDTO> getPeriodById(@RequestParam("idperiodo") int idperiodo) {
        Periodo periodo = this.periodInteract.getPeriodById(idperiodo);
        return ResponseEntity.ok(
            this.mapper.domainObjectToResponseDTO(periodo, this.empressMapper.domainObjecToResponseDTO(periodo.getEmpresa()))
        );
    }
}
