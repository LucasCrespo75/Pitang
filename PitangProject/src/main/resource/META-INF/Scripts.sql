drop table USUARIO;
CREATE TABLE USUARIO (
ID_USUARIO INT NOT NULL,
NOME VARCHAR(11) NOT NULL,
EMAIL VARCHAR(100)PRIMARY KEY ENABLE,
SENHA VARCHAR(100) NOT NULL,
TELEFONE VARCHAR(100) NOT NULL
);
CREATE SEQUENCE ID_USUARIO INCREMENT BY 1 START WITH 1 MAXVALUE 999999999 MINVALUE 1;



