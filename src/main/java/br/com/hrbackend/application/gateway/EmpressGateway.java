package br.com.hrbackend.application.gateway;

import br.com.hrbackend.domain.entity.Empress;

import java.util.List;

public interface EmpressGateway {

    Empress createEmpress(Empress empress);
    Empress updateEmpress(Empress empress);
    Empress deleteEmpress(Empress empress);
    Empress getEmpressById(int id);
    List<Empress> getBranchesByIdEmpressController(int empressController);
}
