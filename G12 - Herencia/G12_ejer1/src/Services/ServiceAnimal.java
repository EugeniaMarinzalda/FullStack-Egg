
package Services;

import g12_ejer1.entidades.Animal;

public abstract class ServiceAnimal {
    /*
    Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
    mensaje por pantalla informando de que se alimenta.
     */
  
    public void alimento(Animal a){
        System.out.println("Se alimenta de " + a.getAlimento());
    };
}
