package br.com.hrbackend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "usuario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idusuario")
public class Usuario implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idusuario;

	private String nome;

	private String sobrenome;

	private String login;

	private String senha;

	private String token;

	private String image;

	@Lob
	private byte[] foto;

	private String tipo;

	private String role;

	@Column(name = "account_non_expired")
	private boolean accountNonExpired;

	@Column(name = "account_non_locked")
	private boolean accountNonLocked;

	@Column(name = "credentials_non_expired")
	private boolean credentialsNonExpired;

	private boolean enabled;

	@ManyToOne
	@JoinColumn(name = "empresa_idempresa")
	private Empresa empresa;
}