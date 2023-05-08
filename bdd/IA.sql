create database IA;

CREATE TABLE login(
    idLogin SERIAL Primary key,
    login VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT null
);
insert into login (login,password) values ('admin','admin');

create table application(
    idapplication SERIAL Primary key,
    application varchar(100) NOT NULL
);

create table actualite(
    idactualite SERIAL Primary key,
    idapplication integer NOT NULL,
    FOREIGN KEY (idapplication) REFERENCES application (idapplication),
    titre varchar(100) NOT NULL,
    description text,
    status integer default 0

create table temoignage(
    idtemoignage SERIAL Primary key,
    auteur varchar(100),
    commentaire text
);