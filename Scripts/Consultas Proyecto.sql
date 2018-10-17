CREATE DATABASE BD_EQUIPO_FUTBOL

/*--------------------TABLA JUGADOR--------------------*/
create table jugador
(cod_jugador char (10) NOT NULL,
nombres_jugador char (20)NOT NULL,
apellidos_jugador char (20) NOT NULL,
nacionalidad char (20) NOT NULL,
duracion_contrato char(20) NOT NULL,
fecha_nac date NOT NULL,
posicion char (20) NOT NULL,
num_camiseta int NOT NULL
CONSTRAINT PK_JUGADOR
PRIMARY KEY (cod_jugador))

/*--------------------TABLA PARTIDO--------------------*/
create table partido
(id_partido char (10) NOT NULL,
fecha_hora datetime,
lugar char (20) NOT NULL,
estadio char (20) NOT NULL,
arbitro_designado char (20),
resultado char (3) NOT NULL,
estado_partido int NOT NULL,
nombre_equipo_rival char (20) NOT NULL
CONSTRAINT PK_PARTIDO
PRIMARY KEY (id_partido))

/*--------------------TABLA DETALLE PARTIDO--------------------*/
create table detalle_partido
(id_partido char (10),
cod_jugador char(10))

/*--------------------TABLA ESTADISTICAS--------------------*/
create table estadisticas
(id_partido char (10),
cod_jugador char(10),
num_pases int NOT NULL,
num_goles int NOT NULL,
num_asistencias int NOT NULL,
dist_recorrida  real NOT NULL,
num_tarjeta_amar int NOT NULL,
num_tarjeta_roja int NOT NULL)

--------------------------------------------------------------

insert into jugador values ('111','Damian','Diaz','Argentina','5 Años','12-10-1989','Armador',10)
insert into jugador values ('112','Matias','Oyola','Argentina','4 Años','11-10-1988','Centro',8)
insert into jugador values ('113','Maximo','Banguera','Ecuatoriana','5 Años','11-10-1998','Arquero',1)
insert into jugador values ('114','Ismael','Blanco','Argentina','4 Años','11-10-1994','Delantero',9)
insert into jugador values ('115','Brahian','Aleman','Argentina','3 Años','21-10-1984','Defensa',2)

insert into partido values ('222','18-06-12 10:34:09 AM','Quito','Atahualpa','Carlos Vera','2-1',1,'Ballenita')
insert into partido values ('223','21-06-12 11:30:09 AM','Guayaquil','Monumental','Samuel Haro','4-1',1,'Liga')

insert into detalle_partido values('222','111')
insert into detalle_partido values('222','112')
insert into detalle_partido values('222','113')

insert into detalle_partido values('223','111')
insert into detalle_partido values('223','112')
insert into detalle_partido values('223','113')
insert into detalle_partido values('223','114')
insert into detalle_partido values('223','115')


insert into estadisticas values ('222','111',12,1,0,123,0,0)
insert into estadisticas values ('222','112',54,1,0,564,2,0)
insert into estadisticas values ('223','111',124,3,1,564,0,0)

select * from partido where id_partido='225'
select * from detalle_partido
select * from estadisticas

select * from detalle_partido

insert into partido values ('224','01/01/2001','a','a','a','a',1,'a')
delete partido where id_partido='229'

select nombres_jugador,apellidos_jugador
from jugador where cod_jugador='111'

--1)PARTIDO
select * from partido
where id_partido='222'--Cambiar por Partido


--2)PARTIDO
select nombres_jugador,apellidos_jugador,num_camiseta,posicion
from detalle_partido,jugador
where id_partido='224' --Cambiar por Partido
and detalle_partido.cod_jugador=jugador.cod_jugador

--3)ESTADISTICAS
select nombres_jugador,apellidos_jugador,num_goles,e.*
from estadisticas e,jugador
where id_partido='223' and e.cod_jugador='111'--Cambiar Por jugador y Partido
and e.cod_jugador=jugador.cod_jugador

--4)JUGADOR
select count(*) as Numero_Partidos
from detalle_partido
where cod_jugador='111'--Cambiar Por Jugador

--5)PARTIDO
select count(*) as Cantidad_Estado
from partido
where estado_partido=1--Cambiar por estado

--6)PARTIDO
select nombre_equipo_rival,fecha_hora,lugar,estadio,resultado from partido
where id_partido='222'--Cambiar por partido

select posicion from jugador 




