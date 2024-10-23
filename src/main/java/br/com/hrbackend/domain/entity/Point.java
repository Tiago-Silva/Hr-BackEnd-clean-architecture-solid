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
@EqualsAndHashCode(of = "id")
public class Point implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private int id;

    private String badge;

    private Date date;

    private Time time;

    private Time startTime;

    private Time endTime;

    private Time breakStart;

    private Time breakEnd;

    private String rep;

    private String nsr;

    private String pis;

    private String employeeName;

    private int employeeId;

    private boolean lateStart;

    private Enterprise enterprise;
}
