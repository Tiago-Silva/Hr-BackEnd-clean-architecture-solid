package br.com.hrbackend.application.usecases.Employee;

import br.com.hrbackend.application.gateway.EmployeeGateway;
import br.com.hrbackend.application.usecases.UseCase;
import br.com.hrbackend.domain.entity.Employee;

public class UpdateEmployeeUseCase implements UseCase<Employee, Employee> {

    private final EmployeeGateway employeeGateway;
    public UpdateEmployeeUseCase(EmployeeGateway employeeGateway) {
        this.employeeGateway = employeeGateway;
    }

    @Override
    public Employee execute(Employee employee) {
        if (employee == null || employee.getIdfuncionario() <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        return this.employeeGateway.updateEmployee(employee);
    }
}
