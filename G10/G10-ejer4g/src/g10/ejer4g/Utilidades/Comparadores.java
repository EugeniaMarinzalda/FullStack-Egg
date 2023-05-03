
package g10.ejer4g.Utilidades;

import entidad.Pelicula;
import java.util.Comparator;

public class Comparadores {
    public static Comparator <Pelicula> compararMayorDuracionDesc = new Comparator<Pelicula>(){
        @Override
        public int compare (Pelicula p1,Pelicula p2){
            return p2.getDuracion().compareTo(p1.getDuracion());
        }
    };
    public static Comparator <Pelicula> compararMayorDuracionAsc = new Comparator<Pelicula>(){
        @Override
        public int compare (Pelicula p1,Pelicula p2){
            return p1.getDuracion().compareTo(p2.getDuracion());
        }
    };
    public static Comparator <Pelicula> compararTituloAlfabe = new Comparator<Pelicula>(){
        @Override
        public int compare (Pelicula p1,Pelicula p2){
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    };
    public static Comparator <Pelicula> compararDirectorAlfabe = new Comparator<Pelicula>(){
        @Override
        public int compare (Pelicula p1,Pelicula p2){
            return p1.getDirector().compareTo(p2.getDirector());
        }
    };
  
}
