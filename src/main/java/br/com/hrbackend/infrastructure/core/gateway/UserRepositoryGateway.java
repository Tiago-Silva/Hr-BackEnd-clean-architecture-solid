package br.com.hrbackend.infrastructure.core.gateway;

import br.com.hrbackend.application.gateway.UserGateway;
import br.com.hrbackend.domain.entity.Usuario;
import br.com.hrbackend.infrastructure.core.mapper.UserMapper;
import br.com.hrbackend.infrastructure.data.repository.UserRepository;

public class UserRepositoryGateway implements UserGateway {

    private final UserRepository repository;
    private final UserMapper mapper;
    public UserRepositoryGateway(UserRepository repository, UserMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Usuario save(Usuario usuario) {
        this.repository.save(this.mapper.toUserDB(usuario));
        return usuario;
    }

    @Override
    public Usuario update(Usuario usuario) {
        this.repository.save(this.mapper.toUserDB(usuario));
        return usuario;
    }

    @Override
    public void delete(Usuario usuario) {
        this.repository.delete(this.mapper.toUserDB(usuario));
    }

    @Override
    public Usuario getId(int id) {
        return this.mapper.toUser(this.repository.findByIdusuario(id));
    }
}
