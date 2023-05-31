
package g12_ejer2extra.entidades;

import java.util.Scanner;

public class EdificioOficina extends Edificio {
    /*
    • Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
    */
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private int numOficina, cantPersonas, numPisos;
    /*
    De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
    */
    public int cantPersonas(){
        int cantTotal = numPisos * cantPersonas;
        System.out.println("Las personas que pueden trabajar en cada piso son: " + cantPersonas);
        System.out.println("Las personas que pueden trabajar en todo el edificio son: " + cantTotal);
        return cantTotal;
    }
    
    
    @Override
    public double calcularSuperficie() {
        return getAncho()*getLargo();
    }

    @Override
    public double calcularVolumen() {
        return getAncho()*getLargo()*getAlto();
    }
    
    
    public EdificioOficina(int numOficina, int cantPersonas, int numPisos) {
        this.numOficina = numOficina;
        this.cantPersonas = cantPersonas;
        this.numPisos = numPisos;
    }

    public EdificioOficina(int numOficina, int cantPersonas, int numPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numOficina = numOficina;
        this.cantPersonas = cantPersonas;
        this.numPisos = numPisos;
    }

    public EdificioOficina() {
    }

    public int getNumOficina() {
        return numOficina;
    }

    public void setNumOficina(int numOficina) {
        this.numOficina = numOficina;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
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
        return "EdificioOficina{" + "numOficina=" + numOficina + ", cantPersonas=" + cantPersonas + ", numPisos=" + numPisos + super.toString()+ '}';
    }

 
    public EdificioOficina crearOficina () {
        System.out.println("Ingrese el ancho de la oficina");
        this.ancho = sc.nextInt();
        System.out.println("Ingrese el alto de la oficina");
        this.alto = sc.nextInt();
        System.out.println("Ingrese el largo de la oficina");
        this.largo = sc.nextInt();
        System.out.println("Ingrese la cantidad de oficinas");
        this.numOficina = sc.nextInt();
        System.out.println("Ingrese la cantidad de personas por oficina");
        this.cantPersonas = sc.nextInt();
        System.out.println("La cantidad de pisos que debe tener es de "+this.numOficina);
        this.numPisos = numOficina;
        return new EdificioOficina (numOficina,cantPersonas,numPisos,ancho,alto,largo);
    }

    @Override
    public void calcularExtra() {
        System.out.println("La superficie es de " + calcularSuperficie());
        System.out.println("El volumen es de " + calcularVolumen());
        cantPersonas();
    }
    
}
