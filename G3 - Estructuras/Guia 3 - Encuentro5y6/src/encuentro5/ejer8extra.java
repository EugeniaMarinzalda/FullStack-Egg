/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro5;

import java.util.Scanner;

/**
 *Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break.
 * @author EUGE
 */
public class ejer8extra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean bandera = true;
        int par = 0;
        int impar = 0; 
        do {
            System.out.println("Ingrese un numero entero");
            int num = leer.nextInt();
            if ((num%5)==0) {
                break;
            }   
            if (num%2 == 0) {
                par = par +1;
                
            } else if (num>0) {
                impar = impar + 1;
            } 
        }while(bandera); 
       System.out.println("Cantidad de numeros pares: " + par); 
       System.out.println("Cantidad de numeros impares: " + impar); 
    }
}
