
package g10.ejer4g;

import ServicePelicula.ServicePelicula;
import g10.ejer4g.Utilidades.Comparadores;

public class G10Ejer4g {

    public static void main(String[] args) {
        ServicePelicula sp = new ServicePelicula();
        Comparadores c = new Comparadores();
        sp.crearPelicula();
        System.out.println("\n Las peliculas son:");
        sp.mostraPeli();
        sp.peliMayor1Hora();
        sp.peliDuracionDesc();
        sp.mostraPeli();
        sp.peliDuracionAsc();
        sp.mostraPeli();
        sp.peliTitulo();
        sp.mostraPeli();
        sp.peliDirector();
        sp.mostraPeli();
    }
    
}
