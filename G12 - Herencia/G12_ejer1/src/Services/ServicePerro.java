
package Services;

import g12_ejer1.entidades.Animal;
import g12_ejer1.entidades.Perro;

public class ServicePerro extends ServiceAnimal{

    @Override
    public void alimento(Animal a) {  // sobreescribo todo el metodo
        System.out.println("El perro " + a.getNombre() + " se alimenta de " + a.getAlimento());
    }
    
   
}
