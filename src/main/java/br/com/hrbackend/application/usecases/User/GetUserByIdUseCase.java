package br.com.hrbackend.application.usecases.User;

import br.com.hrbackend.application.gateway.UserGateway;
import br.com.hrbackend.application.usecases.UseCase;
import br.com.hrbackend.domain.entity.User;

public class GetUserByIdUseCase implements UseCase<Integer, User> {

    private final UserGateway userGateway;
    public GetUserByIdUseCase(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public User execute(Integer id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        return this.userGateway.getId(id);
    }
}
