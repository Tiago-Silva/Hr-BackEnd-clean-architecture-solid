package br.com.hrbackend.domain.entity;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Warning implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private int id;

    private Date date;

    private String description;

    private Time time;

    private String responsible;

    private String type;

    private Employee employee;
}
