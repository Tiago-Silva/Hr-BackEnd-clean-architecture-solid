package br.com.hrbackend.infrastructure.data.repository;

import br.com.hrbackend.infrastructure.data.entityDB.PeriodoDB;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeriodRepository extends JpaRepository<PeriodoDB, Integer> {

    PeriodoDB findByIdperiodo(int idperiodo);
}
