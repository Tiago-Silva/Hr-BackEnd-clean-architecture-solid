package br.com.hrbackend.domain.entity;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Admission implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private int id;

    private Date date;

    private Date admissionExam;

    private String probationPeriod;

    private String firstJob;

    private String socialContribution;

    private String department;

    private String position;

    private String periodTime;

    private Employee employee;
}
