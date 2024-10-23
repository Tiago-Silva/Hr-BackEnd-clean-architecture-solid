package br.com.hrbackend.infrastructure.data.repository;

import br.com.hrbackend.infrastructure.data.entityDB.EnterpriseDB;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.util.List;

public class EnterpriseRepository extends GenericRepository {

    public List<EnterpriseDB> getAllEnterprise() {
        CriteriaBuilder builder = super.getCriteriaBuilder();
        CriteriaQuery<EnterpriseDB> query = builder.createQuery(EnterpriseDB.class);
        Root<EnterpriseDB> root = query.from(EnterpriseDB.class);
        query.select(root);
        return super.em.createQuery(query).getResultList();
    }

    public EnterpriseDB getEnterpriseById(int enterpriseId) {
        return super.em.find(EnterpriseDB.class, enterpriseId);
    }

    public List<EnterpriseDB> getEmpressControllers() {
        CriteriaBuilder builder = super.getCriteriaBuilder();
        CriteriaQuery<EnterpriseDB> query = builder.createQuery(EnterpriseDB.class);
        Root<EnterpriseDB> root = query.from(EnterpriseDB.class);
        query.select(root).where(builder.equal(root.get("isHeadOffice"), true));
        return super.em.createQuery(query).getResultList();
    }

    public List<EnterpriseDB> getBranches() {
        CriteriaBuilder builder = super.getCriteriaBuilder();
        CriteriaQuery<EnterpriseDB> query = builder.createQuery(EnterpriseDB.class);
        Root<EnterpriseDB> root = query.from(EnterpriseDB.class);
        query.select(root).where(builder.equal(root.get("isBranch"), true));
        return super.em.createQuery(query).getResultList();
    }

}
