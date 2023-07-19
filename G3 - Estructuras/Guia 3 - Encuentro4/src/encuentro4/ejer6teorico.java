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
public class ejer6teorico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.
        */
        System.out.println("Ingrese dos numeros: ");
        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        if (num1 >= 25 && num2 >= 25) {
            System.out.println("Los dos numeros son mayores a 25 ");
        } else if (num1 >= 25 ) {
            System.out.println("El primer valor es mayor que 25 ");
        } else if (num2 >= 25 ) {
            System.out.println("El segundo valor es mayor que 25 ");    
        } else {
            System.out.println("Los numeros no son mayores a 25");
        }
}
}   

