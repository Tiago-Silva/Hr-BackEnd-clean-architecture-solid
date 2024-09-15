package br.com.hrbackend.infrastructure.web.config;

import br.com.hrbackend.application.gateway.EmpressGateway;
import br.com.hrbackend.application.usecases.EmpressInteract;
import br.com.hrbackend.infrastructure.core.gateway.EmpressRepositoryGateway;
import br.com.hrbackend.infrastructure.core.mapper.EmpressMapper;
import br.com.hrbackend.infrastructure.data.repository.EmpressRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpressConfig {

    @Bean
    EmpressInteract empressInteract(EmpressGateway empressGateway) {
        return new EmpressInteract(empressGateway);
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
