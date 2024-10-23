package br.com.hrbackend.domain.entity;

import br.com.hrbackend.infrastructure.data.entityDB.UsuarioDB;
import br.com.hrbackend.infrastructure.web.dto.UsuarioRequestDTO;
import br.com.hrbackend.infrastructure.web.dto.UsuarioResponseDTO;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private int userId;

    private String firstName;

    private String lastName;

    private String userName;

    private String password;

    private String token;

    private String image;

    private byte[] photo;

    private String type;

    private String role;

    private boolean accountNonExpired;

    private boolean accountNonLocked;

    private boolean credentialsNonExpired;

    private boolean enabled;

    private Enterprise enterprise;

    public User(UsuarioRequestDTO requestDTO) {
        this.firstName = requestDTO.nome();
        this.lastName = requestDTO.sobrenome();
        this.userName = requestDTO.login();
        this.password = requestDTO.senha();
        this.token = requestDTO.token();
        this.image = requestDTO.image();
        this.photo = requestDTO.foto();
        this.type = requestDTO.tipo();
        this.role = requestDTO.role();
        this.accountNonExpired = requestDTO.accountNonExpired();
        this.accountNonLocked = requestDTO.accountNonLocked();
        this.credentialsNonExpired = requestDTO.credentialsNonExpired();
        this.enabled = requestDTO.enabled();
        this.enterprise = Enterprise.withResponseDTO(requestDTO.empresa());
    }

    public User(UsuarioResponseDTO responseDTO) {
        this.userId = responseDTO.idusuario();
        this.firstName = responseDTO.nome();
        this.lastName = responseDTO.sobrenome();
        this.userName = responseDTO.login();
        this.password = responseDTO.senha();
        this.token = responseDTO.token();
        this.image = responseDTO.image();
        this.photo = responseDTO.foto();
        this.type = responseDTO.tipo();
        this.role = responseDTO.role();
        this.accountNonExpired = responseDTO.accountNonExpired();
        this.accountNonLocked = responseDTO.accountNonLocked();
        this.credentialsNonExpired = responseDTO.credentialsNonExpired();
        this.enabled = responseDTO.enabled();
        this.enterprise = Enterprise.withResponseDTO(responseDTO.empresa());
    }

    public User(UsuarioDB usuarioDB) {
        this.userId = usuarioDB.getIdusuario();
        this.firstName = usuarioDB.getNome();
        this.lastName = usuarioDB.getSobrenome();
        this.userName = usuarioDB.getLogin();
        this.password = usuarioDB.getSenha();
        this.token = usuarioDB.getToken();
        this.image = usuarioDB.getImage();
        this.photo = usuarioDB.getFoto();
        this.type = usuarioDB.getTipo();
        this.role = usuarioDB.getRole();
        this.accountNonExpired = usuarioDB.isAccountNonExpired();
        this.accountNonLocked = usuarioDB.isAccountNonLocked();
        this.credentialsNonExpired = usuarioDB.isCredentialsNonExpired();
        this.enabled = usuarioDB.isEnabled();
        this.enterprise = Enterprise.withEntityDB(usuarioDB.getEmpresa());
    }
}
