
package g11_ejer1.entidades;

/**
 *
 * y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
 */
public class Persona {
    private String nombre, apellido, documento;
    private int edad;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String documento, int edad, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.edad = edad;
        this.perro = perro;
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

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", edad=" + edad + ", perro=" + perro + '}';
    }
    
    
}
