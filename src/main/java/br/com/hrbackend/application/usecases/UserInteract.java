package br.com.hrbackend.application.usecases;

import br.com.hrbackend.application.gateway.UserGateway;
import br.com.hrbackend.domain.entity.Usuario;


public class UserInteract {

    private final UserGateway userGateway;
    public UserInteract(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public void createUser(Usuario usuario) {
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
        this.userGateway.save(usuario);
    }

    public void updateUser(Usuario usuario) {
        if (usuario == null || usuario.getIdusuario() <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        this.userGateway.update(usuario);
    }

    public void deleteUser(Usuario usuario) {
        if (usuario == null || usuario.getIdusuario() <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        this.userGateway.delete(usuario);
    }

    public Usuario getUserById(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        return this.userGateway.getId(id);
    }
}
