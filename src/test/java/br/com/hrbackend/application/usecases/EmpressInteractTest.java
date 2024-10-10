package br.com.hrbackend.application.usecases;

import br.com.hrbackend.application.gateway.EmpressGateway;
import br.com.hrbackend.application.usecases.Empress.*;
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

        CreateEmpressUseCase createEmpressUseCase = new CreateEmpressUseCase(empressGateway);

        createEmpressUseCase.execute(empress);

        Mockito.verify(empressGateway, times(1)).save(empress);
    }

    @Test
    public void testUpdateEmpress() {
        EmpressGateway empressGateway = Mockito.mock(EmpressGateway.class);
        Empress empress = this.createEmpress();
        UpdateEmpressUseCase updateEmpressUseCase = new UpdateEmpressUseCase(empressGateway);

        updateEmpressUseCase.execute(empress);

        Mockito.verify(empressGateway, times(1)).update(empress);
    }

    @Test
    public void testDeleteEmpress() {
        EmpressGateway empressGateway = Mockito.mock(EmpressGateway.class);
        Empress empress = this.createEmpress();
        DeleteEmpressUseCase deleteEmpressUseCase = new DeleteEmpressUseCase(empressGateway);

        deleteEmpressUseCase.execute(empress);

        Mockito.verify(empressGateway, times(1)).delete(empress);
    }

    @Test
    public void testGetEmpressById() {
        EmpressGateway empressGateway = Mockito.mock(EmpressGateway.class);
        GetEmpressByIdUseCase getEmpressByIdUseCase = new GetEmpressByIdUseCase(empressGateway);

        Empress empress = this.createEmpress();
        Mockito.when(empressGateway.getId(1)).thenReturn(empress);

        Empress result = getEmpressByIdUseCase.execute(1);

        assertEquals(empress, result);
        Mockito.verify(empressGateway, times(1)).getId(1);
    }

    @Test
    public void testGetBranchesById() {
        EmpressGateway empressGateway = Mockito.mock(EmpressGateway.class);
        GetBranchesByIdEmpressControllerUseCase getBranchesByIdEmpressControllerUseCase = new GetBranchesByIdEmpressControllerUseCase(empressGateway);

        List<Empress> empressList = Collections.singletonList(this.createEmpress());
        Mockito.when(empressGateway.getBranchesByIdEmpressController(1)).thenReturn(empressList);

        List<Empress> result = getBranchesByIdEmpressControllerUseCase.execute(1);

        assertEquals(empressList, result);
        Mockito.verify(empressGateway, times(1)).getBranchesByIdEmpressController(1);
    }
}