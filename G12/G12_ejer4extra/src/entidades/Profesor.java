
package entidades;

import enumeradores.Cursos;
import enumeradores.EstadoCivil;

public class Profesor extends Empleado{
    /*
    Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
    */
    protected Cursos departamento;

    public Profesor() {
    }

    public Profesor(Cursos departamento, int añoIngreso, int despacho, String nombre, String dni, EstadoCivil civil) {
        super(añoIngreso, despacho, nombre, dni, civil);
        this.departamento = departamento;
    }

    public Cursos getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Cursos departamento) {
        this.departamento = departamento;
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
        return "Profesor{" + "departamento=" + departamento + '}' + super.toString();
    }
    
    
}
