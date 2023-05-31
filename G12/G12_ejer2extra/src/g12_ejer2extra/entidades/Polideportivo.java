
package g12_ejer2extra.entidades;

import java.util.Scanner;


public class Polideportivo extends Edificio {

    /*
    • Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
    */
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private boolean tipo;  //techado o abierto

     @Override
    public double calcularSuperficie() {
        return getAncho()*getLargo();
    }

    @Override
    public double calcularVolumen() {
        return getAncho()*getLargo()*getAlto();
    }
    
  

    public Polideportivo() {
    }
        
    public Polideportivo(String nombre, boolean tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Polideportivo(String nombre, boolean tipo, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
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
        return "Polideportivo{"  + "nombre=" + nombre + ", tipo=" + tipo  + super.toString()+ '}';
    }

    
    public Polideportivo crearEdificio() {
        System.out.println("Ingrese el nombre del polideportivo");
        nombre = sc.next();
        System.out.println("Ingrese el ancho del polideportivo");
        ancho = sc.nextInt();
        System.out.println("Ingrese el alto del polideportivo");
        alto = sc.nextInt();
        System.out.println("Ingrese el largo del polideportivo");
        largo = sc.nextInt();
        System.out.println("Es techado?");
        String resp = sc.next();
        tipo = instalacion(resp);
        return new Polideportivo(nombre, tipo, ancho, alto, largo);
    }

    
    public boolean instalacion (String resp){
        if (resp.equalsIgnoreCase("si")) {
            return true;
        } else {
            return false;
        }
    }
      
    @Override
    public void calcularExtra() {
        System.out.println("La superficie es de " + calcularSuperficie());
        System.out.println("El volumen es de " + calcularVolumen());
    }
 
}
