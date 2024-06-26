package br.com.hrbackend.domain.entity;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.*;

class DocumentosTest {

    private Documentos createDocumentosMock() {
        Date now = new Date(System.currentTimeMillis());
        Documentos documentos = Mockito.mock(Documentos.class);
        Mockito.when(documentos.getIddocumentos()).thenReturn(1);
        Mockito.when(documentos.getTipo()).thenReturn("Tipo");
        Mockito.when(documentos.getUrlDocumento()).thenReturn("UrlDocumento");
        Mockito.when(documentos.getNome()).thenReturn("Nome");
        Mockito.when(documentos.getDescricao()).thenReturn("Descricao");
        Mockito.when(documentos.getIdfuncionario()).thenReturn(1);
        Mockito.when(documentos.getFuncionarioNome()).thenReturn("FuncionarioNome");
        Mockito.when(documentos.getDepartamento()).thenReturn("Departamento");
        Mockito.when(documentos.getEmpresa()).thenReturn(1);
        Mockito.when(documentos.getData()).thenReturn(now);
        Mockito.when(documentos.getIdfalta()).thenReturn(1);
        Mockito.when(documentos.getFuncionario()).thenReturn(new Funcionario());
        return documentos;
    }

    @Test
    public void testDocumentosFields() {
        Date now = new Date(System.currentTimeMillis());
        Documentos documentos = createDocumentosMock();
        assertEquals(1, documentos.getIddocumentos());
        assertEquals("Tipo", documentos.getTipo());
        assertEquals("UrlDocumento", documentos.getUrlDocumento());
        assertEquals("Nome", documentos.getNome());
        assertEquals("Descricao", documentos.getDescricao());
        assertEquals(1, documentos.getIdfuncionario());
        assertEquals("FuncionarioNome", documentos.getFuncionarioNome());
        assertEquals("Departamento", documentos.getDepartamento());
        assertEquals(1, documentos.getEmpresa());
        assertEquals(now, documentos.getData());
        assertEquals(1, documentos.getIdfalta());
        assertEquals(new Funcionario(), documentos.getFuncionario());
    }
}