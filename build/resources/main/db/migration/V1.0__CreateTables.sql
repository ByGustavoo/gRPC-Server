CREATE TABLE estoque(
    id_produto SERIAL PRIMARY KEY,
    descricao  VARCHAR(255) NOT NULL,
    quantidade INTEGER NOT NULL DEFAULT 0,
    disponivel BOOLEAN NOT NULL DEFAULT FALSE
);

INSERT INTO estoque (descricao, quantidade, disponivel) VALUES
('Arroz Tio João 1kg', 50, TRUE),
('Feijão Carioca 1kg', 30, TRUE),
('Açúcar Cristal 1kg', 0, FALSE),
('Óleo de Soja 900ml', 15, TRUE),
('Café Pilão 500g', 0, FALSE);