package br.com.hrbackend.domain.entity;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdmissaoTest {

    private Admissao createAdmissaoMock() {
        Admissao admissao = Mockito.mock(Admissao.class);
        Mockito.when(admissao.getIdadmissao()).thenReturn(1);
        Mockito.when(admissao.getData()).thenReturn(new Date());
        Mockito.when(admissao.getExameAdmissional()).thenReturn(new Date());
        Mockito.when(admissao.getPeriodoExperiencia()).thenReturn("90 dias");
        Mockito.when(admissao.getPrimeiroEmprego()).thenReturn("Não");
        Mockito.when(admissao.getContribuicaoSocial()).thenReturn("Sim");
        Mockito.when(admissao.getDepartamento()).thenReturn("Desenvolvimento");
        Mockito.when(admissao.getCargo()).thenReturn("Desenvolvedor");
        Mockito.when(admissao.getPeriodo()).thenReturn("Integral");
        Mockito.when(admissao.getEmployee()).thenReturn(new Employee()); // Substitua por um mock de Funcionario se necessário
        return admissao;
    }

    @Test
    public void testAdmissaoFields() {
        Admissao admissao = createAdmissaoMock();
        assertEquals(1, admissao.getIdadmissao());
        assertEquals("90 dias", admissao.getPeriodoExperiencia());
        assertEquals("Não", admissao.getPrimeiroEmprego());
        assertEquals("Sim", admissao.getContribuicaoSocial());
        assertEquals("Desenvolvimento", admissao.getDepartamento());
        assertEquals("Desenvolvedor", admissao.getCargo());
        assertEquals("Integral", admissao.getPeriodo());
        assertEquals(new Employee(), admissao.getEmployee()); // Substitua por uma verificação adequada se necessário
    }
}
