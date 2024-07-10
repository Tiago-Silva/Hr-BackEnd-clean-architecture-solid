package br.com.hrbackend.application.gateway;

import br.com.hrbackend.domain.entity.Empresa;

import java.util.List;

public interface EmpressGateway {

    void createEmpress(Empresa empresa);
    void updateEmpress(Empresa empresa);
    void deleteEmpress(Empresa empresa);
    List<Empresa> getAllEmpress();
    Empresa getEmpressById(int id);
    List<Empresa> getEmpressController();
    List<Empresa> getEmpressFilial();
}
