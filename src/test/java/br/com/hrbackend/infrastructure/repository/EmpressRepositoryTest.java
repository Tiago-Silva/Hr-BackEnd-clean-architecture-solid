package br.com.hrbackend.infrastructure.repository;

import br.com.hrbackend.infrastructure.data.entityDB.EmpresaDB;
import br.com.hrbackend.infrastructure.data.repository.EmpressRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class EmpressRepositoryTest {

    @Mock
    private EntityManager em;

    @Mock
    private CriteriaBuilder cb;

    @Mock
    private CriteriaQuery<EmpresaDB> cq;

    @Mock
    private Root<EmpresaDB> root;

    @Mock
    private TypedQuery<EmpresaDB> query;

    @InjectMocks
    private EmpressRepository empressRepository;

    @Test
    void getAllEmpress() {
        when(em.getCriteriaBuilder()).thenReturn(cb);
        when(cb.createQuery(EmpresaDB.class)).thenReturn(cq);
        when(cq.from(EmpresaDB.class)).thenReturn(root);
        when(em.createQuery(cq)).thenReturn(query);
        List<EmpresaDB> expectedEmpresas = Collections.singletonList(new EmpresaDB());
        when(query.getResultList()).thenReturn(expectedEmpresas);

        List<EmpresaDB> actualEmpresas = empressRepository.getAllEmpress();

        assertEquals(expectedEmpresas, actualEmpresas);
        verify(em, times(1)).createQuery(cq);
        verify(query, times(1)).getResultList();
    }

    @Test
    void getEmpressById() {
    }

    @Test
    void getEmpressControllers() {
    }

    @Test
    void getFiliais() {
    }
}