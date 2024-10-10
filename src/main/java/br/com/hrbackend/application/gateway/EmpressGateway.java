package br.com.hrbackend.application.gateway;

import br.com.hrbackend.domain.entity.Empress;

import java.util.List;

public interface EmpressGateway extends Gateway<Empress> {
    List<Empress> getBranchesByIdEmpressController(int empressController);
}
