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
@EqualsAndHashCode(of = "idusuario")
public class Usuario implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private int idusuario;

    private String nome;

    private String sobrenome;

    private String login;

    private String senha;

    private String token;

    private String image;

    private byte[] foto;

    private String tipo;

    private String role;

    private boolean accountNonExpired;

    private boolean accountNonLocked;

    private boolean credentialsNonExpired;

    private boolean enabled;

    private Empress empress;

    public Usuario(UsuarioRequestDTO requestDTO) {
        this.nome = requestDTO.nome();
        this.sobrenome = requestDTO.sobrenome();
        this.login = requestDTO.login();
        this.senha = requestDTO.senha();
        this.token = requestDTO.token();
        this.image = requestDTO.image();
        this.foto = requestDTO.foto();
        this.tipo = requestDTO.tipo();
        this.role = requestDTO.role();
        this.accountNonExpired = requestDTO.accountNonExpired();
        this.accountNonLocked = requestDTO.accountNonLocked();
        this.credentialsNonExpired = requestDTO.credentialsNonExpired();
        this.enabled = requestDTO.enabled();
        this.empress = new Empress(requestDTO.empresa());
    }

    public Usuario(UsuarioResponseDTO responseDTO) {
        this.idusuario = responseDTO.idusuario();
        this.nome = responseDTO.nome();
        this.sobrenome = responseDTO.sobrenome();
        this.login = responseDTO.login();
        this.senha = responseDTO.senha();
        this.token = responseDTO.token();
        this.image = responseDTO.image();
        this.foto = responseDTO.foto();
        this.tipo = responseDTO.tipo();
        this.role = responseDTO.role();
        this.accountNonExpired = responseDTO.accountNonExpired();
        this.accountNonLocked = responseDTO.accountNonLocked();
        this.credentialsNonExpired = responseDTO.credentialsNonExpired();
        this.enabled = responseDTO.enabled();
        this.empress = new Empress(responseDTO.empresa());
    }

    public Usuario(UsuarioDB usuarioDB) {
        this.idusuario = usuarioDB.getIdusuario();
        this.nome = usuarioDB.getNome();
        this.sobrenome = usuarioDB.getSobrenome();
        this.login = usuarioDB.getLogin();
        this.senha = usuarioDB.getSenha();
        this.token = usuarioDB.getToken();
        this.image = usuarioDB.getImage();
        this.foto = usuarioDB.getFoto();
        this.tipo = usuarioDB.getTipo();
        this.role = usuarioDB.getRole();
        this.accountNonExpired = usuarioDB.isAccountNonExpired();
        this.accountNonLocked = usuarioDB.isAccountNonLocked();
        this.credentialsNonExpired = usuarioDB.isCredentialsNonExpired();
        this.enabled = usuarioDB.isEnabled();
        this.empress = new Empress(usuarioDB.getEmpresa());
    }
}
