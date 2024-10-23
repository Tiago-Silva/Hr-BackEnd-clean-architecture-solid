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
@EqualsAndHashCode(of = "idperiodo")
public class Periodo implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private int idperiodo;

    private Time entrada;

    private Time saida;

    private Time intervaloEntrada;

    private Time intervaloSaida;

    private String jornada;

    private String tipo;

    private Enterprise empress;

    public Periodo(PeriodRequestDTO requestDTO) {
        this.entrada = Time.valueOf(requestDTO.entrada());
        this.saida = Time.valueOf(requestDTO.saida());
        this.intervaloEntrada = Time.valueOf(requestDTO.intervaloEntrada());
        this.intervaloSaida = Time.valueOf(requestDTO.intervaloSaida());
        this.jornada = requestDTO.jornada();
        this.tipo = requestDTO.tipo();
        this.empress = Enterprise.withResponseDTO(requestDTO.empresa());
    }

    public Periodo(PeriodResponseDTO responseDTO) {
        this.idperiodo = responseDTO.idperiodo();
        this.entrada = Time.valueOf(responseDTO.entrada());
        this.saida = Time.valueOf(responseDTO.saida());
        this.intervaloEntrada = Time.valueOf(responseDTO.intervaloEntrada());
        this.intervaloSaida = Time.valueOf(responseDTO.intervaloSaida());
        this.jornada = responseDTO.jornada();
        this.tipo = responseDTO.tipo();
        this.empress = Enterprise.withResponseDTO(responseDTO.empresa());
    }

    public Periodo(PeriodoDB periodDB) {
        this.idperiodo = periodDB.getIdperiodo();
        this.entrada = periodDB.getEntrada();
        this.saida = periodDB.getSaida();
        this.intervaloEntrada = periodDB.getIntervaloEntrada();
        this.intervaloSaida = periodDB.getIntervaloSaida();
        this.jornada = periodDB.getJornada();
        this.tipo = periodDB.getTipo();
        this.empress = Enterprise.withEntityDB(periodDB.getEmpresa());
    }
}
