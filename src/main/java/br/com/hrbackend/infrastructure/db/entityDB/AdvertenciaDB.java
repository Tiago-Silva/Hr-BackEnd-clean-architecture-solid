package br.com.hrbackend.infrastructure.db.entityDB;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "advertencia")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idadvertencia")
public class AdvertenciaDB implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idadvertencia;

    private Date data;

    private String descricao;

    private Time hora;

    private String responsavel;

    private String tipo;

    @ManyToOne
    @JoinColumn(name = "funcionario_idfuncionario")
    private FuncionarioDB funcionario;
}