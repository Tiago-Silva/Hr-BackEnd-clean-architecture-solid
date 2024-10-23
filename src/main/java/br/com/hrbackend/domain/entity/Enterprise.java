package br.com.hrbackend.domain.entity;

import br.com.hrbackend.infrastructure.data.entityDB.EmpresaDB;
import br.com.hrbackend.infrastructure.web.dto.EmpressRequestDTO;
import br.com.hrbackend.infrastructure.web.dto.EmpressResponseDTO;
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

	private Enterprise(final EmpressRequestDTO requestDTO) {
		this.tradeName = requestDTO.nomeFantasia();
		this.enterpriseName = requestDTO.razaoSocial();
		this.cnpj = requestDTO.cnpj();
		this.stateRegistration = requestDTO.inscricaoEstadual();
		this.neighborhood = requestDTO.bairro();
		this.city = requestDTO.cidade();
		this.address = requestDTO.endereco();
		this.state = requestDTO.estado();
		this.phone = requestDTO.telefone();
		this.logo = requestDTO.logoMarca();
		this.isBranch = requestDTO.filial();
		this.enterpriseParent = requestDTO.empresaController();
		this.isHeadOffice = requestDTO.matriz();
		this.status = requestDTO.status();
		this.validate();
	}

	private void validate() {
		if (this.tradeName.isBlank()) {
			throw new IllegalArgumentException("Empress nomeFantasa should not be null or empty");
		}

		if (this.enterpriseName.isBlank()) {
			throw new IllegalArgumentException("Empress razaoSocial should not be null or empty");
		}

		if (this.cnpj.isBlank()) {
			throw new IllegalArgumentException("Empress cnpj should not be null or empty");
		}
	}

    public static Enterprise withRequestDTO(EmpressRequestDTO requestDTO) {
		return new Enterprise(requestDTO);
    }

	public static Enterprise withResponseDTO(EmpressResponseDTO responseDTO) {
		return new Enterprise(
			responseDTO.idempresa(),
			responseDTO.nomeFantasia(),
			responseDTO.razaoSocial(),
			responseDTO.cnpj(),
			responseDTO.inscricaoEstadual(),
			responseDTO.bairro(),
			responseDTO.cidade(),
			responseDTO.endereco(),
			responseDTO.estado(),
			responseDTO.telefone(),
			responseDTO.logoMarca(),
			responseDTO.filial(),
			responseDTO.empresaController(),
			responseDTO.matriz(),
			responseDTO.status()
		);
	}

	public static Enterprise withEntityDB(EmpresaDB empresaDB) {
		return new Enterprise(
			empresaDB.getIdempresa(),
			empresaDB.getNomeFantasia(),
			empresaDB.getRazaoSocial(),
			empresaDB.getCnpj(),
			empresaDB.getInscricaoEstadual(),
			empresaDB.getBairro(),
			empresaDB.getCidade(),
			empresaDB.getEndereco(),
			empresaDB.getEstado(),
			empresaDB.getTelefone(),
			empresaDB.getLogoMarca(),
			empresaDB.isFilial(),
			empresaDB.getEmpresaController(),
			empresaDB.isMatriz(),
			empresaDB.getStatus()
		);
	}
}