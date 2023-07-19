
package Services;

import g12_ejer1.entidades.Animal;


public class ServiceGato extends ServiceAnimal {

    @Override
    public void alimento(Animal a) {  //utilizo el metodo de animal y lo complemento
       System.out.print( a.getNombre()+ "=" );
        super.alimento(a);
    }
    
}
