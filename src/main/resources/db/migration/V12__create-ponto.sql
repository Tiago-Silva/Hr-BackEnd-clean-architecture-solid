CREATE TABLE ponto (
    idponto INT AUTO_INCREMENT,
    cracha VARCHAR(45),
    data DATE,
    hora TIME,
    entrada TIME,
    saida TIME,
    intervalo_saida TIME,
    intervalo_entrada TIME,
    rep VARCHAR(45),
    nsr VARCHAR(45),
    pis VARCHAR(45),
    funcionario VARCHAR(45),
    idfuncionario INT,
    cnpj VARCHAR(45),
    filial_nome VARCHAR(45),
    atrasado_entrada BOOLEAN,
    empresa_idempresa INT,
    PRIMARY KEY (idponto),
    FOREIGN KEY (empresa_idempresa) REFERENCES empresa(idempresa)
);