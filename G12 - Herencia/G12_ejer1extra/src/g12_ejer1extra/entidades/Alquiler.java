
package g12_ejer1extra.entidades;

import java.util.Date;


public class Alquiler {
    /*
     Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
    */
    private String nombre, documento;
    private Date fechaA,fechaD ;
    private String posicion;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, String documento, Date fechaA, Date fechaD, String posicion, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaA = fechaA;
        this.fechaD = fechaD;
        this.posicion = posicion;
        this.barco = barco;
    }

    public Alquiler(String nombre, String documento, Date fechaA, Date fechaD, String posicion) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaA = fechaA;
        this.fechaD = fechaD;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Date getFechaA() {
        return fechaA;
    }

    public void setFechaA(Date fechaA) {
        this.fechaA = fechaA;
    }

    public Date getFechaD() {
        return fechaD;
    }

    public void setFechaD(Date fechaD) {
        this.fechaD = fechaD;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", documento=" + documento + ", fechaA=" + fechaA + ", fechaD=" + fechaD + ", posicion=" + posicion + ", barco=" + barco + '}';
    }
  
}
