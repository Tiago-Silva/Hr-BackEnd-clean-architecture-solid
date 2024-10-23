CREATE TABLE warning (
    id INT AUTO_INCREMENT,
    date DATE,
    description VARCHAR(255),
    time TIME,
    responsible VARCHAR(255),
    type VARCHAR(255),
    employee_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (employee_id) REFERENCES employee(id)
);