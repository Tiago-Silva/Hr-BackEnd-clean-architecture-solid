package br.com.hrbackend.infrastructure.data.entityDB;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.math.BigDecimal;

@Entity
@Table(name = "falta")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idfalta")
public class FaltaDB implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Column(name = "descricao_cid")
    private String descricaoCid;

    @Column(name = "data_inicial")
    private Date dataInicial;

    @Column(name = "data_final")
    private Date dataFinal;

    @Column(name = "hora_inicial")
    private Time horaInicial;

    @Column(name = "hora_final")
    private Time horaFinal;

    private String duracao;

    private Date retorno;

    private int idfuncionario;

    @Column(name = "funcionario_nome")
    private String funcionarioNome;

    private String departamento;

    private int empresa;

    private int idlembrete;

    @ManyToOne
    @JoinColumn(name = "funcionario_idfuncionario")
    private EmployeeDB funcionario;
}