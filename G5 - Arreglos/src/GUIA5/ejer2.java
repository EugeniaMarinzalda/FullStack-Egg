/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA5;

import java.util.Scanner;

/**
 *Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
 * @author EUGE
 */
public class ejer2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño");
        int tam = leer.nextInt();
        int [] vectorNum = new int [tam];
        for (int i = 0; i < tam; i++) {
            vectorNum [i] = (int) (Math.random()*100)+1;
            System.out.print("[ " +vectorNum [i]+ " ] ");
        }
        System.out.println(" ");
        System.out.println("Ingrese el numero que desea buscar en el vector");
        int numB = leer.nextInt();
        int repetir =0;
        for (int i = 0; i < tam; i++) {
            if (vectorNum [i] == numB) {
                System.out.println("El numero esta en la posicion " + i);
                repetir++;  
            } 
        }
        System.out.println("El numero " + numB + " se encuentra " + repetir + " veces");
    }
}
