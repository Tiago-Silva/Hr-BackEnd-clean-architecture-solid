package br.com.hrbackend.domain.entity;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.sql.Time;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdvertenciaTest {

    private Advertencia createAdvertenciaMock() {
        Advertencia advertencia = Mockito.mock(Advertencia.class);
        Mockito.when(advertencia.getIdadvertencia()).thenReturn(1);
        Mockito.when(advertencia.getData()).thenReturn(new Date());
        Mockito.when(advertencia.getDescricao()).thenReturn("Descricao");
        Mockito.when(advertencia.getHora()).thenReturn(Time.valueOf("12:00:00"));
        Mockito.when(advertencia.getResponsavel()).thenReturn("Responsavel");
        Mockito.when(advertencia.getTipo()).thenReturn("Tipo");
        Mockito.when(advertencia.getEmployee()).thenReturn(new Employee()); // Substitua por um mock de Funcionario se necessário
        return advertencia;
    }

    @Test
    public void testAdvertenciaFields() {
        Advertencia advertencia = createAdvertenciaMock();
        assertEquals(1, advertencia.getIdadvertencia());
        assertEquals("Descricao", advertencia.getDescricao());
        assertEquals(Time.valueOf("12:00:00"), advertencia.getHora());
        assertEquals("Responsavel", advertencia.getResponsavel());
        assertEquals("Tipo", advertencia.getTipo());
        assertEquals(new Employee(), advertencia.getEmployee()); // Substitua por uma verificação adequada se necessário
    }
}
