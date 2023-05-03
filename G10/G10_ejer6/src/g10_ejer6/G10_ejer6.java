
package g10_ejer6;

import g10_ejer6.Service.ServiceProducto;
import java.util.Scanner;


public class G10_ejer6 {

    /**
     * 
     * Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServiceProducto sp = new ServiceProducto ();
        
        boolean flat = true;
        do {
            System.out.println("Menu \n 1-Cargar producto \n 2-Modificar precio \n 3-Eliminar producto \n 4-Mostrar productos \n 5-Salir");
            int opc = leer.nextInt(); 
            
            switch (opc) {
                case 1:
                    sp.crearProducto();
                    break;
                case 2:
                    sp.modificarPrecio();
                    break;
                case 3:
                    sp.eliminarProducto();
                    break;
                case 4:
                    sp.mostrarProducto();
                    break;
                case 5:
                    System.out.println("Gracias por utilizar el servicio");
                    flat=false;
                    break;
                default:
                    System.out.println("Opcion incorrecta. Intente nuevamente");
            }
        } while (flat);
       
    }
    
}
