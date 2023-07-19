/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro5;

import java.util.Scanner;

/**
 *Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
aparezca un 3 lo sustituya por una E. Ejemplo:
* 0-0-0
0-0-1
0-0-2
0-0-E
* Nota: investigar función equals() y como convertir números a String.
 * @author EUGE
 */
public class ejer12extra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    String salida = String.format("%d-%d-%d",i,j,k); // CREO UNA VARIABLE Y LE DOY FORMATO %d para int %s para string
                    if (salida.contains("3")) {  // contains para identificar un 3 en cualquier lugar
                        salida = salida.replace("3", "E"); //funcion de reemplazo
                    }
                    System.out.println(salida);
                }
            }
        }
    }
}
