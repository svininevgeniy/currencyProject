CREATE SCHEMA IF NOT EXISTS currency_app;

CREATE TABLE currency_app.currencies (
    id BIGSERIAL PRIMARY KEY,
    code VARCHAR NOT NULL,
    rate NUMERIC(19, 5) NOT NULL
);