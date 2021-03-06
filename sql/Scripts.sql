create database projeto_db;
use projeto_db;

create table estados ( 
sigla varchar(4) primary key, 
nome varchar(25) not null);

create table marca_mod (
marca_nome varchar(25) not null,
 modelo_nome varchar(25) primary key);

create table lojas(
loja_nome varchar(25) not null ,
loja_id varchar(25) primary key);

create table user ( 
login varchar(25) primary key,
nome varchar(25) not null,
senha int not null);  

create table veiculos (
placa varchar(25) primary key,
preco float(7,2) not null,
ano int not null,
marca_nome varchar(25) not null,
estado varchar(4) ,
modelo_nome varchar(25),
loja_id varchar(25) ,
foreign key (estado) references estados (sigla),
foreign key (modelo_nome) references marca_mod (modelo_nome),
foreign key (loja_id) references lojas (loja_id));


insert into estados values ('SP' ,'São Paulo');
insert into estados values ('MG' ,'Minas Gerais');
insert into estados values ('RE' ,'Recife');
insert into estados values ('SC' ,'Santa Catarina');
insert into estados values ('RN' ,'Rio Grande do Norte');

insert into marca_mod values ('Hyundai','HB-20');
insert into marca_mod values ('Ford','KA');
insert into marca_mod values ('Mitsubishi','Lancer');
insert into marca_mod values ('Chevrolet','Omega');
insert into marca_mod values ('Toyota','Etios');

insert into lojas values('Auto Liberdade', 'lj-lb');
insert into lojas values ( 'Tucuruvi Motors' ,'lj-tc' );
insert into lojas values ('Anhembi cars' , 'lj-Am');
insert into lojas values ('Morumbi bros' , 'lj-mo');
insert into lojas values ('Project Penha' , 'lj-pe');

insert into user values ('everton.marques' , 'Everton Marques', 585858);
insert into user values ('mateus.amaral' , 'Mateus Amaral', 124578);
insert into user values ('luis.reis', 'Luis Reis', 789456);
insert into user values ('gustavo.lima', 'Gustavo Lima' , 1654868);
insert into user values ('gustavo.ferreira','Gustavo Ferreira',141414);

insert into veiculos values ( '158-FNH' , 50000, 2016,'Hyundai','SP','HB-20','lj-mo');
insert into veiculos values ('334-THR' , 40000,2019,'Ford','MG','KA','lj-pe');
insert into veiculos values('518-VEI', 80000,'2020','Mitsubishi','SC','Lancer','lj-Am');
insert into veiculos values ('648-OCO',30000,2005,'Chevrolet','RE','Omega','lj-tc');
insert into veiculos values ('654-NOT',40000,2019,'Toyota','RN','Etios','lj-tc');
