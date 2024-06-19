CREATE TABLE licenca (
    idlicenca INT AUTO_INCREMENT,
    tipo VARCHAR(45),
    descricao VARCHAR(45),
    data_inicio DATE,
    data_fim DATE,
    retorno DATE,
    funcionario_nome VARCHAR(45),
    idfuncionario INT,
    setor VARCHAR(45),
    empresa INT,
    idlembrete INT,
    funcionario_idfuncionario INT,
    PRIMARY KEY (idlicenca),
    FOREIGN KEY (funcionario_idfuncionario) REFERENCES funcionario(idfuncionario)
);