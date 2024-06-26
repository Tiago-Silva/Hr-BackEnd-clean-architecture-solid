package br.com.hrbackend.domain.entity;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FuncionarioTest {

    private Date returnDate() {
        LocalDate localDate = LocalDate.of(1990, 10, 10);
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    private Funcionario createFuncionarioMock() {
        Funcionario funcionarioMock = Mockito.mock(Funcionario.class);

        Mockito.when(funcionarioMock.getIdfuncionario()).thenReturn(1);
        Mockito.when(funcionarioMock.getNome()).thenReturn("Funcionario");
        Mockito.when(funcionarioMock.getSobrenome()).thenReturn("Santos");
        Mockito.when(funcionarioMock.getPis()).thenReturn("527.31078.95-3");
        Mockito.when(funcionarioMock.getCpf()).thenReturn("962.289.160-84");
        Mockito.when(funcionarioMock.getCarteiraTrabalho()).thenReturn("16545649412");
        Mockito.when(funcionarioMock.getSerieCtps()).thenReturn("161618");
        Mockito.when(funcionarioMock.getUfCtps()).thenReturn("SP");
        Mockito.when(funcionarioMock.getNascimento()).thenReturn(this.returnDate());
        Mockito.when(funcionarioMock.getCep()).thenReturn("8491616165");
        Mockito.when(funcionarioMock.getSexo()).thenReturn("M");
        Mockito.when(funcionarioMock.getCracha()).thenReturn("123456");
        Mockito.when(funcionarioMock.getTelefone()).thenReturn("77955254678");
        Mockito.when(funcionarioMock.getAdmissao()).thenReturn(this.returnDate());
        Mockito.when(funcionarioMock.getStatus()).thenReturn("Ativo");
        Mockito.when(funcionarioMock.getDepartamento()).thenReturn("TI");
        Mockito.when(funcionarioMock.getCargo()).thenReturn("Desenvolvedor");
        Mockito.when(funcionarioMock.getCargoDescricao()).thenReturn("Desenvolvedor Java");
        Mockito.when(funcionarioMock.getPrimeiroEmprego()).thenReturn("Sim");
        Mockito.when(funcionarioMock.getSalario()).thenReturn(new BigDecimal(2500));
        Mockito.when(funcionarioMock.getBanco()).thenReturn("Banco do Brasil");
        Mockito.when(funcionarioMock.getAgencia()).thenReturn("1234");
        Mockito.when(funcionarioMock.getConta()).thenReturn("123456");
        Mockito.when(funcionarioMock.getEmailGoogle()).thenReturn("funcionario@gmail.com");
        Mockito.when(funcionarioMock.getEmpresa()).thenReturn(new Empresa());
        Mockito.when(funcionarioMock.getPeriodo()).thenReturn(new Periodo());

        return funcionarioMock;
    }

    @Test
    public void shouldHaveRequiredFields() {
        Funcionario funcionario = createFuncionarioMock();

        assertEquals(1, funcionario.getIdfuncionario());
        assertEquals("Funcionario", funcionario.getNome());
        assertEquals("Santos", funcionario.getSobrenome());
        assertEquals("527.31078.95-3", funcionario.getPis());
        assertEquals("962.289.160-84", funcionario.getCpf());
        assertEquals("16545649412", funcionario.getCarteiraTrabalho());
        assertEquals("161618", funcionario.getSerieCtps());
        assertEquals("SP", funcionario.getUfCtps());
        assertEquals(this.returnDate(), funcionario.getNascimento());
        assertEquals("8491616165", funcionario.getCep());
        assertEquals("M", funcionario.getSexo());
        assertEquals("123456", funcionario.getCracha());
        assertEquals("77955254678", funcionario.getTelefone());
        assertEquals(this.returnDate(), funcionario.getAdmissao());
        assertEquals("Ativo", funcionario.getStatus());
        assertEquals("TI", funcionario.getDepartamento());
        assertEquals("Desenvolvedor", funcionario.getCargo());
        assertEquals("Desenvolvedor Java", funcionario.getCargoDescricao());
        assertEquals("Sim", funcionario.getPrimeiroEmprego());
        assertEquals(new BigDecimal(2500), funcionario.getSalario());
        assertEquals("Banco do Brasil", funcionario.getBanco());
        assertEquals("1234", funcionario.getAgencia());
        assertEquals("123456", funcionario.getConta());
        assertEquals("funcionario@gmail.com", funcionario.getEmailGoogle());
        assertEquals(new Empresa(), funcionario.getEmpresa());
        assertEquals(new Periodo(), funcionario.getPeriodo());
    }
}
