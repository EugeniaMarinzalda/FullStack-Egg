/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA5;

import java.util.Random;
import java.util.Scanner;

/**
 *Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa).
 * @author EUGE
 */
public class ejer4 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int[][]matriz = new int [4][4];
        Random random = new Random();
        for (int i = 0; i < 4; i++) {   
            for (int j = 0; j < 4; j++) {
                matriz [i][j]= random.nextInt(10);
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 4; i++) {   
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[j][i]+" ");
            }
            System.out.println("");
        }
    }
    
}
    

