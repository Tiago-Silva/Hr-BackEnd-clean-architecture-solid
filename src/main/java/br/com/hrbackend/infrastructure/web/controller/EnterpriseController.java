package br.com.hrbackend.infrastructure.web.controller;

import br.com.hrbackend.application.usecases.Enterprise.*;
import br.com.hrbackend.domain.entity.Enterprise;
import br.com.hrbackend.infrastructure.web.dto.EnterpriseRequestDTO;
import br.com.hrbackend.infrastructure.web.dto.EnterpriseResponseDTO;
import br.com.hrbackend.infrastructure.core.mapper.EnterpriseMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enterprise")
public class EnterpriseController {

    private final CreateEnterpriseUseCase createEnterpriseUseCase;
    private final UpdateEnterpriseUseCase updateEnterpriseUseCase;
    private final DeleteEnterpriseUseCase deleteEnterpriseUseCase;
    private final GetEnterpriseByIdUseCase getEnterpriseByIdUseCase;
    private final GetBranchesByIdEnterpriseControllerUseCase getBranchesByIdEnterpriseControllerUseCase;
    private final EnterpriseMapper mapper;
    public EnterpriseController(
            CreateEnterpriseUseCase createEnterpriseUseCase,
            UpdateEnterpriseUseCase updateEnterpriseUseCase,
            DeleteEnterpriseUseCase deleteEnterpriseUseCase,
            GetEnterpriseByIdUseCase getEnterpriseByIdUseCase,
            GetBranchesByIdEnterpriseControllerUseCase getBranchesByIdEnterpriseControllerUseCase,
            EnterpriseMapper mapper
    ) {
        this.createEnterpriseUseCase = createEnterpriseUseCase;
        this.updateEnterpriseUseCase = updateEnterpriseUseCase;
        this.deleteEnterpriseUseCase = deleteEnterpriseUseCase;
        this.getEnterpriseByIdUseCase = getEnterpriseByIdUseCase;
        this.getBranchesByIdEnterpriseControllerUseCase = getBranchesByIdEnterpriseControllerUseCase;
        this.mapper = mapper;
    }

    @PostMapping
    public ResponseEntity<HttpStatus> createEnterprise(@RequestBody EnterpriseRequestDTO requestDTO) {
        Enterprise enterprise = this.mapper.requestDTOToDomainObject(requestDTO);
        this.createEnterpriseUseCase.execute(enterprise);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<HttpStatus> updateEnterprise(@RequestBody EnterpriseResponseDTO responseDTO) {
        Enterprise enterprise = this.mapper.responseDTOToDomainObject(responseDTO);
        this.updateEnterpriseUseCase.execute(enterprise);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<HttpStatus> deleteEnterprise(@RequestBody EnterpriseResponseDTO responseDTO) {
        Enterprise enterprise = this.mapper.responseDTOToDomainObject(responseDTO);
        this.deleteEnterpriseUseCase.execute(enterprise);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/id/{enterpriseId}")
    public ResponseEntity<EnterpriseResponseDTO> getEnterpriseById(@PathVariable("enterpriseId") int enterpriseId) {
        return ResponseEntity.ok(
            this.mapper.domainObjecToResponseDTO(this.getEnterpriseByIdUseCase.execute(enterpriseId))
        );
    }

    @GetMapping("/filiais/{branchId}")
    public ResponseEntity<List<EnterpriseResponseDTO>> getBranches(@PathVariable("branchId") int branchId) {
        return ResponseEntity.ok(
                this.getBranchesByIdEnterpriseControllerUseCase.execute(branchId).stream().map(this.mapper::domainObjecToResponseDTO).toList()
        );
    }
}
