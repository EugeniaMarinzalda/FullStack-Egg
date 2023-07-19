/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA5;

import java.util.Random;

/**
 *Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.
 * @author EUGE
 */
public class ejer3extra {
    public static void main(String[] args) {
        int[] vector = new int [10];
        rellenar(vector);
        mostrarVector(vector);
    }   
    public static void rellenar(int[] vector) {
       Random random = new Random();
        for (int i = 0; i < 10; i++) {
            vector[i]=random.nextInt(10);
        }
    }
    public static void mostrarVector(int[] vector) {
        for (int i = 0; i < 10; i++) {
            System.out.print(" [ " + vector[i] + " ] ");
        }
        System.out.println(" ");
    } 
}