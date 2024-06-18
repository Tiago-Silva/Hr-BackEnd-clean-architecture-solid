package br.com.hrbackend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "empresa")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idempresa")
public class Empresa implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idempresa;

	@NotBlank
	@Size(max = 100)
	@Column(name = "nome_fantasia")
	private String nomeFantasia;

	@NotBlank
	@Size(max = 100)
	@Column(name = "razao_social")
	private String razaoSocial;

	@NotBlank
	@Size(max = 15)
	private String cnpj;

	@Column(name = "incricao_estadual")
	private String inscricaoEstadual;

	private String bairro;

	private String cidade;

	private String endereco;

	private String estado;

	private String telefone;

	@Column(name = "logo_marca")
	private String logoMarca;

	@Column(name = "is_filial")
	private Boolean isFilial;

	@Column(name = "empresa_controller")
	private int empresaController;

	@Column(name = "is_matriz")
	private Boolean isMatriz;

	private String status;
}