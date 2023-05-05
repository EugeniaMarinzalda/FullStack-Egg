
package g10_ejerextra;

import java.util.HashMap;
import java.util.Scanner;

public class G10_ejer4extra {
/*
4. Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
numero.
     */
     private static HashMap <String,String> MapaCiudades = new HashMap();
     private static Scanner leer = new Scanner(System.in).useDelimiter("\n");

     public static void main(String[] args) {
        MapaCiudades.put("08000", "Barcelona");
        MapaCiudades.put("28000", "Madrid");
        MapaCiudades.put("10000", "Torino");
        MapaCiudades.put("18000", "Imperia");
        MapaCiudades.put("56000", "Ceylon");
        MapaCiudades.put("05000", "Cordoba");
        MapaCiudades.put("70117", "El Espinal");
        MapaCiudades.put("47000", "San Marino");
        MapaCiudades.put("63000", "Gurvanbulag");
        MapaCiudades.put("09000", "Dunedin");
        
        System.out.println("Bienvenido al sistema");
        boolean flat = true; 
        do {
            
            System.out.println("Menu \n1-Cargar 10 ciudades \n2-Cargar 1 ciudad "
                + "\n3-Mostrar ciudades \n4-Buscar ciudad "
                + "\n5-Eliminar 3 ciudades \n6-Salir");
            int opc = leer.nextInt();
            switch (opc) {
                case 1:
                    cargarCiudades();
                    break;
                case 2:
                    agregarCiudad();
                    break;
                case 3:
                    mostrar();
                    break;
                case 4:
                    buscarCiudad();
                    break;
                case 5:
                    eliminarCiudad();
                    break;
                case 6:
                    System.out.println("Gracias por utilizar el sistema");
                    flat=false;
                    break;
                default:
                    System.out.println("Opcion incorrecta. Intente nuevamente");
            } 
        } while (flat);
   
    }
    /*
     • Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
     */
    public static void cargarCiudades(){
        int cant = 0;
        System.out.println("Cargue 10 ciudades");
        do {
            System.out.println("Ingrese la ciudad N°" + (cant+1));
            String pais = leer.next();
            System.out.println("Ingrese el codigo postal");
            String codigo = leer.next();
            MapaCiudades.put(codigo, pais);
            cant++;
        } while (cant<10);  
    }
    /*
    • Muestra por pantalla los datos introducidos
    */
    public static void mostrar(){
        System.out.println("Las ciudades con los codigos postales son:");
        System.out.println(MapaCiudades.toString());
        System.out.println("Cantidad: " + MapaCiudades.size() + "ciudades");
    }
    /*
    • Pide un código postal y muestra la ciudad asociada si existe sino avisa al
usuario.
    */
    public static void buscarCiudad(){
        System.out.println("Ingrese el codigo postal a buscar");
        String cod = leer.next();
        if (MapaCiudades.containsKey(cod)) {
            System.out.println("La ciudad es " +MapaCiudades.get(cod));
        } else {
            System.out.println("La ciudad no fue encontrada");
        }
    }
    /*
    • Agregar una ciudad con su código postal correspondiente más al HashMap.
    */
    public static void agregarCiudad(){
        System.out.println("Ingrese la ciudad" );
        String pais = leer.next();
        System.out.println("Ingrese el codigo postal");
        String codigo = leer.next();
        MapaCiudades.put(codigo, pais);
    }
    /*
    • Elimina 3 ciudades existentes dentro del H
    */
    public static void eliminarCiudad(){
        int cont =0;
        do{
            System.out.println("Ingrese el codigo postal de la ciudad a eliminar");
            String cod = leer.next();
            if (MapaCiudades.containsKey(cod)) {
                MapaCiudades.remove(cod);
                System.out.println("La ciudad "+ MapaCiudades.get(cod) + " fue eliminada correctamente");
                cont++;
            } else {
                System.out.println("La ciudad no fue encontrada. Intente nuevamente.");
            }
        } while (cont<3);    
    }
}
