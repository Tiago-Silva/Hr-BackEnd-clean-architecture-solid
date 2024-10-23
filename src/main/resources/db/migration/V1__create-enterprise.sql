CREATE TABLE enterprise (
     id INT NOT NULL AUTO_INCREMENT,
     trade_name VARCHAR(45) NOT NULL,
     enterprise_name VARCHAR(45) NOT NULL,
     cnpj VARCHAR(45) NOT NULL,
     state_registration VARCHAR(45),
     neighborhood VARCHAR(45),
     city VARCHAR(45),
     address VARCHAR(45),
     state VARCHAR(45),
     phone VARCHAR(45),
     logo VARCHAR(45),
     is_branch BOOLEAN,
     enterprise_parent INT,
     is_head_office BOOLEAN,
     status VARCHAR(45),
     PRIMARY KEY (id)
);