
package g12_ejer2extra.entidades;

public abstract class Edificio {
    /*
      Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
Estos métodos serán abstractos y los implementarán las siguientes clases:


    */
    protected double ancho, alto , largo;

    public Edificio() {
    }

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Edificio{" + "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + '}';
    }
    /*
    • Método calcularSuperficie(): calcula la superficie del edificio.
    */
    public abstract double  calcularSuperficie(); 
    
    /*
    • Método calcularVolumen(): calcula el volumen del edifico.
    */
    public abstract double  calcularVolumen();

    public abstract void  calcularExtra();
    
    
}
