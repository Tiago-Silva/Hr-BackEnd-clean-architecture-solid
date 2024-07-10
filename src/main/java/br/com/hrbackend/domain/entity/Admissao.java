package br.com.hrbackend.domain.entity;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idadmissao")
public class Admissao implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private int idadmissao;

    private Date data;

    private Date exameAdmissional;

    private String periodoExperiencia;

    private String primeiroEmprego;

    private String contribuicaoSocial;

    private String departamento;

    private String cargo;

    private String periodo;

    private Funcionario funcionario;
}
