package br.com.hrbackend.infrastructure.web.controller;

import br.com.hrbackend.application.usecases.Empress.*;
import br.com.hrbackend.domain.entity.Empress;
import br.com.hrbackend.infrastructure.web.dto.EmpresaRequestDTO;
import br.com.hrbackend.infrastructure.web.dto.EmpresaResponseDTO;
import br.com.hrbackend.infrastructure.core.mapper.EmpressMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empress")
public class EmpressController {

    private final CreateEmpressUseCase createEmpressUseCase;
    private final UpdateEmpressUseCase updateEmpressUseCase;
    private final DeleteEmpressUseCase deleteEmpressUseCase;
    private final GetEmpressByIdUseCase getEmpressByIdUseCase;
    private final GetBranchesByIdEmpressControllerUseCase getBranchesByIdEmpressControllerUseCase;
    private final EmpressMapper mapper;
    public EmpressController(CreateEmpressUseCase createEmpressUseCase, UpdateEmpressUseCase updateEmpressUseCase, DeleteEmpressUseCase deleteEmpressUseCase, GetEmpressByIdUseCase getEmpressByIdUseCase, GetBranchesByIdEmpressControllerUseCase getBranchesByIdEmpressControllerUseCase, EmpressMapper mapper) {
        this.createEmpressUseCase = createEmpressUseCase;
        this.updateEmpressUseCase = updateEmpressUseCase;
        this.deleteEmpressUseCase = deleteEmpressUseCase;
        this.getEmpressByIdUseCase = getEmpressByIdUseCase;
        this.getBranchesByIdEmpressControllerUseCase = getBranchesByIdEmpressControllerUseCase;
        this.mapper = mapper;
    }

    @PostMapping
    public ResponseEntity<HttpStatus> createEmpress(@RequestBody EmpresaRequestDTO requestDTO) {
        Empress empress = this.mapper.requestDTOToDomainObject(requestDTO);
        this.createEmpressUseCase.execute(empress);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<HttpStatus> updateEmpress(@RequestBody EmpresaResponseDTO responseDTO) {
        Empress empress = this.mapper.responseDTOToDomainObject(responseDTO);
        this.updateEmpressUseCase.execute(empress);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<HttpStatus> deleteEmpress(@RequestBody EmpresaResponseDTO responseDTO) {
        Empress empress = this.mapper.responseDTOToDomainObject(responseDTO);
        this.deleteEmpressUseCase.execute(empress);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/id/{idempresa}")
    public ResponseEntity<EmpresaResponseDTO> getEmpressById(@PathVariable("idempresa") int idempresa) {
        return ResponseEntity.ok(
            this.mapper.domainObjecToResponseDTO(this.getEmpressByIdUseCase.execute(idempresa))
        );
    }

    @GetMapping("/filiais/{idempress}")
    public ResponseEntity<List<EmpresaResponseDTO>> getFiliais(@PathVariable("idempress") int idempress) {
        return ResponseEntity.ok(
                this.getBranchesByIdEmpressControllerUseCase.execute(idempress).stream().map(this.mapper::domainObjecToResponseDTO).toList()
        );
    }
}
