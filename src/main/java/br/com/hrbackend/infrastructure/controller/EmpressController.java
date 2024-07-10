package br.com.hrbackend.infrastructure.controller;

import br.com.hrbackend.application.usecases.EmpressInteract;
import br.com.hrbackend.domain.entity.Empresa;
import br.com.hrbackend.infrastructure.dto.EmpresaRequestDTO;
import br.com.hrbackend.infrastructure.dto.EmpresaResponseDTO;
import br.com.hrbackend.infrastructure.mapper.EmpressMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empress")
public class EmpressController {

    private final EmpressInteract empressInteract;
    private final EmpressMapper mapper;
    public EmpressController(EmpressInteract empressInteract, EmpressMapper mapper) {
        this.empressInteract = empressInteract;
        this.mapper = mapper;
    }

    @PostMapping
    public ResponseEntity createEmpress(@RequestBody EmpresaRequestDTO requestDTO) {
        Empresa empresa = this.mapper.requestDTOToDomainObject(requestDTO);
        this.empressInteract.createEmpress(empresa);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity updateEmpress(@RequestBody EmpresaResponseDTO responseDTO) {
        Empresa empresa = this.mapper.responseDTOToDomainObject(responseDTO);
        this.empressInteract.updateEmpress(empresa);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity deleteEmpress(@RequestBody EmpresaResponseDTO responseDTO) {
        Empresa empresa = this.mapper.responseDTOToDomainObject(responseDTO);
        this.empressInteract.deleteEmpress(empresa);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<EmpresaResponseDTO>> getAllEmpress() {
        return ResponseEntity.ok(
            this.empressInteract.getAllEmpress().stream().map(this.mapper::domainObjecToResponseDTO).toList()
        );
    }

    @GetMapping("/id/{idempresa}")
    public ResponseEntity<EmpresaResponseDTO> getEmpressById(@PathVariable("idempresa") int idempresa) {
        return ResponseEntity.ok(
            this.mapper.domainObjecToResponseDTO(this.empressInteract.getEmpressById(idempresa))
        );
    }

    @GetMapping("/controllers")
    public ResponseEntity<List<EmpresaResponseDTO>> getEmpressController() {
        return ResponseEntity.ok(
                this.empressInteract.getEmpressController().stream().map(this.mapper::domainObjecToResponseDTO).toList()
        );
    }

    @GetMapping("/filiais")
    public ResponseEntity<List<EmpresaResponseDTO>> getFiliais() {
        return ResponseEntity.ok(
                this.empressInteract.getEmpressFilial().stream().map(this.mapper::domainObjecToResponseDTO).toList()
        );
    }
}
