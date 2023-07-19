/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro5;

import java.util.Scanner;

/**
 *Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.
 * @author EUGE
 */
public class ejer5extra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el plan (A/B/C)");
        String socio = leer.next();
        socio = socio.toUpperCase();
        System.out.println("Ingrese el valor del tratamiento que desea realizar");
        float valor = leer.nextInt();        
        switch (socio) {
            case "A":
                System.out.println("Valor del Tratamiento: $" + valor);
                System.out.println("Descuento del 50%");
                System.out.println("Valor a pagar: " + valor*0.5);
                break;
            case "B":
                System.out.println("Valor del Tratamiento: $" + valor);
                System.out.println("Descuento del 35%");
                System.out.println("Valor a pagar: " + valor*0.75);
                break;
            case "C":
                System.out.println("Valor del Tratamiento: $" + valor);
                System.out.println("No posee porcentaje de descuento");
                System.out.println("Valor a pagar: " + valor);
                break;                
        }        
    }
}
