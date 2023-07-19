
package g10_ejer5.Utilidades;

import entidad.Pais;
import java.util.Comparator;


public class Comparadores {
    public static Comparator <Pais> comparadorNombre = new Comparator <Pais>(){
        @Override
        public int compare(Pais p1, Pais p2){
            return p1.getNombrePais().compareTo(p2.getNombrePais());
        }
    };
}
