package br.com.hrbackend.domain.entity;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idfalta")
public class Falta implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private int idfalta;

    private Date data;

    private BigDecimal dias;

    private BigDecimal horas;

    private Timestamp lancamento;

    private String motivo;

    private String tipo;

    private String medico;

    private int mes;

    private String ano;

    private int idcid;

    private String descricaoCid;

    private Date dataInicial;

    private Date dataFinal;

    private Time horaInicial;

    private Time horaFinal;

    private String duracao;

    private Date retorno;

    private int idfuncionario;

    private String funcionarioNome;

    private String departamento;

    private int empresa;

    private int idlembrete;

    private Funcionario funcionario;
}
