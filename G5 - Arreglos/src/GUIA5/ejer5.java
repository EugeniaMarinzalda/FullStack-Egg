/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA5;

import java.util.Random;
import java.util.Scanner;

/**
 *Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).
 * @author EUGE
 */
public class ejer5 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int tam = 3;
        int[][]matriz = new int [tam][tam];
        int[][]traspuesta = new int [tam][tam];
        boolean bandera = true;
        Random random = new Random();
        System.out.println("Matriz A");
        for (int i = 0; i < tam; i++) {   
            for (int j = 0; j < tam; j++) {
                matriz [i][j]= random.nextInt(10);
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matriz traspuesta");
        for (int i = 0; i < tam; i++) {   
            for (int j = 0; j < tam; j++) {
                traspuesta[i][j] =  matriz[j][i];
                System.out.print(traspuesta[i][j]+ " ");
            }
            System.out.println("");
        }
        //comprobamos la matriz
        for (int i = 0; i < tam; i++) {   
            for (int j = 0; j < tam; j++) {
                if ( matriz [i][j] != - traspuesta[i][j]  ) {
                    bandera = false;
                    break;
                }
            }
        }
        System.out.println("");
        if (bandera) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz no es antisimétrica");
        }
    }
}
