
package entidades;

import enumeradores.EstadoCivil;

public abstract class Persona {
    /*Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.*/
    protected String nombre, dni;
    protected EstadoCivil civil;

    public Persona(String nombre, String dni, EstadoCivil civil) {
        this.nombre = nombre;
        this.dni = dni;
        this.civil = civil;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public EstadoCivil getCivil() {
        return civil;
    }

    public void setCivil(EstadoCivil civil) {
        this.civil = civil;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", dni=" + dni + ", civil=" + civil + '}';
    }
    
  
}
