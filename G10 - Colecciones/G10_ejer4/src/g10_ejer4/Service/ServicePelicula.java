
package g10_ejer4.Service;

import g10_ejer4.Utilidades.Comparadores;
import g10_ejer4.entidades.Pelicula.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServicePelicula {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList <Pelicula> Peliculas = new ArrayList (); 
    /*
    En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
    */
    public void crearPeliculaDeterminadas () {
        boolean hacer = true;
        Pelicula p1 = new Pelicula ("bbbb","gggg",2.6);
        Peliculas.add(p1);
        Pelicula p2 = new Pelicula ("aaaa","llll",0.8);
        Peliculas.add(p2);
        Pelicula p3 = new Pelicula ("dddd","jjjj",3.2);
        Peliculas.add(p3);
        Pelicula p4 = new Pelicula ("cccc","zzzz",0.2);
        Peliculas.add(p4);
        Pelicula p5 = new Pelicula ("ffff","iiii",1.8);
        Peliculas.add(p5);
        Pelicula p6 = new Pelicula ("eeee","kkkk",1.5);
        Peliculas.add(p6);
    }
    public void crearPelicula () {
        boolean hacer = true;
        do{
            System.out.println("Ingrese el titulo");
            String titulo = leer.next();
            System.out.println("Ingrese el autor");
            String autor = leer.next();
            System.out.println("Ingrese el duracion");
            Double duracion = leer.nextDouble();
            Pelicula p = new Pelicula (titulo,autor,duracion);
            Peliculas.add(p); 
            System.out.println("Quieres cargar otra pelicula (S/N)");
            String opc = leer.next();
            if (opc.equals("n")) {
                hacer = false;
            }
        } while (hacer);
        
    }
    /*
    Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
    */
    public void mostrarPelicula (){
        
        for (Pelicula aux : Peliculas) {
            System.out.println(aux);
        }
    }
    /*
    • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    */
    public void mayor1Hora(){
        System.out.println("\nLas peliculas de duracion mayor a 1 hora son:");
        for (Pelicula aux : Peliculas) {
            if (aux.getDuracion()>1) {
                System.out.println(aux);
            }
        }
    }
    /*
    • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
    */
    public void ordenarDuracionDesc () {
        Collections.sort(Peliculas,Comparadores.compararDuracion);
    }
    /*
    • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
    */
    public void ordenarDuracionAsc () {
        Collections.sort(Peliculas,Comparadores.compararDuracion);
        Collections.reverse(Peliculas);
    }
    /*
    • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    */
    public void ordenarTitulo () {
        Collections.sort(Peliculas,Comparadores.compararTitulo);
    }
    /*
    • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    */
    public void ordenarDirector () {
        Collections.sort(Peliculas, Comparadores.comparaDirector);
    }
}
