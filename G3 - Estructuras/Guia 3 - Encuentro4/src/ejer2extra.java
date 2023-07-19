import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos).
 * @author EUGE
 */
public class ejer2extra {
    public static void main(String[] args) {
        Random random = new Random ();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los vectores");
        int tam = leer.nextInt();
        int[] vectorNum1 = new int [tam];
        int[] vectorNum2 = new int [tam];
        boolean igual = true;
        for (int i = 0; i < tam; i++) {
            vectorNum1[i] = random.nextInt(100);  
            System.out.print(" [ " +vectorNum1[i]+ "]");
        }
        System.out.println(" ");
        for (int i = 0; i < tam; i++) {
           vectorNum2[i] = random.nextInt(100);  
           //vectorNum2[i] = vectorNum1[i]; ///unicamente control
            System.out.print(" [ " +vectorNum2[i]+ "]");
        }
        if (!Arrays.equals(vectorNum1, vectorNum2)) {
            System.out.println("vectores diferentes");
        } else {
            System.out.println("vectores iguales");
        }
    }   
}
