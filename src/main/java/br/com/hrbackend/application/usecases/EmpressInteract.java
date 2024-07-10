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
        if (
            empresa == null ||
            empresa.getCnpj().isEmpty() ||
            empresa.getRazaoSocial().isEmpty() ||
            empresa.getNomeFantasia().isEmpty()
        ) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        this.empressGateway.createEmpress(empresa);
    }

    public void updateEmpress(Empresa empresa) {
        if (empresa == null || empresa.getIdempresa() <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        this.empressGateway.updateEmpress(empresa);
    }

    public void deleteEmpress(Empresa empresa) {
        if (empresa == null || empresa.getIdempresa() <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
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
