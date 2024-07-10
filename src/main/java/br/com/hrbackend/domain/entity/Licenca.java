package br.com.hrbackend.domain.entity;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idlicenca")
public class Licenca implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private int idlicenca;

    private String tipo;

    private String descricao;

    private Date dataInicio;

    private Date dataFim;

    private Date retorno;

    private String funcionarioNome;

    private int idfuncionario;

    private String setor;

    private int empresa;

    private int idlembrete;

    private Funcionario funcionario;
}
