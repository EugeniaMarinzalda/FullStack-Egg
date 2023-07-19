/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro5;

import java.util.Scanner;

/**
 *Escribir un programa que lea un número entero y devuelva el número de
dígitos que componen ese número. Por ejemplo, si introducimos el
número 12345, el programa deberá devolver 5. Calcular la cantidad de
dígitos matemáticamente utilizando el operador de división. Nota:
recordar que las variables de tipo entero truncan los números o
resultados.
 * @author EUGE
 */
public class ejer11extra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num =leer.nextInt(); //12345
        boolean repetir = true;
        int dig = 0;
        do {
            num = num/10; 
            dig = dig + 1; 
            if (num==0) {   
                repetir = false;
            }
        } while (repetir);  
        System.out.println("El numero tiene " + dig + " digitos");
    }
}
