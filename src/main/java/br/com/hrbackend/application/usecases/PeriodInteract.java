package br.com.hrbackend.application.usecases;

import br.com.hrbackend.application.gateway.PeriodGateway;
import br.com.hrbackend.domain.entity.Periodo;

public class PeriodInteract {

    private final PeriodGateway periodGateway;
    public PeriodInteract(PeriodGateway periodGateway) {
        this.periodGateway = periodGateway;
    }

    public void createPeriod(Periodo periodo) {
        if (
            periodo == null ||
            periodo.getEntrada() == null ||
            periodo.getSaida() == null ||
            periodo.getIntervaloEntrada() == null ||
            periodo.getIntervaloSaida() == null ||
            periodo.getJornada().isEmpty() ||
            periodo.getTipo().isEmpty() ||
            periodo.getEmpresa() == null
        ) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        this.periodGateway.createPeriod(periodo);
    }

    public void updatePeriod(Periodo periodo) {
        if (periodo == null || periodo.getIdperiodo() <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        this.periodGateway.updatePeriod(periodo);
    }

    public void deletePeriod(Periodo periodo) {
        if (periodo == null || periodo.getIdperiodo() <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        this.periodGateway.deletePeriod(periodo);
    }

    public Periodo getPeriodById(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        return this.periodGateway.getPeriodById(id);
    }
}
