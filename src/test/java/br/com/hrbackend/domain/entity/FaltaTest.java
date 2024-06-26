package br.com.hrbackend.domain.entity;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import static org.junit.jupiter.api.Assertions.*;

class FaltaTest {

    private Falta createFaltaMock() {
        Date now = new Date(System.currentTimeMillis());
        Timestamp timeNow = new Timestamp(System.currentTimeMillis());
        Falta falta = Mockito.mock(Falta.class);
        Mockito.when(falta.getIdfalta()).thenReturn(1);
        Mockito.when(falta.getData()).thenReturn(now);
        Mockito.when(falta.getDias()).thenReturn(new BigDecimal("10"));
        Mockito.when(falta.getHoras()).thenReturn(new BigDecimal("8"));
        Mockito.when(falta.getLancamento()).thenReturn(timeNow);
        Mockito.when(falta.getMotivo()).thenReturn("Motivo");
        Mockito.when(falta.getTipo()).thenReturn("Tipo");
        Mockito.when(falta.getMedico()).thenReturn("Medico");
        Mockito.when(falta.getMes()).thenReturn(1);
        Mockito.when(falta.getAno()).thenReturn("2024");
        Mockito.when(falta.getIdcid()).thenReturn(1);
        Mockito.when(falta.getDescricaoCid()).thenReturn("DescricaoCid");
        Mockito.when(falta.getDataInicial()).thenReturn(now);
        Mockito.when(falta.getDataFinal()).thenReturn(now);
        Mockito.when(falta.getHoraInicial()).thenReturn(Time.valueOf("12:00:00"));
        Mockito.when(falta.getHoraFinal()).thenReturn(Time.valueOf("12:00:00"));
        Mockito.when(falta.getDuracao()).thenReturn("8 horas");
        Mockito.when(falta.getRetorno()).thenReturn(now);
        Mockito.when(falta.getIdfuncionario()).thenReturn(1);
        Mockito.when(falta.getFuncionarioNome()).thenReturn("FuncionarioNome");
        Mockito.when(falta.getDepartamento()).thenReturn("Departamento");
        Mockito.when(falta.getEmpresa()).thenReturn(1);
        Mockito.when(falta.getIdlembrete()).thenReturn(1);
        Mockito.when(falta.getFuncionario()).thenReturn(new Funcionario());
        return falta;
    }

    @Test
    public void testFaltaFields() {
        Date now = new Date(System.currentTimeMillis());
        Timestamp timeNow = new Timestamp(System.currentTimeMillis());
        Falta falta = createFaltaMock();
        assertEquals(1, falta.getIdfalta());
        assertEquals(now, falta.getData());
        assertEquals(new BigDecimal("10"), falta.getDias());
        assertEquals(new BigDecimal("8"), falta.getHoras());
        assertEquals(timeNow, falta.getLancamento());
        assertEquals("Motivo", falta.getMotivo());
        assertEquals("Tipo", falta.getTipo());
        assertEquals("Medico", falta.getMedico());
        assertEquals(1, falta.getMes());
        assertEquals("2024", falta.getAno());
        assertEquals(1, falta.getIdcid());
        assertEquals("DescricaoCid", falta.getDescricaoCid());
        assertEquals(now, falta.getDataInicial());
        assertEquals(now, falta.getDataFinal());
        assertEquals(Time.valueOf("12:00:00"), falta.getHoraInicial());
        assertEquals(Time.valueOf("12:00:00"), falta.getHoraFinal());
        assertEquals("8 horas", falta.getDuracao());
        assertEquals(now, falta.getRetorno());
        assertEquals(1, falta.getIdfuncionario());
        assertEquals("FuncionarioNome", falta.getFuncionarioNome());
        assertEquals("Departamento", falta.getDepartamento());
        assertEquals(1, falta.getEmpresa());
        assertEquals(1, falta.getIdlembrete());
        assertEquals(new Funcionario(), falta.getFuncionario());
    }
}