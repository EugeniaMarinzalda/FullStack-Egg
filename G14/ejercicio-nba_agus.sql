/*Abrir el script de la base de datos llamada “nba.sql” y ejecutarlo para crear todas las tablas e
insertar datos en las mismas. A continuación, generar el modelo de entidad relación. Deberá
obtener un diagrama de entidad relación igual al que se muestra a continuación:*/
select * from jugadores;
select * from equipos;
select * from estadisticas;
select * from partidos;

#1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
select nombre from jugadores order by nombre asc;

#2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras,
#ordenados por nombre alfabéticamente.
select nombre, posicion, peso from jugadores where peso >= 200 and posicion regexp'C' order by nombre asc;

#3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.
select nombre from equipos order by nombre asc;

#4. Mostrar el nombre de los equipos del este (East).
select nombre, conferencia from equipos where conferencia regexp 'east';
select * from equipos where conferencia ='east';

#5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
select nombre, ciudad from equipos where ciudad like 'c%' order by nombre asc;
select * from equipos where ciudad regexp '^c';

#6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
select nombre, nombre_equipo from jugadores order by nombre_equipo asc;

#7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
select nombre, nombre_equipo from jugadores where nombre_equipo = 'raptors' order by nombre asc; 

#8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.
select nombre, puntos_por_partido from jugadores as j join estadisticas as e on j.codigo = e.jugador where j.nombre = 'pau gasol';

#9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′
select j.nombre, e.puntos_por_partido, e.temporada from jugadores j, estadisticas e where e.jugador = j.codigo 
and j.nombre = 'pau gasol' and temporada = '04/05';
select nombre, puntos_por_partido , temporada from jugadores as j join estadisticas as e on j.codigo = e.jugador 
where j.nombre = 'pau gasol' and temporada = '04/05';
select est.Puntos_por_partido from estadisticas est where est.jugador =(select j.codigo from jugadores j where j.nombre='Pau Gasol') 
and est.temporada='04/05';

#10. Mostrar el número de puntos de cada jugador en toda su carrera.
select nombre, round(sum(puntos_por_partido)) as 'Puntos totales' from jugadores j join estadisticas e on j.codigo = e.jugador group by j.nombre;

#11. Mostrar el número de jugadores de cada equipo.
select nombre_equipo, count(*) as 'Cantidad de jugadores' from equipos e, jugadores j  where j.nombre_equipo = e.nombre group by nombre_equipo;
select nombre_equipo, count(j.codigo) as 'Cantidad de jugadores' from equipos e, jugadores j  where j.nombre_equipo = e.nombre group by nombre_equipo;
select e.Nombre as Equipo, COUNT(j.codigo) as 'Cantidad Jugadores' from equipos e join jugadores j on e.Nombre = j.Nombre_equipo
group by e.Nombre;

#12. Mostrar el jugador que más puntos ha realizado en toda su carrera.
select nombre, round(sum(puntos_por_partido)) as total_puntos from jugadores j join estadisticas e on j.codigo = e.jugador group by j.nombre order by total_puntos desc limit 1;

#13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
select j.nombre, nombre_equipo, altura, conferencia, division from jugadores j join equipos e on j.nombre_equipo = e.nombre order by altura desc limit 1;
select e.nombre, conferencia, division, j.nombre, j.altura from jugadores j join equipos e on j.nombre_equipo = e.nombre 
where j.altura = (select max(altura) from jugadores);

#14. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos.
select equipo_local, equipo_visitante, abs(puntos_local-puntos_visitante) as diferencia from partidos where abs(puntos_local-puntos_visitante) = 
(select max(abs(puntos_local-puntos_visitante)) from partidos) ;

#15. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante, equipo_ganador), en caso de empate sera null.
select p.codigo, equipo_local, equipo_visitante, 
(SELECT equipo_local FROM partidos WHERE codigo = p.codigo AND puntos_local > puntos_visitante LIMIT 1 )as equipo_ganador from partidos p;

SELECT p.codigo, p.equipo_local, p.equipo_visitante, 
(SELECT equipo_local FROM partidos WHERE codigo = p.codigo AND puntos_local > puntos_visitante LIMIT 1) AS equipo_ganador_local, 
(SELECT equipo_visitante FROM partidos WHERE codigo = p.codigo AND puntos_visitante > puntos_local LIMIT 1 ) AS equipo_ganador_visitante 
FROM partidos p;

select codigo, equipo_local, equipo_visitante, if (puntos_local > puntos_visitante, equipo_local, if (puntos_local< puntos_visitante, equipo_visitante, null)) 
as equipo_ganador from partidos;

#16. Mostrar la media de puntos en partidos de los equipos de la división Pacific.
select round(avg(puntos_local+puntos_visitante)) as media_puntos from partidos where equipo_local in 
(select nombre from equipos where division = 'pacific' ) or equipo_visitante in (select nombre from equipos where division = 'pacific' );

#17. Mostrar los puntos de cada equipo en los partidos, tanto de local como de visitante.
select e.nombre, p.puntos_local, p.puntos_visitante , temporada from partidos p inner join equipos e on e.nombre = p.equipo_local;

select equipo_local, sum(puntos_local) as Puntos_Total from partidos group by equipo_local union all 
select equipo_visitante, sum(puntos_visitante) as puntos_visitante from partidos group by equipo_visitante;

select equipos.nombre, sum(partidos.puntos_local) as puntos_locales, sum(partidos.puntos_visitante) as puntos_visitantes 
from equipos inner join partidos on equipos.nombre = partidos.equipo_local group by equipos.nombre;

select equipos.nombre, partidos.puntos_local, partidos.puntos_visitante from equipos inner join partidos on equipos.nombre = partidos.equipo_local;

select e.nombre, p.puntos_local, p.puntos_visitante, temporada from equipos as e inner join partidos as p on e.nombre = p.equipo_local;
