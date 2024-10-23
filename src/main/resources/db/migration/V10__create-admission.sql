CREATE TABLE admission (
    id INT AUTO_INCREMENT,
    date DATE,
    admission_exam DATE,
    probation_period VARCHAR(45),
    first_job VARCHAR(45),
    social_contribution VARCHAR(45),
    department VARCHAR(45),
    position VARCHAR(45),
    period_time VARCHAR(45),
    employee_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (employee_id) REFERENCES employee(id)
);