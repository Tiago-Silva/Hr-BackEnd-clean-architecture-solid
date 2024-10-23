package br.com.hrbackend.infrastructure.core.gateway;

import br.com.hrbackend.application.gateway.EnterpriseGateway;
import br.com.hrbackend.domain.entity.Enterprise;
import br.com.hrbackend.infrastructure.core.mapper.EnterpriseMapper;
import br.com.hrbackend.infrastructure.data.repository.EnterpriseRepository;

import java.util.List;

public class EnterpriseRepositoryGateway implements EnterpriseGateway {

    private final EnterpriseRepository repository;
    private final EnterpriseMapper mapper;
    public EnterpriseRepositoryGateway(EnterpriseRepository repository, EnterpriseMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Enterprise save(Enterprise empressDomain) {
        this.repository.save(this.mapper.toEnterpriseDB(empressDomain));
        return empressDomain;
    }

    @Override
    public Enterprise update(Enterprise empressDomain) {
        this.repository.update(this.mapper.toEnterpriseDB(empressDomain));
        return empressDomain;
    }

    @Override
    public void delete(Enterprise empressDomain) {
        this.repository.delete(this.mapper.toEnterpriseDB(empressDomain));
    }

    @Override
    public Enterprise getId(int id) {
        return this.mapper.toEnterprise(this.repository.getEnterpriseById(id));
    }

    @Override
    public List<Enterprise> getBranchesByIdEnterpriseController(int enterpriseController) {
        return this.repository.getBranches().stream().map(this.mapper::toEnterprise).toList();
    }
}
