package br.com.hrbackend.application.gateway;

import br.com.hrbackend.domain.entity.Empresa;

import java.util.List;

public interface EmpresaGateway {

    void createEmpresa(Empresa empresa);
    void updateEmpresa(Empresa empresa);
    void deleteEmpresa(Empresa empresa);
    List<Empresa> getAllEmpresas();
    Empresa getEmpresaById(int id);
    List<Empresa> getEmpresasController();
    List<Empresa> getEmpresasFiliais();
}
