package br.com.hrbackend.infrastructure.repository;

import br.com.hrbackend.infrastructure.db.entityDB.UsuarioDB;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UsuarioDB, Integer> {

    UsuarioDB findByIdusuario(int idusuario);
}
