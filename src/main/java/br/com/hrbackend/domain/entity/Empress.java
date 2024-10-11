package br.com.hrbackend.domain.entity;

import br.com.hrbackend.infrastructure.data.entityDB.EmpresaDB;
import br.com.hrbackend.infrastructure.web.dto.EmpressRequestDTO;
import br.com.hrbackend.infrastructure.web.dto.EmpressResponseDTO;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "idempresa")
public class Empress implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;
	
	private int idempresa;

	private String nomeFantasia;

	private String razaoSocial;

	private String cnpj;

	private String inscricaoEstadual;

	private String bairro;

	private String cidade;

	private String endereco;

	private String estado;

	private String telefone;

	private String logoMarca;

	private boolean filial = false;

	private int empresaController;

	private boolean matriz = false;

	private String status;

	private Empress(
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
		this.idempresa = idempresa;
		this.nomeFantasia = nomeFantasia;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.bairro = bairro;
		this.cidade = cidade;
		this.endereco = endereco;
		this.estado = estado;
		this.telefone = telefone;
		this.logoMarca = logoMarca;
		this.filial = filial;
		this.empresaController = empresaController;
		this.matriz = matriz;
		this.status = status;
		this.validate();
	}

	private Empress(final EmpressRequestDTO requestDTO) {
		this.nomeFantasia = requestDTO.nomeFantasia();
		this.razaoSocial = requestDTO.razaoSocial();
		this.cnpj = requestDTO.cnpj();
		this.inscricaoEstadual = requestDTO.inscricaoEstadual();
		this.bairro = requestDTO.bairro();
		this.cidade = requestDTO.cidade();
		this.endereco = requestDTO.endereco();
		this.estado = requestDTO.estado();
		this.telefone = requestDTO.telefone();
		this.logoMarca = requestDTO.logoMarca();
		this.filial = requestDTO.filial();
		this.empresaController = requestDTO.empresaController();
		this.matriz = requestDTO.matriz();
		this.status = requestDTO.status();
		this.validate();
	}

	private void validate() {
		if (this.nomeFantasia.isBlank()) {
			throw new IllegalArgumentException("Empress nomeFantasa should not be null or empty");
		}

		if (this.razaoSocial.isBlank()) {
			throw new IllegalArgumentException("Empress razaoSocial should not be null or empty");
		}

		if (this.cnpj.isBlank()) {
			throw new IllegalArgumentException("Empress cnpj should not be null or empty");
		}
	}

    public static Empress withRequestDTO(EmpressRequestDTO requestDTO) {
		return new Empress(requestDTO);
    }

	public static Empress withResponseDTO(EmpressResponseDTO responseDTO) {
		return new Empress(
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

	public static Empress withEntityDB(EmpresaDB empresaDB) {
		return new Empress(
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