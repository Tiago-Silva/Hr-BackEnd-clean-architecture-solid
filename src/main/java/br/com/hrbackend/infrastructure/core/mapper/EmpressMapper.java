package br.com.hrbackend.infrastructure.core.mapper;

import br.com.hrbackend.domain.entity.Empress;
import br.com.hrbackend.infrastructure.data.entityDB.EmpresaDB;
import br.com.hrbackend.infrastructure.web.dto.EmpresaRequestDTO;
import br.com.hrbackend.infrastructure.web.dto.EmpresaResponseDTO;

public class EmpressMapper {

    public EmpresaRequestDTO domainObjectToRequestDTO(Empress empress) {
        return new EmpresaRequestDTO(
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

    public EmpresaResponseDTO domainObjecToResponseDTO (Empress empress) {
        return new EmpresaResponseDTO(
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

    public Empress requestDTOToDomainObject (EmpresaRequestDTO requestDTO) {
        return Empress.withRequestDTO(requestDTO);
    }

    public Empress responseDTOToDomainObject (EmpresaResponseDTO responseDTO) {
        return Empress.withResponseDTO(responseDTO);
    }

    public EmpresaDB toEmpressDB(Empress empress) {
        return new EmpresaDB(empress);
    }

    public Empress toEmpress(EmpresaDB empresaDB) {
        return Empress.withEntityDB(empresaDB);
    }
}
