/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA5;

import java.util.Random;

/**
 *Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos.
 * @author EUGE
 */
public class ejer5extra {
    public static void main(String[] args) {
        int N= 2;
        int M= 3;
        int sum=0;
        int [][] matriz = new int [N][M];
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j]= random.nextInt(10);
                sum += matriz[i][j];
            }
            System.out.println("La suma es " + sum);  
        }
        
        
        
    }
}
