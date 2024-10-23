package br.com.hrbackend.domain.entity;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idrelogioPonto")
public class RelogioPonto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private int idrelogioPonto;

    private String rep;

    private String local;

    private String descricao;

    private Enterprise empress;
}