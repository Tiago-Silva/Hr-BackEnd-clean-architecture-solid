CREATE TABLE advertencia (
    idadvertencia INT AUTO_INCREMENT,
    data DATE,
    descricao VARCHAR(255),
    hora TIME,
    responsavel VARCHAR(255),
    tipo VARCHAR(255),
    funcionario_idfuncionario INT,
    PRIMARY KEY (idadvertencia),
    FOREIGN KEY (funcionario_idfuncionario) REFERENCES funcionario(idfuncionario)
);