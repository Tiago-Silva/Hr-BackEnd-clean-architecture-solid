package br.com.hrbackend.domain.entity;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Time;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PeriodoTest {

    private Periodo createPeriodoMock() {
        Periodo periodo = Mockito.mock(Periodo.class);
        Mockito.when(periodo.getIdperiodo()).thenReturn(1);
        Mockito.when(periodo.getEntrada()).thenReturn(Time.valueOf("08:00:00"));
        Mockito.when(periodo.getSaida()).thenReturn(Time.valueOf("17:00:00"));
        Mockito.when(periodo.getIntervaloEntrada()).thenReturn(Time.valueOf("12:00:00"));
        Mockito.when(periodo.getIntervaloSaida()).thenReturn(Time.valueOf("13:00:00"));
        Mockito.when(periodo.getJornada()).thenReturn("8 horas");
        Mockito.when(periodo.getTipo()).thenReturn("Comercial");
        Mockito.when(periodo.getEmpresa()).thenReturn(new Empresa()); // Substitua por um mock de Empresa se necessário
        return periodo;
    }

    @Test
    public void testPeriodoFields() {
        Periodo periodo = createPeriodoMock();
        assertEquals(1, periodo.getIdperiodo());
        assertEquals(Time.valueOf("08:00:00"), periodo.getEntrada());
        assertEquals(Time.valueOf("17:00:00"), periodo.getSaida());
        assertEquals(Time.valueOf("12:00:00"), periodo.getIntervaloEntrada());
        assertEquals(Time.valueOf("13:00:00"), periodo.getIntervaloSaida());
        assertEquals("8 horas", periodo.getJornada());
        assertEquals("Comercial", periodo.getTipo());
        assertEquals(new Empresa(), periodo.getEmpresa()); // Substitua por uma verificação adequada se necessário
    }
}
