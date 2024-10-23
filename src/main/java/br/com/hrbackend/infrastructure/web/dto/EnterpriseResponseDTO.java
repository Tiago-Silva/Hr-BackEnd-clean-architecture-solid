package br.com.hrbackend.infrastructure.web.dto;

public record EnterpriseResponseDTO(
        int id,
        String tradeName,
        String enterpriseName,
        String cnpj,
        String stateRegistration,
        String neighborhood,
        String city,
        String address,
        String state,
        String phone,
        String logo,
        boolean isBranch,
        int enterpriseParent,
        boolean isHeadOffice,
        String status
) {
}
