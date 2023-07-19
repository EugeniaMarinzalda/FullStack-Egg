
package entidades;

import enumeradores.Cursos;
import enumeradores.EstadoCivil;


public class Estudiante extends Persona{
    
    /*
    En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
    */
    protected Cursos curso;

    public Estudiante(Cursos curso, String nombre, String dni, EstadoCivil civil) {
        super(nombre, dni, civil);
        this.curso = curso;
    }

    public Estudiante() {
    }

    public Cursos getCurso() {
        return curso;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
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
        return "Estudiante{" + "curso=" + curso + '}' + super.toString();
    }
    
    
}
