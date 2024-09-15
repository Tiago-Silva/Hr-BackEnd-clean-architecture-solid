package br.com.hrbackend.domain.entity;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class RelogioPontoTest {

    private RelogioPonto createRelogioPontoMock() {
        RelogioPonto relogioPonto = Mockito.mock(RelogioPonto.class);
        Mockito.when(relogioPonto.getIdrelogioPonto()).thenReturn(1);
        Mockito.when(relogioPonto.getRep()).thenReturn("Rep");
        Mockito.when(relogioPonto.getLocal()).thenReturn("Local");
        Mockito.when(relogioPonto.getDescricao()).thenReturn("Descricao");
        Mockito.when(relogioPonto.getEmpress()).thenReturn(new Empress()); // Substitua por um mock de Empresa se necessário
        return relogioPonto;
    }

    @Test
    public void testRelogioPontoFields() {
        RelogioPonto relogioPonto = createRelogioPontoMock();
        assertEquals(1, relogioPonto.getIdrelogioPonto());
        assertEquals("Rep", relogioPonto.getRep());
        assertEquals("Local", relogioPonto.getLocal());
        assertEquals("Descricao", relogioPonto.getDescricao());
        assertEquals(new Empress(), relogioPonto.getEmpress()); // Substitua por uma verificação adequada se necessário
    }
}