CREATE TABLE documents (
    id INT AUTO_INCREMENT,
    type VARCHAR(45),
    document_url VARCHAR(45),
    name VARCHAR(45),
    description VARCHAR(45),
    department VARCHAR(45),
    enterprise_id INT,
    date DATE,
    absence_id INT,
    employee_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (employee_id) REFERENCES employee(id)
);