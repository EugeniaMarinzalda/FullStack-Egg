
package Service;

import g11_ejer2.entidades.Revolver;

public class ServiceRevolver {
    Revolver r = new Revolver ();
    /*
    desde el main
        llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
        deben ser aleatorios.
    */
    public Revolver llenarRevolver() {
        r.setPosicionActual((int) (Math.random() * 6)+1);
        r.setPosicionAgua((int) (Math.random() * 6)+1);
        System.out.println("Revolver listo para jugar");
        System.out.println("Estado :" + r.toString());
        return r;
    }
    /*
    desde disparo jugador
    mojar(): devuelve true si la posición del agua coincide con la posición actual
    */
    public boolean mojar(){
        if (r.getPosicionActual() == r.getPosicionAgua()) {
            System.out.println("fue mojado desde mojar");
            return true;
        }   
        System.out.println("no fue mojado desde mojar");
        return false;
    };
    /*
    desde disparo jugador
    siguienteChorro(): cambia a la siguiente posición del tambor
    */
    public void siguienteChorro(){
        if (mojar()==false) {
            r.setPosicionActual(r.getPosicionActual()+1);
            System.out.println("El revolver cambio a la posicion" + r.getPosicionActual());
        }       
    }
 
}
