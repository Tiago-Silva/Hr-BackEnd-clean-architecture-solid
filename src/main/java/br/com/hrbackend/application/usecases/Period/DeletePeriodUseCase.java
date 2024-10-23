package br.com.hrbackend.application.usecases.Period;

import br.com.hrbackend.application.gateway.PeriodGateway;
import br.com.hrbackend.application.usecases.UseCase;
import br.com.hrbackend.domain.entity.Period;

public class DeletePeriodUseCase implements UseCase<Period, Void> {

    private final PeriodGateway periodGateway;
    public DeletePeriodUseCase(PeriodGateway periodGateway) {
        this.periodGateway = periodGateway;
    }

    @Override
    public Void execute(Period periodo) {
        if (periodo == null || periodo.getIdperiodo() <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        this.periodGateway.delete(periodo);
        return null;
    }
}
