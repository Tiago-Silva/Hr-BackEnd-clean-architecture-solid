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
public class Benefit implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private int id;

    private String name;

    private String type;

    private String balanceCalculation;

    private String payrollCost;

    private String description;

    private String salaryPercentage;

    private String discountEvent;

    private String operator;

    private Date cutoffDate;

    private Date contractExpiry;

    private String enterpriseCost;

    private String enterpriseName;

    private Enterprise enterprise;
}

