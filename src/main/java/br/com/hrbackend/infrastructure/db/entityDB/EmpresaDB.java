package br.com.hrbackend.infrastructure.db.entityDB;

import br.com.hrbackend.infrastructure.dto.EmpresaRequestDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "empresa")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idempresa")
public class EmpresaDB implements Serializable {
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
	private boolean isFilial;

	@Column(name = "empresa_controller")
	private int empresaController;

	@Column(name = "is_matriz")
	private boolean isMatriz;

	private String status;

	@OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY)
	private List<UsuarioDB> usuarios;

	@OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY)
	private List<FuncionarioDB> funcionarios;

	@OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY)
	private List<PeriodoDB> periodos;

	@OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY)
	private List<PontoDB> pontos;

	@OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY)
	private List<RelogioPontoDB> relogios;

	@OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY)
	private List<BeneficioDB> beneficios;

	public EmpresaDB(EmpresaRequestDTO requestDTO) {
		this.nomeFantasia = requestDTO.nomeFantasia();
		this.razaoSocial = requestDTO.razaoSocial();
		this.cnpj = requestDTO.cnpj();
		this.inscricaoEstadual = requestDTO.inscricaoEstadual();
		this.bairro = requestDTO.bairro();
		this.cidade = requestDTO.cidade();
		this.endereco = requestDTO.endereco();
		this.estado = requestDTO.estado();
		this.telefone = requestDTO.telefone();
		this.logoMarca = requestDTO.logoMarca();
		this.isFilial = requestDTO.filial();
		this.empresaController = requestDTO.empresaController();
		this.isMatriz = requestDTO.matriz();
		this.status = requestDTO.status();
	}
}