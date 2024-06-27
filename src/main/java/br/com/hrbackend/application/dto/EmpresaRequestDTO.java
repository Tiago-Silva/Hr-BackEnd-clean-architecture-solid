package br.com.hrbackend.application.dto;

public record EmpresaRequestDTO(
        String nomeFantasia,
        String razaoSocial,
        String cnpj,
        String inscricaoEstadual,
        String bairro,
        String cidade,
        String endereco,
        String estado,
        String telefone,
        String logoMarca,
        boolean filial,
        int empresaController,
        boolean matriz,
        String status
) {}
