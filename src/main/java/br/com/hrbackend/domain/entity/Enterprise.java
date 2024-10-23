package br.com.hrbackend.domain.entity;

import br.com.hrbackend.infrastructure.data.entityDB.EnterpriseDB;
import br.com.hrbackend.infrastructure.web.dto.EnterpriseRequestDTO;
import br.com.hrbackend.infrastructure.web.dto.EnterpriseResponseDTO;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Enterprise implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;
	
	private int id;

	private String tradeName;

	private String enterpriseName;

	private String cnpj;

	private String stateRegistration;

	private String neighborhood;

	private String city;

	private String address;

	private String state;

	private String phone;

	private String logo;

	private boolean isBranch;

	private int enterpriseParent;

	private boolean isHeadOffice;

	private String status;

	private Enterprise(
		final int idempresa,
		final String nomeFantasia,
		final String razaoSocial,
		final String cnpj,
		final String inscricaoEstadual,
		final String bairro,
		final String cidade,
		final String endereco,
		final String estado,
		final String telefone,
		final String logoMarca,
		final boolean filial,
		final int empresaController,
		final boolean matriz,
		final String status
	) {
		this.id = idempresa;
		this.tradeName = nomeFantasia;
		this.enterpriseName = razaoSocial;
		this.cnpj = cnpj;
		this.stateRegistration = inscricaoEstadual;
		this.neighborhood = bairro;
		this.city = cidade;
		this.address = endereco;
		this.state = estado;
		this.phone = telefone;
		this.logo = logoMarca;
		this.isBranch = filial;
		this.enterpriseParent = empresaController;
		this.isHeadOffice = matriz;
		this.status = status;
		this.validate();
	}

	private Enterprise(final EnterpriseRequestDTO requestDTO) {
		this.tradeName = requestDTO.tradeName();
		this.enterpriseName = requestDTO.enterpriseName();
		this.cnpj = requestDTO.cnpj();
		this.stateRegistration = requestDTO.stateRegistration();
		this.neighborhood = requestDTO.neighborhood();
		this.city = requestDTO.city();
		this.address = requestDTO.address();
		this.state = requestDTO.state();
		this.phone = requestDTO.phone();
		this.logo = requestDTO.logo();
		this.isBranch = requestDTO.isBranch();
		this.enterpriseParent = requestDTO.enterpriseParent();
		this.isHeadOffice = requestDTO.isHeadOffice();
		this.status = requestDTO.status();
		this.validate();
	}

	private void validate() {
		if (this.tradeName.isBlank()) {
			throw new IllegalArgumentException("Empress nomeFantasa should not be null or empty");
		}

		if (this.enterpriseName.isBlank()) {
			throw new IllegalArgumentException("Empress enterpriseName should not be null or empty");
		}

		if (this.cnpj.isBlank()) {
			throw new IllegalArgumentException("Empress cnpj should not be null or empty");
		}
	}

    public static Enterprise withRequestDTO(EnterpriseRequestDTO requestDTO) {
		return new Enterprise(requestDTO);
    }

	public static Enterprise withResponseDTO(EnterpriseResponseDTO responseDTO) {
		return new Enterprise(
			responseDTO.id(),
			responseDTO.tradeName(),
			responseDTO.enterpriseName(),
			responseDTO.cnpj(),
			responseDTO.stateRegistration(),
			responseDTO.neighborhood(),
			responseDTO.city(),
			responseDTO.address(),
			responseDTO.state(),
			responseDTO.phone(),
			responseDTO.logo(),
			responseDTO.isBranch(),
			responseDTO.enterpriseParent(),
			responseDTO.isHeadOffice(),
			responseDTO.status()
		);
	}

	public static Enterprise withEntityDB(EnterpriseDB enterpriseDB) {
		return new Enterprise(
			enterpriseDB.getId(),
			enterpriseDB.getTradeName(),
			enterpriseDB.getEnterpriseName(),
			enterpriseDB.getCnpj(),
			enterpriseDB.getStateRegistration(),
			enterpriseDB.getNeighborhood(),
			enterpriseDB.getCity(),
			enterpriseDB.getAddress(),
			enterpriseDB.getState(),
			enterpriseDB.getPhone(),
			enterpriseDB.getLogo(),
			enterpriseDB.isBranch(),
			enterpriseDB.getEnterpriseParent(),
			enterpriseDB.isHeadOffice(),
			enterpriseDB.getStatus()
		);
	}
}