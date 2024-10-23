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
public class PriorNotice implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private int id;

    private String reason;

    private String description;

    private Date startDate;

    private Date endDate;

    private String employeeName;

    private String department;

    private int enterpriseId;

    private Date returnDate;

    private int reminderId;

    private String noticeType;

    private String days;

    private Employee employee;
}