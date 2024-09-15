package br.com.hrbackend.application.gateway;

import br.com.hrbackend.domain.entity.Employee;

public interface EmployeeGateway {

    Employee createEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    void deleteEmployee(Employee employee);
    Employee getEmployeeById(int id);
}
