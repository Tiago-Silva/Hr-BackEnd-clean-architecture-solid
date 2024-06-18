package br.com.hrbackend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "afastamento")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idafastamento")
public class Afastamento implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idafastamento;

    @Column(name = "data_inicio")
    private Date dataInicio;

    @Column(name = "data_fim")
    private Date dataFim;

    private String motivo;

    private String descricao;

    @Column(name = "funcionario_nome")
    private String funcionarioNome;

    private String setor;

    private Date retorno;

    private int empresa;

    private int idfuncionario;

    private int idlembrete;

    @ManyToOne
    @JoinColumn(name = "funcionario_idfuncionario")
    private Funcionario funcionario;
}