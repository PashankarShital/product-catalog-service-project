CREATE TABLE price
(
    id       BIGINT AUTO_INCREMENT NOT NULL,
    currency VARCHAR(255) NULL,
    price    DOUBLE NOT NULL,
    CONSTRAINT pk_price PRIMARY KEY (id)
);