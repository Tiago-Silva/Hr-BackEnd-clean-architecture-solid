package br.com.hrbackend.domain.entity;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvisoPrevioTest {

    private AvisoPrevio createAvisoPrevioMock() {
        AvisoPrevio avisoPrevio = Mockito.mock(AvisoPrevio.class);
        Mockito.when(avisoPrevio.getIdavisoPrevio()).thenReturn(1);
        Mockito.when(avisoPrevio.getMotivo()).thenReturn("Motivo");
        Mockito.when(avisoPrevio.getDescricao()).thenReturn("Descricao");
        Mockito.when(avisoPrevio.getDataInicio()).thenReturn(Date.valueOf("2022-01-01"));
        Mockito.when(avisoPrevio.getDataFim()).thenReturn(Date.valueOf("2022-01-31"));
        Mockito.when(avisoPrevio.getFuncionarioNome()).thenReturn("Funcionario");
        Mockito.when(avisoPrevio.getIdfuncionario()).thenReturn(1);
        Mockito.when(avisoPrevio.getSetor()).thenReturn("Setor");
        Mockito.when(avisoPrevio.getEmpresa()).thenReturn(1);
        Mockito.when(avisoPrevio.getRetorno()).thenReturn(Date.valueOf("2022-02-01"));
        Mockito.when(avisoPrevio.getIdlembrete()).thenReturn(1);
        Mockito.when(avisoPrevio.getTipoAviso()).thenReturn("Tipo");
        Mockito.when(avisoPrevio.getDias()).thenReturn("30");
        Mockito.when(avisoPrevio.getEmployee()).thenReturn(new Employee()); // Substitua por um mock de Funcionario se necessário
        return avisoPrevio;
    }

    @Test
    public void testAvisoPrevioFields() {
        AvisoPrevio avisoPrevio = createAvisoPrevioMock();
        assertEquals(1, avisoPrevio.getIdavisoPrevio());
        assertEquals("Motivo", avisoPrevio.getMotivo());
        assertEquals("Descricao", avisoPrevio.getDescricao());
        assertEquals(Date.valueOf("2022-01-01"), avisoPrevio.getDataInicio());
        assertEquals(Date.valueOf("2022-01-31"), avisoPrevio.getDataFim());
        assertEquals("Funcionario", avisoPrevio.getFuncionarioNome());
        assertEquals(1, avisoPrevio.getIdfuncionario());
        assertEquals("Setor", avisoPrevio.getSetor());
        assertEquals(1, avisoPrevio.getEmpresa());
        assertEquals(Date.valueOf("2022-02-01"), avisoPrevio.getRetorno());
        assertEquals(1, avisoPrevio.getIdlembrete());
        assertEquals("Tipo", avisoPrevio.getTipoAviso());
        assertEquals("30", avisoPrevio.getDias());
        assertEquals(new Employee(), avisoPrevio.getEmployee());
    }
}
