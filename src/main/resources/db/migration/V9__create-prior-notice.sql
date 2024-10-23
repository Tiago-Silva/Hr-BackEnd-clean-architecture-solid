CREATE TABLE prior_notice (
    id INT AUTO_INCREMENT,
    reason VARCHAR(45),
    description VARCHAR(45),
    start_date DATE,
    end_date DATE,
    employee_name VARCHAR(45),
    department VARCHAR(45),
    enterprise_id INT,
    return_date DATE,
    reminder_id INT,
    notice_type VARCHAR(45),
    days VARCHAR(45),
    employee_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (employee_id) REFERENCES employee(id)
);