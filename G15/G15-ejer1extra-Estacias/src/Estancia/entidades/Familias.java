
package Estancia.entidades;


public class Familias {
    private int id_familia;
    private String nombre;
    private int edad_min;
    private int edad_max;
    private int num_hijos;
    private String email;
    private int id_casa_familia;

    public Familias() {
    }

    public Familias(int id_familia, String nombre, int edad_min, int edad_max, int num_hijos, String email, int id_casa_familia) {
        this.id_familia = id_familia;
        this.nombre = nombre;
        this.edad_min = edad_min;
        this.edad_max = edad_max;
        this.num_hijos = num_hijos;
        this.email = email;
        this.id_casa_familia = id_casa_familia;
    }

    public int getId_familia() {
        return id_familia;
    }

    public void setId_familia(int id_familia) {
        this.id_familia = id_familia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad_min() {
        return edad_min;
    }

    public void setEdad_min(int edad_min) {
        this.edad_min = edad_min;
    }

    public int getEdad_max() {
        return edad_max;
    }

    public void setEdad_max(int edad_max) {
        this.edad_max = edad_max;
    }

    public int getNum_hijos() {
        return num_hijos;
    }

    public void setNum_hijos(int num_hijos) {
        this.num_hijos = num_hijos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId_casa_familia() {
        return id_casa_familia;
    }

    public void setId_casa_familia(int id_casa_familia) {
        this.id_casa_familia = id_casa_familia;
    }
    
    
}
