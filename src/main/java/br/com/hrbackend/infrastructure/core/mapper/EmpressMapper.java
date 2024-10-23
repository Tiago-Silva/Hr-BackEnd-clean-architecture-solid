package br.com.hrbackend.infrastructure.core.mapper;

import br.com.hrbackend.domain.entity.Enterprise;
import br.com.hrbackend.infrastructure.data.entityDB.EmpresaDB;
import br.com.hrbackend.infrastructure.web.dto.EmpressRequestDTO;
import br.com.hrbackend.infrastructure.web.dto.EmpressResponseDTO;

public class EmpressMapper {

    public EmpressRequestDTO domainObjectToRequestDTO(Enterprise empress) {
        return new EmpressRequestDTO(
                empress.getNomeFantasia(),
                empress.getRazaoSocial(),
                empress.getCnpj(),
                empress.getInscricaoEstadual(),
                empress.getBairro(),
                empress.getCidade(),
                empress.getEndereco(),
                empress.getEstado(),
                empress.getTelefone(),
                empress.getLogoMarca(),
                empress.isFilial(),
                empress.getEmpresaController(),
                empress.isMatriz(),
                empress.getStatus()
        );
    }

    public EmpressResponseDTO domainObjecToResponseDTO (Enterprise empress) {
        return new EmpressResponseDTO(
                empress.getIdempresa(),
                empress.getNomeFantasia(),
                empress.getRazaoSocial(),
                empress.getCnpj(),
                empress.getInscricaoEstadual(),
                empress.getBairro(),
                empress.getCidade(),
                empress.getEndereco(),
                empress.getEstado(),
                empress.getTelefone(),
                empress.getLogoMarca(),
                empress.isFilial(),
                empress.getEmpresaController(),
                empress.isMatriz(),
                empress.getStatus()
        );
    }

    public Enterprise requestDTOToDomainObject (EmpressRequestDTO requestDTO) {
        return Enterprise.withRequestDTO(requestDTO);
    }

    public Enterprise responseDTOToDomainObject (EmpressResponseDTO responseDTO) {
        return Enterprise.withResponseDTO(responseDTO);
    }

    public EmpresaDB toEmpressDB(Enterprise empress) {
        return new EmpresaDB(empress);
    }

    public Enterprise toEmpress(EmpresaDB empresaDB) {
        return Enterprise.withEntityDB(empresaDB);
    }
}
