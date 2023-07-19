/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro5;

import java.util.Scanner;

/**
 *Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.
 * @author EUGE
 */
public class ejer3extra {
    /** usando equalsIgnoreCase:
    
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = leer.next();
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
            System.out.println("La letra ingresada es una vocal");
        } else {
            System.out.println("La letra ingresada es una consonante");
        }
        
    }
     * @param args
    **/
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = leer.next();
        letra = letra.toLowerCase();
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("La letra ingresada es una vocal");
        } else {
            System.out.println("La letra ingresada es una consonante");
        }
    }
}