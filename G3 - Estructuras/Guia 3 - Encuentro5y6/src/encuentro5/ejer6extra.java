/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro5;

import java.util.Scanner;

/**
 *Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
 * @author EUGE
 */
public class ejer6extra {
    public static void main(String[] args) {
        System.out.println("Indique el tamaño de la muestra");
        Scanner leer = new Scanner(System.in);
        int N = leer.nextInt();
        int reg = 1;
        float sumAlt = 0;
        float sumBaj = 0;
        int n =0;
        do {
            System.out.println("Ingrese la estatura de la persona " + reg + ". Utilice ',' para separar metros de centimetros" );
            float altura = leer.nextFloat();
            reg = reg + 1;
            sumAlt = sumAlt + altura;
            if (altura<1.6) {
                sumBaj = sumBaj + altura;
                n = n+1;
            }
        } while (reg<=N);
        System.out.println("El promedio de estaturas por debajo de 1.6 es de " + sumBaj/n);
        System.out.println("El promedio de estaturas general es de " + sumAlt/N);
    }
}
