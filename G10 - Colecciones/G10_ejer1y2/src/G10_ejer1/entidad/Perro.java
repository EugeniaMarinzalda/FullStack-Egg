
package G10_ejer1.entidad;

/**
 *
 * @author EUGE
 */
public class Perro {
    private String raza;
    private String nombre;

    public Perro() {
    }

    public Perro(String raza, String nombre) {
        this.raza = raza;
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", nombre=" + nombre + '}';
    }
    
}
