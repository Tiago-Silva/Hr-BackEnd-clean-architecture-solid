package br.com.hrbackend.infrastructure.db.entityDB;

import br.com.hrbackend.domain.entity.Usuario;
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
public class UsuarioDB implements Serializable {
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
	private EmpresaDB empresa;

	public UsuarioDB(Usuario usuario) {
		this.idusuario = usuario.getIdusuario();
		this.nome = usuario.getNome();
		this.sobrenome = usuario.getSobrenome();
		this.login = usuario.getLogin();
		this.senha = usuario.getSenha();
		this.token = usuario.getToken();
		this.image = usuario.getImage();
		this.foto = usuario.getFoto();
		this.tipo = usuario.getTipo();
		this.role = usuario.getRole();
		this.accountNonExpired = usuario.isAccountNonExpired();
		this.accountNonLocked = usuario.isAccountNonLocked();
		this.credentialsNonExpired = usuario.isCredentialsNonExpired();
		this.enabled = usuario.isEnabled();
		this.empresa = new EmpresaDB(usuario.getEmpresa());
	}
}