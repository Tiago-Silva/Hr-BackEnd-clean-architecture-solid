package br.com.hrbackend.application.usecases.Period;

import br.com.hrbackend.application.gateway.PeriodGateway;
import br.com.hrbackend.application.usecases.UseCase;
import br.com.hrbackend.domain.entity.Period;

public class GetPeriodByIdUseCase implements UseCase<Integer, Period> {

    private final PeriodGateway periodGateway;
    public GetPeriodByIdUseCase(PeriodGateway periodGateway) {
        this.periodGateway = periodGateway;
    }

    @Override
    public Period execute(Integer id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        return this.periodGateway.getId(id);
    }
}
