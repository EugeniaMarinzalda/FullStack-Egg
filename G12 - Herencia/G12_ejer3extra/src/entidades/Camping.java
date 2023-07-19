/*
 Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones.
 */
package entidades;

public class Camping extends Extrahotelero{
    protected int carpasCant;
    protected int bañosCant;
    protected Boolean restaurante;

    public Camping() {
    }

    public Camping(int carpasCant, int bañosCant, Boolean restaurante) {
        this.carpasCant = carpasCant;
        this.bañosCant = bañosCant;
        this.restaurante = restaurante;
    }

    public Camping(int carpasCant, int bañosCant, Boolean restaurante, Boolean privado, float metros2) {
        super(privado, metros2);
        this.carpasCant = carpasCant;
        this.bañosCant = bañosCant;
        this.restaurante = restaurante;
    }

    public Camping(int carpasCant, int bañosCant, Boolean restaurante, Boolean privado, float metros2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metros2, nombre, direccion, localidad, gerente);
        this.carpasCant = carpasCant;
        this.bañosCant = bañosCant;
        this.restaurante = restaurante;
    }

    public int getCarpasCant() {
        return carpasCant;
    }

    public void setCarpasCant(int carpasCant) {
        this.carpasCant = carpasCant;
    }

    public int getBañosCant() {
        return bañosCant;
    }

    public void setBañosCant(int bañosCant) {
        this.bañosCant = bañosCant;
    }

    public Boolean getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return "\nCAMPING" + "\nCantidad de carpas=" + carpasCant + ",\nCantidad de baños=" + bañosCant + ", \nRestaurante=" + restaurante + super.toString();
    }
    
    
}
