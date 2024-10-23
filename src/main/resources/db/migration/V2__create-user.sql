CREATE TABLE user (
    userid INT AUTO_INCREMENT,
    first_name VARCHAR(45),
    last_name VARCHAR(45),
    username VARCHAR(45),
    password VARCHAR(45),
    token VARCHAR(45),
    image VARCHAR(45),
    photo BLOB,
    type VARCHAR(45),
    role VARCHAR(45),
    account_non_expired BOOLEAN,
    account_non_locked BOOLEAN,
    credentials_non_expired BOOLEAN,
    enabled BOOLEAN,
    enterprise_id INT,
    PRIMARY KEY (userid),
    FOREIGN KEY (enterprise_id) REFERENCES enterprise(id)
);