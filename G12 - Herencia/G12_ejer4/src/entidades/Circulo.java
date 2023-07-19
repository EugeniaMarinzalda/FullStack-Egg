
package entidades;

import interfaz.CalculosFormas;

public class Circulo implements CalculosFormas{
    
    private double radio;
    private double diametro;
    private CalculosFormas f;

    public Circulo() {
    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", diametro=" + diametro + '}';
    }

    @Override
    public double area() {
        double areaCirculo = Math.pow(pi*getRadio(), 2);
        return areaCirculo;
    }

    @Override
    public double perimetro() {
       double perimetroCirculo = pi*getDiametro();
        return perimetroCirculo;
    }

   
    
}
