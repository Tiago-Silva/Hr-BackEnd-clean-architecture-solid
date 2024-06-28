package br.com.hrbackend.infrastructure.gateway;

import br.com.hrbackend.application.gateway.EmpressGateway;
import br.com.hrbackend.domain.entity.Empresa;
import br.com.hrbackend.infrastructure.mapper.EmpressMapper;
import br.com.hrbackend.infrastructure.repository.EmpressRepository;

import java.util.List;

public class EmpressRepositoryGateway implements EmpressGateway {

    private final EmpressRepository repository;
    private final EmpressMapper mapper;
    public EmpressRepositoryGateway(EmpressRepository repository, EmpressMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public void createEmpress(Empresa empressDomain) {
        this.repository.save(this.mapper.toEmpressDB(empressDomain));
    }

    @Override
    public void updateEmpress(Empresa empressDomain) {
        this.repository.update(this.mapper.toEmpressDB(empressDomain));
    }

    @Override
    public void deleteEmpress(Empresa empressDomain) {
        this.repository.delete(this.mapper.toEmpressDB(empressDomain));
    }

    @Override
    public List<Empresa> getAllEmpress() {
        return this.repository.getAllEmpresas().stream().map(this.mapper::toEmpress).toList();
    }

    @Override
    public Empresa getEmpressById(int id) {
        return this.mapper.toEmpress(this.repository.getEmpresaById(id));
    }

    @Override
    public List<Empresa> getEmpressController() {
        return this.repository.getEmpresasControllers().stream().map(this.mapper::toEmpress).toList();
    }

    @Override
    public List<Empresa> getEmpressFilial() {
        return this.repository.getFiliais().stream().map(this.mapper::toEmpress).toList();
    }
}
