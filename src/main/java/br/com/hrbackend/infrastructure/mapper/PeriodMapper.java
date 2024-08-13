package br.com.hrbackend.infrastructure.mapper;

import br.com.hrbackend.domain.entity.Periodo;
import br.com.hrbackend.infrastructure.db.entityDB.PeriodoDB;
import br.com.hrbackend.infrastructure.dto.EmpresaResponseDTO;
import br.com.hrbackend.infrastructure.dto.PeriodRequestDTO;
import br.com.hrbackend.infrastructure.dto.PeriodResponseDTO;

public class PeriodMapper {

    public PeriodRequestDTO domainObjectToRequestDTO(Periodo period, EmpresaResponseDTO empresa) {
        return new PeriodRequestDTO(
                period.getEntrada().toString(),
                period.getSaida().toString(),
                period.getIntervaloEntrada().toString(),
                period.getIntervaloSaida().toString(),
                period.getJornada(),
                period.getTipo(),
                empresa
        );
    }

    public PeriodResponseDTO domainObjectToResponseDTO(Periodo period, EmpresaResponseDTO empresa) {
        return new PeriodResponseDTO(
                period.getIdperiodo(),
                period.getEntrada().toString(),
                period.getSaida().toString(),
                period.getIntervaloEntrada().toString(),
                period.getIntervaloSaida().toString(),
                period.getJornada(),
                period.getTipo(),
                empresa
        );
    }

    public Periodo requestDTOToDomainObject(PeriodRequestDTO requestDTO) {
        return new Periodo(requestDTO);
    }

    public Periodo responseDTOToDomainObject(PeriodResponseDTO responseDTO) {
        return new Periodo(responseDTO);
    }

    public PeriodoDB toPeriodDB(Periodo period) {
        return new PeriodoDB(period);
    }

    public Periodo toPeriod(PeriodoDB periodDB) {
        return new Periodo(periodDB);
    }
}
