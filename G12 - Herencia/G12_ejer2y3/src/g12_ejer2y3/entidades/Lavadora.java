
package g12_ejer2y3.entidades;

public final class Lavadora extends Electrodomestico {
    /*
    A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.
    Método get y set del atributo carga.
    */
    private double carga;

    public Lavadora(double carga) {
        this.carga = carga;
    }
    
    public Lavadora() {
    }
    
    public Lavadora(double carga, double precio, double peso, String color, char consumo) {
        super(precio, peso, color, consumo);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        
        return "Lavadora=> " + super.toString() +" , carga=" + carga ;
    }

    
}
