drop database ensino;
create database ensino;
use ensino;

create table escola
(
    id int primary key auto_increment,
    nome varchar(50)not null
);

insert into escola values(null,'Escola Ensino Médio');

insert into escola values(null,'Escola Ensino Superior');

create table disciplina
(
    id int primary key auto_increment,
    nome varchar(50)not null
);

insert into disciplina values(null,'Matemática');

insert into disciplina values(null,'Educação Física');


create table avaliacao
(
    id int primary key auto_increment,
    nome varchar(50)not null,
    nota int not null
);

insert into avaliacao values(null,'Prova', 10);

insert into avaliacao values(null,'Relatório', 7);


show tables;

select * from disciplina;

select * from escola;

select * from avaliacao;


insert into venda_produto values (null, 1,35.00,'2018-05-15');
insert into venda_produto values (null, 1,35.00,'2018-06-15');
insert into venda_produto values (null, 1,35.00,'2018-07-15');
insert into venda_produto values (null, 2,120.00,'2018-07-15');
insert into venda_produto values (null, 2,120.00,'2018-07-14');
insert into venda_produto values (null, 3,15.00,'2018-07-15');
insert into venda_produto values (null, 7,45.00,'2018-07-15');
insert into venda_produto values (null, 8,65.00,'2018-07-15');
insert into venda_produto values (null, 8,65.00,'2018-07-16');
insert into venda_produto values (null, 9,48.00,'2018-07-16');
insert into venda_produto values (null, 5,3500.00,'2018-07-16');
insert into venda_produto values (null, 5,3500.00,'2018-07-16');
insert into venda_produto values (null, 6,450.00,'2018-07-16');

