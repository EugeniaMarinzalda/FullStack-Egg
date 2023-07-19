/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada.
 */
public class Cine {
    private Pelicula peli;
    private Asiento [][] sala;
    private double precio;

    public Cine() {
    }

    public Cine(Pelicula peli, Asiento[][] sala, double precio) {
        this.peli = peli;
        this.sala = sala;
        this.precio = precio;
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    public Asiento[][] getSala() {
        return sala;
    }

    public void setSala(Asiento[][] sala) {
        this.sala = sala;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cine{" + "peli=" + peli + ", sala=" + sala + ", precio=" + precio + '}';
    }

    
    
    
}
