/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g10_ejer6.Service;

import g10_ejer6.entidad.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
* Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 * @author EUGE
 */
public class ServiceProducto {
    private HashMap<String,Double> mapaProd = new HashMap();
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public void crearProducto (){
        System.out.println("Ingrese el nombre del producto");
        String name = sc.next();
        name = name.toLowerCase();
        System.out.println("Ingrese el precio");
        Double price = sc.nextDouble();
        Producto prod = new Producto(name,price);
        mapaProd.put(name, price);
    }
    public void modificarPrecio(){
        System.out.println("A que producto desea modificar el precio");
        String keys = sc.next();
        keys = keys.toLowerCase();
        if (mapaProd.containsKey(keys)){
            System.out.println("Ingrese el precio actualizado");
            Double price = sc.nextDouble();
            mapaProd.replace(keys, price);
        } else {
            System.out.println("El producto no se ha encontrado");
        }
    }
    public void mostrarProducto(){
        for (Map.Entry<String, Double> entry : mapaProd.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(entry);
            
        }
    }
    public void eliminarProducto(){
        System.out.println("Que producto desea eliminar");
        String keys = sc.next();
        keys = keys.toLowerCase();
        if (mapaProd.containsKey(keys)){
            mapaProd.remove(keys, mapaProd.get(keys));
        } else {
            System.out.println("El producto no se ha encontrado");
        }
    }
            
           
}
