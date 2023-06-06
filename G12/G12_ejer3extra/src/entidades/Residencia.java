/*
 Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo.
 */
package entidades;

public class Residencia extends Extrahotelero{
    protected int cantidHabitaciones;
    protected Boolean gremio;
    protected Boolean campoDepor;

    public Residencia() {
    }

    public Residencia(int cantidHabitaciones, Boolean gremio, Boolean campoDepor) {
        this.cantidHabitaciones = cantidHabitaciones;
        this.gremio = gremio;
        this.campoDepor = campoDepor;
    }

    public Residencia(int cantidHabitaciones, Boolean gremio, Boolean campoDepor, Boolean privado, float metros2) {
        super(privado, metros2);
        this.cantidHabitaciones = cantidHabitaciones;
        this.gremio = gremio;
        this.campoDepor = campoDepor;
    }

    public Residencia(int cantidHabitaciones, Boolean gremio, Boolean campoDepor, Boolean privado, float metros2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metros2, nombre, direccion, localidad, gerente);
        this.cantidHabitaciones = cantidHabitaciones;
        this.gremio = gremio;
        this.campoDepor = campoDepor;
    }

    public int getCantidHabitaciones() {
        return cantidHabitaciones;
    }

    public void setCantidHabitaciones(int cantidHabitaciones) {
        this.cantidHabitaciones = cantidHabitaciones;
    }

    public Boolean getGremio() {
        return gremio;
    }

    public void setGremio(Boolean gremio) {
        this.gremio = gremio;
    }

    public Boolean getCampoDepor() {
        return campoDepor;
    }

    public void setCampoDepor(Boolean campoDepor) {
        this.campoDepor = campoDepor;
    }

    @Override
    public String toString() {
        return "\nRESIDENCIA" + "\nCantidad de habitaciones=" + cantidHabitaciones + ", \nTiene descuento por gremio?=" + gremio + ", \nCampo Deportivo=" + campoDepor +super.toString();
    }
    
    
}
