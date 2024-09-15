package br.com.hrbackend.infrastructure.web.config;

import br.com.hrbackend.application.gateway.EmpressGateway;
import br.com.hrbackend.application.usecases.Empress.*;
import br.com.hrbackend.infrastructure.core.gateway.EmpressRepositoryGateway;
import br.com.hrbackend.infrastructure.core.mapper.EmpressMapper;
import br.com.hrbackend.infrastructure.data.repository.EmpressRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpressConfig {

    @Bean
    CreateEmpressUseCase createEmpressUseCase(EmpressGateway empressGateway) {
        return new CreateEmpressUseCase(empressGateway);
    }

    @Bean
    UpdateEmpressUseCase updateEmpressUseCase(EmpressGateway empressGateway) {
        return new UpdateEmpressUseCase(empressGateway);
    }

    @Bean
    DeleteEmpressUseCase deleteEmpressUseCase(EmpressGateway empressGateway) {
        return new DeleteEmpressUseCase(empressGateway);
    }

    @Bean
    GetEmpressByIdUseCase getEmpressByIdUseCase(EmpressGateway empressGateway) {
        return new GetEmpressByIdUseCase(empressGateway);
    }

    @Bean
    GetBranchesByIdEmpressControllerUseCase getBranchesByIdEmpressControllerUseCase(EmpressGateway empressGateway) {
        return new GetBranchesByIdEmpressControllerUseCase(empressGateway);
    }

    @Bean
    EmpressGateway empressGateway(EmpressRepository repository, EmpressMapper mapper) {
        return new EmpressRepositoryGateway(repository, mapper);
    }

    @Bean
    EmpressRepository empressRepository() {
        return new EmpressRepository();
    }

    @Bean
    EmpressMapper empressMapper() {
        return new EmpressMapper();
    }
}
