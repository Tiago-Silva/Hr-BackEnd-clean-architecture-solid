package br.com.hrbackend.infrastructure.core.gateway;

import br.com.hrbackend.application.gateway.EmployeeGateway;
import br.com.hrbackend.domain.entity.Employee;
import br.com.hrbackend.infrastructure.core.mapper.EmployeeMapper;
import br.com.hrbackend.infrastructure.data.repository.EmployeeRepository;

public class EmployeeRepositoryGateway implements EmployeeGateway {

    private final EmployeeRepository repository;
    private final EmployeeMapper mapper;
    public EmployeeRepositoryGateway(EmployeeRepository repository, EmployeeMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Employee save(Employee object) {
        this.repository.save(this.mapper.toEmployeeDB(object));
        return object;
    }

    @Override
    public Employee update(Employee object) {
        this.repository.update(this.mapper.toEmployeeDB(object));
        return object;
    }

    @Override
    public void delete(Employee object) {
        this.repository.delete(this.mapper.toEmployeeDB(object));
    }

    @Override
    public Employee getId(int objectId) {
        return this.mapper.toEmployee(this.repository.getById(objectId));
    }
}
