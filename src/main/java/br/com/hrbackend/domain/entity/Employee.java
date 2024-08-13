package br.com.hrbackend.domain.entity;

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
}
