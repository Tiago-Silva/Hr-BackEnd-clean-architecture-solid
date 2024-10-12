package br.com.hrbackend.infrastructure.web.config;

import br.com.hrbackend.application.gateway.PeriodGateway;
import br.com.hrbackend.application.usecases.Period.CreatePeriodUseCase;
import br.com.hrbackend.application.usecases.Period.DeletePeriodUseCase;
import br.com.hrbackend.application.usecases.Period.GetPeriodByIdUseCase;
import br.com.hrbackend.application.usecases.Period.UpdatePeriodUseCase;
import br.com.hrbackend.infrastructure.core.gateway.PeriodRepositoryGateway;
import br.com.hrbackend.infrastructure.core.mapper.PeriodMapper;
import br.com.hrbackend.infrastructure.data.repository.PeriodRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PeriodConfig {

    @Bean
    CreatePeriodUseCase createPeriodUseCase(PeriodGateway periodGateway) {
        return new CreatePeriodUseCase(periodGateway);
    }

    @Bean
    UpdatePeriodUseCase updatePeriodUseCase(PeriodGateway periodGateway) {
        return new UpdatePeriodUseCase(periodGateway);
    }

    @Bean
    DeletePeriodUseCase deletePeriodUseCase(PeriodGateway periodGateway) {
        return new DeletePeriodUseCase(periodGateway);
    }

    @Bean
    GetPeriodByIdUseCase getPeriodByIdUseCase(PeriodGateway periodGateway) {
        return new GetPeriodByIdUseCase(periodGateway);
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
