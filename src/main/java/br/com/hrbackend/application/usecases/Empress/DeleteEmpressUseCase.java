package br.com.hrbackend.application.usecases.Empress;

import br.com.hrbackend.application.gateway.EmpressGateway;
import br.com.hrbackend.application.usecases.UseCase;
import br.com.hrbackend.domain.entity.Enterprise;

public class DeleteEmpressUseCase implements UseCase<Enterprise, Enterprise> {

    private final EmpressGateway empressGateway;
    public DeleteEmpressUseCase(EmpressGateway empressGateway) {
        this.empressGateway = empressGateway;
    }

    @Override
    public Enterprise execute(Enterprise empress) {
        if (empress == null || empress.getIdempresa() <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        this.empressGateway.delete(empress);
        return empress;
    }
}
