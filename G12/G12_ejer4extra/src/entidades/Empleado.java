
package entidades;

import enumeradores.EstadoCivil;


public abstract class Empleado extends Persona{
    /*
    Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
    */
    
    protected int añoIngreso, despacho;

    public Empleado(int añoIngreso, int despacho, String nombre, String dni, EstadoCivil civil) {
        super(nombre, dni, civil);
        this.añoIngreso = añoIngreso;
        this.despacho = despacho;
    }

    public Empleado() {
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    public int getDespacho() {
        return despacho;
    }

    public void setDespacho(int despacho) {
        this.despacho = despacho;
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
        return "Empleado{" + "a\u00f1oIngreso=" + añoIngreso + ", despacho=" + despacho + '}' + super.toString();
    }
    
    
    
}
