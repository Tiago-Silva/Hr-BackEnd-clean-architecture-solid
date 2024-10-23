package br.com.hrbackend.application.gateway;

import br.com.hrbackend.domain.entity.Enterprise;

import java.util.List;

public interface EmpressGateway extends Gateway<Enterprise> {
    List<Enterprise> getBranchesByIdEmpressController(int empressController);
}
