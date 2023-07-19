/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro4;

import java.util.Scanner;

/**
 *
 * @author EUGE
 */
public class ejer10teorico {
    /*
    Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor. Por
ejemplo:
5 *****
3 ***
11 ***********
2 **
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese el numero entre 1 y 20");
            num = leer.nextInt();
            while (num > 20 || num < 1) {
                System.out.println("Ingrese otro numero");
                num = leer.nextInt();
            }         
            System.out.print(num + " ");            
            for (int j = 1; j <= num ; j++) {
                System.out.print("*");
            }
            System.out.println("");
            }
        }
    }
    




