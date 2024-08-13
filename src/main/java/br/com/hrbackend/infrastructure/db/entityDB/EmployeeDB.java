package br.com.hrbackend.infrastructure.db.entityDB;

import br.com.hrbackend.domain.entity.Employee;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "funcionario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idfuncionario")
public class EmployeeDB implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idfuncionario;

	private String nome;

	private String sobrenome;

	private String pis;

	private String cpf;

	private String rg;

	@Column(name = "expedicao_rg")
	private Date expedicaoRg;

	@Column(name = "emissor_rg")
	private String emissorRg;

	@Column(name = "uf_rg")
	private String ufRg;

	@Column(name = "carteira_motorista")
	private String carteiraMotorista;

	@Column(name = "categoria_cnh")
	private String categoriaCnh;

	@Column(name = "expedicao_cnh")
	private Date expedicaoCnh;

	@Column(name = "validade_cnh")
	private Date validadeCnh;

	@Column(name = "carteira_trabalho")
	private String carteiraTrabalho;

	@Column(name = "serie_ctps")
	private String serieCtps;

	@Column(name = "uf_ctps")
	private String ufCtps;

	@Column(name = "titulo_eleitor")
	private String tituloEleitor;

	private Date nascimento;

	private String nacionalidade;

	private String cep;

	private String estado;

	private String bairro;

	private String cidade;

	private String endereco;

	private String sexo;

	@Column(name = "estado_civil")
	private String estadoCivil;

	private String mae;

	private String pai;

	private String cracha;

	private String telefone;

	private Date admissao;

	private Date demissao;

	private String status;

	@Column(name = "motivo_demissao")
	private String motivoDemissao;

	private String departamento;

	private String cargo;

	@Column(name = "cargo_descricao")
	private String cargoDescricao;

	@Column(name = "exame_admissional")
	private Date exameAdmissional;

	@Column(name = "periodo_experiencia")
	private String periodoExperiencia;

	@Column(name = "primeiro_emprego")
	private String primeiroEmprego;

	@Column(name = "contribuicao_social")
	private String contribuicaoSocial;

	private int idadmissao;

	private String vinculo;

	private BigDecimal salario;

	private String banco;

	private String agencia;

	private String conta;

	@Column(name = "email_google")
	private String emailGoogle;

	@Column(name = "email_hotmail")
	private String emailHotmail;

	@Column(name = "local_exame")
	private String localExame;

	@Column(name = "url_image")
	private String urlImage;

	@ManyToOne
	@JoinColumn(name = "empresa_idempresa")
	private EmpresaDB empresa;

	@ManyToOne
	@JoinColumn(name = "periodo_idperiodo")
	private PeriodoDB periodo;

	@OneToMany(mappedBy = "funcionario", fetch = FetchType.LAZY)
	private List<AdmissaoDB> admissoes;

	@OneToMany(mappedBy = "funcionario", fetch = FetchType.LAZY)
	private List<AdvertenciaDB> advertencias;

	@OneToMany(mappedBy = "funcionario", fetch = FetchType.LAZY)
	private List<AfastamentoDB> afastamentos;

	@OneToMany(mappedBy = "funcionario", fetch = FetchType.LAZY)
	private List<AvisoPrevioDB> avisosPrevios;

	@OneToMany(mappedBy = "funcionario", fetch = FetchType.LAZY)
	private List<DocumentosDB> documentos;

	@OneToMany(mappedBy = "funcionario", fetch = FetchType.LAZY)
	private List<FaltaDB> faltas;

	@OneToMany(mappedBy = "funcionario", fetch = FetchType.LAZY)
	private List<LicencaDB> licencas;

	public EmployeeDB(Employee employee) {
		this.idfuncionario = employee.getIdfuncionario();
		this.nome = employee.getNome();
		this.sobrenome = employee.getSobrenome();
		this.pis = employee.getPis();
		this.cpf = employee.getCpf();
		this.rg = employee.getRg();
		this.expedicaoRg = employee.getExpedicaoRg();
		this.emissorRg = employee.getEmissorRg();
		this.ufRg = employee.getUfRg();
		this.carteiraMotorista = employee.getCarteiraMotorista();
		this.categoriaCnh = employee.getCategoriaCnh();
		this.expedicaoCnh = employee.getExpedicaoCnh();
		this.validadeCnh = employee.getValidadeCnh();
		this.carteiraTrabalho = employee.getCarteiraTrabalho();
		this.serieCtps = employee.getSerieCtps();
		this.ufCtps = employee.getUfCtps();
		this.tituloEleitor = employee.getTituloEleitor();
		this.nascimento = employee.getNascimento();
		this.nacionalidade = employee.getNacionalidade();
		this.cep = employee.getCep();
		this.estado = employee.getEstado();
		this.bairro = employee.getBairro();
		this.cidade = employee.getCidade();
		this.endereco = employee.getEndereco();
		this.sexo = employee.getSexo();
		this.estadoCivil = employee.getEstadoCivil();
		this.mae = employee.getMae();
		this.pai = employee.getPai();
		this.cracha = employee.getCracha();
		this.telefone = employee.getTelefone();
		this.admissao = employee.getAdmissao();
		this.demissao = employee.getDemissao();
		this.status = employee.getStatus();
		this.motivoDemissao = employee.getMotivoDemissao();
		this.departamento = employee.getDepartamento();
		this.cargo = employee.getCargo();
		this.cargoDescricao = employee.getCargoDescricao();
		this.exameAdmissional = employee.getExameAdmissional();
		this.periodoExperiencia = employee.getPeriodoExperiencia();
		this.primeiroEmprego = employee.getPrimeiroEmprego();
		this.contribuicaoSocial = employee.getContribuicaoSocial();
		this.idadmissao = employee.getIdadmissao();
		this.vinculo = employee.getVinculo();
		this.salario = employee.getSalario();
		this.banco = employee.getBanco();
		this.agencia = employee.getAgencia();
		this.conta = employee.getConta();
		this.emailGoogle = employee.getEmailGoogle();
		this.emailHotmail = employee.getEmailHotmail();
		this.localExame = employee.getLocalExame();
		this.urlImage = employee.getUrlImage();
		this.empresa = new EmpresaDB(employee.getEmpresa());
		this.periodo = new PeriodoDB(employee.getPeriodo());
	}
}