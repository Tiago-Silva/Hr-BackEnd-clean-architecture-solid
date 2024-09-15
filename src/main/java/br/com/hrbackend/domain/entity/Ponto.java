package br.com.hrbackend.domain.entity;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idponto")
public class Ponto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private int idponto;

    private String cracha;

    private Date data;

    private Time hora;

    private Time entrada;

    private Time saida;

    private Time intervaloSaida;

    private Time intervaloEntrada;

    private String rep;

    private String nsr;

    private String pis;

    private String funcionario;

    private int idfuncionario;

    private String cnpj;

    private String empresaNome;

    private boolean atrasadoEntrada;

    private Empress empress;
}
