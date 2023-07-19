/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g11_ejerteorico.entidades;

/**
 *
 * @author EUGE
 */
public class Persona {
    private String nombre, apellido;
    private dni nroDni;

    public Persona(String nombre, String apellido, dni nroDni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroDni = nroDni;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public dni getNroDni() {
        return nroDni;
    }

    public void setNroDni(dni nroDni) {
        this.nroDni = nroDni;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", nroDni=" + nroDni + '}';
    }

    
    
}
