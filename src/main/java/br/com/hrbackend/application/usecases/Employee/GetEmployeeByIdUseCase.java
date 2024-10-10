package br.com.hrbackend.application.usecases.Employee;

import br.com.hrbackend.application.gateway.EmployeeGateway;
import br.com.hrbackend.application.usecases.UseCase;
import br.com.hrbackend.domain.entity.Employee;

public class GetEmployeeByIdUseCase implements UseCase<Integer, Employee> {

    private final EmployeeGateway employeeGateway;
    public GetEmployeeByIdUseCase(EmployeeGateway employeeGateway) {
        this.employeeGateway = employeeGateway;
    }

    @Override
    public Employee execute(Integer id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        return this.employeeGateway.getId(id);
    }
}
