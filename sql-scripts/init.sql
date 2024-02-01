-- init.sql
drop table if exists usuarios;

CREATE TABLE usuarios (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255)
);

INSERT INTO usuarios (name) VALUES ('Leon Tolstói'),
('Honoré de Balzac'),
('Mary Shelley'),
('Oscar Wild'),
('Italo Sveno');

