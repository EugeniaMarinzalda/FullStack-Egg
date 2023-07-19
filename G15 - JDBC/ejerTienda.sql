# a) Lista el nombre de todos los productos que hay en la tabla producto.
  SELECT * FROM producto;
  
# b) Lista los nombres y los precios de todos los productos de la tabla producto.
SELECT nombre, precio FROM producto;

# c) Listar aquellos productos que su precio esté entre 120 y 202.
SELECT nombre, precio FROM producto WHERE precio BETWEEN 120.00 AND 202.00;

# d) Buscar y listar todos los Portátiles de la tabla producto.
SELECT * FROM producto where nombre like '%portatil%';

# e) Listar el nombre y el precio del producto más barato.
SELECT nombre, precio FROM producto order by precio asc limit 1;

# f) Ingresar un producto a la base de datos.
INSERT INTO Producto (nombre, precio, codigo_fabricante) VALUES ( 'Termo acero 1 litro', 2000 , 10);

# g) Ingresar un fabricante a la base de datos
INSERT INTO fabricante (nombre) VALUES ( 'Stanley');
                    
# h) Editar un producto con datos a elección.
SELECT * FROM producto WHERE nombre LIKE '%monitor%';
SELECT * FROM producto where codigo = 13;
