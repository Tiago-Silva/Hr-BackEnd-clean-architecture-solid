package br.com.hrbackend.application.usecases;

import br.com.hrbackend.application.gateway.EmpressGateway;
import br.com.hrbackend.domain.entity.Empress;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;

class EmpressInteractTest {

    private Empress createEmpress() {
        Empress empress = new Empress();
        empress.setIdempresa(1);
        empress.setCnpj("12345678901234");
        empress.setRazaoSocial("Razao Social");
        empress.setNomeFantasia("Nome Fantasia");
        return empress;
    }

    @Test
    public void testCreateEmpress() {
        EmpressGateway empressGateway = Mockito.mock(EmpressGateway.class);

        Empress empress = this.createEmpress();

        EmpressInteract empressInteract = new EmpressInteract(empressGateway);

        empressInteract.createEmpress(empress);

        Mockito.verify(empressGateway, times(1)).createEmpress(empress);
    }

    @Test
    public void testUpdateEmpress() {
        EmpressGateway empressGateway = Mockito.mock(EmpressGateway.class);
        Empress empress = this.createEmpress();
        EmpressInteract empressInteract = new EmpressInteract(empressGateway);

        empressInteract.updateEmpress(empress);

        Mockito.verify(empressGateway, times(1)).updateEmpress(empress);
    }

    @Test
    public void testDeleteEmpress() {
        EmpressGateway empressGateway = Mockito.mock(EmpressGateway.class);
        Empress empress = this.createEmpress();
        EmpressInteract empressInteract = new EmpressInteract(empressGateway);

        empressInteract.deleteEmpress(empress);

        Mockito.verify(empressGateway, times(1)).deleteEmpress(empress);
    }

    @Test
    public void testGetAllEmpress() {
        EmpressGateway empressGateway = Mockito.mock(EmpressGateway.class);
        EmpressInteract empressInteract = new EmpressInteract(empressGateway);

        List<Empress> empresses = Collections.singletonList(this.createEmpress());
        Mockito.when(empressGateway.getAllEmpress()).thenReturn(empresses);

        List<Empress> result = empressInteract.getAllEmpress();

        assertEquals(empresses, result);
        Mockito.verify(empressGateway, times(1)).getAllEmpress();
    }

    @Test
    public void testGetEmpressById() {
        EmpressGateway empressGateway = Mockito.mock(EmpressGateway.class);
        EmpressInteract empressInteract = new EmpressInteract(empressGateway);

        Empress empress = this.createEmpress();
        Mockito.when(empressGateway.getEmpressById(1)).thenReturn(empress);

        Empress result = empressInteract.getEmpressById(1);

        assertEquals(empress, result);
        Mockito.verify(empressGateway, times(1)).getEmpressById(1);
    }

    @Test
    public void testGetEmpressController() {
        EmpressGateway empressGateway = Mockito.mock(EmpressGateway.class);
        EmpressInteract empressInteract = new EmpressInteract(empressGateway);

        List<Empress> empresasController = Collections.singletonList(this.createEmpress());
        Mockito.when(empressGateway.getEmpressController()).thenReturn(empresasController);

        List<Empress> result = empressInteract.getEmpressController();

        assertEquals(empresasController, result);
        Mockito.verify(empressGateway, times(1)).getEmpressController();
    }

    @Test
    public void testGetEmpressFilial() {
        EmpressGateway empressGateway = Mockito.mock(EmpressGateway.class);
        EmpressInteract empressInteract = new EmpressInteract(empressGateway);

        List<Empress> empressList = Collections.singletonList(this.createEmpress());
        Mockito.when(empressGateway.getEmpressFilial()).thenReturn(empressList);

        List<Empress> result = empressInteract.getEmpressFilial();

        assertEquals(empressList, result);
        Mockito.verify(empressGateway, times(1)).getEmpressFilial();
    }
}