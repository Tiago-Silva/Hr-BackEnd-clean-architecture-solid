package br.com.hrbackend.domain.entity;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Time;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idperiodo")
public class Periodo implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private int idperiodo;

    private Time entrada;

    private Time saida;

    private Time intervaloEntrada;

    private Time intervaloSaida;

    private String jornada;

    private String tipo;

    private Empresa empresa;
}
