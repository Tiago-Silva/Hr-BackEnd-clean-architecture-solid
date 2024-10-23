package br.com.hrbackend.application.usecases.Empress;

import br.com.hrbackend.application.gateway.EmpressGateway;
import br.com.hrbackend.application.usecases.UseCase;
import br.com.hrbackend.domain.entity.Enterprise;

public class UpdateEmpressUseCase implements UseCase<Enterprise, Enterprise> {

    private final EmpressGateway empressGateway;
    public UpdateEmpressUseCase(EmpressGateway empressGateway) {
        this.empressGateway = empressGateway;
    }

    @Override
    public Enterprise execute(Enterprise empress) {
        if (empress == null || empress.getIdempresa() <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        return this.empressGateway.update(empress);
    }
}
