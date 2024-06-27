package br.com.hrbackend.application.usecases;

import br.com.hrbackend.application.gateway.EmpressGateway;
import br.com.hrbackend.domain.entity.Empresa;

import java.util.List;

public class EmpressInteract {

    private final EmpressGateway empressGateway;
    public EmpressInteract(EmpressGateway empressGateway) {
        this.empressGateway = empressGateway;
    }

    public void createEmpress(Empresa empresa) {
        this.empressGateway.createEmpress(empresa);
    }

    public void updateEmpress(Empresa empresa) {
        this.empressGateway.updateEmpress(empresa);
    }

    public void deleteEmpress(Empresa empresa) {
        this.empressGateway.deleteEmpress(empresa);
    }

    public List<Empresa> getAllEmpress() {
        return this.empressGateway.getAllEmpress();
    }

    public Empresa getEmpressById(int id) {
        return this.empressGateway.getEmpressById(id);
    }

    public List<Empresa> getEmpressController() {
        return this.empressGateway.getEmpressController();
    }

    public List<Empresa> getEmpressFilial() {
        return this.empressGateway.getEmpressFilial();
    }
}
