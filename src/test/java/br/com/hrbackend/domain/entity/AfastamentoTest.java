package br.com.hrbackend.domain.entity;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AfastamentoTest {

    private Afastamento createAfastamentoMock() {
        Afastamento afastamento = Mockito.mock(Afastamento.class);
        Mockito.when(afastamento.getIdafastamento()).thenReturn(1);
        Mockito.when(afastamento.getDataInicio()).thenReturn(Date.valueOf("2022-01-01"));
        Mockito.when(afastamento.getDataFim()).thenReturn(Date.valueOf("2022-01-31"));
        Mockito.when(afastamento.getMotivo()).thenReturn("Motivo");
        Mockito.when(afastamento.getDescricao()).thenReturn("Descricao");
        Mockito.when(afastamento.getFuncionarioNome()).thenReturn("Funcionario");
        Mockito.when(afastamento.getSetor()).thenReturn("Setor");
        Mockito.when(afastamento.getRetorno()).thenReturn(Date.valueOf("2022-02-01"));
        Mockito.when(afastamento.getEmpresa()).thenReturn(1);
        Mockito.when(afastamento.getIdfuncionario()).thenReturn(1);
        Mockito.when(afastamento.getIdlembrete()).thenReturn(1);
        Mockito.when(afastamento.getFuncionario()).thenReturn(new Funcionario()); // Substitua por um mock de Funcionario se necessário
        return afastamento;
    }

    @Test
    public void testAfastamentoFields() {
        Afastamento afastamento = createAfastamentoMock();
        assertEquals(1, afastamento.getIdafastamento());
        assertEquals(Date.valueOf("2022-01-01"), afastamento.getDataInicio());
        assertEquals(Date.valueOf("2022-01-31"), afastamento.getDataFim());
        assertEquals("Motivo", afastamento.getMotivo());
        assertEquals("Descricao", afastamento.getDescricao());
        assertEquals("Funcionario", afastamento.getFuncionarioNome());
        assertEquals("Setor", afastamento.getSetor());
        assertEquals(Date.valueOf("2022-02-01"), afastamento.getRetorno());
        assertEquals(1, afastamento.getEmpresa());
        assertEquals(1, afastamento.getIdfuncionario());
        assertEquals(1, afastamento.getIdlembrete());
        assertEquals(new Funcionario(), afastamento.getFuncionario());
    }
}
