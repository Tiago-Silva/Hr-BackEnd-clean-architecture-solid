package br.com.hrbackend.application.usecases.Enterprise;

import br.com.hrbackend.application.gateway.EnterpriseGateway;
import br.com.hrbackend.application.usecases.UseCase;
import br.com.hrbackend.domain.entity.Enterprise;

public class CreateEnterpriseUseCase implements UseCase<Enterprise, Enterprise> {

    private final EnterpriseGateway enterpriseGateway;
    public CreateEnterpriseUseCase(EnterpriseGateway enterpriseGateway) {
        this.enterpriseGateway = enterpriseGateway;
    }

    @Override
    public Enterprise execute(Enterprise enterprise) {
        if (
            enterprise == null ||
            enterprise.getCnpj().isEmpty() ||
            enterprise.getEnterpriseName().isEmpty() ||
            enterprise.getTradeName().isEmpty()
        ) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        return this.enterpriseGateway.save(enterprise);
    }
}
