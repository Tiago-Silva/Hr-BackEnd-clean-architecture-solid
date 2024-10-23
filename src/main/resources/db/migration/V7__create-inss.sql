CREATE TABLE inss (
    id INT AUTO_INCREMENT,
    start_date DATE,
    end_date DATE,
    reason VARCHAR(255),
    description VARCHAR(255),
    employee_name VARCHAR(255),
    department VARCHAR(255),
    return_date DATE,
    enterprise_id INT,
    employee_id INT,
    reminder_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (employee_id) REFERENCES employee(id)
);