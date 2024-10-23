package br.com.hrbackend.infrastructure.core.gateway;

import br.com.hrbackend.application.gateway.EmpressGateway;
import br.com.hrbackend.domain.entity.Enterprise;
import br.com.hrbackend.infrastructure.core.mapper.EmpressMapper;
import br.com.hrbackend.infrastructure.data.repository.EmpressRepository;

import java.util.List;

public class EmpressRepositoryGateway implements EmpressGateway {

    private final EmpressRepository repository;
    private final EmpressMapper mapper;
    public EmpressRepositoryGateway(EmpressRepository repository, EmpressMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Enterprise save(Enterprise empressDomain) {
        this.repository.save(this.mapper.toEmpressDB(empressDomain));
        return empressDomain;
    }

    @Override
    public Enterprise update(Enterprise empressDomain) {
        this.repository.update(this.mapper.toEmpressDB(empressDomain));
        return empressDomain;
    }

    @Override
    public void delete(Enterprise empressDomain) {
        this.repository.delete(this.mapper.toEmpressDB(empressDomain));
    }

    @Override
    public Enterprise getId(int id) {
        return this.mapper.toEmpress(this.repository.getEmpressById(id));
    }

    @Override
    public List<Enterprise> getBranchesByIdEmpressController(int empressController) {
        return this.repository.getFiliais().stream().map(this.mapper::toEmpress).toList();
    }
}
