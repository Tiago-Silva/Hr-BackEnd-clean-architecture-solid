package br.com.hrbackend.infrastructure.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public abstract class GenericRepository {

    @PersistenceContext
    protected EntityManager em;

    protected CriteriaBuilder getCriteriaBuilder() { return this.em.getCriteriaBuilder();}

    @Transactional(propagation= Propagation.REQUIRED, isolation= Isolation.SERIALIZABLE, readOnly = false)
    public void save(Object objeto) {
        this.em.persist(objeto);
        this.em.flush();
    }

    @Transactional(propagation= Propagation.REQUIRED, isolation= Isolation.SERIALIZABLE , readOnly = false)
    public Object saveWithReturn(Object objeto) {
        this.em.persist(objeto);
        this.em.flush();
        return objeto;
    }

    @Transactional(propagation=Propagation.REQUIRED, isolation=Isolation.SERIALIZABLE, readOnly = false)
    public void delete(Object objeto) {
        objeto = this.em.merge(objeto);
        this.em.remove(objeto);
    }

    @Transactional(propagation=Propagation.REQUIRED, isolation=Isolation.SERIALIZABLE, readOnly = false)
    public void update(Object objeto) {
        this.em.merge(objeto);
    }
}
