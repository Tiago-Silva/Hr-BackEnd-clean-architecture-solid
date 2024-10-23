package br.com.hrbackend.application.usecases.Enterprise;

import br.com.hrbackend.application.gateway.EnterpriseGateway;
import br.com.hrbackend.application.usecases.UseCase;
import br.com.hrbackend.domain.entity.Enterprise;

import java.util.List;

public class GetBranchesByIdEnterpriseControllerUseCase implements UseCase<Integer, List<Enterprise>> {

    private final EnterpriseGateway enterpriseGateway;
    public GetBranchesByIdEnterpriseControllerUseCase(EnterpriseGateway enterpriseGateway) {
        this.enterpriseGateway = enterpriseGateway;
    }

    @Override
    public List<Enterprise> execute(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        return this.enterpriseGateway.getBranchesByIdEnterpriseController(id);
    }
}
