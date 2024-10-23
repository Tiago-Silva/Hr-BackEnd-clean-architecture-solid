package br.com.hrbackend.infrastructure.core.mapper;

import br.com.hrbackend.domain.entity.Enterprise;
import br.com.hrbackend.infrastructure.data.entityDB.EnterpriseDB;
import br.com.hrbackend.infrastructure.web.dto.EnterpriseRequestDTO;
import br.com.hrbackend.infrastructure.web.dto.EnterpriseResponseDTO;

public class EnterpriseMapper {

    public EnterpriseRequestDTO domainObjectToRequestDTO(Enterprise enterprise) {
        return new EnterpriseRequestDTO(
                enterprise.getTradeName(),
                enterprise.getEnterpriseName(),
                enterprise.getCnpj(),
                enterprise.getStateRegistration(),
                enterprise.getNeighborhood(),
                enterprise.getCity(),
                enterprise.getAddress(),
                enterprise.getState(),
                enterprise.getPhone(),
                enterprise.getLogo(),
                enterprise.isBranch(),
                enterprise.getEnterpriseParent(),
                enterprise.isHeadOffice(),
                enterprise.getStatus()
        );
    }

    public EnterpriseResponseDTO domainObjecToResponseDTO (Enterprise enterprise) {
        return new EnterpriseResponseDTO(
                enterprise.getId(),
                enterprise.getTradeName(),
                enterprise.getEnterpriseName(),
                enterprise.getCnpj(),
                enterprise.getStateRegistration(),
                enterprise.getNeighborhood(),
                enterprise.getCity(),
                enterprise.getAddress(),
                enterprise.getState(),
                enterprise.getPhone(),
                enterprise.getLogo(),
                enterprise.isBranch(),
                enterprise.getEnterpriseParent(),
                enterprise.isHeadOffice(),
                enterprise.getStatus()
        );
    }

    public Enterprise requestDTOToDomainObject (EnterpriseRequestDTO requestDTO) {
        return Enterprise.withRequestDTO(requestDTO);
    }

    public Enterprise responseDTOToDomainObject (EnterpriseResponseDTO responseDTO) {
        return Enterprise.withResponseDTO(responseDTO);
    }

    public EnterpriseDB toEnterpriseDB(Enterprise enterprise) {
        return new EnterpriseDB(enterprise);
    }

    public Enterprise toEnterprise(EnterpriseDB enterpriseDB) {
        return Enterprise.withEntityDB(enterpriseDB);
    }
}
