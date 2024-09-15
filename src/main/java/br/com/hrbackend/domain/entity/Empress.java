package br.com.hrbackend.domain.entity;

import br.com.hrbackend.infrastructure.data.entityDB.EmpresaDB;
import br.com.hrbackend.infrastructure.web.dto.EmpresaRequestDTO;
import br.com.hrbackend.infrastructure.web.dto.EmpresaResponseDTO;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

	private boolean filial;

	private int empresaController;

	private boolean matriz;

	private String status;

    public Empress(EmpresaRequestDTO requestDTO) {
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
    }

	public Empress(EmpresaResponseDTO responseDTO) {
		this.idempresa = responseDTO.idempresa();
		this.nomeFantasia = responseDTO.nomeFantasia();
		this.razaoSocial = responseDTO.razaoSocial();
		this.cnpj = responseDTO.cnpj();
		this.inscricaoEstadual = responseDTO.inscricaoEstadual();
		this.bairro = responseDTO.bairro();
		this.cidade = responseDTO.cidade();
		this.endereco = responseDTO.endereco();
		this.estado = responseDTO.estado();
		this.telefone = responseDTO.telefone();
		this.logoMarca = responseDTO.logoMarca();
		this.filial = responseDTO.filial();
		this.empresaController = responseDTO.empresaController();
		this.matriz = responseDTO.matriz();
		this.status = responseDTO.status();
	}

	public Empress(EmpresaDB empresaDB) {
		this.idempresa = empresaDB.getIdempresa();
		this.nomeFantasia = empresaDB.getNomeFantasia();
		this.razaoSocial = empresaDB.getRazaoSocial();
		this.cnpj = empresaDB.getCnpj();
		this.inscricaoEstadual = empresaDB.getInscricaoEstadual();
		this.bairro = empresaDB.getBairro();
		this.cidade = empresaDB.getCidade();
		this.endereco = empresaDB.getEndereco();
		this.estado = empresaDB.getEstado();
		this.telefone = empresaDB.getTelefone();
		this.logoMarca = empresaDB.getLogoMarca();
		this.filial = empresaDB.isFilial();
		this.empresaController = empresaDB.getEmpresaController();
		this.matriz = empresaDB.isMatriz();
		this.status = empresaDB.getStatus();
	}
}