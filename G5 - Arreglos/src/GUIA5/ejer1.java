/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA5;

/**
 *Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
 * @author EUGE
 */
public class ejer1 {
    public static void main(String[] args) {
       int vectorNum [] = new int [100];
        for (int i = 0; i < 100; i++) {
            vectorNum [i] = i+1; 
        }
        System.out.println("Descendiente");
        for (int i = 99 ; i >= 0; i--) {
            System.out.print(" [ " + vectorNum[i] + "]");
        }
        System.out.println(" ");
        System.out.println("Ascendente");
        for (int i = 0 ; i < 100; i++) {
            System.out.print(" [ " + vectorNum[i] + "]");
        }    
    }
}
