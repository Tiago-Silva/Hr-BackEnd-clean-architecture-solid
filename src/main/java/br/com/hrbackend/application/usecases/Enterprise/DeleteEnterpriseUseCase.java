package br.com.hrbackend.application.usecases.Enterprise;

import br.com.hrbackend.application.gateway.EnterpriseGateway;
import br.com.hrbackend.application.usecases.UseCase;
import br.com.hrbackend.domain.entity.Enterprise;

public class DeleteEnterpriseUseCase implements UseCase<Enterprise, Enterprise> {

    private final EnterpriseGateway enterpriseGateway;
    public DeleteEnterpriseUseCase(EnterpriseGateway enterpriseGateway) {
        this.enterpriseGateway = enterpriseGateway;
    }

    @Override
    public Enterprise execute(Enterprise enterprise) {
        if (enterprise == null || enterprise.getId() <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        this.enterpriseGateway.delete(enterprise);
        return enterprise;
    }
}
