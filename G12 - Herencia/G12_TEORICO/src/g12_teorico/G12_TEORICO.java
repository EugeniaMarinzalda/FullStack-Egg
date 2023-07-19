
package g12_teorico;

import g12_teorico.Entidades.Animal;
import g12_teorico.Entidades.Gato;
import g12_teorico.Entidades.Perro;
import java.util.ArrayList;

public class G12_TEORICO {
    /*
    EJERCICIO ANIMAL
Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un saludo
“Hola”. Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el
método hacerRuido() con el ruido que corresponda a cada uno. Luego, en el main vamos a crear
un ArrayList de animales y los siguientes animales
Animal a = new Animal();
Animal b = new Perro();
Animal c = new Gato();
Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al
método hacerRuido() de cada ítem.
    */
    
    public static void main(String[] args) {
        ArrayList <Animal> animales = new ArrayList();
        
        Animal a = new Animal();
        animales.add(a);
        Animal b = new Perro();
        animales.add(b);
        Animal c = new Gato();
        animales.add(c);
        
        for (Animal aux : animales) {
            aux.hacerRuido();
        }
    }
    
}
