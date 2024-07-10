package br.com.hrbackend.domain.entity;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idafastamento")
public class Afastamento implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private int idafastamento;

    private Date dataInicio;

    private Date dataFim;

    private String motivo;

    private String descricao;

    private String funcionarioNome;

    private String setor;

    private Date retorno;

    private int empresa;

    private int idfuncionario;

    private int idlembrete;

    private Funcionario funcionario;
}
