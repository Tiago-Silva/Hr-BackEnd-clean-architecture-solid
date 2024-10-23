package br.com.hrbackend.infrastructure.core.mapper;

import br.com.hrbackend.domain.entity.Period;
import br.com.hrbackend.infrastructure.data.entityDB.PeriodoDB;
import br.com.hrbackend.infrastructure.web.dto.EnterpriseResponseDTO;
import br.com.hrbackend.infrastructure.web.dto.PeriodRequestDTO;
import br.com.hrbackend.infrastructure.web.dto.PeriodResponseDTO;

public class PeriodMapper {

    public PeriodRequestDTO domainObjectToRequestDTO(Period period, EnterpriseResponseDTO enterprise) {
        return new PeriodRequestDTO(
                period.getStartTime().toString(),
                period.getEndTime().toString(),
                period.getBreakStart().toString(),
                period.getBreakEnd().toString(),
                period.getWorkday(),
                period.getType(),
                enterprise
        );
    }

    public PeriodResponseDTO domainObjectToResponseDTO(Period period, EnterpriseResponseDTO enterprise) {
        return new PeriodResponseDTO(
                period.getId(),
                period.getStartTime().toString(),
                period.getEndTime().toString(),
                period.getBreakStart().toString(),
                period.getBreakEnd().toString(),
                period.getWorkday(),
                period.getType(),
                enterprise
        );
    }

    public Period requestDTOToDomainObject(PeriodRequestDTO requestDTO) {
        return new Period(requestDTO);
    }

    public Period responseDTOToDomainObject(PeriodResponseDTO responseDTO) {
        return new Period(responseDTO);
    }

    public PeriodoDB toPeriodDB(Period period) {
        return new PeriodoDB(period);
    }

    public Period toPeriod(PeriodoDB periodDB) {
        return new Period(periodDB);
    }
}
