package br.com.hrbackend.infrastructure.web.config;

import br.com.hrbackend.application.gateway.EnterpriseGateway;
import br.com.hrbackend.application.usecases.Enterprise.*;
import br.com.hrbackend.infrastructure.core.gateway.EnterpriseRepositoryGateway;
import br.com.hrbackend.infrastructure.core.mapper.EnterpriseMapper;
import br.com.hrbackend.infrastructure.data.repository.EnterpriseRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnterpriseConfig {

    @Bean
    CreateEnterpriseUseCase createEmpressUseCase(EnterpriseGateway enterpriseGateway) {
        return new CreateEnterpriseUseCase(enterpriseGateway);
    }

    @Bean
    UpdateEnterpriseUseCase updateEmpressUseCase(EnterpriseGateway enterpriseGateway) {
        return new UpdateEnterpriseUseCase(enterpriseGateway);
    }

    @Bean
    DeleteEnterpriseUseCase deleteEmpressUseCase(EnterpriseGateway enterpriseGateway) {
        return new DeleteEnterpriseUseCase(enterpriseGateway);
    }

    @Bean
    GetEnterpriseByIdUseCase getEmpressByIdUseCase(EnterpriseGateway enterpriseGateway) {
        return new GetEnterpriseByIdUseCase(enterpriseGateway);
    }

    @Bean
    GetBranchesByIdEnterpriseControllerUseCase getBranchesByIdEmpressControllerUseCase(EnterpriseGateway enterpriseGateway) {
        return new GetBranchesByIdEnterpriseControllerUseCase(enterpriseGateway);
    }

    @Bean
    EnterpriseGateway enterpriseGateway(EnterpriseRepository repository, EnterpriseMapper mapper) {
        return new EnterpriseRepositoryGateway(repository, mapper);
    }

    @Bean
    EnterpriseRepository enterpriseRepository() {
        return new EnterpriseRepository();
    }

    @Bean
    EnterpriseMapper enterpriseMapper() {
        return new EnterpriseMapper();
    }
}
