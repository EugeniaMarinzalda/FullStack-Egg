package encuentro5;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *public class ejer2 {
  Realizar un programa que solo permita introducir solo frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
función Lenght() en Java.
 * @author EUGE
 */
public class ejer3 {
    public static void main(String[] args) {
        System.out.println("Ingrese una frase de 8 caracteres");
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        //int largo = frase.length();
        if  (frase.length()!=8) {   
            while (frase.length()!=8) {
                System.out.println("Incorrecto, reintente nuevamente");
                frase = leer.nextLine();
            }
        }
        System.out.println("Correcto");
        
    }
}
