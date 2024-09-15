CREATE TABLE periodo (
    idperiodo INT AUTO_INCREMENT,
    entrada TIME,
    saida TIME,
    intervalo_entrada TIME,
    intervalo_saida TIME,
    jornada VARCHAR(45),
    tipo VARCHAR(45),
    empresa_idempresa INT,
    PRIMARY KEY (idperiodo),
    FOREIGN KEY (empresa_idempresa) REFERENCES empress(idempresa)
);