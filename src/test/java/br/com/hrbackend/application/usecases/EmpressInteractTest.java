package br.com.hrbackend.application.usecases;

import br.com.hrbackend.application.gateway.EmpressGateway;
import br.com.hrbackend.domain.entity.Empresa;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;

class EmpressInteractTest {

    private Empresa createEmpress() {
        Empresa empresa = new Empresa();
        empresa.setIdempresa(1);
        empresa.setCnpj("12345678901234");
        empresa.setRazaoSocial("Razao Social");
        empresa.setNomeFantasia("Nome Fantasia");
        return empresa;
    }

    @Test
    public void testCreateEmpress() {
        EmpressGateway empressGateway = Mockito.mock(EmpressGateway.class);

        Empresa empresa = this.createEmpress();

        EmpressInteract empressInteract = new EmpressInteract(empressGateway);

        empressInteract.createEmpress(empresa);

        Mockito.verify(empressGateway, times(1)).createEmpress(empresa);
    }

    @Test
    public void testUpdateEmpress() {
        EmpressGateway empressGateway = Mockito.mock(EmpressGateway.class);
        Empresa empresa = this.createEmpress();
        EmpressInteract empressInteract = new EmpressInteract(empressGateway);

        empressInteract.updateEmpress(empresa);

        Mockito.verify(empressGateway, times(1)).updateEmpress(empresa);
    }

    @Test
    public void testDeleteEmpress() {
        EmpressGateway empressGateway = Mockito.mock(EmpressGateway.class);
        Empresa empresa = this.createEmpress();
        EmpressInteract empressInteract = new EmpressInteract(empressGateway);

        empressInteract.deleteEmpress(empresa);

        Mockito.verify(empressGateway, times(1)).deleteEmpress(empresa);
    }

    @Test
    public void testGetAllEmpress() {
        EmpressGateway empressGateway = Mockito.mock(EmpressGateway.class);
        EmpressInteract empressInteract = new EmpressInteract(empressGateway);

        List<Empresa> empresas = Collections.singletonList(this.createEmpress());
        Mockito.when(empressGateway.getAllEmpress()).thenReturn(empresas);

        List<Empresa> result = empressInteract.getAllEmpress();

        assertEquals(empresas, result);
        Mockito.verify(empressGateway, times(1)).getAllEmpress();
    }

    @Test
    public void testGetEmpressById() {
        EmpressGateway empressGateway = Mockito.mock(EmpressGateway.class);
        EmpressInteract empressInteract = new EmpressInteract(empressGateway);

        Empresa empresa = this.createEmpress();
        Mockito.when(empressGateway.getEmpressById(1)).thenReturn(empresa);

        Empresa result = empressInteract.getEmpressById(1);

        assertEquals(empresa, result);
        Mockito.verify(empressGateway, times(1)).getEmpressById(1);
    }

    @Test
    public void testGetEmpressController() {
        EmpressGateway empressGateway = Mockito.mock(EmpressGateway.class);
        EmpressInteract empressInteract = new EmpressInteract(empressGateway);

        List<Empresa> empresasController = Collections.singletonList(this.createEmpress());
        Mockito.when(empressGateway.getEmpressController()).thenReturn(empresasController);

        List<Empresa> result = empressInteract.getEmpressController();

        assertEquals(empresasController, result);
        Mockito.verify(empressGateway, times(1)).getEmpressController();
    }

    @Test
    public void testGetEmpressFilial() {
        EmpressGateway empressGateway = Mockito.mock(EmpressGateway.class);
        EmpressInteract empressInteract = new EmpressInteract(empressGateway);

        List<Empresa> empresaList = Collections.singletonList(this.createEmpress());
        Mockito.when(empressGateway.getEmpressFilial()).thenReturn(empresaList);

        List<Empresa> result = empressInteract.getEmpressFilial();

        assertEquals(empresaList, result);
        Mockito.verify(empressGateway, times(1)).getEmpressFilial();
    }
}