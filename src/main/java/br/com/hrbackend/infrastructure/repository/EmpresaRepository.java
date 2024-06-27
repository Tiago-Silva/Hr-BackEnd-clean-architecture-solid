package br.com.hrbackend.infrastructure.repository;

import br.com.hrbackend.application.gateway.GenericRepository;
import br.com.hrbackend.infrastructure.db.entityDB.EmpresaDB;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmpresaRepository extends GenericRepository {

    public List<EmpresaDB> getAllEmpresas() {
        CriteriaBuilder builder = super.getCriteriaBuilder();
        return super.em.createQuery(builder.createQuery(EmpresaDB.class)).getResultList();
    }

    public EmpresaDB getEmpresaById(int idempresa) {
        return super.em.find(EmpresaDB.class, idempresa);
    }

    public List<EmpresaDB> getEmpresasControllers() {
        CriteriaBuilder builder = super.getCriteriaBuilder();
        CriteriaQuery<EmpresaDB> query = builder.createQuery(EmpresaDB.class);
        Root<EmpresaDB> root = query.from(EmpresaDB.class);
        query.select(root).where(builder.equal(root.get("isMatriz"), true));
        return super.em.createQuery(query).getResultList();
    }

    public List<EmpresaDB> getFiliais() {
        CriteriaBuilder builder = super.getCriteriaBuilder();
        CriteriaQuery<EmpresaDB> query = builder.createQuery(EmpresaDB.class);
        Root<EmpresaDB> root = query.from(EmpresaDB.class);
        query.select(root).where(builder.equal(root.get("isFilial"), true));
        return super.em.createQuery(query).getResultList();
    }

}
