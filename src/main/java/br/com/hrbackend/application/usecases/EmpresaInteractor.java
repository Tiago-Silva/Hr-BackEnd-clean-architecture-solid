package br.com.hrbackend.application.usecases;

import br.com.hrbackend.application.gateway.EmpresaGateway;
import br.com.hrbackend.domain.entity.Empresa;

import java.util.List;

public class EmpresaInteractor {

    private final EmpresaGateway empresaGateway;
    public EmpresaInteractor(EmpresaGateway empresaGateway) {
        this.empresaGateway = empresaGateway;
    }

    public void createEmpresa(Empresa empresa) {
        this.empresaGateway.createEmpresa(empresa);
    }

    public void updateEmpresa(Empresa empresa) {
        this.empresaGateway.updateEmpresa(empresa);
    }

    public void deleteEmpresa(Empresa empresa) {
        this.empresaGateway.deleteEmpresa(empresa);
    }

    public List<Empresa> getAllEmpresas() {
        return this.empresaGateway.getAllEmpresas();
    }

    public Empresa getEmpresaById(int id) {
        return this.empresaGateway.getEmpresaById(id);
    }

    public List<Empresa> getEmpresasController() {
        return this.empresaGateway.getEmpresasController();
    }

    public List<Empresa> getEmpresasFiliais() {
        return this.empresaGateway.getEmpresasFiliais();
    }
}
