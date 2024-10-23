CREATE TABLE benefit (
    id INT AUTO_INCREMENT,
    name VARCHAR(45),
    type VARCHAR(45),
    balance_calculation VARCHAR(45),
    payroll_cost VARCHAR(45),
    description VARCHAR(45),
    salary_percentage VARCHAR(45),
    discount_event VARCHAR(45),
    operator VARCHAR(45),
    cutoff_date DATE,
    contract_expiry DATE,
    enterprise_cost VARCHAR(45),
    enterprise_name VARCHAR(45),
    enterprise_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (enterprise_id) REFERENCES enterprise(id)
);