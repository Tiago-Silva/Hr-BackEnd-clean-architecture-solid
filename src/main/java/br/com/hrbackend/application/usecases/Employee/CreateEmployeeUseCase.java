package br.com.hrbackend.application.usecases.Employee;

import br.com.hrbackend.application.gateway.EmployeeGateway;
import br.com.hrbackend.application.usecases.UseCase;
import br.com.hrbackend.domain.entity.Employee;

public class CreateEmployeeUseCase implements UseCase<Employee, Employee> {

    private final EmployeeGateway employeeGateway;
    public CreateEmployeeUseCase(EmployeeGateway employeeGateway) {
        this.employeeGateway = employeeGateway;
    }

    @Override
    public Employee execute(Employee inputDTO) {
        if (
            inputDTO == null ||
            inputDTO.getNome().isEmpty() ||
            inputDTO.getSobrenome().isEmpty() ||
            inputDTO.getPis().isEmpty() ||
            inputDTO.getCpf().isEmpty() ||
            inputDTO.getCracha().isEmpty() ||
            inputDTO.getTelefone().isEmpty() ||
            inputDTO.getAdmissao().toString().isEmpty()
        ) {
            throw new IllegalArgumentException("Invalid arguments");
        }

        return this.employeeGateway.createEmployee(inputDTO);
    }
}
