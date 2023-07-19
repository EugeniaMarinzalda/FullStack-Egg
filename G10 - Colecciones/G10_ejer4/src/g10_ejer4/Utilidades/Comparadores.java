
package g10_ejer4.Utilidades;

import g10_ejer4.entidades.Pelicula.Pelicula;
import java.util.Comparator;

public class Comparadores {
    public static Comparator <Pelicula> compararDuracion = new Comparator <Pelicula>(){
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            return t2.getDuracion().compareTo(t1.getDuracion());
        }
    };
    public static Comparator <Pelicula> compararTitulo = new Comparator <Pelicula>(){
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            return t1.getTitulo().compareTo(t2.getTitulo());
        }
    };
    public static Comparator <Pelicula> comparaDirector = new Comparator <Pelicula>(){
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            return t1.getDirector().compareTo(t2.getDirector());
        }
    };      
}
