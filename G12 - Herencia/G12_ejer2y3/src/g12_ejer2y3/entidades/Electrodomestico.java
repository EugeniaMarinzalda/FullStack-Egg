
package g12_ejer2y3.entidades;

/**
 *
 * Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
 */
public class Electrodomestico {
    protected double precio, peso;
    protected String color;
    protected char consumo;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, double peso, String color, char consumo) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.consumo = consumo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return "precio=" + precio + ", peso=" + peso + ", color=" + color + ", consumo=" + consumo ;
    }
    
    
        
}
