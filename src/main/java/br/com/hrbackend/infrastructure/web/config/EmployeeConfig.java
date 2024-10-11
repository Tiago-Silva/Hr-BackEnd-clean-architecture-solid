package br.com.hrbackend.infrastructure.web.config;

import br.com.hrbackend.application.gateway.EmployeeGateway;
import br.com.hrbackend.application.usecases.Employee.CreateEmployeeUseCase;
import br.com.hrbackend.application.usecases.Employee.DeleteEmployeeUseCase;
import br.com.hrbackend.application.usecases.Employee.GetEmployeeByIdUseCase;
import br.com.hrbackend.application.usecases.Employee.UpdateEmployeeUseCase;
import br.com.hrbackend.infrastructure.core.gateway.EmployeeRepositoryGateway;
import br.com.hrbackend.infrastructure.core.mapper.EmployeeMapper;
import br.com.hrbackend.infrastructure.data.repository.EmployeeRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {

    @Bean
    CreateEmployeeUseCase createEmployeeUseCase(EmployeeGateway employeeGateway) {
        return new CreateEmployeeUseCase(employeeGateway);
    }

    @Bean
    UpdateEmployeeUseCase updateEmployeeUseCase(EmployeeGateway employeeGateway) {
        return new UpdateEmployeeUseCase(employeeGateway);
    }

    @Bean
    DeleteEmployeeUseCase deleteEmployeeUseCase(EmployeeGateway employeeGateway) {
        return new DeleteEmployeeUseCase(employeeGateway);
    }

    @Bean
    GetEmployeeByIdUseCase getEmployeeByIdUseCase(EmployeeGateway employeeGateway) {
        return new GetEmployeeByIdUseCase(employeeGateway);
    }

    @Bean
    EmployeeGateway employeeGateway(EmployeeRepository repository, EmployeeMapper mapper) {
        return new EmployeeRepositoryGateway(repository, mapper);
    }

    @Bean
    EmployeeRepository employeeRepository() { return new EmployeeRepository(); }

    @Bean
    EmployeeMapper employeeMapper() { return new EmployeeMapper(); }
}
