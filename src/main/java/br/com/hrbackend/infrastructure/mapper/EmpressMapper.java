package br.com.hrbackend.infrastructure.mapper;

import br.com.hrbackend.domain.entity.Empresa;
import br.com.hrbackend.infrastructure.db.entityDB.EmpresaDB;
import br.com.hrbackend.infrastructure.dto.EmpresaRequestDTO;
import br.com.hrbackend.infrastructure.dto.EmpresaResponseDTO;

public class EmpressMapper {

    public EmpresaRequestDTO domainObjectToRequestDTO(Empresa empresa) {
        return new EmpresaRequestDTO(
                empresa.getNomeFantasia(),
                empresa.getRazaoSocial(),
                empresa.getCnpj(),
                empresa.getInscricaoEstadual(),
                empresa.getBairro(),
                empresa.getCidade(),
                empresa.getEndereco(),
                empresa.getEstado(),
                empresa.getTelefone(),
                empresa.getLogoMarca(),
                empresa.isFilial(),
                empresa.getEmpresaController(),
                empresa.isMatriz(),
                empresa.getStatus()
        );
    }

    public EmpresaResponseDTO domainObjecToResponseDTO (Empresa empresa) {
        return new EmpresaResponseDTO(
                empresa.getIdempresa(),
                empresa.getNomeFantasia(),
                empresa.getRazaoSocial(),
                empresa.getCnpj(),
                empresa.getInscricaoEstadual(),
                empresa.getBairro(),
                empresa.getCidade(),
                empresa.getEndereco(),
                empresa.getEstado(),
                empresa.getTelefone(),
                empresa.getLogoMarca(),
                empresa.isFilial(),
                empresa.getEmpresaController(),
                empresa.isMatriz(),
                empresa.getStatus()
        );
    }

    public Empresa requestDTOToDomainObject (EmpresaRequestDTO requestDTO) {
        return new Empresa(requestDTO);
    }

    public Empresa responseDTOToDomainObject (EmpresaResponseDTO responseDTO) {
        return new Empresa(responseDTO);
    }

    public EmpresaDB toEmpressDB(Empresa empresa) {
        return new EmpresaDB(empresa);
    }

    public Empresa toEmpress(EmpresaDB empresaDB) {
        return new Empresa(empresaDB);
    }
}
