package br.com.hrbackend.application.usecases.User;

import br.com.hrbackend.application.gateway.UserGateway;
import br.com.hrbackend.application.usecases.UseCase;
import br.com.hrbackend.domain.entity.User;

public class DeleteUserUseCase implements UseCase<User, Void> {

    private final UserGateway userGateway;
    public DeleteUserUseCase(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public Void execute(User usuario) {
        if (usuario == null || usuario.getUserId() <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        this.userGateway.delete(usuario);
        return null;
    }
}
