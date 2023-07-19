
package Service;

import g11_ejer2.entidades.Revolver;

public class ServiceRevolver {
    
    /*
    desde el main
        llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
        deben ser aleatorios.
    */
    public Revolver llenarRevolver() {
        int PosicionActual =((int) (Math.random() * 6)+1);
        int PosicionAgua = ((int) (Math.random() * 6)+1);
        System.out.println("Revolver listo para jugar");
        return new Revolver (PosicionActual,PosicionAgua);
    }
    /*
    desde disparo jugador
    mojar(): devuelve true si la posición del agua coincide con la posición actual
    */
    public boolean mojar(Revolver r){
        //System.out.println("Estado :" + r.toString());//para controlar
        if (r.getPosicionActual() == r.getPosicionAgua()) {
            System.out.println("Pum! Ha sido mojado!");
            return true;
        } else {
            System.out.println("Usted no se ha mojado.");
            siguienteChorro(r);
            //System.out.println("El revolver cambio a la posicion " + r.getPosicionActual()); //para control
            System.out.println("El revolver cambio de posición." );
            return false;
        }  
    };
    /*
    desde disparo jugador
    siguienteChorro(): cambia a la siguiente posición del tambor
    */
    public void siguienteChorro(Revolver re){
        re.setPosicionActual(re.getPosicionActual()+1);      
    }
 
}
