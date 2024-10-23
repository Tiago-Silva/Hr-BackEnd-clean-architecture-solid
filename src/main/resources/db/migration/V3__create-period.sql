CREATE TABLE period (
    id INT AUTO_INCREMENT,
    start_time TIME,
    end_time TIME,
    break_start TIME,
    break_end TIME,
    workday VARCHAR(45),
    type VARCHAR(45),
    enterprise_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (enterprise_id) REFERENCES enterprise(id)
);