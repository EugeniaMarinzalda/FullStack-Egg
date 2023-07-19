package encuentro5;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.
 * @author EUGE
 */
public class ejer2 {
    public static void main(String[] args) {
        System.out.println("Ingrese una frase");
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        if (frase.equals("eureka")) {
            System.out.println("Corecto");
        } else { 
            System.out.println("Incorrecto");
        }
    }
}
