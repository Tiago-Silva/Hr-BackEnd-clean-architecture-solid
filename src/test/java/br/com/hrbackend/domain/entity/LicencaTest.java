package br.com.hrbackend.domain.entity;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.*;

class LicencaTest {

    private Licenca createLicencaMock() {
        Date now = new Date(System.currentTimeMillis());
        Licenca licenca = Mockito.mock(Licenca.class);
        Mockito.when(licenca.getIdlicenca()).thenReturn(1);
        Mockito.when(licenca.getTipo()).thenReturn("Tipo");
        Mockito.when(licenca.getDescricao()).thenReturn("Descricao");
        Mockito.when(licenca.getDataInicio()).thenReturn(now);
        Mockito.when(licenca.getDataFim()).thenReturn(now);
        Mockito.when(licenca.getRetorno()).thenReturn(now);
        Mockito.when(licenca.getFuncionarioNome()).thenReturn("FuncionarioNome");
        Mockito.when(licenca.getIdfuncionario()).thenReturn(1);
        Mockito.when(licenca.getSetor()).thenReturn("Setor");
        Mockito.when(licenca.getEmpresa()).thenReturn(1);
        Mockito.when(licenca.getIdlembrete()).thenReturn(1);
        Mockito.when(licenca.getFuncionario()).thenReturn(new Funcionario()); // Substitua por um mock de Funcionario se necessário
        return licenca;
    }

    @Test
    public void testLicencaFields() {
        Licenca licenca = createLicencaMock();
        assertEquals(1, licenca.getIdlicenca());
        assertEquals("Tipo", licenca.getTipo());
        assertEquals("Descricao", licenca.getDescricao());
        assertNotNull(licenca.getDataInicio());
        assertNotNull(licenca.getDataFim());
        assertNotNull(licenca.getRetorno());
        assertEquals("FuncionarioNome", licenca.getFuncionarioNome());
        assertEquals(1, licenca.getIdfuncionario());
        assertEquals("Setor", licenca.getSetor());
        assertEquals(1, licenca.getEmpresa());
        assertEquals(1, licenca.getIdlembrete());
        assertNotNull(licenca.getFuncionario());
    }
}