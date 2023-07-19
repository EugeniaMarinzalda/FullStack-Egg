/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro4;

import java.util.Scanner;

/**
 *
 * @author EUGE
 */
public class ejer8compa {
     
            public static void main(String[] args) {
        // EL Programa deberá pedir una nota entre 0 y 10, sino esta entre esos 
        // Numeros se pedirá de nuevo hasta que sea una opcion valida
        Scanner sc = new Scanner(System.in); 
        System.out.println("Ingrese la nota");
        int nota = sc.nextInt();
        // while (nota>0 && nota>10){ - no esta bien detallado , no incluye los negativos
        while ( nota<0 || nota >11 ) {
        System.out.println("Su nota es incorrecta, intente nuevamente");
        nota = sc.nextInt();
        }
        }
}
