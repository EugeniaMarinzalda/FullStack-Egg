/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g11_ejerteo2.entidades;

import java.util.ArrayList;

/**
 *
 * Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.

*/

public class Equipo {
   
    private ArrayList <Jugador> listaEquipo;
    private String nombreEquipo;

    public Equipo() {
    }

    public Equipo(ArrayList<Jugador> listaEquipo, String nombreEquipo) {
        this.listaEquipo = listaEquipo;
        this.nombreEquipo = nombreEquipo;
    }

    public ArrayList<Jugador> getListaEquipo() {
        return listaEquipo;
    }

    public void setListaEquipo(ArrayList<Jugador> listaEquipo) {
        this.listaEquipo = listaEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    @Override
    public String toString() {
        return "Equipo "  + nombreEquipo + "\nLista de Jugadores \n" + listaEquipo + '}';
    }
    
}
