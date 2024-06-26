package br.com.hrbackend.domain.entity;

import lombok.*;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idadvertencia")
public class Advertencia implements Serializable {
    private static final long serialVersionUID = 1L;

    private int idadvertencia;

    private Date data;

    private String descricao;

    private Time hora;

    private String responsavel;

    private String tipo;

    private Funcionario funcionario;
}
