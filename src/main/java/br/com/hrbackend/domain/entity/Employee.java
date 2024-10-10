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
@NoArgsConstructor
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

    private Empress empress;

    private Periodo periodo;

    private Employee(
            final int idfuncionario,
            final String nome,
            final String sobrenome,
            final String pis,
            final String cpf,
            final String rg,
            final Date expedicaoRg,
            final String emissorRg,
            final String ufRg,
            final String carteiraMotorista,
            final String categoriaCnh,
            final Date expedicaoCnh,
            final Date validadeCnh,
            final String carteiraTrabalho,
            final String serieCtps,
            final String ufCtps,
            final String tituloEleitor,
            final Date nascimento,
            final String nacionalidade,
            final String cep,
            final String estado,
            final String bairro,
            final String cidade,
            final String endereco,
            final String sexo,
            final String estadoCivil,
            final String mae,
            final String pai,
            final String cracha,
            final String telefone,
            final Date admissao,
            final Date demissao,
            final String status,
            final String motivoDemissao,
            final String departamento,
            final String cargo,
            final String cargoDescricao,
            final Date exameAdmissional,
            final String periodoExperiencia,
            final String primeiroEmprego,
            final String contribuicaoSocial,
            final int idadmissao,
            final String vinculo,
            final BigDecimal salario,
            final String banco,
            final String agencia,
            final String conta,
            final String emailGoogle,
            final String emailHotmail,
            final String localExame,
            final String urlImage,
            final Empress empress,
            final Periodo periodo
    ) {
        this.idfuncionario = idfuncionario;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.pis = pis;
        this.cpf = cpf;
        this.rg = rg;
        this.expedicaoRg = expedicaoRg;
        this.emissorRg = emissorRg;
        this.ufRg = ufRg;
        this.carteiraMotorista = carteiraMotorista;
        this.categoriaCnh = categoriaCnh;
        this.expedicaoCnh = expedicaoCnh;
        this.validadeCnh = validadeCnh;
        this.carteiraTrabalho = carteiraTrabalho;
        this.serieCtps = serieCtps;
        this.ufCtps = ufCtps;
        this.tituloEleitor = tituloEleitor;
        this.nascimento = nascimento;
        this.nacionalidade = nacionalidade;
        this.cep = cep;
        this.estado = estado;
        this.bairro = bairro;
        this.cidade = cidade;
        this.endereco = endereco;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.mae = mae;
        this.pai = pai;
        this.cracha = cracha;
        this.telefone = telefone;
        this.admissao = admissao;
        this.demissao = demissao;
        this.status = status;
        this.motivoDemissao = motivoDemissao;
        this.departamento = departamento;
        this.cargo = cargo;
        this.cargoDescricao = cargoDescricao;
        this.exameAdmissional = exameAdmissional;
        this.periodoExperiencia = periodoExperiencia;
        this.primeiroEmprego = primeiroEmprego;
        this.contribuicaoSocial = contribuicaoSocial;
        this.idadmissao = idadmissao;
        this.vinculo = vinculo;
        this.salario = salario;
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
        this.emailGoogle = emailGoogle;
        this.emailHotmail = emailHotmail;
        this.localExame = localExame;
        this.urlImage = urlImage;
        this.empress = empress;
        this.periodo = periodo;
        this.validate();
    }

    private Employee(
            final String nome,
            final String sobrenome,
            final String pis,
            final String cpf,
            final String rg,
            final Date expedicaoRg,
            final String emissorRg,
            final String ufRg,
            final String carteiraMotorista,
            final String categoriaCnh,
            final Date expedicaoCnh,
            final Date validadeCnh,
            final String carteiraTrabalho,
            final String serieCtps,
            final String ufCtps,
            final String tituloEleitor,
            final Date nascimento,
            final String nacionalidade,
            final String cep,
            final String estado,
            final String bairro,
            final String cidade,
            final String endereco,
            final String sexo,
            final String estadoCivil,
            final String mae,
            final String pai,
            final String cracha,
            final String telefone,
            final Date admissao,
            final Date demissao,
            final String status,
            final String motivoDemissao,
            final String departamento,
            final String cargo,
            final String cargoDescricao,
            final Date exameAdmissional,
            final String periodoExperiencia,
            final String primeiroEmprego,
            final String contribuicaoSocial,
            final int idadmissao,
            final String vinculo,
            final BigDecimal salario,
            final String banco,
            final String agencia,
            final String conta,
            final String emailGoogle,
            final String emailHotmail,
            final String localExame,
            final String urlImage,
            final Empress empress,
            final Periodo periodo
    ) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.pis = pis;
        this.cpf = cpf;
        this.rg = rg;
        this.expedicaoRg = expedicaoRg;
        this.emissorRg = emissorRg;
        this.ufRg = ufRg;
        this.carteiraMotorista = carteiraMotorista;
        this.categoriaCnh = categoriaCnh;
        this.expedicaoCnh = expedicaoCnh;
        this.validadeCnh = validadeCnh;
        this.carteiraTrabalho = carteiraTrabalho;
        this.serieCtps = serieCtps;
        this.ufCtps = ufCtps;
        this.tituloEleitor = tituloEleitor;
        this.nascimento = nascimento;
        this.nacionalidade = nacionalidade;
        this.cep = cep;
        this.estado = estado;
        this.bairro = bairro;
        this.cidade = cidade;
        this.endereco = endereco;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.mae = mae;
        this.pai = pai;
        this.cracha = cracha;
        this.telefone = telefone;
        this.admissao = admissao;
        this.demissao = demissao;
        this.status = status;
        this.motivoDemissao = motivoDemissao;
        this.departamento = departamento;
        this.cargo = cargo;
        this.cargoDescricao = cargoDescricao;
        this.exameAdmissional = exameAdmissional;
        this.periodoExperiencia = periodoExperiencia;
        this.primeiroEmprego = primeiroEmprego;
        this.contribuicaoSocial = contribuicaoSocial;
        this.idadmissao = idadmissao;
        this.vinculo = vinculo;
        this.salario = salario;
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
        this.emailGoogle = emailGoogle;
        this.emailHotmail = emailHotmail;
        this.localExame = localExame;
        this.urlImage = urlImage;
        this.empress = empress;
        this.periodo = periodo;
        this.validate();
    }

    private void validate() {
        if (this.nome == null || this.nome.isBlank()) {
            throw new IllegalArgumentException("Employee nome should not be null or empty");
        }
        if (this.sobrenome == null || this.sobrenome.isBlank()) {
            throw new IllegalArgumentException("Employee sobrenome should not be null or empty");
        }
        if (this.pis == null || this.pis.isBlank()) {
            throw new IllegalArgumentException("Employee pis should not be null or empty");
        }
        if (this.cpf == null || this.cpf.isBlank()) {
            throw new IllegalArgumentException("Employee cpf should not be null or empty");
        }
        if (this.rg == null || this.rg.isBlank()) {
            throw new IllegalArgumentException("Employee rg should not be null or empty");
        }
        if (this.expedicaoRg == null) {
            throw new IllegalArgumentException("Employee expedicaoRg should not be null");
        }
        if (this.emissorRg == null || this.emissorRg.isBlank()) {
            throw new IllegalArgumentException("Employee emissorRg should not be null or empty");
        }
        if (this.ufRg == null || this.ufRg.isBlank()) {
            throw new IllegalArgumentException("Employee ufRg should not be null or empty");
        }
        if (this.carteiraMotorista == null || this.carteiraMotorista.isBlank()) {
            throw new IllegalArgumentException("Employee carteiraMotorista should not be null or empty");
        }
        if (this.categoriaCnh == null || this.categoriaCnh.isBlank()) {
            throw new IllegalArgumentException("Employee categoriaCnh should not be null or empty");
        }
        if (this.expedicaoCnh == null) {
            throw new IllegalArgumentException("Employee expedicaoCnh should not be null");
        }
        if (this.validadeCnh == null) {
            throw new IllegalArgumentException("Employee validadeCnh should not be null");
        }
        if (this.carteiraTrabalho == null || this.carteiraTrabalho.isBlank()) {
            throw new IllegalArgumentException("Employee carteiraTrabalho should not be null or empty");
        }
        if (this.serieCtps == null || this.serieCtps.isBlank()) {
            throw new IllegalArgumentException("Employee serieCtps should not be null or empty");
        }
        if (this.ufCtps == null || this.ufCtps.isBlank()) {
            throw new IllegalArgumentException("Employee ufCtps should not be null or empty");
        }
        if (this.tituloEleitor == null || this.tituloEleitor.isBlank()) {
            throw new IllegalArgumentException("Employee tituloEleitor should not be null or empty");
        }
        if (this.nascimento == null) {
            throw new IllegalArgumentException("Employee nascimento should not be null");
        }
        if (this.nacionalidade == null || this.nacionalidade.isBlank()) {
            throw new IllegalArgumentException("Employee nacionalidade should not be null or empty");
        }
        if (this.cep == null || this.cep.isBlank()) {
            throw new IllegalArgumentException("Employee cep should not be null or empty");
        }
        if (this.estado == null || this.estado.isBlank()) {
            throw new IllegalArgumentException("Employee estado should not be null or empty");
        }
        if (this.bairro == null || this.bairro.isBlank()) {
            throw new IllegalArgumentException("Employee bairro should not be null or empty");
        }
        if (this.cidade == null || this.cidade.isBlank()) {
            throw new IllegalArgumentException("Employee cidade should not be null or empty");
        }
        if (this.endereco == null || this.endereco.isBlank()) {
            throw new IllegalArgumentException("Employee endereco should not be null or empty");
        }
        if (this.sexo == null || this.sexo.isBlank()) {
            throw new IllegalArgumentException("Employee sexo should not be null or empty");
        }
        if (this.estadoCivil == null || this.estadoCivil.isBlank()) {
            throw new IllegalArgumentException("Employee estadoCivil should not be null or empty");
        }
        if (this.mae == null || this.mae.isBlank()) {
            throw new IllegalArgumentException("Employee mae should not be null or empty");
        }
        if (this.pai == null || this.pai.isBlank()) {
            throw new IllegalArgumentException("Employee pai should not be null or empty");
        }
        if (this.cracha == null || this.cracha.isBlank()) {
            throw new IllegalArgumentException("Employee cracha should not be null or empty");
        }
        if (this.telefone == null || this.telefone.isBlank()) {
            throw new IllegalArgumentException("Employee telefone should not be null or empty");
        }
        if (this.admissao == null) {
            throw new IllegalArgumentException("Employee admissao should not be null");
        }
        if (this.status == null || this.status.isBlank()) {
            throw new IllegalArgumentException("Employee status should not be null or empty");
        }
        if (this.departamento == null || this.departamento.isBlank()) {
            throw new IllegalArgumentException("Employee departamento should not be null or empty");
        }
        if (this.cargo == null || this.cargo.isBlank()) {
            throw new IllegalArgumentException("Employee cargo should not be null or empty");
        }
        if (this.cargoDescricao == null || this.cargoDescricao.isBlank()) {
            throw new IllegalArgumentException("Employee cargoDescricao should not be null or empty");
        }
        if (this.periodoExperiencia == null || this.periodoExperiencia.isBlank()) {
            throw new IllegalArgumentException("Employee periodoExperiencia should not be null or empty");
        }
        if (this.primeiroEmprego == null || this.primeiroEmprego.isBlank()) {
            throw new IllegalArgumentException("Employee primeiroEmprego should not be null or empty");
        }
        if (this.contribuicaoSocial == null || this.contribuicaoSocial.isBlank()) {
            throw new IllegalArgumentException("Employee contribuicaoSocial should not be null or empty");
        }
        if (this.vinculo == null || this.vinculo.isBlank()) {
            throw new IllegalArgumentException("Employee vinculo should not be null or empty");
        }
        if (this.salario == null) {
            throw new IllegalArgumentException("Employee salario should not be null");
        }
        if (this.banco == null || this.banco.isBlank()) {
            throw new IllegalArgumentException("Employee banco should not be null or empty");
        }
        if (this.agencia == null || this.agencia.isBlank()) {
            throw new IllegalArgumentException("Employee agencia should not be null or empty");
        }
        if (this.conta == null || this.conta.isBlank()) {
            throw new IllegalArgumentException("Employee conta should not be null or empty");
        }
        if (this.emailGoogle == null || this.emailGoogle.isBlank()) {
            throw new IllegalArgumentException("Employee emailGoogle should not be null or empty");
        }
        if (this.emailHotmail == null || this.emailHotmail.isBlank()) {
            throw new IllegalArgumentException("Employee emailHotmail should not be null or empty");
        }
        if (this.localExame == null || this.localExame.isBlank()) {
            throw new IllegalArgumentException("Employee localExame should not be null or empty");
        }
        if (this.urlImage == null || this.urlImage.isBlank()) {
            throw new IllegalArgumentException("Employee urlImage should not be null or empty");
        }
        if (this.empress == null) {
            throw new IllegalArgumentException("Employee empress should not be null");
        }
        if (this.periodo == null) {
            throw new IllegalArgumentException("Employee periodo should not be null");
        }
    }

    public static Employee withRequestDTO(EmployeeRequestDTO requestDTO) {
        return new Employee(
                requestDTO.nome(),
                requestDTO.sobrenome(),
                requestDTO.pis(),
                requestDTO.cpf(),
                requestDTO.rg(),
                new Date(),
                requestDTO.emissorRg(),
                requestDTO.ufRg(),
                requestDTO.carteiraMotorista(),
                requestDTO.categoriaCnh(),
                new Date(),
                new Date(),
                requestDTO.carteiraTrabalho(),
                requestDTO.serieCtps(),
                requestDTO.ufCtps(),
                requestDTO.tituloEleitor(),
                new Date(),
                requestDTO.nacionalidade(),
                requestDTO.cep(),
                requestDTO.estado(),
                requestDTO.bairro(),
                requestDTO.cidade(),
                requestDTO.endereco(),
                requestDTO.sexo(),
                requestDTO.estadoCivil(),
                requestDTO.mae(),
                requestDTO.pai(),
                requestDTO.cracha(),
                requestDTO.telefone(),
                new Date(),
                new Date(),
                requestDTO.status(),
                requestDTO.motivoDemissao(),
                requestDTO.departamento(),
                requestDTO.cargo(),
                requestDTO.cargoDescricao(),
                new Date(),
                requestDTO.periodoExperiencia(),
                requestDTO.primeiroEmprego(),
                requestDTO.contribuicaoSocial(),
                requestDTO.idadmissao(),
                requestDTO.vinculo(),
                requestDTO.salario(),
                requestDTO.banco(),
                requestDTO.agencia(),
                requestDTO.conta(),
                requestDTO.emailGoogle(),
                requestDTO.emailHotmail(),
                requestDTO.localExame(),
                requestDTO.urlImage(),
                Empress.withResponseDTO(requestDTO.empresa()),
                new Periodo(requestDTO.periodo())
        );
    }

    public static Employee withResponseDTO(EmployeeResponseDTO responseDTO) {
        return new Employee(
                responseDTO.idfuncionario(),
                responseDTO.nome(),
                responseDTO.sobrenome(),
                responseDTO.pis(),
                responseDTO.cpf(),
                responseDTO.rg(),
                new Date(),
                responseDTO.emissorRg(),
                responseDTO.ufRg(),
                responseDTO.carteiraMotorista(),
                responseDTO.categoriaCnh(),
                new Date(),
                new Date(),
                responseDTO.carteiraTrabalho(),
                responseDTO.serieCtps(),
                responseDTO.ufCtps(),
                responseDTO.tituloEleitor(),
                new Date(),
                responseDTO.nacionalidade(),
                responseDTO.cep(),
                responseDTO.estado(),
                responseDTO.bairro(),
                responseDTO.cidade(),
                responseDTO.endereco(),
                responseDTO.sexo(),
                responseDTO.estadoCivil(),
                responseDTO.mae(),
                responseDTO.pai(),
                responseDTO.cracha(),
                responseDTO.telefone(),
                new Date(),
                new Date(),
                responseDTO.status(),
                responseDTO.motivoDemissao(),
                responseDTO.departamento(),
                responseDTO.cargo(),
                responseDTO.cargoDescricao(),
                new Date(),
                responseDTO.periodoExperiencia(),
                responseDTO.primeiroEmprego(),
                responseDTO.contribuicaoSocial(),
                responseDTO.idadmissao(),
                responseDTO.vinculo(),
                responseDTO.salario(),
                responseDTO.banco(),
                responseDTO.agencia(),
                responseDTO.conta(),
                responseDTO.emailGoogle(),
                responseDTO.emailHotmail(),
                responseDTO.localExame(),
                responseDTO.urlImage(),
                Empress.withResponseDTO(responseDTO.empresa()),
                new Periodo(responseDTO.periodo())
        );
    }

    public static Employee withEntityDB(EmployeeDB employeeDB) {
        return new Employee(
                employeeDB.getIdfuncionario(),
                employeeDB.getNome(),
                employeeDB.getSobrenome(),
                employeeDB.getPis(),
                employeeDB.getCpf(),
                employeeDB.getRg(),
                employeeDB.getExpedicaoRg(),
                employeeDB.getEmissorRg(),
                employeeDB.getUfRg(),
                employeeDB.getCarteiraMotorista(),
                employeeDB.getCategoriaCnh(),
                employeeDB.getExpedicaoCnh(),
                employeeDB.getValidadeCnh(),
                employeeDB.getCarteiraTrabalho(),
                employeeDB.getSerieCtps(),
                employeeDB.getUfCtps(),
                employeeDB.getTituloEleitor(),
                employeeDB.getNascimento(),
                employeeDB.getNacionalidade(),
                employeeDB.getCep(),
                employeeDB.getEstado(),
                employeeDB.getBairro(),
                employeeDB.getCidade(),
                employeeDB.getEndereco(),
                employeeDB.getSexo(),
                employeeDB.getEstadoCivil(),
                employeeDB.getMae(),
                employeeDB.getPai(),
                employeeDB.getCracha(),
                employeeDB.getTelefone(),
                employeeDB.getAdmissao(),
                employeeDB.getDemissao(),
                employeeDB.getStatus(),
                employeeDB.getMotivoDemissao(),
                employeeDB.getDepartamento(),
                employeeDB.getCargo(),
                employeeDB.getCargoDescricao(),
                employeeDB.getExameAdmissional(),
                employeeDB.getPeriodoExperiencia(),
                employeeDB.getPrimeiroEmprego(),
                employeeDB.getContribuicaoSocial(),
                employeeDB.getIdadmissao(),
                employeeDB.getVinculo(),
                employeeDB.getSalario(),
                employeeDB.getBanco(),
                employeeDB.getAgencia(),
                employeeDB.getConta(),
                employeeDB.getEmailGoogle(),
                employeeDB.getEmailHotmail(),
                employeeDB.getLocalExame(),
                employeeDB.getUrlImage(),
                Empress.withEntityDB(employeeDB.getEmpresa()),
                new Periodo(employeeDB.getPeriodo())
        );
    }
}
