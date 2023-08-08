CREATE TABLE employee(
                         id BIGSERIAL NOT NULL PRIMARY KEY,
                         name VARCHAR(50) NOT NULL,
                         salary INT NOT NULL
);
INSERT INTO employee (name, salary)
VALUES ('Антон', 140000);

CREATE TABLE position(
                         id_position BIGSERIAL NOT NULL PRIMARY KEY,
                         name_position VARCHAR(50) NOT NULL
);
ALTER TABLE employee ADD FOREIGN KEY (id_position) REFERENCES  position(id_position);