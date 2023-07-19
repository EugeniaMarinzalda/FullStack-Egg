/*
 Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. 
 */
package entidades;

public abstract class Hotel extends Alojamientos{
    protected int cantidadHabit;
    protected int cantidadCamas;
    protected int cantidadPisos;
    protected float precio;

    public Hotel() {
    }

    public Hotel(int cantidadHabit, int cantidadCamas, int cantidadPisos, float precio) {
        this.cantidadHabit = cantidadHabit;
        this.cantidadCamas = cantidadCamas;
        this.cantidadPisos = cantidadPisos;
        this.precio = precio;
    }

    public Hotel(int cantidadHabit, int cantidadCamas, int cantidadPisos, float precio, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabit = cantidadHabit;
        this.cantidadCamas = cantidadCamas;
        this.cantidadPisos = cantidadPisos;
        this.precio = precio;
    }

    public int getCantidadHabit() {
        return cantidadHabit;
    }

    public void setCantidadHabit(int cantidadHabit) {
        this.cantidadHabit = cantidadHabit;
    }

    public int getCantidadCamas() {
        return cantidadCamas;
    }

    public void setCantidadCamas(int cantidadCamas) {
        this.cantidadCamas = cantidadCamas;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "\nCantidad de Habitaciones=" + cantidadHabit + ", \nCantidad de camas=" + cantidadCamas + ", \nCantidad de pisos=" + cantidadPisos + ", \nPrecio por habitacion=" + precio + super.toString();
    }
    
    public abstract float obtenerPrecioFin();
    
}

