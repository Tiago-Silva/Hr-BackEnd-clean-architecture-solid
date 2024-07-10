package br.com.hrbackend.infrastructure.dto;

import java.math.BigDecimal;
import java.util.Date;

public record FuncionarioResponseDTO(
        int idfuncionario,
        String nome,
        String sobrenome,
        String pis,
        String cpf,
        String rg,
        Date expedicaoRg,
        String emissorRg,
        String ufRg,
        String carteiraMotorista,
        String categoriaCnh,
        Date expedicaoCnh,
        Date validadeCnh,
        String carteiraTrabalho,
        String serieCtps,
        String ufCtps,
        String tituloEleitor,
        Date nascimento,
        String nacionalidade,
        String cep,
        String estado,
        String bairro,
        String cidade,
        String endereco,
        String sexo,
        String estadoCivil,
        String mae,
        String pai,
        String cracha,
        String telefone,
        Date admissao,
        Date demissao,
        String status,
        String motivoDemissao,
        String departamento,
        String cargo,
        String cargoDescricao,
        Date exameAdmissional,
        String periodoExperiencia,
        String primeiroEmprego,
        String contribuicaoSocial,
        int idadmissao,
        String vinculo,
        BigDecimal salario,
        String banco,
        String agencia,
        String conta,
        String emailGoogle,
        String emailHotmail,
        String localExame,
        String urlImage,
        EmpresaResponseDTO empresa,
        PeriodoResponseDTO periodo
) { }
