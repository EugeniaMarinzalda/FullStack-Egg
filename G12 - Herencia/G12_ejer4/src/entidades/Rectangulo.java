
package entidades;

import interfaz.CalculosFormas;

public class Rectangulo implements CalculosFormas {
/*
    Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
    */
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public double area() {
        return base*altura;
    }

    @Override
    public double perimetro() {
        return (base+altura)*2;
    }

    
}
