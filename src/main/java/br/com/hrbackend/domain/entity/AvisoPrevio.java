package br.com.hrbackend.domain.entity;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idavisoPrevio")
public class AvisoPrevio implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private int idavisoPrevio;

    private String motivo;

    private String descricao;

    private Date dataInicio;

    private Date dataFim;

    private String funcionarioNome;

    private int idfuncionario;

    private String setor;

    private int empresa;

    private Date retorno;

    private int idlembrete;

    private String tipoAviso;

    private String dias;

    private Employee employee;
}