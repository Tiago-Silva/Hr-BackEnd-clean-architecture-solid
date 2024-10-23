package br.com.hrbackend.application.usecases.Empress;

import br.com.hrbackend.application.gateway.EmpressGateway;
import br.com.hrbackend.application.usecases.UseCase;
import br.com.hrbackend.domain.entity.Enterprise;

public class CreateEmpressUseCase implements UseCase<Enterprise, Enterprise> {

    private final EmpressGateway empressGateway;
    public CreateEmpressUseCase(EmpressGateway empressGateway) {
        this.empressGateway = empressGateway;
    }

    @Override
    public Enterprise execute(Enterprise empress) {
        if (
            empress == null ||
            empress.getCnpj().isEmpty() ||
            empress.getRazaoSocial().isEmpty() ||
            empress.getNomeFantasia().isEmpty()
        ) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        return this.empressGateway.save(empress);
    }
}
