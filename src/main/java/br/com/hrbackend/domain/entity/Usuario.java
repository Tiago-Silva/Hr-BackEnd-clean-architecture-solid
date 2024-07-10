package br.com.hrbackend.domain.entity;

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

    private Empresa empresa;
}
