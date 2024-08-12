package br.com.hrbackend.application.gateway;

import br.com.hrbackend.domain.entity.Usuario;


public interface UserGateway {

    void createUser(Usuario usuario);
    void updateUser(Usuario usuario);
    void deleteUser(Usuario usuario);
    Usuario getUserById(int id);
}
