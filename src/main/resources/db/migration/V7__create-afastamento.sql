CREATE TABLE afastamento (
    idafastamento INT AUTO_INCREMENT,
    data_inicio DATE,
    data_fim DATE,
    motivo VARCHAR(255),
    descricao VARCHAR(255),
    funcionario_nome VARCHAR(255),
    setor VARCHAR(255),
    retorno DATE,
    empresa INT,
    idfuncionario INT,
    idlembrete INT,
    funcionario_idfuncionario INT,
    PRIMARY KEY (idafastamento),
    FOREIGN KEY (funcionario_idfuncionario) REFERENCES funcionario(idfuncionario)
);