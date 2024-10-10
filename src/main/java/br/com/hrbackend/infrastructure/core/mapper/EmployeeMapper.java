package br.com.hrbackend.infrastructure.core.mapper;

import br.com.hrbackend.domain.entity.Employee;
import br.com.hrbackend.infrastructure.data.entityDB.EmployeeDB;
import br.com.hrbackend.infrastructure.web.dto.EmployeeRequestDTO;
import br.com.hrbackend.infrastructure.web.dto.EmployeeResponseDTO;
import br.com.hrbackend.infrastructure.web.dto.EmpresaResponseDTO;
import br.com.hrbackend.infrastructure.web.dto.PeriodResponseDTO;

public class EmployeeMapper {

    public EmployeeRequestDTO domainObjectToRequestDTO(Employee employee, EmpresaResponseDTO empress, PeriodResponseDTO period) {
        return new EmployeeRequestDTO(
                employee.getNome(),
                employee.getSobrenome(),
                employee.getPis(),
                employee.getCpf(),
                employee.getRg(),
                employee.getExpedicaoRg().toString(),
                employee.getEmissorRg(),
                employee.getUfRg(),
                employee.getCarteiraMotorista(),
                employee.getCategoriaCnh(),
                employee.getExpedicaoCnh().toString(),
                employee.getValidadeCnh().toString(),
                employee.getCarteiraTrabalho(),
                employee.getSerieCtps(),
                employee.getUfCtps(),
                employee.getTituloEleitor(),
                employee.getNascimento().toString(),
                employee.getNacionalidade(),
                employee.getCep(),
                employee.getEstado(),
                employee.getBairro(),
                employee.getCidade(),
                employee.getEndereco(),
                employee.getSexo(),
                employee.getEstadoCivil(),
                employee.getMae(),
                employee.getPai(),
                employee.getCracha(),
                employee.getTelefone(),
                employee.getAdmissao().toString(),
                employee.getDemissao().toString(),
                employee.getStatus(),
                employee.getMotivoDemissao(),
                employee.getDepartamento(),
                employee.getCargo(),
                employee.getCargoDescricao(),
                employee.getExameAdmissional().toString(),
                employee.getPeriodoExperiencia(),
                employee.getPrimeiroEmprego(),
                employee.getContribuicaoSocial(),
                employee.getIdadmissao(),
                employee.getVinculo(),
                employee.getSalario(),
                employee.getBanco(),
                employee.getAgencia(),
                employee.getConta(),
                employee.getEmailGoogle(),
                employee.getEmailHotmail(),
                employee.getLocalExame(),
                employee.getUrlImage(),
                empress,
                period
        );
    }

    public EmployeeResponseDTO domainObjectToResponseDTO(Employee employee, EmpresaResponseDTO empress, PeriodResponseDTO period) {
        return new EmployeeResponseDTO(
                employee.getIdfuncionario(),
                employee.getNome(),
                employee.getSobrenome(),
                employee.getPis(),
                employee.getCpf(),
                employee.getRg(),
                employee.getExpedicaoRg().toString(),
                employee.getEmissorRg(),
                employee.getUfRg(),
                employee.getCarteiraMotorista(),
                employee.getCategoriaCnh(),
                employee.getExpedicaoCnh().toString(),
                employee.getValidadeCnh().toString(),
                employee.getCarteiraTrabalho(),
                employee.getSerieCtps(),
                employee.getUfCtps(),
                employee.getTituloEleitor(),
                employee.getNascimento().toString(),
                employee.getNacionalidade(),
                employee.getCep(),
                employee.getEstado(),
                employee.getBairro(),
                employee.getCidade(),
                employee.getEndereco(),
                employee.getSexo(),
                employee.getEstadoCivil(),
                employee.getMae(),
                employee.getPai(),
                employee.getCracha(),
                employee.getTelefone(),
                employee.getAdmissao().toString(),
                employee.getDemissao().toString(),
                employee.getStatus(),
                employee.getMotivoDemissao(),
                employee.getDepartamento(),
                employee.getCargo(),
                employee.getCargoDescricao(),
                employee.getExameAdmissional().toString(),
                employee.getPeriodoExperiencia(),
                employee.getPrimeiroEmprego(),
                employee.getContribuicaoSocial(),
                employee.getIdadmissao(),
                employee.getVinculo(),
                employee.getSalario(),
                employee.getBanco(),
                employee.getAgencia(),
                employee.getConta(),
                employee.getEmailGoogle(),
                employee.getEmailHotmail(),
                employee.getLocalExame(),
                employee.getUrlImage(),
                empress,
                period
        );
    }

    public Employee requestDTOToDomainObject(EmployeeRequestDTO requestDTO) {
        return Employee.withRequestDTO(requestDTO);
    }

    public Employee responseDTOToDomainObject(EmployeeResponseDTO responseDTO) {
        return Employee.withResponseDTO(responseDTO);
    }

    public EmployeeDB toEmployeeDB(Employee employee) {
        return new EmployeeDB(employee);
    }

    public Employee toEmployee(EmployeeDB employeeDB) {
        return Employee.withEntityDB(employeeDB);
    }
}
