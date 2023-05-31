
package service;

import g12_ejer2y3.entidades.Electrodomestico;
import g12_ejer2y3.entidades.Lavadora;
import java.util.Scanner;

public class ServiceLavadora extends ServiceElectro{
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    /*
    Los métodos que se implementara serán:
• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.

    */
    
    public Lavadora crearLavadora (){
        System.out.println("Ingrese los datos de la Lavadora:");
        Electrodomestico e = super.crearElectrodomestico();
        System.out.println("Ingrese la carga que soporta la lavadora");
        double carga = sc.nextDouble();
        return new Lavadora (carga,e.getPrecio(),e.getPeso(),e.getColor(),e.getConsumo());
    }
    /*
    • Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
    */
    public double precioFinal(Lavadora l) {
        super.precioFinal(l);
        if (l.getCarga()>30) {
            l.setPrecio(l.getPrecio()+500);
        }
        return l.getPrecio();
    }
    
}
