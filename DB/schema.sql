CREATE DATABASE IF NOT EXISTS library;

USE library;

CREATE TABLE user
(
    id                  INT          NOT NULL PRIMARY KEY AUTO_INCREMENT,
    phone               VARCHAR(10)  NOT NULL UNIQUE,
    password       TEXT        NOT NULL,
    userName            VARCHAR(32)  NOT NULL,
    regist_time      TIMESTAMP    NOT NULL,
    exit_time         TIMESTAMP     NULL
);

CREATE TABLE book
(
    id                  INT          NOT NULL PRIMARY KEY AUTO_INCREMENT,
    isbn                VARCHAR(256) NOT NULL,
    title               VARCHAR(128) NOT NULL,
    author              VARCHAR(32)  NOT NULL,
    introduction        VARCHAR(32)  NOT NULL,
    store_date          TIMESTAMP    NOT NULL,
    borrowing_date      TIMESTAMP    NOT NULL,
    return_date         TIMESTAMP    NOT NULL,
    sta                 INT          NOT NULL
);