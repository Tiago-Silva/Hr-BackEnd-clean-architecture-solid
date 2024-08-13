package br.com.hrbackend.application.gateway;

import br.com.hrbackend.domain.entity.Periodo;

public interface PeriodGateway {

    void createPeriod(Periodo periodo);
    void updatePeriod(Periodo periodo);
    void deletePeriod(Periodo periodo);
    Periodo getPeriodById(int id);
}
