
package g11_ejer3extra.Entidades;

/**
 *
 * b. Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,
modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
 */
public class Vehiculo {
    private String marca, modelo, motor, chasis, color, tipo;
    private int año;

    public Vehiculo(String marca, String modelo, String motor, String chasis, String color, String tipo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
        this.año = año;
    }

    public Vehiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + ", chasis=" + chasis + ", color=" + color + ", tipo=" + tipo + ", a\u00f1o=" + año + '}';
    }
    
    
    
}
