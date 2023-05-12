
package Service;

import g11_ejer2.entidades.Juego;
import g11_ejer2.entidades.Jugador;
import g11_ejer2.entidades.Revolver;
import java.util.ArrayList;

public class ServiceJuego {
    Juego jue = new Juego();
    Revolver r = new Revolver ();
    ServiceRevolver sr = new ServiceRevolver();
    ServiceJugador sj = new ServiceJugador();
    ArrayList <Jugador> Jugadores = new ArrayList();
     
    /*
    DESDE EL MAIN dentro de ronda
    llenarJuego(ArrayList<Jugador> Jugadores,Revolver r): este método recibe los jugadores y el revolver para guardarlos en los atributos del juego.
    */

    public Juego llenarJuego(ArrayList<Jugador> Jugadores,Revolver r) {
        System.out.println("llenando juego");
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
            
            if (sj.disparo(j.getR())==true) {
                System.out.println("Juego Terminado");
                System.out.println("El jugador mojado es :" + aux);
                break;
            } else {
                System.out.println("El error es aca");
            }
        }
    }
}
