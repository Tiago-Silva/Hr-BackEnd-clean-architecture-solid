package br.com.hrbackend.application.usecases.Empress;

import br.com.hrbackend.application.gateway.EmpressGateway;
import br.com.hrbackend.application.usecases.UseCase;
import br.com.hrbackend.domain.entity.Empress;

public class UpdateEmpressUseCase implements UseCase<Empress, Empress> {

    private final EmpressGateway empressGateway;
    public UpdateEmpressUseCase(EmpressGateway empressGateway) {
        this.empressGateway = empressGateway;
    }

    @Override
    public Empress execute(Empress empress) {
        if (empress == null || empress.getIdempresa() <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        return this.empressGateway.update(empress);
    }
}
