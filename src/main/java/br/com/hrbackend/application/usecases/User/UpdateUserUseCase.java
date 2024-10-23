package br.com.hrbackend.application.usecases.User;

import br.com.hrbackend.application.gateway.UserGateway;
import br.com.hrbackend.application.usecases.UseCase;
import br.com.hrbackend.domain.entity.User;

public class UpdateUserUseCase implements UseCase<User, User> {

    private final UserGateway userGateway;
    public UpdateUserUseCase(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public User execute(User usuario) {
        if (usuario == null || usuario.getUserId() <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        return this.userGateway.update(usuario);
    }
}
