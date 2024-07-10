package br.com.hrbackend.infrastructure.repository;

import br.com.hrbackend.infrastructure.db.entityDB.EmpresaDB;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.util.List;

public class EmpressRepository extends GenericRepository {

    public List<EmpresaDB> getAllEmpress() {
        CriteriaBuilder builder = super.getCriteriaBuilder();
        CriteriaQuery<EmpresaDB> query = builder.createQuery(EmpresaDB.class);
        Root<EmpresaDB> root = query.from(EmpresaDB.class);
        query.select(root);
        return super.em.createQuery(query).getResultList();
    }

    public EmpresaDB getEmpressById(int idempresa) {
        return super.em.find(EmpresaDB.class, idempresa);
    }

    public List<EmpresaDB> getEmpressControllers() {
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
