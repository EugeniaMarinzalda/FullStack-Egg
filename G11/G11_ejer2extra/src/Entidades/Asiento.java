/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;


public class Asiento {
    private int fila;
    private char columna;
    private boolean ocupado;

    public Asiento() {
    }

    public Asiento(int fila, char columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public Asiento(int fila, char columna, boolean ocupado) {
        this.fila = fila;
        this.columna = columna;
        this.ocupado = ocupado;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public char getColumna() {
        return columna;
    }

    public void setColumna(char columna) {
        this.columna = columna;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        if (ocupado) {
            return "{" +fila + columna + "X"+ '}';
        } else {
            return "{" +fila + columna + " " + '}';
        }
        
        
        
        
    }

}
