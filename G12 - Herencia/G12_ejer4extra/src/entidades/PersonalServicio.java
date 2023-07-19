
package entidades;

import enumeradores.EstadoCivil;
import enumeradores.Seccion;


public class PersonalServicio extends Empleado{
    /*
    Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
    */
    protected Seccion seccion;

    public PersonalServicio() {
    }

    public PersonalServicio(Seccion seccion, int añoIngreso, int despacho, String nombre, String dni, EstadoCivil civil) {
        super(añoIngreso, despacho, nombre, dni, civil);
        this.seccion = seccion;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
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
        return "PersonalServicio{" + "seccion=" + seccion + '}' + super.toString();
    }
    
    
}
