CREATE TABLE empress (
    idempresa INT NOT NULL AUTO_INCREMENT,
    nome_fantasia VARCHAR(45) NOT NULL,
    razao_social VARCHAR(45) NOT NULL,
    cnpj VARCHAR(45) NOT NULL,
    incricao_estadual VARCHAR(45),
    bairro VARCHAR(45),
    cidade VARCHAR(45),
    endereco VARCHAR(45),
    estado VARCHAR(45),
    telefone VARCHAR(45),
    logo_marca VARCHAR(45),
    is_filial BOOLEAN,
    empresa_controller INT,
    is_matriz BOOLEAN,
    status VARCHAR(45),
    PRIMARY KEY (idempresa)
);