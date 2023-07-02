# se deben realizar las siguientes consultas:
# https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-consultas-sql-bd-pokemon/

#1. Mostrar el nombre de todos los pokemon.
select nombre from pokemon;

#2. Mostrar los pokemon que pesen menos de 10k.
select nombre,peso from pokemon where peso<10;

#3. Mostrar los pokemon de tipo agua.
select * from pokemon p inner join pokemon_tipo pt on p.numero_pokedex = pt.numero_pokedex where pt.id_tipo = (
select id_tipo from tipo where nombre = 'agua') ;

#4. Mostrar los pokemon de tipo agua, fuego o tierra ordenados por tipo.
select * from pokemon p inner join pokemon_tipo pt on p.numero_pokedex = pt.numero_pokedex where pt.id_tipo in (
select id_tipo from tipo where nombre = 'agua' or nombre = 'fuego' or nombre = 'tierra' )
order by id_tipo ;

#5. Mostrar los pokemon que son de tipo fuego y volador.
select * from pokemon
where numero_pokedex in (select numero_pokedex
              from pokemon_tipo pt, tipo t
                          where pt.id_tipo=t.id_tipo and t.nombre='fuego')
and numero_pokedex in (select numero_pokedex
            from pokemon_tipo pt, tipo t
                        where pt.id_tipo=t.id_tipo and t.nombre='volador');

#6. Mostrar los pokemon con una estadística base de ps mayor que 200.
select * from pokemon 
inner join estadisticas_base e 
on pokemon.numero_pokedex = e.numero_pokedex
where e.ps > 200;

#7. Mostrar los datos (nombre, peso, altura) de la prevolución de Arbok.
select p.nombre, p.peso, p.altura, e.* from pokemon p
join evoluciona_de e
on p.numero_pokedex = e.pokemon_origen
where e.pokemon_evolucionado = (select numero_pokedex from pokemon where nombre = 'arbok'); 

#8. Mostrar aquellos pokemon que evolucionan por intercambio.
select * from pokemon p
inner join pokemon_forma_evolucion pfe on p.numero_pokedex = pfe.numero_pokedex
inner join forma_evolucion fe on pfe.id_forma_evolucion = fe.id_forma_evolucion
inner join tipo_evolucion te on fe.tipo_evolucion = te.id_tipo_evolucion
where te.tipo_evolucion = 'intercambio'
;

#9. Mostrar el nombre del movimiento con más prioridad.
select * from pokemon p
inner join pokemon_tipo pt on p.numero_pokedex = pt.numero_pokedex
inner join tipo t on pt.id_tipo = t.id_tipo
inner join movimiento m on t.id_tipo = m.id_tipo
where m.prioridad = (select prioridad from movimiento order by prioridad desc limit 1)
;

#10. Mostrar el pokemon más pesado.
select * from pokemon order by peso desc limit 1;

#11. Mostrar el nombre y tipo del ataque con más potencia.
select m.nombre as nombre_movimiento , t.nombre as tipo , m.potencia from tipo t
inner join movimiento m on t.id_tipo = m.id_tipo
order by potencia desc limit 1;

#12. Mostrar el número de movimientos de cada tipo.
select t.nombre as Tipo, count(m.nombre) as cantidad from tipo t
inner join movimiento m on t.id_tipo = m.id_tipo
group by Tipo
order by Tipo;

#13. Mostrar todos los movimientos que puedan envenenar.
select m.nombre as nombre_movimiento , t.nombre as tipo from tipo t
inner join movimiento m on t.id_tipo = m.id_tipo
where t.nombre='veneno';

#14. Mostrar todos los movimientos que causan daño, ordenados alfabéticamente por nombre.
select * from movimiento where descripcion like '%daño%' order by nombre;

#15. Mostrar todos los movimientos que aprende pikachu.
select distinct m.*, p.nombre from pokemon p
inner join pokemon_movimiento_forma pmf on pmf.numero_pokedex = p.numero_pokedex
inner join movimiento m on m.id_movimiento = pmf.id_movimiento
where p.nombre='pikachu';

#16. Mostrar todos los movimientos que aprende pikachu por MT (tipo de aprendizaje).
select distinct m.*, tfa.*, mt.* from pokemon p
inner join pokemon_movimiento_forma pmf on pmf.numero_pokedex = p.numero_pokedex
inner join movimiento m on m.id_movimiento = pmf.id_movimiento
inner join forma_aprendizaje fa on pmf.id_forma_aprendizaje = fa.id_forma_aprendizaje
inner join mt on mt.id_forma_aprendizaje = fa.id_forma_aprendizaje
inner join tipo_forma_aprendizaje tfa on tfa.id_tipo_aprendizaje = fa.id_tipo_aprendizaje
where p.nombre='pikachu' and tfa.tipo_aprendizaje = 'MT';

#17. Mostrar todos los movimientos de tipo normal que aprende pikachu por nivel.
select p.nombre, m.*, t.*, na.* from pokemon p
inner join pokemon_movimiento_forma pmf on pmf.numero_pokedex = p.numero_pokedex
inner join forma_aprendizaje fa on fa.id_forma_aprendizaje = pmf.id_forma_aprendizaje
inner join nivel_aprendizaje na on na.id_forma_aprendizaje = fa.id_forma_aprendizaje
inner join movimiento m on m.id_movimiento = pmf.id_movimiento
inner join tipo t on t.id_tipo = m.id_tipo
where p.nombre='pikachu' and t.nombre = 'normal'
order by na.nivel;

select p.nombre, m.*, t.*, na.*
from pokemon p, pokemon_movimiento_forma pmf, forma_aprendizaje fa, nivel_aprendizaje na,  movimiento m, tipo t
where pmf.numero_pokedex = p.numero_pokedex and fa.id_forma_aprendizaje = pmf.id_forma_aprendizaje and na.id_forma_aprendizaje = fa.id_forma_aprendizaje and  m.id_movimiento = pmf.id_movimiento
and m.id_movimiento = pmf.id_movimiento and t.id_tipo = m.id_tipo
and p.nombre='pikachu' and t.nombre = 'normal'
order by na.nivel;

#18. Mostrar todos los movimientos de efecto secundario cuya probabilidad sea mayor al 30%.
select * from movimiento m
inner join movimiento_efecto_secundario mes on m.id_movimiento = mes.id_movimiento
inner join efecto_secundario es on es.id_efecto_secundario = mes.id_efecto_secundario
where mes.probabilidad > 30;

#19. Mostrar todos los pokemon que evolucionan por piedra.
select po.nombre , tp.nombre_piedra from pokemon po
inner join pokemon_forma_evolucion pfe on po.numero_pokedex = pfe.numero_pokedex
inner join forma_evolucion fe on fe.id_forma_evolucion = pfe.id_forma_evolucion
inner join piedra p on p.id_forma_evolucion = fe.id_forma_evolucion
inner join tipo_piedra tp on tp.id_tipo_piedra = p.id_tipo_piedra
order by po.nombre;

#20. Mostrar todos los pokemon que no pueden evolucionar.
select p.nombre from pokemon p
left join evoluciona_de ed on ed.pokemon_origen = p.numero_pokedex
where pokemon_origen is null
order by p.nombre;

#21. Mostrar la cantidad de los pokemon de cada tipo.
select t.nombre, count(*) from pokemon p
left join pokemon_tipo pt on p.numero_pokedex = pt.numero_pokedex
inner join tipo t on t.id_tipo = pt.id_tipo
group by t.nombre
order by t.nombre;

select * from pokemon;
select * from movimiento;
select * from forma_evolucion;
select * from pokemon_forma_evolucion;
select * from tipo_evolucion;
select * from pokemon_tipo;
select * from tipo;
select * from estadisticas_base;
select * from evoluciona_de ;