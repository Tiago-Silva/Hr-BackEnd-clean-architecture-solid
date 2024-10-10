package br.com.hrbackend.application.usecases.Empress;

import br.com.hrbackend.application.gateway.EmpressGateway;
import br.com.hrbackend.application.usecases.UseCase;
import br.com.hrbackend.domain.entity.Empress;

public class GetEmpressByIdUseCase implements UseCase<Integer, Empress> {

    private final EmpressGateway empressGateway;
    public GetEmpressByIdUseCase(EmpressGateway empressGateway) {
        this.empressGateway = empressGateway;
    }

    @Override
    public Empress execute(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        return this.empressGateway.getId(id);
    }
}
