/*
Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
 */
package entidades;

public class Hotel5 extends Hotel4 {

    protected int salonesDeConf;
    protected int suites;
    protected int limos;

    public Hotel5() {
    }

    public Hotel5(int salonesDeConf, int suites, int limos) {
        this.salonesDeConf = salonesDeConf;
        this.suites = suites;
        this.limos = limos;
    }

    public Hotel5(int salonesDeConf, int suites, int limos, String gimnasio, String restauranteNombre, int restauranteCapacidad) {
        super(gimnasio, restauranteNombre, restauranteCapacidad);
        this.salonesDeConf = salonesDeConf;
        this.suites = suites;
        this.limos = limos;
    }

    public Hotel5(int salonesDeConf, int suites, int limos, String gimnasio, String restauranteNombre, int restauranteCapacidad, int cantidadHabit, int cantidadCamas, int cantidadPisos, float precio) {
        super(gimnasio, restauranteNombre, restauranteCapacidad, cantidadHabit, cantidadCamas, cantidadPisos, precio);
        this.salonesDeConf = salonesDeConf;
        this.suites = suites;
        this.limos = limos;
    }

    public Hotel5(int salonesDeConf, int suites, int limos, String gimnasio, String restauranteNombre, int restauranteCapacidad, int cantidadHabit, int cantidadCamas, int cantidadPisos, float precio, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, restauranteNombre, restauranteCapacidad, cantidadHabit, cantidadCamas, cantidadPisos, precio, nombre, direccion, localidad, gerente);
        this.salonesDeConf = salonesDeConf;
        this.suites = suites;
        this.limos = limos;
    }

    public int getSalonesDeConf() {
        return salonesDeConf;
    }

    public void setSalonesDeConf(int salonesDeConf) {
        this.salonesDeConf = salonesDeConf;
    }

    public int getSuites() {
        return suites;
    }

    public void setSuites(int suites) {
        this.suites = suites;
    }

    public int getLimos() {
        return limos;
    }

    public void setLimos(int limos) {
        this.limos = limos;
    }

    @Override
    public String toString() {
        return "\nHOTEL * * * * *"+"\nNombre del hotel=" + super.nombre + ", \nDireccion=" + super.direccion + ", \nLocalidad=" + super.localidad + ",\nGerente=" + super.gerente+ "\nCantidad de salones de conferencia=" + salonesDeConf + ", \nCantidad de suites=" + suites + ", \nCantidad de limosinas=" + limos + "\nGimnasio tipo =" + super.gimnasio + ", \nNombre de restaurante=" + super.restauranteNombre + ", \nCapacidad del restaurante=" + super.restauranteCapacidad+ "\nCantidad de Habitaciones=" + super.cantidadHabit + ", \nCantidad de camas=" + super.cantidadCamas + ", \nCantidad de pisos=" + super.cantidadPisos + ", \nPrecio por habitacion=" + super.precio;
    }

    @Override
    public float obtenerPrecioFin() {
        float precioRes = 0;
        float precioFinal = 0;
        float precioGim = 0;
        float precioLimos=0;
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
        
        precioLimos=this.limos*15;

        return precioFinal = 50 + this.cantidadCamas + precioRes + precioGim+precioLimos;
    }
}
