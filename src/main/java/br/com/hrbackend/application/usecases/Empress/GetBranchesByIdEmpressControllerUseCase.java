package br.com.hrbackend.application.usecases.Empress;

import br.com.hrbackend.application.gateway.EmpressGateway;
import br.com.hrbackend.application.usecases.UseCase;
import br.com.hrbackend.domain.entity.Empress;

import java.util.List;

public class GetBranchesByIdEmpressControllerUseCase implements UseCase<Integer, List<Empress>> {

    private final EmpressGateway empressGateway;
    public GetBranchesByIdEmpressControllerUseCase(EmpressGateway empressGateway) {
        this.empressGateway = empressGateway;
    }

    @Override
    public List<Empress> execute(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        return this.empressGateway.getBranchesByIdEmpressController(id);
    }
}
