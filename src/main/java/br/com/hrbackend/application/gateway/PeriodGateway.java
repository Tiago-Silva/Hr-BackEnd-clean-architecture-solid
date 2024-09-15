package br.com.hrbackend.application.gateway;

import br.com.hrbackend.domain.entity.Periodo;

public interface PeriodGateway {

    Periodo createPeriod(Periodo periodo);
    Periodo updatePeriod(Periodo periodo);
    void deletePeriod(Periodo periodo);
    Periodo getPeriodById(int id);
}
