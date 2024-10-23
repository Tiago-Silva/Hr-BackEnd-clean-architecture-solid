CREATE TABLE time_clock (
    id INT AUTO_INCREMENT,
    rep VARCHAR(45),
    location VARCHAR(45),
    description VARCHAR(45),
    enterprise_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (enterprise_id) REFERENCES enterprise(id)
);