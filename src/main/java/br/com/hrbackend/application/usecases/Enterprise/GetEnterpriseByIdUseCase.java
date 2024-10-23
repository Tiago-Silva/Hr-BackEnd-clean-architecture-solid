package br.com.hrbackend.application.usecases.Enterprise;

import br.com.hrbackend.application.gateway.EnterpriseGateway;
import br.com.hrbackend.application.usecases.UseCase;
import br.com.hrbackend.domain.entity.Enterprise;

public class GetEnterpriseByIdUseCase implements UseCase<Integer, Enterprise> {

    private final EnterpriseGateway enterpriseGateway;
    public GetEnterpriseByIdUseCase(EnterpriseGateway enterpriseGateway) {
        this.enterpriseGateway = enterpriseGateway;
    }

    @Override
    public Enterprise execute(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        return this.enterpriseGateway.getId(id);
    }
}
