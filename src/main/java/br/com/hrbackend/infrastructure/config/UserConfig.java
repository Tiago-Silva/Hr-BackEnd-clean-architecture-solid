package br.com.hrbackend.infrastructure.config;

import br.com.hrbackend.application.gateway.UserGateway;
import br.com.hrbackend.application.usecases.UserInteract;
import br.com.hrbackend.infrastructure.gateway.UserRepositoryGateway;
import br.com.hrbackend.infrastructure.mapper.UserMapper;
import br.com.hrbackend.infrastructure.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    UserInteract userInteract(UserGateway userGateway) {
        return new UserInteract(userGateway);
    }

    @Bean
    UserGateway userGateway(UserRepository repository, UserMapper mapper) {
        return new UserRepositoryGateway(repository, mapper);
    }

    @Bean
    UserMapper userMapper() {
        return new UserMapper();
    }
}
