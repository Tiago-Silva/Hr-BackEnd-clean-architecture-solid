package br.com.hrbackend.application.usecases;

import br.com.hrbackend.application.gateway.EmployeeGateway;
import br.com.hrbackend.domain.entity.Employee;

public class EmployeeInteract {

    private final EmployeeGateway employeeGateway;
    public EmployeeInteract(EmployeeGateway employeeGateway) {
        this.employeeGateway = employeeGateway;
    }

    public void createEmployee(Employee employee) {
        if (
            employee == null ||
            employee.getNome().isEmpty() ||
            employee.getSobrenome().isEmpty() ||
            employee.getPis().isEmpty() ||
            employee.getCpf().isEmpty() ||
            employee.getCracha().isEmpty() ||
            employee.getTelefone().isEmpty() ||
            employee.getAdmissao().toString().isEmpty()
        ) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        this.employeeGateway.createEmployee(employee);
    }

    public void updateEmployee(Employee employee) {
        if (employee == null || employee.getIdfuncionario() <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        this.employeeGateway.updateEmployee(employee);
    }

    public void deleteEmployee(Employee employee) {
        if (employee == null || employee.getIdfuncionario() <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        this.employeeGateway.deleteEmployee(employee);
    }

    public Employee getEmployeeById(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        return this.employeeGateway.getEmployeeById(id);
    }
}
