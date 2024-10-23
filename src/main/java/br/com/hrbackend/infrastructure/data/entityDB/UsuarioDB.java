package br.com.hrbackend.infrastructure.data.entityDB;

import br.com.hrbackend.domain.entity.User;
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
@EqualsAndHashCode(of = "userId")
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

	public UsuarioDB(User usuario) {
		this.idusuario = usuario.getUserId();
		this.nome = usuario.getFirstName();
		this.sobrenome = usuario.getLastName();
		this.login = usuario.getUserName();
		this.senha = usuario.getPassword();
		this.token = usuario.getToken();
		this.image = usuario.getImage();
		this.foto = usuario.getPhoto();
		this.tipo = usuario.getType();
		this.role = usuario.getRole();
		this.accountNonExpired = usuario.isAccountNonExpired();
		this.accountNonLocked = usuario.isAccountNonLocked();
		this.credentialsNonExpired = usuario.isCredentialsNonExpired();
		this.enabled = usuario.isEnabled();
		this.empresa = new EmpresaDB(usuario.getEnterprise());
	}
}