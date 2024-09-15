package br.com.hrbackend.infrastructure.data.entityDB;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "aviso_previo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idavisoPrevio")
public class AvisoPrevioDB implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idaviso_previo")
    private int idavisoPrevio;

    private String motivo;

    private String descricao;

    @Column(name = "data_inicio")
    private Date dataInicio;

    @Column(name = "data_fim")
    private Date dataFim;

    @Column(name = "funcionario_nome")
    private String funcionarioNome;

    private int idfuncionario;

    private String setor;

    private int empresa;

    private Date retorno;

    private int idlembrete;

    @Column(name = "tipo_aviso")
    private String tipoAviso;

    private String dias;

    @ManyToOne
    @JoinColumn(name = "funcionario_idfuncionario")
    private EmployeeDB funcionario;
}