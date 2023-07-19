
package service;

import g12_ejer2y3.entidades.Electrodomestico;
import g12_ejer2y3.entidades.Televisor;
import java.util.Scanner;


public class ServiceTele extends ServiceElectro{

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
 
       /*
    Los métodos que se implementara serán:
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
    */
    public Televisor crearTelevisor(){
        System.out.println("Ingrese los datos del Televisor:");
        Electrodomestico e = super.crearElectrodomestico();
        System.out.println("Ingrese la resolucion del televisor");
        int reso = sc.nextInt();
        boolean sinto;
        do {
            System.out.println("Tiene sintonizador TDT");
            String resp = sc.next();
            if (resp.equalsIgnoreCase("SI")) {
                sinto = true;
                break;
            } else if (resp.equalsIgnoreCase("NO")) {
                sinto=false;
                break;
            } else {
                System.out.println("Valor incorrecto. Intente nuevamente");
            }
        } while (true);
        return new Televisor(reso, sinto,  e.getPrecio(), e.getPeso(), e.getColor(), e.getConsumo());
    }

    /*
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
    */
    public double precioFinal(Televisor t) {
        super.precioFinal(t);
        if (t.getResolucion()>40) {
            t.setPrecio(t.getPrecio()*1.3);
        }
        if (t.isSintonizadorTDT()) {
            t.setPrecio(t.getPrecio()+500);
        }
        return t.getPrecio(); 
    }
}
