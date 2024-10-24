CREATE TABLE point (
    id INT AUTO_INCREMENT,
    badge VARCHAR(45),
    date DATE,
    time TIME,
    start_time TIME,
    end_time TIME,
    break_end TIME,
    break_start TIME,
    rep VARCHAR(45),
    nsr VARCHAR(45),
    pis VARCHAR(45),
    employee_name VARCHAR(45),
    employee_id INT,
    late_start BOOLEAN,
    enterprise_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (enterprise_id) REFERENCES enterprise(id)
);