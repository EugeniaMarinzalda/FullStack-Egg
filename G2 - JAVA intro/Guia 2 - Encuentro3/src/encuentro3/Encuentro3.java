/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro3;

import java.util.Scanner;

/**
 *
 * @author EUGE
 */
public class Encuentro3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*EJERCICIO 1)
        Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma       
*/        
     
    int num1;
    int num2;
    int suma;
    System.out.println("Ingrese el primer numero");
    Scanner leer1 = new Scanner (System.in);
    num1= leer1.nextInt();
    System.out.println("Ingrese el segundo numero");
    Scanner leer2 = new Scanner (System.in);
    num2= leer2.nextInt();
    suma = num1 + num2;
    System.out.println("El resultado de la suma es " + suma);
    
    
    }
    
}
