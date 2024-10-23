package br.com.hrbackend.application.usecases;

import br.com.hrbackend.application.gateway.UserGateway;
import br.com.hrbackend.domain.entity.User;


public class UserInteract {

    private final UserGateway userGateway;
    public UserInteract(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public void createUser(User usuario) {
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
        this.userGateway.save(usuario);
    }

    public void updateUser(User usuario) {
        if (usuario == null || usuario.getUserId() <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        this.userGateway.update(usuario);
    }

    public void deleteUser(User usuario) {
        if (usuario == null || usuario.getUserId() <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        this.userGateway.delete(usuario);
    }

    public User getUserById(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        return this.userGateway.getId(id);
    }
}
