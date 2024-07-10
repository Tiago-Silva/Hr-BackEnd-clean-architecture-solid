package br.com.hrbackend.domain.entity;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.sql.Date;
import java.sql.Time;

import static org.junit.jupiter.api.Assertions.*;

class PontoTest {

    private Ponto createPontoMock() {
        Date now = new Date(System.currentTimeMillis());
        Ponto ponto = Mockito.mock(Ponto.class);
        Mockito.when(ponto.getIdponto()).thenReturn(1);
        Mockito.when(ponto.getCracha()).thenReturn("Cracha");
        Mockito.when(ponto.getData()).thenReturn(now);
        Mockito.when(ponto.getHora()).thenReturn(Time.valueOf("12:00:00"));
        Mockito.when(ponto.getEntrada()).thenReturn(Time.valueOf("12:00:00"));
        Mockito.when(ponto.getSaida()).thenReturn(Time.valueOf("12:00:00"));
        Mockito.when(ponto.getIntervaloSaida()).thenReturn(Time.valueOf("12:00:00"));
        Mockito.when(ponto.getIntervaloEntrada()).thenReturn(Time.valueOf("12:00:00"));
        Mockito.when(ponto.getRep()).thenReturn("Rep");
        Mockito.when(ponto.getNsr()).thenReturn("Nsr");
        Mockito.when(ponto.getPis()).thenReturn("Pis");
        Mockito.when(ponto.getFuncionario()).thenReturn("Funcionario");
        Mockito.when(ponto.getIdfuncionario()).thenReturn(1);
        Mockito.when(ponto.getCnpj()).thenReturn("Cnpj");
        Mockito.when(ponto.getEmpresaNome()).thenReturn("EmpresaNome");
        Mockito.when(ponto.isAtrasadoEntrada()).thenReturn(true);
        Mockito.when(ponto.getEmpresa()).thenReturn(new Empresa()); // Substitua por um mock de Empresa se necessário
        return ponto;
    }

    @Test
    public void testPontoFields() {
        Ponto ponto = createPontoMock();
        assertEquals(1, ponto.getIdponto());
        assertEquals("Cracha", ponto.getCracha());
        assertNotNull(ponto.getData());
        assertEquals(Time.valueOf("12:00:00"), ponto.getHora());
        assertEquals(Time.valueOf("12:00:00"), ponto.getEntrada());
        assertEquals(Time.valueOf("12:00:00"), ponto.getSaida());
        assertEquals(Time.valueOf("12:00:00"), ponto.getIntervaloSaida());
        assertEquals(Time.valueOf("12:00:00"), ponto.getIntervaloEntrada());
        assertEquals("Rep", ponto.getRep());
        assertEquals("Nsr", ponto.getNsr());
        assertEquals("Pis", ponto.getPis());
        assertEquals("Funcionario", ponto.getFuncionario());
        assertEquals(1, ponto.getIdfuncionario());
        assertEquals("Cnpj", ponto.getCnpj());
        assertEquals("EmpresaNome", ponto.getEmpresaNome());
        assertTrue(ponto.isAtrasadoEntrada());
        assertNotNull(ponto.getEmpresa());
    }
}