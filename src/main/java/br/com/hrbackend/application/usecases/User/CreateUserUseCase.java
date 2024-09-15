package br.com.hrbackend.application.usecases.User;

import br.com.hrbackend.application.gateway.UserGateway;
import br.com.hrbackend.application.usecases.UseCase;
import br.com.hrbackend.domain.entity.Usuario;

public class CreateUserUseCase implements UseCase<Usuario, Usuario> {

    private final UserGateway userGateway;
    public CreateUserUseCase(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public Usuario execute(Usuario usuario) {
        if (
            usuario == null ||
            usuario.getNome().isEmpty() ||
            usuario.getSobrenome().isEmpty() ||
            usuario.getLogin().isEmpty() ||
            usuario.getSenha().isEmpty() ||
            usuario.getTipo().isEmpty() ||
            usuario.getRole().isEmpty()
        ) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        return this.userGateway.createUser(usuario);
    }
}
