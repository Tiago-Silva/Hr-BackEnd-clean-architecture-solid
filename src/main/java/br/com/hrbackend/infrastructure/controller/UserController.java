package br.com.hrbackend.infrastructure.controller;

import br.com.hrbackend.application.usecases.UserInteract;
import br.com.hrbackend.domain.entity.Usuario;
import br.com.hrbackend.infrastructure.dto.UsuarioRequestDTO;
import br.com.hrbackend.infrastructure.dto.UsuarioResponseDTO;
import br.com.hrbackend.infrastructure.mapper.EmpressMapper;
import br.com.hrbackend.infrastructure.mapper.UserMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserInteract userInteract;
    private final UserMapper mapper;
    private final EmpressMapper empressMapper;
    public UserController(UserInteract userInteract, UserMapper mapper, EmpressMapper empressMapper) {
        this.userInteract = userInteract;
        this.mapper = mapper;
        this.empressMapper = empressMapper;
    }

    @PostMapping
    public ResponseEntity<HttpStatus> createUser(@RequestBody UsuarioRequestDTO requestDTO) {
        Usuario usuario = this.mapper.requestDTOToDomainObject(requestDTO);
        this.userInteract.createUser(usuario);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<HttpStatus> updateUser(@RequestBody UsuarioResponseDTO responseDTO) {
        Usuario usuario = this.mapper.responseDTOToDomainObject(responseDTO);
        this.userInteract.updateUser(usuario);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<HttpStatus> deleteUser(@RequestBody UsuarioResponseDTO responseDTO) {
        Usuario usuario = this.mapper.responseDTOToDomainObject(responseDTO);
        this.userInteract.deleteUser(usuario);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/id/{idusuario}")
    public ResponseEntity<UsuarioResponseDTO> getUserById(@PathVariable("idusuario") int idusuario) {
        Usuario usuario = this.userInteract.getUserById(idusuario);
        return ResponseEntity.ok(
            this.mapper.domainObjectToResponseDTO(usuario, this.empressMapper.domainObjecToResponseDTO(usuario.getEmpresa()))
        );
    }
}
