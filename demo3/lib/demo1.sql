create database demo1;
use demo1;
create table persona
(
 dni int,
 nombres varchar(200),
 correo varchar(50),
 fecnac varchar(10)
);

select*from persona;

insert into persona(dni,nombres,correo,fecnac) values(78012345,'Anthony Loayza Perez','rloayza@gmail.com','02/02/2013');