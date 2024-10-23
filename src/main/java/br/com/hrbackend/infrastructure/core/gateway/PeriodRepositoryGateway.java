package br.com.hrbackend.infrastructure.core.gateway;

import br.com.hrbackend.application.gateway.PeriodGateway;
import br.com.hrbackend.domain.entity.Period;
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
    public Period save(Period periodo) {
        this.repository.save(this.mapper.toPeriodDB(periodo));
        return periodo;
    }

    @Override
    public Period update(Period periodo) {
        this.repository.save(this.mapper.toPeriodDB(periodo));
        return periodo;
    }

    @Override
    public void delete(Period periodo) {
        this.repository.delete(this.mapper.toPeriodDB(periodo));
    }

    @Override
    public Period getId(int id) {
        return this.mapper.toPeriod(this.repository.findByIdperiodo(id));
    }
}
