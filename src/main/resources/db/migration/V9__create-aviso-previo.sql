CREATE TABLE aviso_previo (
    idaviso_previo INT AUTO_INCREMENT,
    motivo VARCHAR(45),
    descricao VARCHAR(45),
    data_inicio DATE,
    data_fim DATE,
    funcionario_nome VARCHAR(45),
    idfuncionario INT,
    setor VARCHAR(45),
    empress INT,
    retorno DATE,
    idlembrete INT,
    tipo_aviso VARCHAR(45),
    dias VARCHAR(45),
    funcionario_idfuncionario INT,
    PRIMARY KEY (idaviso_previo),
    FOREIGN KEY (funcionario_idfuncionario) REFERENCES funcionario(idfuncionario)
);