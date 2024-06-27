package br.com.hrbackend.application.usecases;

import br.com.hrbackend.application.gateway.EmpresaGateway;
import br.com.hrbackend.domain.entity.Empresa;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;

class EmpresaInteractorTest {

    @Test
    public void testCreateEmpresa() {
        EmpresaGateway empresaGateway = Mockito.mock(EmpresaGateway.class);

        Empresa empresa = new Empresa();

        EmpresaInteractor empresaInteractor = new EmpresaInteractor(empresaGateway);

        empresaInteractor.createEmpresa(empresa);

        Mockito.verify(empresaGateway, times(1)).createEmpresa(empresa);
    }

    @Test
    public void testUpdateEmpresa() {
        EmpresaGateway empresaGateway = Mockito.mock(EmpresaGateway.class);
        Empresa empresa = new Empresa();
        EmpresaInteractor empresaInteractor = new EmpresaInteractor(empresaGateway);

        empresaInteractor.updateEmpresa(empresa);

        Mockito.verify(empresaGateway, times(1)).updateEmpresa(empresa);
    }

    @Test
    public void testDeleteEmpresa() {
        EmpresaGateway empresaGateway = Mockito.mock(EmpresaGateway.class);
        Empresa empresa = new Empresa();
        EmpresaInteractor empresaInteractor = new EmpresaInteractor(empresaGateway);

        empresaInteractor.deleteEmpresa(empresa);

        Mockito.verify(empresaGateway, times(1)).deleteEmpresa(empresa);
    }

    @Test
    public void testGetAllEmpresas() {
        EmpresaGateway empresaGateway = Mockito.mock(EmpresaGateway.class);
        EmpresaInteractor empresaInteractor = new EmpresaInteractor(empresaGateway);

        List<Empresa> empresas = Collections.singletonList(new Empresa());
        Mockito.when(empresaGateway.getAllEmpresas()).thenReturn(empresas);

        List<Empresa> result = empresaInteractor.getAllEmpresas();

        assertEquals(empresas, result);
        Mockito.verify(empresaGateway, times(1)).getAllEmpresas();
    }

    @Test
    public void testGetEmpresaById() {
        EmpresaGateway empresaGateway = Mockito.mock(EmpresaGateway.class);
        EmpresaInteractor empresaInteractor = new EmpresaInteractor(empresaGateway);

        Empresa empresa = new Empresa();
        Mockito.when(empresaGateway.getEmpresaById(1)).thenReturn(empresa);

        Empresa result = empresaInteractor.getEmpresaById(1);

        assertEquals(empresa, result);
        Mockito.verify(empresaGateway, times(1)).getEmpresaById(1);
    }

    @Test
    public void testGetEmpresasController() {
        EmpresaGateway empresaGateway = Mockito.mock(EmpresaGateway.class);
        EmpresaInteractor empresaInteractor = new EmpresaInteractor(empresaGateway);

        List<Empresa> empresasController = Collections.singletonList(new Empresa());
        Mockito.when(empresaGateway.getEmpresasController()).thenReturn(empresasController);

        List<Empresa> result = empresaInteractor.getEmpresasController();

        assertEquals(empresasController, result);
        Mockito.verify(empresaGateway, times(1)).getEmpresasController();
    }

    @Test
    public void testGetEmpresasFiliais() {
        EmpresaGateway empresaGateway = Mockito.mock(EmpresaGateway.class);
        EmpresaInteractor empresaInteractor = new EmpresaInteractor(empresaGateway);

        List<Empresa> empresaList = Collections.singletonList(new Empresa());
        Mockito.when(empresaGateway.getEmpresasFiliais()).thenReturn(empresaList);

        List<Empresa> result = empresaInteractor.getEmpresasFiliais();

        assertEquals(empresaList, result);
        Mockito.verify(empresaGateway, times(1)).getEmpresasFiliais();
    }
}