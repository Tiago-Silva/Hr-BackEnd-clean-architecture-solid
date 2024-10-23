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
public class License implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private int id;

    private String type;

    private String description;

    private Date startDate;

    private Date endDate;

    private Date returnDate;

    private String department;

    private int enterpriseId;

    private int reminderId;

    private Employee employee;
}
