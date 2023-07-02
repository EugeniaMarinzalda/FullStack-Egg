#a) Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años.
SELECT * FROM familias where num_hijos>=3 and edad_maxima<=10 ;

#b) Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de agosto de
#2020 y el 31 de agosto de 2020 en Reino Unido.
SELECT * FROM casas where fecha_desde >= '2020-08-01' and fecha_hasta<= '2022-08-31' and pais = 'Reino Unido';

#c) Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail.
SELECT * FROM familias where email like '%@hotmail.com' ;

#d) Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha dada
#y un número de días específico.
SELECT * FROM casas where fecha_desde >= '2020-07-15' and 20>=tiempo_minimo and 20<=tiempo_maximo;
#SELECT * FROM casas where fecha_desde >= 'fecha_dada' and cantdias>=tiempo_minimo and cantdias<=tiempo_maximo;

#e) Listar los datos de todos los clientes que en algún momento realizaron una estancia y la
#descripción de la casa donde la realizaron.
SELECT c.* , ca.* FROM clientes c 
inner join estancias e on c.id_cliente = e.id_cliente
inner join casas ca on e.id_casa = ca.id_casa;

#f) Listar todas las estancias que han sido reservadas por un cliente, mostrar el nombre, país y
#ciudad del cliente y además la información de la casa que reservó. La que reemplazaría a la anterior
SELECT c.nombre, c.pais, c.ciudad , ca.* FROM clientes c 
Left join estancias e on c.id_cliente = e.id_cliente
inner join casas ca on e.id_casa = ca.id_casa;
 


/*
#g) Debido a la devaluación de la libra esterlina con respecto al euro se desea incrementar el
#precio por día en un 5% de todas las casas del Reino Unido. Mostar los precios actualizados.


h) Obtener el número de casas que existen para cada uno de los países diferentes.
i) Busca y listar aquellas casas del Reino Unido de las que se ha dicho de ellas (comentarios)
que están ‘limpias’.
j) Insertar nuevos datos en la tabla estancias verificando la disponibilidad de las fechas.*/