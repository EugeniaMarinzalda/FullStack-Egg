/*
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
 */
package entidades;

public class Hotel4 extends Hotel{

   protected String gimnasio;
   protected String restauranteNombre;
   protected int restauranteCapacidad;

    public Hotel4() {
    }

    public Hotel4(String gimnasio, String restauranteNombre, int restauranteCapacidad) {
        this.gimnasio = gimnasio;
        this.restauranteNombre = restauranteNombre;
        this.restauranteCapacidad = restauranteCapacidad;
    }

    public Hotel4(String gimnasio, String restauranteNombre, int restauranteCapacidad, int cantidadHabit, int cantidadCamas, int cantidadPisos, float precio) {
        super(cantidadHabit, cantidadCamas, cantidadPisos, precio);
        this.gimnasio = gimnasio;
        this.restauranteNombre = restauranteNombre;
        this.restauranteCapacidad = restauranteCapacidad;
    }

    public Hotel4(String gimnasio, String restauranteNombre, int restauranteCapacidad, int cantidadHabit, int cantidadCamas, int cantidadPisos, float precio, String nombre, String direccion, String localidad, String gerente) {
        super(cantidadHabit, cantidadCamas, cantidadPisos, precio, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.restauranteNombre = restauranteNombre;
        this.restauranteCapacidad = restauranteCapacidad;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getRestauranteNombre() {
        return restauranteNombre;
    }

    public void setRestauranteNombre(String restauranteNombre) {
        this.restauranteNombre = restauranteNombre;
    }

    public int getRestauranteCapacidad() {
        return restauranteCapacidad;
    }

    public void setRestauranteCapacidad(int restauranteCapacidad) {
        this.restauranteCapacidad = restauranteCapacidad;
    }

    @Override
    public String toString() {
        return "\nHOTEL * * * * " + "\nGimnasio tipo =" + gimnasio + ", \nNombre de restaurante=" + restauranteNombre + ", \nCapacidad del restaurante=" + restauranteCapacidad +super.toString();
    }

    @Override
    public float obtenerPrecioFin() {
          float precioRes=0;
          float precioFinal=0;
          float precioGim=0;
            if (this.restauranteCapacidad < 30) {
                precioRes = 10;
            } else if (this.restauranteCapacidad >= 30 && this.restauranteCapacidad < 50) {
                precioRes = 30;
            } else if (this.restauranteCapacidad >= 50) {
                precioRes = 50;
            }

            if (this.gimnasio.equalsIgnoreCase("a")) {
                precioGim = 50;
            } else if (this.gimnasio.equalsIgnoreCase("b")) {
                precioGim = 30;
            }

            return precioFinal = 50+this.cantidadCamas + precioRes + precioGim;

    }
   
   
    
}
