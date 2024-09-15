package br.com.hrbackend.infrastructure.core.gateway;

import br.com.hrbackend.application.gateway.PeriodGateway;
import br.com.hrbackend.domain.entity.Periodo;
import br.com.hrbackend.infrastructure.core.mapper.PeriodMapper;
import br.com.hrbackend.infrastructure.data.repository.PeriodRepository;

public class PeriodRepositoryGateway implements PeriodGateway {

    private final PeriodRepository repository;
    private final PeriodMapper mapper;
    public PeriodRepositoryGateway(PeriodRepository repository, PeriodMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public void createPeriod(Periodo periodo) {
        this.repository.save(this.mapper.toPeriodDB(periodo));
    }

    @Override
    public void updatePeriod(Periodo periodo) {
        this.repository.save(this.mapper.toPeriodDB(periodo));
    }

    @Override
    public void deletePeriod(Periodo periodo) {
        this.repository.delete(this.mapper.toPeriodDB(periodo));
    }

    @Override
    public Periodo getPeriodById(int id) {
        return this.mapper.toPeriod(this.repository.findByIdperiodo(id));
    }
}
