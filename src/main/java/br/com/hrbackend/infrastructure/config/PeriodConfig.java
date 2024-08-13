package br.com.hrbackend.infrastructure.config;

import br.com.hrbackend.application.gateway.PeriodGateway;
import br.com.hrbackend.application.usecases.PeriodInteract;
import br.com.hrbackend.infrastructure.gateway.PeriodRepositoryGateway;
import br.com.hrbackend.infrastructure.mapper.PeriodMapper;
import br.com.hrbackend.infrastructure.repository.PeriodRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PeriodConfig {

    @Bean
    PeriodInteract periodInteract(PeriodGateway periodGateway) {
        return new PeriodInteract(periodGateway);
    }

    @Bean
    PeriodGateway periodGateway(PeriodRepository repository, PeriodMapper mapper) {
        return new PeriodRepositoryGateway(repository, mapper);
    }

    @Bean
    PeriodMapper periodMapper() {
        return new PeriodMapper();
    }
}
