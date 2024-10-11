package br.com.hrbackend.infrastructure.data.repository;

import br.com.hrbackend.infrastructure.data.entityDB.EmployeeDB;

public class EmployeeRepository extends GenericRepository {

    public EmployeeDB getById(int idfuncionario) { return super.em.find(EmployeeDB.class, idfuncionario ); }
}
