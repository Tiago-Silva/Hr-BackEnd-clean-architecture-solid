CREATE TABLE admissao (
    idadmissao INT AUTO_INCREMENT,
    data DATE,
    exame_admissional DATE,
    periodo_experiencia VARCHAR(45),
    primeiro_emprego VARCHAR(45),
    contribuicao_social VARCHAR(45),
    departamento VARCHAR(45),
    cargo VARCHAR(45),
    periodo VARCHAR(45),
    funcionario_idfuncionario INT,
    PRIMARY KEY (idadmissao),
    FOREIGN KEY (funcionario_idfuncionario) REFERENCES funcionario(idfuncionario)
);