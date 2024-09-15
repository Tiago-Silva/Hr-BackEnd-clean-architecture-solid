package br.com.hrbackend.application.usecases.Period;

import br.com.hrbackend.application.gateway.PeriodGateway;
import br.com.hrbackend.application.usecases.UseCase;
import br.com.hrbackend.domain.entity.Periodo;

public class CreatePeriodUseCase implements UseCase<Periodo, Periodo> {

    private final PeriodGateway periodGateway;
    public CreatePeriodUseCase(PeriodGateway periodGateway) {
        this.periodGateway = periodGateway;
    }

    @Override
    public Periodo execute(Periodo periodo) {
        if (
            periodo == null ||
            periodo.getEntrada() == null ||
            periodo.getSaida() == null ||
            periodo.getIntervaloEntrada() == null ||
            periodo.getIntervaloSaida() == null ||
            periodo.getJornada().isEmpty() ||
            periodo.getTipo().isEmpty() ||
            periodo.getEmpress() == null
        ) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        return this.periodGateway.createPeriod(periodo);
    }
}
