
package ServicePelicula;

import entidad.Pelicula;
import g10.ejer4g.Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ServicePelicula {
     public ArrayList <Pelicula> listaPelicula = new ArrayList();
     public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    /*
    En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
    */
    public void crearPelicula (){
        boolean bandera = true;
        do {
            System.out.println("Ingrese el nombre de la pelicula");
            String nombre = leer.next();
            System.out.println("Ingrese el director de la pelicula");
            String director = leer.next();
            System.out.println("Ingrese la duracion de la pelicula en minutos");
            int duracion = leer.nextInt();
            listaPelicula.add(new Pelicula(nombre,director,duracion) );
            System.out.println("Quiere agregar otra pelicula más? (n para salir)");
            String opc = leer.next();
            if (opc.equalsIgnoreCase("n")) {
                bandera=false;
            }
        } while (bandera);
    }
    /*
    * Mostrar en pantalla todas las películas.
    */
    public void mostraPeli(){
        for (Pelicula aux : listaPelicula) {
           System.out.println(aux); 
        }
        System.out.println("");
    }
    /*
    • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    */
    public void peliMayor1Hora(){
        System.out.println("Las peliculas mayor a una hora son:");
        for (Pelicula aux : listaPelicula) {
            if (aux.getDuracion()>=60) {
                System.out.println(aux); 
            }
        }
        System.out.println("");
        
    }
    /*
    • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
    */
   public void peliDuracionDesc(){
       System.out.println("Las peliculas ordenadas de acuerdo a la duracion de mayor a menor son");
       Collections.sort(listaPelicula, Comparadores.compararMayorDuracionDesc);
   }
   /*
   • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
   */
   public void peliDuracionAsc(){
       System.out.println("Las peliculas ordenadas de acuerdo a la duracion de menor a mayor son");
       Collections.sort(listaPelicula, Comparadores.compararMayorDuracionAsc);
   }
   /*
   • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
   */
   public void peliTitulo(){
       System.out.println("Las peliculas ordenadas de acuerdo al titulo de manera alfabetica son");
       Collections.sort(listaPelicula, Comparadores.compararTituloAlfabe);
   }
   /*
   • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
   */
   public void peliDirector(){
       System.out.println("Las peliculas ordenadas de acuerdo al director de manera alfabetica son");
       Collections.sort(listaPelicula, Comparadores.compararDirectorAlfabe);
   }
   
}
