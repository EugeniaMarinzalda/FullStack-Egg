/*
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa.
 */
package entidades;

public class Extrahotelero extends Alojamientos {
    protected Boolean privado;
    protected float metros2;

    public Extrahotelero() {
    }

    public Extrahotelero(Boolean privado, float metros2) {
        this.privado = privado;
        this.metros2 = metros2;
    }

    public Extrahotelero(Boolean privado, float metros2, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metros2 = metros2;
    }

    public Boolean getPrivado() {
        return privado;
    }

    public void setPrivado(Boolean privado) {
        this.privado = privado;
    }

    public float getMetros2() {
        return metros2;
    }

    public void setMetros2(float metros2) {
        this.metros2 = metros2;
    }

    @Override
    public String toString() {
        return  "\nPrivado=" + privado + ", \nMetros cuadrados=" + metros2 +super.toString();
    }
    
    
}
