
-- A continuación, se deben realizar las siguientes consultas sobre la base de datos:
-- 1. Lista el nombre de todos los productos que hay en la tabla producto.
select nombre from producto;
select * from producto;
-- 2. Lista los nombres y los precios de todos los productos de la tabla producto.
select nombre, precio from producto;
-- 3. Lista todas las columnas de la tabla producto.
select * from producto;
-- 4. Lista los nombres y los precios de todos los productos de la tabla producto, redondeando el valor del precio.
select nombre, round(precio) from producto;
-- 5. Lista el código de los fabricantes que tienen productos en la tabla producto.
select codigo_fabricante from producto group by codigo_fabricante;
select p.codigo_fabricante, p.nombre , f.nombre as fabricante from producto p , fabricante f where p.codigo_fabricante = f.codigo order by p.codigo_fabricante;
-- 6. Lista el código de los fabricantes que tienen productos en la tabla producto, sin mostrar los repetidos.
select distinct codigo_fabricante from producto;
select distinct p.codigo_fabricante , f.nombre from producto p , fabricante f where p.codigo_fabricante = f.codigo;
-- 7. Lista los nombres de los fabricantes ordenados de forma ascendente.
select nombre from fabricante order by nombre;
--  8. Lista los nombres de los productos ordenados en primer lugar por el nombre de forma ascendente y en segundo lugar por el precio de forma descendente.
select * from producto order by nombre asc , precio desc;
--  9. Devuelve una lista con las 5 primeras filas de la tabla fabricante.
select * from fabricante limit 5;
--  10. Lista el nombre y el precio del producto más barato. (Utilice solamente las cláusulas ORDER BY y LIMIT)
select nombre, precio from producto order by precio asc limit 1;
--  11. Lista el nombre y el precio del producto más caro. (Utilice solamente las cláusulas ORDER BY y LIMIT)
select nombre, precio from producto order by precio desc limit 1;
-- 12. Lista el nombre de los productos que tienen un precio menor o igual a $120.
select nombre, precio from producto where precio <= 120;
-- 13. Lista todos los productos que tengan un precio entre $60 y $200. Utilizando el operador BETWEEN.
select nombre, precio from producto where precio between 60 and 200;
--  14. Lista todos los productos donde el código de fabricante sea 1, 3 o 5. Utilizando el operador IN.
select nombre, codigo_fabricante from producto where codigo_fabricante in (1,3,5);
select nombre, codigo_fabricante from producto where codigo_fabricante regexp "1\|3\|5";
--  15. Devuelve una lista con el nombre de todos los productos que contienen la cadena Portátil en el nombre.
select * from producto where nombre like '%portatil%';
select * from producto where nombre regexp 'portátil';

-- Consultas Multitabla
-- 1. Devuelve una lista con el código del producto, nombre del producto, código del fabricante y nombre del fabricante, de todos los productos de la base de datos.
select p.codigo, p.nombre, f.codigo, f.nombre from producto p left outer Join fabricante f on p.codigo_fabricante = f.codigo ;
-- 2. Devuelve una lista con el nombre del producto, precio y nombre de fabricante de todos los productos de la base de datos. Ordene el resultado por el nombre del fabricante, por
-- orden alfabético.
select p.nombre, p.precio, f.nombre as Nombre_Fabricante from producto p left outer Join fabricante f on p.codigo_fabricante = f.codigo order by f.nombre;
-- 3. Devuelve el nombre del producto, su precio y el nombre de su fabricante, del producto más barato.
select p.codigo, p.nombre, p.precio, f.nombre as Nombre_Fabricante from producto p Left Join fabricante f on p.codigo_fabricante = f.codigo order by p.precio ;
-- select p.nombre, p.precio, count(p.nombre), f.nombre as Nombre_Fabricante  from producto p cross Join fabricante f group by p.nombre, p.precio, f.nombre ;
-- 4. Devuelve una lista de todos los productos del fabricante Lenovo.
select p.*, f.nombre as 'Nombre Fabricante' from producto p Left Join fabricante f on p.codigo_fabricante = f.codigo where f.nombre= 'Lenovo' ;
-- 5. Devuelve una lista de todos los productos del fabricante Crucial que tengan un precio mayor que $200.
select p.*, f.nombre as 'Nombre Fabricante' from producto p inner Join fabricante f on p.codigo_fabricante = f.codigo where f.nombre= 'Crucial' and p.precio>200 ; -- implicito
select p.*, f.nombre as 'Nombre Fabricante' from producto p, fabricante f where p.codigo_fabricante = f.codigo and f.nombre= 'Crucial' and p.precio>200 ; -- explicito
-- 6. Devuelve un listado con todos los productos de los fabricantes Asus, Hewlett-Packard. Utilizando el operador IN.
select p.*, f.nombre as 'Nombre Fabricante' from producto p, fabricante f where p.codigo_fabricante = f.codigo and f.nombre in('Asus','Hewlett-Packard') ; 
-- 7. Devuelve un listado con el nombre de producto, precio y nombre de fabricante, de todos
-- los productos que tengan un precio mayor o igual a $180. Ordene el resultado en primer
-- lugar por el precio (en orden descendente) y en segundo lugar por el nombre (en orden ascendente)
select p.*, f.nombre as 'Nombre Fabricante' from producto p, fabricante f where p.codigo_fabricante = f.codigo and p.precio>=180 order by p.precio desc , p.nombre asc;

-- Consultas Multitabla
-- Resuelva todas las consultas utilizando las cláusulas LEFT JOIN y RIGHT JOIN.
-- 1. Devuelve un listado de todos los fabricantes que existen en la base de datos, junto con los
-- productos que tiene cada uno de ellos. El listado deberá mostrar también aquellos
-- fabricantes que no tienen productos asociados.
select f.* , p.nombre from producto p right join fabricante f on p.codigo_fabricante = f.codigo;
-- 2. Devuelve un listado donde sólo aparezcan aquellos fabricantes que no tienen ningún
-- producto asociado.
select f.*, P.* from producto p RIGHT JOIN fabricante f ON p.codigo_fabricante = F.CODIGO WHERE P.CODIGO_FABRICANTE IS NULL;
SELECT f.nombre FROM FABRICANTE F WHERE F.codigo NOT IN (SELECT P.codigo_FABRICANTE FROM PRODUCTO P); -- ANTI JOIN
SELECT F.NOMBRE FROM FABRICANTE F WHERE NOT EXISTS (SELECT P.* FROM PRODUCTO P WHERE P.CODIGO_FABRICANTE = F.CODIGO);

-- Subconsultas (En la cláusula WHERE)
-- Con operadores básicos de comparación
-- 1. Devuelve todos los productos del fabricante Lenovo. (Sin utilizar INNER JOIN).
SELECT P.*, F.NOMBRE FROM PRODUCTO P , FABRICANTE F WHERE p.codigo_fabricante = f.codigo AND F.NOMBRE = 'LENOVO';

-- 2. Devuelve todos los datos de los productos que tienen el mismo precio que el producto
-- más caro del fabricante Lenovo. (Sin utilizar INNER JOIN).
SELECT P.* 
FROM PRODUCTO P  
WHERE P.PRECIO = 
	(SELECT MAX(P.PRECIO) 
    FROM FABRICANTE F, PRODUCTO P 
    WHERE p.codigo_fabricante = f.codigo AND F.NOMBRE = 'LENOVO');
    
SELECT MAX(P.PRECIO) FROM FABRICANTE F, PRODUCTO P WHERE p.codigo_fabricante = f.codigo AND F.NOMBRE = 'LENOVO'; -- CONTROL SUBCONSULTA

-- 3. Lista el nombre del producto más caro del fabricante Lenovo.
SELECT P.NOMBRE , P.PRECIO , F.NOMBRE AS 'NOMBRE FABRICANTE' 
FROM FABRICANTE F, PRODUCTO P 
WHERE p.codigo_fabricante = f.codigo AND F.NOMBRE = 'LENOVO' 
order by p.precio desc
limit 1
;

SELECT P.* 
FROM PRODUCTO P 
WHERE P.CODIGO_FABRICANTE = 2 AND P.PRECIO = 
	(SELECT MAX(P.PRECIO) 
    FROM PRODUCTO P
    WHERE P.CODIGO_FABRICANTE = 2);

-- 4. Lista todos los productos del fabricante Asus que tienen un precio superior al precio
-- medio de todos sus productos.
select p.* 
from producto p, fabricante f
where p.codigo_fabricante = f.codigo AND f.nombre = 'Asus' AND P.PRECIO > (
	SELECT AVG(P.PRECIO)
    FROM PRODUCTO P 
    WHERE P.CODIGO_FABRICANTE = 1
    );

-- Subconsultas con IN y NOT IN
-- 1. Devuelve los nombres de los fabricantes que tienen productos asociados. (Utilizando IN o
-- NOT IN).
-- 2. Devuelve los nombres de los fabricantes que no tienen productos asociados. (Utilizando
-- IN o NOT IN).
-- Subconsultas (En la cláusula HAVING)
-- 1. Devuelve un listado con todos los nombres de los fabricantes que tienen el mismo número
-- de productos que el fabricante Lenovo.
select * from fabricante;
select * from producto;
select * from producto p , fabricante f where p.codigo_fabricante = f.codigo;