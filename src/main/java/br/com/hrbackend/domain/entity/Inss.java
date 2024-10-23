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
public class Inss implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private int id;

    private Date startDate;

    private Date endDate;

    private String reason;

    private String description;

    private String employeeName;

    private String department;

    private Date returnDate;

    private int enterpriseId;

    private int employeeId;

    private int reminderId;

    private Employee employee;
}
