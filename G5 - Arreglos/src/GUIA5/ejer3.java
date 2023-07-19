/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA5;

import java.util.Random;

/**
 *
 * @author EUGE
 */
public class ejer3 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 10;
        int[] vectorNum = new int[n];

        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;

        for (int i = 0; i < 10; i++) {
           vectorNum[i] = random.nextInt(100000);

          
            
            if (vectorNum[i] < 10) {
                cont1++;
            } else if (vectorNum[i] < 100) {
                cont2++;
            } else if (vectorNum[i] < 1000) {
                cont3++;
            } else if (vectorNum[i] < 10000) {
                cont4++;
            } else if (vectorNum[i] < 100000) {
                cont5++;
            }
            System.out.println(vectorNum[i]);    
        }

        System.out.println("Los numeros de un digito son: " + cont1);
        System.out.println("Los numeros de dos digitos son: " + cont2);
        System.out.println("Los numeros de tres digitos son: " + cont3);
        System.out.println("Los numeros de cuatro digitos son: " + cont4);
        System.out.println("Los numeros de cinco digitos son: " + cont5);

    }

}
    
