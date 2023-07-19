
package g11_ejer2.entidades;

/*
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
 */
public class Jugador {
    private int idJugador;
    private String nombre;
    private boolean mojado;

    public Jugador(int idJugador, String nombre, boolean mojado) {
        this.idJugador = idJugador;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public Jugador() {
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        if (mojado) {
            return "Jugador{" + "Id=" + idJugador + ", Nombre=" + nombre + ", Mojado"+ "}\n";
        } else {
            return "Jugador{" + "Id=" + idJugador + ", Nombre=" + nombre + ", Seco" + "}\n";
        }
        
    }
  
}
