package br.com.hrbackend.domain.entity;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Documents implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private int id;

    private String type;

    private String documentUrl;

    private String name;

    private String description;

    private String department;

    private int enterpriseId;

    private Date date;

    private int absenceId;

    private Employee employee;
}
