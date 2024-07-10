CREATE TABLE documentos (
    iddocumentos INT AUTO_INCREMENT,
    tipo VARCHAR(45),
    url_documento VARCHAR(45),
    nome VARCHAR(45),
    descricao VARCHAR(45),
    idfuncionario INT,
    funcionario_nome VARCHAR(45),
    departamento VARCHAR(45),
    empresa INT,
    data DATE,
    idfalta INT,
    funcionario_idfuncionario INT,
    PRIMARY KEY (iddocumentos),
    FOREIGN KEY (funcionario_idfuncionario) REFERENCES funcionario(idfuncionario)
);