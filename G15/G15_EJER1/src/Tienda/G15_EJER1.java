
package Tienda;

import Tienda.Servicios.FabricanteServicio;
import Tienda.Servicios.ProductoServicio;
import java.util.Scanner;

public class G15_EJER1 {

    public static void main(String[] args) throws Exception {
    
        System.out.println("Bienvenido a la Tienda");
        ProductoServicio PS = new ProductoServicio();
        FabricanteServicio FS = new FabricanteServicio();
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int choice;
        
        do {
            System.out.println("Menu");
            System.out.println("1-Lista el nombre de todos los productos que hay en la tabla producto.");
            System.out.println("2-Lista los nombres y los precios de todos los productos de la tabla producto.");
            System.out.println("3-Listar aquellos productos que su precio esté entre 120 y 202.");
            System.out.println("4-Buscar y listar todos los Portátiles de la tabla producto.");
            System.out.println("5-Listar el nombre y el precio del producto más barato.");
            System.out.println("6-Ingresar un producto a la base de datos.");
            System.out.println("7-Ingresar un fabricante a la base de datos");
            System.out.println("8-Editar un producto con datos a elección.");
            System.out.println("9-Salir");
            
            choice = leer.nextInt();
            
            while (choice < 1 || choice > 9) {
                System.out.println("El valor ingresado no corresponde a ninguna opción, intente nuevamente");
                choice = leer.nextInt();
            }
            String sql;
            switch (choice) {
                case 1:
                    try {
                        PS.imprimirLista();
                    } catch (Exception e) {
                        throw e;
                    }
                    break;
                case 2:
                    try {
                        PS.imprimirNombrePrecio();
                    } catch (Exception e) {
                        throw e;
                    }
                    break;
                case 3:
                    sql = "SELECT nombre, precio FROM producto WHERE precio BETWEEN 120.00 AND 202.00";
                    PS.imprimirSQL(sql);
                    break;
                case 4:
                    sql = "SELECT * FROM producto where nombre like '%portatil%'";
                    PS.imprimirSQL(sql);
                    break;
                case 5:
                    sql = "SELECT nombre, precio FROM producto order by precio asc limit 1";
                    PS.imprimirSQL(sql);
                    break;
                case 6:
                    PS.agregarProducto();
                    break;
                case 7:
                    FS.agregarFabricante();
                    break;
                case 8:
                    PS.modificar();
                    break;
            }
        } while (choice != 9);
        System.out.println("Gracias por utilizar el sistema");
    }   
}
