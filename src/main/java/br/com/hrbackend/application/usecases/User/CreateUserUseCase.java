package br.com.hrbackend.application.usecases.User;

import br.com.hrbackend.application.gateway.UserGateway;
import br.com.hrbackend.application.usecases.UseCase;
import br.com.hrbackend.domain.entity.User;

public class CreateUserUseCase implements UseCase<User, User> {

    private final UserGateway userGateway;
    public CreateUserUseCase(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public User execute(User usuario) {
        if (
            usuario == null ||
            usuario.getFirstName().isEmpty() ||
            usuario.getLastName().isEmpty() ||
            usuario.getUserName().isEmpty() ||
            usuario.getPassword().isEmpty() ||
            usuario.getType().isEmpty() ||
            usuario.getRole().isEmpty()
        ) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        return this.userGateway.save(usuario);
    }
}
