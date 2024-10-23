package br.com.hrbackend.application.gateway;

import br.com.hrbackend.domain.entity.Enterprise;

import java.util.List;

public interface EnterpriseGateway extends Gateway<Enterprise> {
    List<Enterprise> getBranchesByIdEnterpriseController(int enterpriseController);
}
