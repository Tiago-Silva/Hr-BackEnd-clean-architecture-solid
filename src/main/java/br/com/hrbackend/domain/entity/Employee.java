package br.com.hrbackend.domain.entity;

import br.com.hrbackend.infrastructure.data.entityDB.EmployeeDB;
import br.com.hrbackend.infrastructure.web.dto.EmployeeRequestDTO;
import br.com.hrbackend.infrastructure.web.dto.EmployeeResponseDTO;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idfuncionario")
public class Employee implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private int idfuncionario;

    private String nome;

    private String sobrenome;

    private String pis;

    private String cpf;

    private String rg;

    private Date expedicaoRg;

    private String emissorRg;

    private String ufRg;

    private String carteiraMotorista;

    private String categoriaCnh;

    private Date expedicaoCnh;

    private Date validadeCnh;

    private String carteiraTrabalho;

    private String serieCtps;

    private String ufCtps;

    private String tituloEleitor;

    private Date nascimento;

    private String nacionalidade;

    private String cep;

    private String estado;

    private String bairro;

    private String cidade;

    private String endereco;

    private String sexo;

    private String estadoCivil;

    private String mae;

    private String pai;

    private String cracha;

    private String telefone;

    private Date admissao;

    private Date demissao;

    private String status;

    private String motivoDemissao;

    private String departamento;

    private String cargo;

    private String cargoDescricao;

    private Date exameAdmissional;

    private String periodoExperiencia;

    private String primeiroEmprego;

    private String contribuicaoSocial;

    private int idadmissao;

    private String vinculo;

    private BigDecimal salario;

    private String banco;

    private String agencia;

    private String conta;

    private String emailGoogle;

    private String emailHotmail;

    private String localExame;

    private String urlImage;

    private Empresa empresa;

    private Periodo periodo;

    public Employee(EmployeeRequestDTO requestDTO) {
        this.nome = requestDTO.nome();
        this.sobrenome = requestDTO.sobrenome();
        this.pis = requestDTO.pis();
        this.cpf = requestDTO.cpf();
        this.rg = requestDTO.rg();
        this.expedicaoRg = new Date();
        this.emissorRg = requestDTO.emissorRg();
        this.ufRg = requestDTO.ufRg();
        this.carteiraMotorista = requestDTO.carteiraMotorista();
        this.categoriaCnh = requestDTO.categoriaCnh();
        this.expedicaoCnh = new Date();
        this.validadeCnh = new Date();
        this.carteiraTrabalho = requestDTO.carteiraTrabalho();
        this.serieCtps = requestDTO.serieCtps();
        this.ufCtps = requestDTO.ufCtps();
        this.tituloEleitor = requestDTO.tituloEleitor();
        this.nascimento = new Date();
        this.nacionalidade = requestDTO.nacionalidade();
        this.cep = requestDTO.cep();
        this.estado = requestDTO.estado();
        this.bairro = requestDTO.bairro();
        this.cidade = requestDTO.cidade();
        this.endereco = requestDTO.endereco();
        this.sexo = requestDTO.sexo();
        this.estadoCivil = requestDTO.estadoCivil();
        this.mae = requestDTO.mae();
        this.pai = requestDTO.pai();
        this.cracha = requestDTO.cracha();
        this.telefone = requestDTO.telefone();
        this.admissao = new Date();
        this.demissao = new Date();
        this.status = requestDTO.status();
        this.motivoDemissao = requestDTO.motivoDemissao();
        this.departamento = requestDTO.departamento();
        this.cargo = requestDTO.cargo();
        this.cargoDescricao = requestDTO.cargoDescricao();
        this.exameAdmissional = new Date();
        this.periodoExperiencia = requestDTO.periodoExperiencia();
        this.primeiroEmprego = requestDTO.primeiroEmprego();
        this.contribuicaoSocial = requestDTO.contribuicaoSocial();
        this.idadmissao = requestDTO.idadmissao();
        this.vinculo = requestDTO.vinculo();
        this.salario = requestDTO.salario();
        this.banco = requestDTO.banco();
        this.agencia = requestDTO.agencia();
        this.conta = requestDTO.conta();
        this.emailGoogle = requestDTO.emailGoogle();
        this.emailHotmail = requestDTO.emailHotmail();
        this.localExame = requestDTO.localExame();
        this.urlImage = requestDTO.urlImage();
        this.empresa = new Empresa(requestDTO.empresa());
        this.periodo = new Periodo(requestDTO.periodo());
    }

    public Employee(EmployeeResponseDTO responseDTO) {
        this.idfuncionario = responseDTO.idfuncionario();
        this.nome = responseDTO.nome();
        this.sobrenome = responseDTO.sobrenome();
        this.pis = responseDTO.pis();
        this.cpf = responseDTO.cpf();
        this.rg = responseDTO.rg();
        this.expedicaoRg = new Date();
        this.emissorRg = responseDTO.emissorRg();
        this.ufRg = responseDTO.ufRg();
        this.carteiraMotorista = responseDTO.carteiraMotorista();
        this.categoriaCnh = responseDTO.categoriaCnh();
        this.expedicaoCnh = new Date();
        this.validadeCnh = new Date();
        this.carteiraTrabalho = responseDTO.carteiraTrabalho();
        this.serieCtps = responseDTO.serieCtps();
        this.ufCtps = responseDTO.ufCtps();
        this.tituloEleitor = responseDTO.tituloEleitor();
        this.nascimento = new Date();
        this.nacionalidade = responseDTO.nacionalidade();
        this.cep = responseDTO.cep();
        this.estado = responseDTO.estado();
        this.bairro = responseDTO.bairro();
        this.cidade = responseDTO.cidade();
        this.endereco = responseDTO.endereco();
        this.sexo = responseDTO.sexo();
        this.estadoCivil = responseDTO.estadoCivil();
        this.mae = responseDTO.mae();
        this.pai = responseDTO.pai();
        this.cracha = responseDTO.cracha();
        this.telefone = responseDTO.telefone();
        this.admissao = new Date();
        this.demissao = new Date();
        this.status = responseDTO.status();
        this.motivoDemissao = responseDTO.motivoDemissao();
        this.departamento = responseDTO.departamento();
        this.cargo = responseDTO.cargo();
        this.cargoDescricao = responseDTO.cargoDescricao();
        this.exameAdmissional = new Date();
        this.periodoExperiencia = responseDTO.periodoExperiencia();
        this.primeiroEmprego = responseDTO.primeiroEmprego();
        this.contribuicaoSocial = responseDTO.contribuicaoSocial();
        this.idadmissao = responseDTO.idadmissao();
        this.vinculo = responseDTO.vinculo();
        this.salario = responseDTO.salario();
        this.banco = responseDTO.banco();
        this.agencia = responseDTO.agencia();
        this.conta = responseDTO.conta();
        this.emailGoogle = responseDTO.emailGoogle();
        this.emailHotmail = responseDTO.emailHotmail();
        this.localExame = responseDTO.localExame();
        this.urlImage = responseDTO.urlImage();
        this.empresa = new Empresa(responseDTO.empresa());
        this.periodo = new Periodo(responseDTO.periodo());
    }

    public Employee(EmployeeDB employeeDB) {
        this.idfuncionario = employeeDB.getIdfuncionario();
        this.nome = employeeDB.getNome();
        this.sobrenome = employeeDB.getSobrenome();
        this.pis = employeeDB.getPis();
        this.cpf = employeeDB.getCpf();
        this.rg = employeeDB.getRg();
        this.expedicaoRg = employeeDB.getExpedicaoRg();
        this.emissorRg = employeeDB.getEmissorRg();
        this.ufRg = employeeDB.getUfRg();
        this.carteiraMotorista = employeeDB.getCarteiraMotorista();
        this.categoriaCnh = employeeDB.getCategoriaCnh();
        this.expedicaoCnh = employeeDB.getExpedicaoCnh();
        this.validadeCnh = employeeDB.getValidadeCnh();
        this.carteiraTrabalho = employeeDB.getCarteiraTrabalho();
        this.serieCtps = employeeDB.getSerieCtps();
        this.ufCtps = employeeDB.getUfCtps();
        this.tituloEleitor = employeeDB.getTituloEleitor();
        this.nascimento = employeeDB.getNascimento();
        this.nacionalidade = employeeDB.getNacionalidade();
        this.cep = employeeDB.getCep();
        this.estado = employeeDB.getEstado();
        this.bairro = employeeDB.getBairro();
        this.cidade = employeeDB.getCidade();
        this.endereco = employeeDB.getEndereco();
        this.sexo = employeeDB.getSexo();
        this.estadoCivil = employeeDB.getEstadoCivil();
        this.mae = employeeDB.getMae();
        this.pai = employeeDB.getPai();
        this.cracha = employeeDB.getCracha();
        this.telefone = employeeDB.getTelefone();
        this.admissao = employeeDB.getAdmissao();
        this.demissao = employeeDB.getDemissao();
        this.status = employeeDB.getStatus();
        this.motivoDemissao = employeeDB.getMotivoDemissao();
        this.departamento = employeeDB.getDepartamento();
        this.cargo = employeeDB.getCargo();
        this.cargoDescricao = employeeDB.getCargoDescricao();
        this.exameAdmissional = employeeDB.getExameAdmissional();
        this.periodoExperiencia = employeeDB.getPeriodoExperiencia();
        this.primeiroEmprego = employeeDB.getPrimeiroEmprego();
        this.contribuicaoSocial = employeeDB.getContribuicaoSocial();
        this.idadmissao = employeeDB.getIdadmissao();
        this.vinculo = employeeDB.getVinculo();
        this.salario = employeeDB.getSalario();
        this.banco = employeeDB.getBanco();
        this.agencia = employeeDB.getAgencia();
        this.conta = employeeDB.getConta();
        this.emailGoogle = employeeDB.getEmailGoogle();
        this.emailHotmail = employeeDB.getEmailHotmail();
        this.localExame = employeeDB.getLocalExame();
        this.urlImage = employeeDB.getUrlImage();
        this.empresa = new Empresa(employeeDB.getEmpresa());
        this.periodo = new Periodo(employeeDB.getPeriodo());
    }
}
