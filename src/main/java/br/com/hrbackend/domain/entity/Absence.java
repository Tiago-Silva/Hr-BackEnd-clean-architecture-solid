package br.com.hrbackend.domain.entity;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Absence implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private int id;

    private Date date;

    private BigDecimal days;

    private BigDecimal hours;

    private Timestamp record;

    private String reason;

    private String type;

    private String doctor;

    private int month;

    private String year;

    private int cidId;

    private String cidDescription;

    private Date startDate;

    private Date endDate;

    private Time startTime;

    private Time endTime;

    private String duration;

    private Date returnDate;

    private String department;

    private int enterpriseId;

    private int reminderId;

    private Employee employee;
}
