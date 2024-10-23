package br.com.hrbackend.application.usecases.Period;

import br.com.hrbackend.application.gateway.PeriodGateway;
import br.com.hrbackend.application.usecases.UseCase;
import br.com.hrbackend.domain.entity.Period;

public class UpdatePeriodUseCase implements UseCase<Period, Period> {

    private final PeriodGateway periodGateway;
    public UpdatePeriodUseCase(PeriodGateway periodGateway) {
        this.periodGateway = periodGateway;
    }

    @Override
    public Period execute(Period periodo) {
        if (periodo == null || periodo.getIdperiodo() <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        return this.periodGateway.update(periodo);
    }
}
