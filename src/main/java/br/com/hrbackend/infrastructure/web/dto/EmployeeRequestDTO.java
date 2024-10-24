package br.com.hrbackend.infrastructure.web.dto;

import java.math.BigDecimal;

public record EmployeeRequestDTO(
        String nome,
        String sobrenome,
        String pis,
        String cpf,
        String rg,
        String expedicaoRg,
        String emissorRg,
        String ufRg,
        String carteiraMotorista,
        String categoriaCnh,
        String expedicaoCnh,
        String validadeCnh,
        String carteiraTrabalho,
        String serieCtps,
        String ufCtps,
        String tituloEleitor,
        String nascimento,
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
        String admissao,
        String demissao,
        String status,
        String motivoDemissao,
        String departamento,
        String cargo,
        String cargoDescricao,
        String exameAdmissional,
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
        EnterpriseResponseDTO enterprise,
        PeriodResponseDTO periodo
) {
}
