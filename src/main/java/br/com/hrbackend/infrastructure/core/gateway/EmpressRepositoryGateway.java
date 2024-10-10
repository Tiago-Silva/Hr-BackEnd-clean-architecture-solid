package br.com.hrbackend.infrastructure.core.gateway;

import br.com.hrbackend.application.gateway.EmpressGateway;
import br.com.hrbackend.domain.entity.Empress;
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
    public Empress save(Empress empressDomain) {
        this.repository.save(this.mapper.toEmpressDB(empressDomain));
        return empressDomain;
    }

    @Override
    public Empress update(Empress empressDomain) {
        this.repository.update(this.mapper.toEmpressDB(empressDomain));
        return empressDomain;
    }

    @Override
    public void delete(Empress empressDomain) {
        this.repository.delete(this.mapper.toEmpressDB(empressDomain));
    }

    @Override
    public Empress getId(int id) {
        return this.mapper.toEmpress(this.repository.getEmpressById(id));
    }

    @Override
    public List<Empress> getBranchesByIdEmpressController(int empressController) {
        return this.repository.getFiliais().stream().map(this.mapper::toEmpress).toList();
    }
}
