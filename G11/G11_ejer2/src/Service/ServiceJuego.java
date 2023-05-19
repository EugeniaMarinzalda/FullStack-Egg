
package Service;

import g11_ejer2.entidades.Juego;
import g11_ejer2.entidades.Jugador;
import g11_ejer2.entidades.Revolver;
import java.util.ArrayList;

public class ServiceJuego {

    ServiceRevolver sr = new ServiceRevolver();
    ServiceJugador sj = new ServiceJugador();
    /*
    DESDE EL MAIN dentro de ronda
    llenarJuego(ArrayList<Jugador> Jugadores,Revolver r): este método recibe los jugadores y el revolver para guardarlos en los atributos del juego.
    */
    public Juego llenarJuego(ArrayList<Jugador> Jugadores,Revolver r) {
        System.out.println("Que comience el juego!");
        return new Juego(Jugadores,r);
    }
    
    /*
ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
    desde el main
 */
    public void ronda(Juego j){
        for (Jugador aux : j.getJugadores()) {
            System.out.println("Turno " + aux.getNombre());
            boolean hacer = sj.disparo(j.getR(),aux);
            if (hacer) {
                System.out.println("Juego Terminado");
                break;
            } 
        }
    }
}
