package br.com.hrbackend.infrastructure.db.entityDB;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "licenca")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idlicenca")
public class LicencaDB implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idlicenca;

    private String tipo;

    private String descricao;

    @Column(name = "data_inicio")
    private Date dataInicio;

    @Column(name = "data_fim")
    private Date dataFim;

    private Date retorno;

    @Column(name = "funcionario_nome")
    private String funcionarioNome;

    private int idfuncionario;

    private String setor;

    private int empresa;

    private int idlembrete;

    @ManyToOne
    @JoinColumn(name = "funcionario_idfuncionario")
    private EmployeeDB funcionario;
}