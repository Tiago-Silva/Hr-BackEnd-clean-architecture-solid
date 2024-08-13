package br.com.hrbackend.application.gateway;

import br.com.hrbackend.domain.entity.Employee;

public interface EmployeeGateway {

    void createEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(Employee employee);
    Employee getEmployeeById(int id);
}
