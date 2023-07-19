/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer número múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son.
 * @author EUGE
 */
public class ejer12teorico {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        esMultiplo(num1,num2);
    }
    public static void esMultiplo (int num1, int num2) {
        if (num1%num2==0) {
            System.out.println("El numero " + num1 + " es multiplo de " + num2 );
        } else {
            System.out.println("El numero " + num1 + " no es multiplo de " + num2 );
        }
    } 
}

