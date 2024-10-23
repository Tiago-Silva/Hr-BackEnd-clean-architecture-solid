package br.com.hrbackend.domain.entity;

import br.com.hrbackend.infrastructure.data.entityDB.PeriodoDB;
import br.com.hrbackend.infrastructure.web.dto.PeriodRequestDTO;
import br.com.hrbackend.infrastructure.web.dto.PeriodResponseDTO;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Time;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Period implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private int id;

    private Time startTime;

    private Time endTime;

    private Time breakStart;

    private Time breakEnd;

    private String workday;

    private String type;

    private Enterprise enterprise;

    public Period(PeriodRequestDTO requestDTO) {
        this.startTime = Time.valueOf(requestDTO.entrada());
        this.endTime = Time.valueOf(requestDTO.saida());
        this.breakStart = Time.valueOf(requestDTO.intervaloEntrada());
        this.breakEnd = Time.valueOf(requestDTO.intervaloSaida());
        this.workday = requestDTO.jornada();
        this.type = requestDTO.tipo();
        this.enterprise = Enterprise.withResponseDTO(requestDTO.empresa());
    }

    public Period(PeriodResponseDTO responseDTO) {
        this.id = responseDTO.idperiodo();
        this.startTime = Time.valueOf(responseDTO.entrada());
        this.endTime = Time.valueOf(responseDTO.saida());
        this.breakStart = Time.valueOf(responseDTO.intervaloEntrada());
        this.breakEnd = Time.valueOf(responseDTO.intervaloSaida());
        this.workday = responseDTO.jornada();
        this.type = responseDTO.tipo();
        this.enterprise = Enterprise.withResponseDTO(responseDTO.empresa());
    }

    public Period(PeriodoDB periodDB) {
        this.id = periodDB.getIdperiodo();
        this.startTime = periodDB.getEntrada();
        this.endTime = periodDB.getSaida();
        this.breakStart = periodDB.getIntervaloEntrada();
        this.breakEnd = periodDB.getIntervaloSaida();
        this.workday = periodDB.getJornada();
        this.type = periodDB.getTipo();
        this.enterprise = Enterprise.withEntityDB(periodDB.getEmpresa());
    }
}
