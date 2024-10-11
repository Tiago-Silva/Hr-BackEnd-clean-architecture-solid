package br.com.hrbackend.infrastructure.core.mapper;

import br.com.hrbackend.domain.entity.Empress;
import br.com.hrbackend.infrastructure.data.entityDB.EmpresaDB;
import br.com.hrbackend.infrastructure.web.dto.EmpressRequestDTO;
import br.com.hrbackend.infrastructure.web.dto.EmpressResponseDTO;

public class EmpressMapper {

    public EmpressRequestDTO domainObjectToRequestDTO(Empress empress) {
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

    public EmpressResponseDTO domainObjecToResponseDTO (Empress empress) {
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

    public Empress requestDTOToDomainObject (EmpressRequestDTO requestDTO) {
        return Empress.withRequestDTO(requestDTO);
    }

    public Empress responseDTOToDomainObject (EmpressResponseDTO responseDTO) {
        return Empress.withResponseDTO(responseDTO);
    }

    public EmpresaDB toEmpressDB(Empress empress) {
        return new EmpresaDB(empress);
    }

    public Empress toEmpress(EmpresaDB empresaDB) {
        return Empress.withEntityDB(empresaDB);
    }
}
