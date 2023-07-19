
package g10_ejer4;

import g10_ejer4.Service.ServicePelicula;

/**
 *Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 * @author EUGE
 */
public class G10_ejer4 {

    public static void main(String[] args) {
        ServicePelicula ss = new ServicePelicula ();
        //ss.crearPelicula();
        ss.crearPeliculaDeterminadas();
        System.out.println("Las peliculas son:");
        ss.mostrarPelicula();
        ss.mayor1Hora();
        System.out.println("\nLas peliculas ordenadas por duracion de mayor a menor son:");
        ss.ordenarDuracionDesc();
        ss.mostrarPelicula();
        System.out.println("\nLas peliculas ordenadas por duracion de menor a mayor son:");
        ss.ordenarDuracionAsc();
        ss.mostrarPelicula();
        System.out.println("\nLas peliculas ordenadas por titulo alfabeticamente son:");
        ss.ordenarTitulo();
        ss.mostrarPelicula();
        System.out.println("\nLas peliculas ordenadas por director alfabeticamente son:");
        ss.ordenarDirector();
        ss.mostrarPelicula();
    }
}
