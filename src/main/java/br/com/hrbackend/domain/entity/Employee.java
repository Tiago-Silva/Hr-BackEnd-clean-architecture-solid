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
@EqualsAndHashCode(of = "id")
public class Employee implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private int id;

    private String name;

    private String lastName;

    private String pis;

    private String cpf;

    private String rg;

    private Date rgIssueDate;

    private String rgIssuer;

    private String rgState;

    private String driverLicense;

    private String driverLicenseCategory;

    private Date driverLicenseIssueDate;

    private Date driverLicenseExpiryDate;

    private String workCard;

    private String workCardSeries;

    private String workCardState;

    private String voterRegistration;

    private Date birthDate;

    private String nationality;

    private String zipCode;

    private String state;

    private String neighborhood;

    private String city;

    private String address;

    private String gender;

    private String maritalStatus;

    private String motherName;

    private String fatherName;

    private String badge;

    private String phone;

    private Date hireDate;

    private Date terminationDate;

    private String status;

    private String terminationReason;

    private String department;

    private String position;

    private String positionDescription;

    private Date admissionExam;

    private String probationPeriod;

    private String firstJob;

    private String socialContribution;

    private int admissionId;

    private String relationship;

    private BigDecimal salary;

    private String bank;

    private String agency;

    private String account;

    private String googleEmail;

    private String hotmailEmail;

    private String examLocation;

    private String imageUrl;

    private Enterprise enterprise;

    private Period periodo;

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
            final Enterprise empress,
            final Period periodo
    ) {
        this.id = idfuncionario;
        this.name = nome;
        this.lastName = sobrenome;
        this.pis = pis;
        this.cpf = cpf;
        this.rg = rg;
        this.rgIssueDate = expedicaoRg;
        this.rgIssuer = emissorRg;
        this.rgState = ufRg;
        this.driverLicense = carteiraMotorista;
        this.driverLicenseCategory = categoriaCnh;
        this.driverLicenseIssueDate = expedicaoCnh;
        this.driverLicenseExpiryDate = validadeCnh;
        this.workCard = carteiraTrabalho;
        this.workCardSeries = serieCtps;
        this.workCardState = ufCtps;
        this.voterRegistration = tituloEleitor;
        this.birthDate = nascimento;
        this.nationality = nacionalidade;
        this.zipCode = cep;
        this.state = estado;
        this.neighborhood = bairro;
        this.city = cidade;
        this.address = endereco;
        this.gender = sexo;
        this.maritalStatus = estadoCivil;
        this.motherName = mae;
        this.fatherName = pai;
        this.badge = cracha;
        this.phone = telefone;
        this.hireDate = admissao;
        this.terminationDate = demissao;
        this.status = status;
        this.terminationReason = motivoDemissao;
        this.department = departamento;
        this.position = cargo;
        this.positionDescription = cargoDescricao;
        this.admissionExam = exameAdmissional;
        this.probationPeriod = periodoExperiencia;
        this.firstJob = primeiroEmprego;
        this.socialContribution = contribuicaoSocial;
        this.admissionId = idadmissao;
        this.relationship = vinculo;
        this.salary = salario;
        this.bank = banco;
        this.agency = agencia;
        this.account = conta;
        this.googleEmail = emailGoogle;
        this.hotmailEmail = emailHotmail;
        this.examLocation = localExame;
        this.imageUrl = urlImage;
        this.enterprise = empress;
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
            final Enterprise empress,
            final Period periodo
    ) {
        this.name = nome;
        this.lastName = sobrenome;
        this.pis = pis;
        this.cpf = cpf;
        this.rg = rg;
        this.rgIssueDate = expedicaoRg;
        this.rgIssuer = emissorRg;
        this.rgState = ufRg;
        this.driverLicense = carteiraMotorista;
        this.driverLicenseCategory = categoriaCnh;
        this.driverLicenseIssueDate = expedicaoCnh;
        this.driverLicenseExpiryDate = validadeCnh;
        this.workCard = carteiraTrabalho;
        this.workCardSeries = serieCtps;
        this.workCardState = ufCtps;
        this.voterRegistration = tituloEleitor;
        this.birthDate = nascimento;
        this.nationality = nacionalidade;
        this.zipCode = cep;
        this.state = estado;
        this.neighborhood = bairro;
        this.city = cidade;
        this.address = endereco;
        this.gender = sexo;
        this.maritalStatus = estadoCivil;
        this.motherName = mae;
        this.fatherName = pai;
        this.badge = cracha;
        this.phone = telefone;
        this.hireDate = admissao;
        this.terminationDate = demissao;
        this.status = status;
        this.terminationReason = motivoDemissao;
        this.department = departamento;
        this.position = cargo;
        this.positionDescription = cargoDescricao;
        this.admissionExam = exameAdmissional;
        this.probationPeriod = periodoExperiencia;
        this.firstJob = primeiroEmprego;
        this.socialContribution = contribuicaoSocial;
        this.admissionId = idadmissao;
        this.relationship = vinculo;
        this.salary = salario;
        this.bank = banco;
        this.agency = agencia;
        this.account = conta;
        this.googleEmail = emailGoogle;
        this.hotmailEmail = emailHotmail;
        this.examLocation = localExame;
        this.imageUrl = urlImage;
        this.enterprise = empress;
        this.periodo = periodo;
        this.validate();
    }

    private void validate() {
        if (this.name == null || this.name.isBlank()) {
            throw new IllegalArgumentException("Employee nome should not be null or empty");
        }
        if (this.lastName == null || this.lastName.isBlank()) {
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
        if (this.rgIssueDate == null) {
            throw new IllegalArgumentException("Employee expedicaoRg should not be null");
        }
        if (this.rgIssuer == null || this.rgIssuer.isBlank()) {
            throw new IllegalArgumentException("Employee emissorRg should not be null or empty");
        }
        if (this.rgState == null || this.rgState.isBlank()) {
            throw new IllegalArgumentException("Employee ufRg should not be null or empty");
        }
        if (this.driverLicense == null || this.driverLicense.isBlank()) {
            throw new IllegalArgumentException("Employee carteiraMotorista should not be null or empty");
        }
        if (this.driverLicenseCategory == null || this.driverLicenseCategory.isBlank()) {
            throw new IllegalArgumentException("Employee categoriaCnh should not be null or empty");
        }
        if (this.driverLicenseIssueDate == null) {
            throw new IllegalArgumentException("Employee expedicaoCnh should not be null");
        }
        if (this.driverLicenseExpiryDate == null) {
            throw new IllegalArgumentException("Employee validadeCnh should not be null");
        }
        if (this.workCard == null || this.workCard.isBlank()) {
            throw new IllegalArgumentException("Employee carteiraTrabalho should not be null or empty");
        }
        if (this.workCardSeries == null || this.workCardSeries.isBlank()) {
            throw new IllegalArgumentException("Employee serieCtps should not be null or empty");
        }
        if (this.workCardState == null || this.workCardState.isBlank()) {
            throw new IllegalArgumentException("Employee ufCtps should not be null or empty");
        }
        if (this.voterRegistration == null || this.voterRegistration.isBlank()) {
            throw new IllegalArgumentException("Employee tituloEleitor should not be null or empty");
        }
        if (this.birthDate == null) {
            throw new IllegalArgumentException("Employee nascimento should not be null");
        }
        if (this.nationality == null || this.nationality.isBlank()) {
            throw new IllegalArgumentException("Employee nacionalidade should not be null or empty");
        }
        if (this.zipCode == null || this.zipCode.isBlank()) {
            throw new IllegalArgumentException("Employee cep should not be null or empty");
        }
        if (this.state == null || this.state.isBlank()) {
            throw new IllegalArgumentException("Employee estado should not be null or empty");
        }
        if (this.neighborhood == null || this.neighborhood.isBlank()) {
            throw new IllegalArgumentException("Employee bairro should not be null or empty");
        }
        if (this.city == null || this.city.isBlank()) {
            throw new IllegalArgumentException("Employee cidade should not be null or empty");
        }
        if (this.address == null || this.address.isBlank()) {
            throw new IllegalArgumentException("Employee endereco should not be null or empty");
        }
        if (this.gender == null || this.gender.isBlank()) {
            throw new IllegalArgumentException("Employee sexo should not be null or empty");
        }
        if (this.maritalStatus == null || this.maritalStatus.isBlank()) {
            throw new IllegalArgumentException("Employee estadoCivil should not be null or empty");
        }
        if (this.motherName == null || this.motherName.isBlank()) {
            throw new IllegalArgumentException("Employee mae should not be null or empty");
        }
        if (this.fatherName == null || this.fatherName.isBlank()) {
            throw new IllegalArgumentException("Employee pai should not be null or empty");
        }
        if (this.badge == null || this.badge.isBlank()) {
            throw new IllegalArgumentException("Employee cracha should not be null or empty");
        }
        if (this.phone == null || this.phone.isBlank()) {
            throw new IllegalArgumentException("Employee telefone should not be null or empty");
        }
        if (this.hireDate == null) {
            throw new IllegalArgumentException("Employee admissao should not be null");
        }
        if (this.status == null || this.status.isBlank()) {
            throw new IllegalArgumentException("Employee status should not be null or empty");
        }
        if (this.department == null || this.department.isBlank()) {
            throw new IllegalArgumentException("Employee departamento should not be null or empty");
        }
        if (this.position == null || this.position.isBlank()) {
            throw new IllegalArgumentException("Employee cargo should not be null or empty");
        }
        if (this.positionDescription == null || this.positionDescription.isBlank()) {
            throw new IllegalArgumentException("Employee cargoDescricao should not be null or empty");
        }
        if (this.probationPeriod == null || this.probationPeriod.isBlank()) {
            throw new IllegalArgumentException("Employee periodoExperiencia should not be null or empty");
        }
        if (this.firstJob == null || this.firstJob.isBlank()) {
            throw new IllegalArgumentException("Employee primeiroEmprego should not be null or empty");
        }
        if (this.socialContribution == null || this.socialContribution.isBlank()) {
            throw new IllegalArgumentException("Employee contribuicaoSocial should not be null or empty");
        }
        if (this.relationship == null || this.relationship.isBlank()) {
            throw new IllegalArgumentException("Employee vinculo should not be null or empty");
        }
        if (this.salary == null) {
            throw new IllegalArgumentException("Employee salario should not be null");
        }
        if (this.bank == null || this.bank.isBlank()) {
            throw new IllegalArgumentException("Employee banco should not be null or empty");
        }
        if (this.agency == null || this.agency.isBlank()) {
            throw new IllegalArgumentException("Employee agencia should not be null or empty");
        }
        if (this.account == null || this.account.isBlank()) {
            throw new IllegalArgumentException("Employee conta should not be null or empty");
        }
        if (this.googleEmail == null || this.googleEmail.isBlank()) {
            throw new IllegalArgumentException("Employee emailGoogle should not be null or empty");
        }
        if (this.hotmailEmail == null || this.hotmailEmail.isBlank()) {
            throw new IllegalArgumentException("Employee emailHotmail should not be null or empty");
        }
        if (this.examLocation == null || this.examLocation.isBlank()) {
            throw new IllegalArgumentException("Employee localExame should not be null or empty");
        }
        if (this.imageUrl == null || this.imageUrl.isBlank()) {
            throw new IllegalArgumentException("Employee urlImage should not be null or empty");
        }
        if (this.enterprise == null) {
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
                Enterprise.withResponseDTO(requestDTO.empresa()),
                new Period(requestDTO.periodo())
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
                Enterprise.withResponseDTO(responseDTO.empresa()),
                new Period(responseDTO.periodo())
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
                Enterprise.withEntityDB(employeeDB.getEmpresa()),
                new Period(employeeDB.getPeriodo())
        );
    }
}
