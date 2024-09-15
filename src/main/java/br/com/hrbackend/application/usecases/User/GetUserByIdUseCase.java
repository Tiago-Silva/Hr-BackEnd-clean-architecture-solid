package br.com.hrbackend.application.usecases.User;

import br.com.hrbackend.application.gateway.UserGateway;
import br.com.hrbackend.application.usecases.UseCase;
import br.com.hrbackend.domain.entity.Usuario;

public class GetUserByIdUseCase implements UseCase<Integer, Usuario> {

    private final UserGateway userGateway;
    public GetUserByIdUseCase(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public Usuario execute(Integer id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        return this.userGateway.getUserById(id);
    }
}
