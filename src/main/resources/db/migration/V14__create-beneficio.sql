CREATE TABLE beneficio (
    idbeneficio INT AUTO_INCREMENT,
    nome VARCHAR(45),
    tipo VARCHAR(45),
    calculo_saldo VARCHAR(45),
    custo_emp_folha VARCHAR(45),
    descricao VARCHAR(45),
    percentual_salario VARCHAR(45),
    evento_desconto VARCHAR(45),
    operador VARCHAR(45),
    data_corte DATE,
    vencimento_contrato DATE,
    custo_emp VARCHAR(45),
    filial_nome VARCHAR(45),
    idfilial INT,
    empresa_idempresa INT,
    PRIMARY KEY (idbeneficio),
    FOREIGN KEY (empresa_idempresa) REFERENCES empresa(idempresa)
);