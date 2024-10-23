package br.com.hrbackend.domain.entity;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class TimeClock implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private int id;

    private String rep;

    private String location;

    private String description;

    private Enterprise enterprise;
}