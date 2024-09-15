CREATE TABLE relogio_ponto (
    idrelogio_ponto INT AUTO_INCREMENT,
    rep VARCHAR(45),
    local VARCHAR(45),
    descricao VARCHAR(45),
    empresa_idempresa INT,
    PRIMARY KEY (idrelogio_ponto),
    FOREIGN KEY (empresa_idempresa) REFERENCES empress(idempresa)
);