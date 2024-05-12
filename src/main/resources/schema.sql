CREATE TABLE IF NOT EXISTS Produto(
    id INT NOT NULL,
    nome varchar(250) NOT NULL,
    preco DOUBLE PRECISION NOT NULL,
    peso DOUBLE PRECISION NOT NULL,
    versao INT,
    PRIMARY KEY (id)
);