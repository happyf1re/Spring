DROP TABLE IF EXISTS products;
CREATE TABLE products (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) UNIQUE NOT NULL,
    price BIGINT
);

INSERT INTO products (title, price)
VALUES
('Product1', 3000),
('Product2', 1000),
('Product3', 1500),
('Product4', 4000);