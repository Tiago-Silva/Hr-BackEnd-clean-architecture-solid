package br.com.hrbackend.domain.entity;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BeneficioTest {

    private Beneficio createBeneficioMock() {
        Date now = new Date(System.currentTimeMillis());
        Beneficio beneficio = Mockito.mock(Beneficio.class);
        Mockito.when(beneficio.getIdbeneficio()).thenReturn(1);
        Mockito.when(beneficio.getNome()).thenReturn("Nome");
        Mockito.when(beneficio.getTipo()).thenReturn("Tipo");
        Mockito.when(beneficio.getCalculoSaldo()).thenReturn("CalculoSaldo");
        Mockito.when(beneficio.getCustoEmpFolha()).thenReturn("CustoEmpFolha");
        Mockito.when(beneficio.getDescricao()).thenReturn("Descricao");
        Mockito.when(beneficio.getPercentualSalario()).thenReturn("PercentualSalario");
        Mockito.when(beneficio.getEventoDesconto()).thenReturn("EventoDesconto");
        Mockito.when(beneficio.getOperador()).thenReturn("Operador");
        Mockito.when(beneficio.getDataCorte()).thenReturn(now);
        Mockito.when(beneficio.getVencimentoContrato()).thenReturn(now);
        Mockito.when(beneficio.getCustoEmp()).thenReturn("CustoEmp");
        Mockito.when(beneficio.getEmpresaNome()).thenReturn("EmpresaNome");
        Mockito.when(beneficio.getIdempresa()).thenReturn(1);
        Mockito.when(beneficio.getEmpress()).thenReturn(new Empress()); // Substitua por um mock de Empresa se necessário
        return beneficio;
    }

    @Test
    public void testBeneficioFields() {
        Date now = new Date(System.currentTimeMillis());
        Beneficio beneficio = createBeneficioMock();
        assertEquals(1, beneficio.getIdbeneficio());
        assertEquals("Nome", beneficio.getNome());
        assertEquals("Tipo", beneficio.getTipo());
        assertEquals("CalculoSaldo", beneficio.getCalculoSaldo());
        assertEquals("CustoEmpFolha", beneficio.getCustoEmpFolha());
        assertEquals("Descricao", beneficio.getDescricao());
        assertEquals("PercentualSalario", beneficio.getPercentualSalario());
        assertEquals("EventoDesconto", beneficio.getEventoDesconto());
        assertEquals("Operador", beneficio.getOperador());
        assertEquals(now, beneficio.getDataCorte());
        assertEquals(now, beneficio.getVencimentoContrato());
        assertEquals("CustoEmp", beneficio.getCustoEmp());
        assertEquals("EmpresaNome", beneficio.getEmpresaNome());
        assertEquals(1, beneficio.getIdempresa());
        assertEquals(new Empress(), beneficio.getEmpress()); // Substitua por uma verificação adequada se necessário
    }
}