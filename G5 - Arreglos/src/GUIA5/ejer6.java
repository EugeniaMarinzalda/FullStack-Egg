/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA5;

/**
 *
 * @author EUGE
 */
public class ejer6 {
    
}
/*
package com.mycompany.arrays;

import java.util.Scanner;

public class cuadrado_magico {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int valores = 0;

        llenarMatriz(valores, matriz, read);
        suma(valores, matriz);
    }

    public static void llenarMatriz(int valores, int[][] matriz, Scanner read) {

        System.out.println("Ingrese valores del 1 al 9 para llenar la matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                do {
                    valores = read.nextInt();
                    if (valores < 1 || valores > 9) {
                        System.out.println("Has ingresado un valor fuera del rango solicitado, intente nuevamente");
                    }
                } while (valores < 1 || valores > 9);
                matriz[i][j] = valores;
            }
        }
        System.out.println(" ");
        System.out.println("*°-°*");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
public static void suma(int valores, int[][] matriz) {
        int f1 = 0, f2 = 0, f3 = 0, c1 = 0, c2 = 0, c3 = 0, d1 = 0, d2 = 0, cont = 0;

        for (int i = 0; i < matriz.length; i++) {
            f1 += matriz[0][i];
            f2 += matriz[1][i];
            f3 += matriz[2][i];
            if (f1 != f2 || f1 != f3) {
                cont += 1;
            }
        }

        for (int j = 0; j < matriz.length; j++) {
            c1 += matriz[j][0];
            c2 += matriz[j][1];
            c3 += matriz[j][2];
            if (c1 != c2 || c1 != c3) {
                cont += 1;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    d1 += matriz[i][j];
                }
                if (i + j == matriz.length - 1) {
                    d2 += matriz[i][j];
                }
            }
            if (d1 != d2) {
                cont += 1;
            }
        }

        if (cont == 0) {
            if (f1 != c1 || f1 != d1) {
                cont += 1;
            }
        }

        if (cont == 0) {
            System.out.println("La matriz es mágica");
        } else {
            System.out.println("La matriz no es mágica");
        }
    }
}
*/