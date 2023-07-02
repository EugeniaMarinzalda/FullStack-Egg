#1. Devuelve un listado con el código de oficina y la ciudad donde hay oficinas.
select codigo_oficina, ciudad from oficina;

#2. Devuelve un listado con la ciudad y el teléfono de las oficinas de España.
select ciudad, telefono from oficina where pais = 'españa';

#3. Devuelve un listado con el nombre, apellidos y email de los empleados cuyo jefe tiene un código de jefe igual a 7.
select nombre, apellido1, apellido2, email from empleado where codigo_jefe =7;

#4. Devuelve el nombre del puesto, nombre, apellidos y email del jefe de la empresa.
select e.codigo_empleado, e.puesto, e.nombre, e.apellido1, e.apellido2, e.email, e.codigo_jefe from empleado e where e.codigo_empleado in (
select codigo_jefe from empleado group by codigo_jefe);

#5. Devuelve un listado con el nombre, apellidos y puesto de aquellos empleados que no sean representantes de ventas.
select nombre, apellido1, apellido2, puesto from empleado where puesto not like 'Representante Ventas';

#6. Devuelve un listado con el nombre de los todos los clientes españoles.
select nombre_cliente from cliente where pais = 'Spain';

#7. Devuelve un listado con los distintos estados por los que puede pasar un pedido.
select estado from pedido group by estado;

/*8. Devuelve un listado con el código de cliente de aquellos clientes que realizaron algún pago
en 2008. Tenga en cuenta que deberá eliminar aquellos códigos de cliente que aparezcan repetidos. 
Resuelva la consulta:
o Utilizando la función YEAR de MySQL.
o Utilizando la función DATE_FORMAT de MySQL.
o Sin utilizar ninguna de las funciones anteriores.
*/
select codigo_cliente from pago where year(fecha_pago) = 2008 group by codigo_cliente;
select codigo_cliente from pago where date_format(fecha_pago,'%Y') = 2008 group by codigo_cliente;
select codigo_cliente from pago where fecha_pago like '%2008%' group by codigo_cliente;

#9. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de
#entrega de los pedidos que no han sido entregados a tiempo.
select codigo_pedido, codigo_cliente, year(fecha_esperada), year(fecha_entrega) from pedido where fecha_esperada < fecha_entrega ;
select codigo_pedido, codigo_cliente, date_format(fecha_esperada, '%d/%m/%Y') as 'Fecha esperada' , date_format(fecha_entrega, '%d/%m/%Y') as 'Fecha entrega' from pedido where fecha_esperada < fecha_entrega ;
select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega from pedido where fecha_esperada < fecha_entrega ;

/*10. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de
entrega de los pedidos cuya fecha de entrega ha sido al menos dos días antes de la fecha
esperada.
o Utilizando la función ADDDATE de MySQL.
o Utilizando la función DATEDIFF de MySQL.
*/
select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega from pedido where fecha_entrega < adddate(fecha_esperada,interval - 2 DAY); 
select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega from pedido where datediff(fecha_esperada,fecha_entrega)>2; 
select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega from pedido where (fecha_esperada-fecha_entrega)>2; 

#11. Devuelve un listado de todos los pedidos que fueron rechazados en 2009.
select * from pedido where estado= 'Rechazado' and year(fecha_pedido) = 2009;

#12. Devuelve un listado de todos los pedidos que han sido entregados en el mes de enero de cualquier año.
select * from pedido where fecha_entrega like '____-01-__';
select * from pedido where month(fecha_entrega) = 01;

#13. Devuelve un listado con todos los pagos que se realizaron en el año 2008 mediante Paypal.
#Ordene el resultado de mayor a menor.
select * from pago where forma_pago = 'Paypal' and year(fecha_pago)=2008 order by fecha_pago; 
 
 #14. Devuelve un listado con todas las formas de pago que aparecen en la tabla pago. Tenga en
#cuenta que no deben aparecer formas de pago repetidas.
 select forma_pago from pago group by forma_pago;
 
#15. Devuelve un listado con todos los productos que pertenecen a la gama Ornamentales y que
#tienen más de 100 unidades en stock. El listado deberá estar ordenado por su precio de
#venta, mostrando en primer lugar los de mayor precio.
select * from producto where gama like 'ornamentales' and cantidad_en_stock>100 order by precio_venta desc;

#16. Devuelve un listado con todos los clientes que sean de la ciudad de Madrid y cuyo
#representante de ventas tenga el código de empleado 11 o 30.
select * from cliente where ciudad like 'madrid' and codigo_empleado_rep_ventas in (11,30);
 
 /*
 Consultas multitabla (Composición interna)
Las consultas se deben resolver con INNER JOIN.
 */
 #1. Obtén un listado con el nombre de cada cliente y el nombre y apellido de su representante de ventas.
 select nombre_cliente, nombre, concat(apellido1 ,' ',apellido2 ) as Apellidos from cliente inner join empleado on codigo_empleado_rep_ventas = codigo_empleado;
 
#2. Muestra el nombre de los clientes que hayan realizado pagos junto con el nombre de sus representantes de ventas.
select nombre_cliente, concat(nombre,' ', apellido1,' ', apellido2) as Nombre_empleado from cliente inner join empleado on codigo_empleado_rep_ventas = codigo_empleado where codigo_cliente in (
select codigo_cliente from pago group by codigo_cliente);

#3. Muestra el nombre de los clientes que no hayan realizado pagos junto con el nombre de sus representantes de ventas.
select nombre_cliente, concat(nombre,' ', apellido1,' ', apellido2) as Nombre_empleado from cliente inner join empleado on codigo_empleado_rep_ventas = codigo_empleado where codigo_cliente not in (
select codigo_cliente from pago group by codigo_cliente);

#4. Devuelve el nombre de los clientes que han hecho pagos y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
select c.nombre_cliente, concat(e.nombre,' ', e.apellido1,' ', e.apellido2) as Nombre_empleado, o.ciudad  from cliente c 
inner join empleado e on c.codigo_empleado_rep_ventas = e.codigo_empleado
inner join pago p on p.codigo_cliente = c.codigo_cliente
inner join oficina o on o.codigo_oficina = e.codigo_oficina;

select c.nombre_cliente, concat(e.nombre,' ', e.apellido1,' ', e.apellido2) as Nombre_empleado from c.cliente inner join e.empleado on codigo_empleado_rep_ventas = codigo_empleado where codigo_cliente not in (
select codigo_cliente from pago group by codigo_cliente);

 
select * from cliente;
select * from detalle_pedido;
select * from empleado;
select * from gama_producto;
select * from oficina;
select * from pago;
select * from pedido;
select * from producto;


/*




5. Devuelve el nombre de los clientes que no hayan hecho pagos y el nombre de sus
representantes junto con la ciudad de la oficina a la que pertenece el representante.
6. Lista la dirección de las oficinas que tengan clientes en Fuenlabrada.
7. Devuelve el nombre de los clientes y el nombre de sus representantes junto con la ciudad
de la oficina a la que pertenece el representante.
8. Devuelve un listado con el nombre de los empleados junto con el nombre de sus jefes.
9. Devuelve el nombre de los clientes a los que no se les ha entregado a tiempo un pedido.
10. Devuelve un listado de las diferentes gamas de producto que ha comprado cada cliente.
Consultas multitabla (Composición externa)
Resuelva todas las consultas utilizando las cláusulas LEFT JOIN, RIGHT JOIN, JOIN.
1. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
2. Devuelve un listado que muestre solamente los clientes que no han realizado ningún
pedido.
3. Devuelve un listado que muestre los clientes que no han realizado ningún pago y los que
no han realizado ningún pedido.
4. Devuelve un listado que muestre solamente los empleados que no tienen una oficina
asociada.
5. Devuelve un listado que muestre solamente los empleados que no tienen un cliente
asociado.
6. Devuelve un listado que muestre los empleados que no tienen una oficina asociada y los
que no tienen un cliente asociado.
7. Devuelve un listado de los productos que nunca han aparecido en un pedido.*/
#8. Devuelve las oficinas donde no trabajan ninguno de los empleados que hayan sido los
#representantes de ventas de algún cliente que haya realizado la compra de algún producto
#de la gama Frutales.
SELECT DISTINCT oficina.codigo_oficina AS Oficina FROM oficina
LEFT JOIN empleado ON empleado.codigo_oficina = oficina.codigo_oficina
LEFT JOIN cliente ON cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado
LEFT JOIN pedido ON pedido.codigo_cliente = cliente.codigo_cliente
LEFT JOIN detalle_pedido ON detalle_pedido.codigo_pedido = pedido.codigo_pedido
LEFT JOIN producto ON producto.codigo_producto = detalle_pedido.codigo_producto
WHERE producto.gama = 'Frutales';
/*9. Devuelve un listado con los clientes que han realizado algún pedido, pero no han realizado
ningún pago.
10. Devuelve un listado con los datos de los empleados que no tienen clientes asociados y el
nombre de su jefe asociado.
Consultas resumen
1. ¿Cuántos empleados hay en la compañía?
2. ¿Cuántos clientes tiene cada país?
3. ¿Cuál fue el pago medio en 2009?
4. ¿Cuántos pedidos hay en cada estado? Ordena el resultado de forma descendente por el
número de pedidos.
5. Calcula el precio de venta del producto más caro y más barato en una misma consulta.
6. Calcula el número de clientes que tiene la empresa.
7. ¿Cuántos clientes tiene la ciudad de Madrid?
8. ¿Calcula cuántos clientes tiene cada una de las ciudades que empiezan por M?
9. Devuelve el nombre de los representantes de ventas y el número de clientes al que atiende
cada uno.
10. Calcula el número de clientes que no tiene asignado representante de ventas.
11. Calcula la fecha del primer y último pago realizado por cada uno de los clientes. El listado
deberá mostrar el nombre y los apellidos de cada cliente.
12. Calcula el número de productos diferentes que hay en cada uno de los pedidos.
13. Calcula la suma de la cantidad total de todos los productos que aparecen en cada uno de
los pedidos.
14. Devuelve un listado de los 20 productos más vendidos y el número total de unidades que
se han vendido de cada uno. El listado deberá estar ordenado por el número total de
unidades vendidas.
15. La facturación que ha tenido la empresa en toda la historia, indicando la base imponible, el
IVA y el total facturado. La base imponible se calcula sumando el coste del producto por el
número de unidades vendidas de la tabla detalle_pedido. El IVA es el 21 % de la base
imponible, y el total la suma de los dos campos anteriores.
16. La misma información que en la pregunta anterior, pero agrupada por código de producto.
17. La misma información que en la pregunta anterior, pero agrupada por código de producto
filtrada por los códigos que empiecen por OR.
18. Lista las ventas totales de los productos que hayan facturado más de 3000 euros. Se
mostrará el nombre, unidades vendidas, total facturado y total facturado con impuestos (21%
IVA)
Subconsultas con operadores básicos de comparación
1. Devuelve el nombre del cliente con mayor límite de crédito.
2. Devuelve el nombre del producto que tenga el precio de venta más caro.
3. Devuelve el nombre del producto del que se han vendido más unidades. (Tenga en cuenta
que tendrá que calcular cuál es el número total de unidades que se han vendido de cada
producto a partir de los datos de la tabla detalle_pedido. Una vez que sepa cuál es el código
del producto, puede obtener su nombre fácilmente.)
4. Los clientes cuyo límite de crédito sea mayor que los pagos que haya realizado. (Sin utilizar
INNER JOIN).
5. Devuelve el producto que más unidades tiene en stock.
6. Devuelve el producto que menos unidades tiene en stock.
7. Devuelve el nombre, los apellidos y el email de los empleados que están a cargo de Alberto
Soria.
Subconsultas con ALL y ANY
1. Devuelve el nombre del cliente con mayor límite de crédito.
2. Devuelve el nombre del producto que tenga el precio de venta más caro.
3. Devuelve el producto que menos unidades tiene en stock.
Subconsultas con IN y NOT IN
1. Devuelve el nombre, apellido1 y cargo de los empleados que no representen a ningún
cliente.
2. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
3. Devuelve un listado que muestre solamente los clientes que sí han realizado ningún pago.
4. Devuelve un listado de los productos que nunca han aparecido en un pedido.
5. Devuelve el nombre, apellidos, puesto y teléfono de la oficina de aquellos empleados que
no sean representante de ventas de ningún cliente.
Subconsultas con EXISTS y NOT EXISTS
1. Devuelve un listado que muestre solamente los clientes que no han realizado ningún
pago.
2. Devuelve un listado que muestre solamente los clientes que sí han realizado ningún pago.
3. Devuelve un listado de los productos que nunca han aparecido en un pedido.
4. Devuelve un listado de los productos que han aparecido en un pedido alguna vez.
*/
