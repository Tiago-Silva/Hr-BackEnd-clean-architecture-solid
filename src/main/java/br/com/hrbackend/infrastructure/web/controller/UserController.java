package br.com.hrbackend.infrastructure.web.controller;

import br.com.hrbackend.application.usecases.UserInteract;
import br.com.hrbackend.domain.entity.User;
import br.com.hrbackend.infrastructure.web.dto.UsuarioRequestDTO;
import br.com.hrbackend.infrastructure.web.dto.UsuarioResponseDTO;
import br.com.hrbackend.infrastructure.core.mapper.EnterpriseMapper;
import br.com.hrbackend.infrastructure.core.mapper.UserMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserInteract userInteract;
    private final UserMapper mapper;
    private final EnterpriseMapper enterpriseMapper;
    public UserController(UserInteract userInteract, UserMapper mapper, EnterpriseMapper enterpriseMapper) {
        this.userInteract = userInteract;
        this.mapper = mapper;
        this.enterpriseMapper = enterpriseMapper;
    }

    @PostMapping
    public ResponseEntity<HttpStatus> createUser(@RequestBody UsuarioRequestDTO requestDTO) {
        User usuario = this.mapper.requestDTOToDomainObject(requestDTO);
        this.userInteract.createUser(usuario);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<HttpStatus> updateUser(@RequestBody UsuarioResponseDTO responseDTO) {
        User usuario = this.mapper.responseDTOToDomainObject(responseDTO);
        this.userInteract.updateUser(usuario);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<HttpStatus> deleteUser(@RequestBody UsuarioResponseDTO responseDTO) {
        User usuario = this.mapper.responseDTOToDomainObject(responseDTO);
        this.userInteract.deleteUser(usuario);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/id/{idusuario}")
    public ResponseEntity<UsuarioResponseDTO> getUserById(@PathVariable("idusuario") int idusuario) {
        User usuario = this.userInteract.getUserById(idusuario);
        return ResponseEntity.ok(
            this.mapper.domainObjectToResponseDTO(usuario, this.enterpriseMapper.domainObjecToResponseDTO(usuario.getEnterprise()))
        );
    }
}
