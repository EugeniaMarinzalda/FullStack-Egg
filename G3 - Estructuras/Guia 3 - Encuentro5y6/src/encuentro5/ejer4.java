package encuentro5;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java.
 * @author EUGE
 */
public class ejer4 {
    public static void main(String[] args) {
        System.out.println("Ingrese una frase que comience con A");
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        String primer = frase.substring(0,1);
        primer = primer.toUpperCase();
        if (primer.equals("A")) {
            System.out.println("Correcto");           
        } else {
            System.out.println("Incorrecto");
        }
    }
}
