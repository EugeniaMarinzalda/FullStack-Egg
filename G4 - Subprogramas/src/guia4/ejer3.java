/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €
 * @author EUGE
 */
public class ejer3 {
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de Euros que sea convertir");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double cantidad = leer.nextDouble();
        System.out.println("Ingrese a que moneda quiere convertir \n libras \n dolar \n yenes ");
        
        String moneda = leer.next();
        moneda = moneda.toLowerCase();
        conversor(moneda, cantidad);
    }
    
    public static void conversor(String moneda, double cantidad){
        switch (moneda) {
            case "libras":
                System.out.println(cantidad + " euros son "+ cantidad*0.86 + " libras.");    
                break;
            case "dolar":
                System.out.println(cantidad + " euros son "+ cantidad*0.86 + " dolares.");    
                break;
            case "yenes":
                System.out.println(cantidad + " euros son "+ cantidad*0.86 + " yenes.");    
                break;
        }
}
}
