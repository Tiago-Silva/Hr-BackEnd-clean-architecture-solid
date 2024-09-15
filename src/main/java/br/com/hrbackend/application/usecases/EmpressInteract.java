package br.com.hrbackend.application.usecases;

import br.com.hrbackend.application.gateway.EmpressGateway;
import br.com.hrbackend.domain.entity.Empress;

import java.util.List;

public class EmpressInteract {

    private final EmpressGateway empressGateway;
    public EmpressInteract(EmpressGateway empressGateway) {
        this.empressGateway = empressGateway;
    }

    public void createEmpress(Empress empress) {
        if (
            empress == null ||
            empress.getCnpj().isEmpty() ||
            empress.getRazaoSocial().isEmpty() ||
            empress.getNomeFantasia().isEmpty()
        ) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        this.empressGateway.createEmpress(empress);
    }

    public void updateEmpress(Empress empress) {
        if (empress == null || empress.getIdempresa() <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        this.empressGateway.updateEmpress(empress);
    }

    public void deleteEmpress(Empress empress) {
        if (empress == null || empress.getIdempresa() <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        this.empressGateway.deleteEmpress(empress);
    }

    public List<Empress> getAllEmpress() {
        return this.empressGateway.getAllEmpress();
    }

    public Empress getEmpressById(int id) {
        return this.empressGateway.getEmpressById(id);
    }

    public List<Empress> getEmpressController() {
        return this.empressGateway.getEmpressController();
    }

    public List<Empress> getEmpressFilial() {
        return this.empressGateway.getBranchesByIdEmpressController();
    }
}
