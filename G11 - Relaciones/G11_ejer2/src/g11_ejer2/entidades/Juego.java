
package g11_ejer2.entidades;

import java.util.ArrayList;

/**
 *Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
 */
public class Juego {
    private ArrayList<Jugador> Jugadores;
    private Revolver r;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> Jugadores, Revolver r) {
        this.Jugadores = Jugadores;
        this.r = r;
    }

    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(ArrayList<Jugador> Jugadores) {
        this.Jugadores = Jugadores;
    }

    public Revolver getR() {
        return r;
    }

    public void setR(Revolver r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Juego{" + "Jugadores=" + Jugadores + ", r=" + r + '}';
    }

}
