package br.com.hrbackend.application.usecases.Period;

import br.com.hrbackend.application.gateway.PeriodGateway;
import br.com.hrbackend.application.usecases.UseCase;
import br.com.hrbackend.domain.entity.Period;

public class CreatePeriodUseCase implements UseCase<Period, Period> {

    private final PeriodGateway periodGateway;
    public CreatePeriodUseCase(PeriodGateway periodGateway) {
        this.periodGateway = periodGateway;
    }

    @Override
    public Period execute(Period periodo) {
        if (
            periodo == null ||
            periodo.getStartTime() == null ||
            periodo.getEndTime() == null ||
            periodo.getBreakStart() == null ||
            periodo.getBreakEnd() == null ||
            periodo.getWorkday().isEmpty() ||
            periodo.getType().isEmpty() ||
            periodo.getEnterprise() == null
        ) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        return this.periodGateway.save(periodo);
    }
}
