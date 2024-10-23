package br.com.hrbackend.application.usecases.Enterprise;

import br.com.hrbackend.application.gateway.EnterpriseGateway;
import br.com.hrbackend.application.usecases.UseCase;
import br.com.hrbackend.domain.entity.Enterprise;

public class UpdateEnterpriseUseCase implements UseCase<Enterprise, Enterprise> {

    private final EnterpriseGateway enterpriseGateway;
    public UpdateEnterpriseUseCase(EnterpriseGateway enterpriseGateway) {
        this.enterpriseGateway = enterpriseGateway;
    }

    @Override
    public Enterprise execute(Enterprise enterprise) {
        if (enterprise == null || enterprise.getId() <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        return this.enterpriseGateway.update(enterprise);
    }
}
