package br.com.hrbackend.domain.entity;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idempresa")
public class Empresa implements Serializable {
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
}