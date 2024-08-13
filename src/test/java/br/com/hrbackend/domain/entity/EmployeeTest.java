package br.com.hrbackend.domain.entity;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    private Date returnDate() {
        LocalDate localDate = LocalDate.of(1990, 10, 10);
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    private Employee createFuncionarioMock() {
        Employee employeeMock = Mockito.mock(Employee.class);

        Mockito.when(employeeMock.getIdfuncionario()).thenReturn(1);
        Mockito.when(employeeMock.getNome()).thenReturn("Funcionario");
        Mockito.when(employeeMock.getSobrenome()).thenReturn("Santos");
        Mockito.when(employeeMock.getPis()).thenReturn("527.31078.95-3");
        Mockito.when(employeeMock.getCpf()).thenReturn("962.289.160-84");
        Mockito.when(employeeMock.getCarteiraTrabalho()).thenReturn("16545649412");
        Mockito.when(employeeMock.getSerieCtps()).thenReturn("161618");
        Mockito.when(employeeMock.getUfCtps()).thenReturn("SP");
        Mockito.when(employeeMock.getNascimento()).thenReturn(this.returnDate());
        Mockito.when(employeeMock.getCep()).thenReturn("8491616165");
        Mockito.when(employeeMock.getSexo()).thenReturn("M");
        Mockito.when(employeeMock.getCracha()).thenReturn("123456");
        Mockito.when(employeeMock.getTelefone()).thenReturn("77955254678");
        Mockito.when(employeeMock.getAdmissao()).thenReturn(this.returnDate());
        Mockito.when(employeeMock.getStatus()).thenReturn("Ativo");
        Mockito.when(employeeMock.getDepartamento()).thenReturn("TI");
        Mockito.when(employeeMock.getCargo()).thenReturn("Desenvolvedor");
        Mockito.when(employeeMock.getCargoDescricao()).thenReturn("Desenvolvedor Java");
        Mockito.when(employeeMock.getPrimeiroEmprego()).thenReturn("Sim");
        Mockito.when(employeeMock.getSalario()).thenReturn(new BigDecimal(2500));
        Mockito.when(employeeMock.getBanco()).thenReturn("Banco do Brasil");
        Mockito.when(employeeMock.getAgencia()).thenReturn("1234");
        Mockito.when(employeeMock.getConta()).thenReturn("123456");
        Mockito.when(employeeMock.getEmailGoogle()).thenReturn("funcionario@gmail.com");
        Mockito.when(employeeMock.getEmpresa()).thenReturn(new Empresa());
        Mockito.when(employeeMock.getPeriodo()).thenReturn(new Periodo());

        return employeeMock;
    }

    @Test
    public void shouldHaveRequiredFields() {
        Employee employee = createFuncionarioMock();

        assertEquals(1, employee.getIdfuncionario());
        assertEquals("Funcionario", employee.getNome());
        assertEquals("Santos", employee.getSobrenome());
        assertEquals("527.31078.95-3", employee.getPis());
        assertEquals("962.289.160-84", employee.getCpf());
        assertEquals("16545649412", employee.getCarteiraTrabalho());
        assertEquals("161618", employee.getSerieCtps());
        assertEquals("SP", employee.getUfCtps());
        assertEquals(this.returnDate(), employee.getNascimento());
        assertEquals("8491616165", employee.getCep());
        assertEquals("M", employee.getSexo());
        assertEquals("123456", employee.getCracha());
        assertEquals("77955254678", employee.getTelefone());
        assertEquals(this.returnDate(), employee.getAdmissao());
        assertEquals("Ativo", employee.getStatus());
        assertEquals("TI", employee.getDepartamento());
        assertEquals("Desenvolvedor", employee.getCargo());
        assertEquals("Desenvolvedor Java", employee.getCargoDescricao());
        assertEquals("Sim", employee.getPrimeiroEmprego());
        assertEquals(new BigDecimal(2500), employee.getSalario());
        assertEquals("Banco do Brasil", employee.getBanco());
        assertEquals("1234", employee.getAgencia());
        assertEquals("123456", employee.getConta());
        assertEquals("funcionario@gmail.com", employee.getEmailGoogle());
        assertEquals(new Empresa(), employee.getEmpresa());
        assertEquals(new Periodo(), employee.getPeriodo());
    }
}
