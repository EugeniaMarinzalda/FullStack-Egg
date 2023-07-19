/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro5;

import java.util.Scanner;

/**
 *
 * @author EUGE
 */
public class ejer7extra2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros");
        int N = leer.nextInt();
        int max=0;
        int min= N*1000;
        int sum = 0;
        int reg = 1;
        float prom = 0;
        do {
            System.out.println("Ingrese el numero "+ reg);
            int num = leer.nextInt();
            if (num>max) {
                max=num;
            }
            if (num<min) {
                min = num;
            }  
            sum = sum + num;
            reg = reg + 1;
        } while (reg<=N);
        System.out.println("El valor maximo es " + max);
        System.out.println("El valor minimo es " + min);
        System.out.println("El valor promedio es " + (prom=sum/N));             
        }
}
