package br.com.hrbackend.infrastructure.data.repository;

import br.com.hrbackend.infrastructure.data.entityDB.UsuarioDB;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UsuarioDB, Integer> {

    UsuarioDB findByIdusuario(int idusuario);
}
