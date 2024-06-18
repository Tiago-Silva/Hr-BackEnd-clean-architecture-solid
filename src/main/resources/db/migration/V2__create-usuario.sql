CREATE TABLE usuario (
    idusuario INT AUTO_INCREMENT,
    nome VARCHAR(45),
    sobrenome VARCHAR(45),
    login VARCHAR(45),
    senha VARCHAR(45),
    token VARCHAR(45),
    image VARCHAR(45),
    foto BLOB,
    tipo VARCHAR(45),
    role VARCHAR(45),
    account_non_expired BOOLEAN,
    account_non_locked BOOLEAN,
    credentials_non_expired BOOLEAN,
    enabled BOOLEAN,
    empresa_idempresa INT,
    PRIMARY KEY (idusuario),
    FOREIGN KEY (empresa_idempresa) REFERENCES empresa(idempresa)
);