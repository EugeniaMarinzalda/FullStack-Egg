
package g10_ejer2extra;

import g10_ejer2extra.entidad.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 2. Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.
 */
public class G10_ejer2extra {
    static ArrayList<CantanteFamoso> ListaFamosos = new ArrayList (); 
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {
        
        ListaFamosos.add(new CantanteFamoso("Carlos Gardel","Mi Buenos Aires querido"));   
        ListaFamosos.add(new CantanteFamoso("El Chaqueño Palavecino","Disco 1"));   
        ListaFamosos.add(new CantanteFamoso("El Indio Solaris","Disco 2"));   
        ListaFamosos.add(new CantanteFamoso("Alma Fuerte","Niño Jefe"));   
        ListaFamosos.add(new CantanteFamoso("Sumo","Llegando los monos"));
       
        int opc = 0;
        boolean salir = true;
        do {
            System.out.println("Menu \n1-Agregar cantante \n2-Mostrar cantante \n3-Eliminar un cantante \n4-Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    crearFamoso();
                    break;
                case 2:
                    mostrarCantante();
                    break;
                case 3:
                    Eliminar();
                    break;
                case 4:
                    System.out.println("Gracias por utilizar el servicio");
                    salir=false;
                    break;
                default:
                    System.out.println("Opcion incorrecta. Intente nuevamente.");
            }
            
        } while (salir);

    }
    
    public static void crearFamoso(){
            System.out.println("Ingrese el nombre del Cantante famoso");
            String nombre = leer.next();
            System.out.println("Ingrese el disco mas vendido");
            String disco = leer.next();
            ListaFamosos.add(new CantanteFamoso(nombre,disco));
    }
    
    public static void mostrarCantante(){
        System.out.println("Los cantantes famosos y sus discos mas vendidos son: ");
        for (CantanteFamoso aux : ListaFamosos) {
            System.out.println(aux);
        }
    }
    
    public static void Eliminar(){
        System.out.println("Ingrese el nombre del Cantante");
        String np = leer.next();
        for(CantanteFamoso cantante : ListaFamosos){
            if(cantante.getNombre().equals(np)){
                ListaFamosos.remove(cantante);
                System.out.println("Cantante Eliminado!");
                break;
            }
        }
    }
}
