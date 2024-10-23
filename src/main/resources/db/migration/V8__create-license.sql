CREATE TABLE license (
    id INT AUTO_INCREMENT,
    type VARCHAR(45),
    description VARCHAR(45),
    start_date DATE,
    end_date DATE,
    return_date DATE,
    department VARCHAR(45),
    enterprise_id INT,
    reminder_id INT,
    employee_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (employee_id) REFERENCES employee(id)
);