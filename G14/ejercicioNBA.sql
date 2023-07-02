

#continuación, se deben realizar las siguientes consultas sobre la base de datos:
#1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
select nombre from jugadores order by nombre;

#2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras, ordenados por nombre alfabéticamente.
select nombre, posicion, peso from jugadores where posicion like '%c%' and peso >= 200 order by nombre;
select nombre, posicion, peso from jugadores where posicion regexp 'c' and peso >= 200 order by nombre;

#3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.
select nombre_equipo from jugadores group by nombre_equipo order by nombre_equipo;

#4. Mostrar el nombre de los equipos del este (East).
select * from equipos where conferencia = 'east';

#5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
select * from equipos where ciudad like 'c%' order by nombre;

#6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
select nombre, nombre_equipo from jugadores order by nombre_equipo;

#7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
select nombre, nombre_equipo from jugadores where nombre_equipo = 'raptors' order by nombre_equipo;

#8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.
select j.nombre, e.puntos_por_partido from jugadores j join estadisticas e on e.jugador = j.codigo where j.nombre = 'Pau Gasol';

#9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
select j.nombre, e.puntos_por_partido, e.temporada from jugadores j join estadisticas e on e.jugador = j.codigo where j.nombre = 'Pau Gasol' and e.temporada = '04/05';

#10. Mostrar el número de puntos de cada jugador en toda su carrera.
select j.nombre, round(sum(e.puntos_por_partido)) as 'Puntos total' from jugadores j join estadisticas e on e.jugador = j.codigo group by j.nombre;
 
 #11. Mostrar el número de jugadores de cada equipo.
 select nombre_equipo, count(nombre) as cantidad from jugadores group by nombre_equipo;

#12. Mostrar el jugador que más puntos ha realizado en toda su carrera.
select j.nombre, round(sum(e.puntos_por_partido)) as Puntos_totales from jugadores j join estadisticas e on e.jugador = j.codigo group by j.nombre order by Puntos_totales desc limit 1;

#13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
select j.nombre, j.nombre_equipo, e.conferencia , e.division, j.altura from jugadores j join equipos e on j.Nombre_equipo = e.Nombre order by j.altura desc limit 1;  

# -----  14. Mostrar la media de puntos en partidos de los equipos de la división Pacific.
 #select  avg(est.puntos_por_partido) from estadisticas est, jugadores j where est.jugador = j.codigo and (
 select sum(puntos_por_partido) from estadisticas est, jugadores j where est.jugador = j.codigo and e.division = 'Pacific';
 #);

#15. - revisar - Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos.
select equipo_local, equipo_visitante, puntos_local, puntos_visitante, abs(puntos_local-puntos_visitante) as 'Diferencia_puntos'  from partidos where abs(puntos_local-puntos_visitante) = (
		select max(abs(puntos_local-puntos_visitante)) from partidos);

#17. Mostrar los puntos de cada equipo en los partidos, tanto de local como de visitante.
select equipos.nombre, sum(partidos.puntos_local) as puntos_local, sum(partidos.puntos_visitante) as puntos_visitante from equipos inner join partidos on equipos.nombre = partidos.equipo_local group by equipos.nombre; 

#18. - revisar - Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante, equipo_ganador), en caso de empate sera null.
select codigo as 'Codigo_partido' , equipo_local, equipo_visitante, if (puntos_local> puntos_visitante, equipo_local, if (puntos_local< puntos_visitante, equipo_visitante,null)) as equipo_ganador from partidos  ;

select * from equipos;
select * from estadisticas;
select * from jugadores;
select * from partidos;