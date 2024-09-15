package br.com.hrbackend.application.gateway;

import br.com.hrbackend.domain.entity.Empress;

import java.util.List;

public interface EmpressGateway {

    void createEmpress(Empress empress);
    void updateEmpress(Empress empress);
    void deleteEmpress(Empress empress);
    List<Empress> getAllEmpress();
    Empress getEmpressById(int id);
    List<Empress> getEmpressController();
    List<Empress> getEmpressFilial();
}
