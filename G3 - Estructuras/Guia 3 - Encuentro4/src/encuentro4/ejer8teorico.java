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
public class ejer8teorico {
    /* Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0
y 10 la nota se pedirá de nuevo hasta que la nota sea correcta. */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la nota");
        int nota = leer.nextInt();
        
        while ( nota<0 || nota >11 ) {
            System.out.println("Ingrese la nota nuevamente");
            nota = leer.nextInt();        
        }
        
    }
}
