package br.com.hrbackend.application.usecases.User;

import br.com.hrbackend.application.gateway.UserGateway;
import br.com.hrbackend.application.usecases.UseCase;
import br.com.hrbackend.domain.entity.Usuario;

public class UpdateUserUseCase implements UseCase<Usuario, Usuario> {

    private final UserGateway userGateway;
    public UpdateUserUseCase(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public Usuario execute(Usuario usuario) {
        if (usuario == null || usuario.getIdusuario() <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        return this.userGateway.update(usuario);
    }
}
