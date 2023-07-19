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
public class ejercicio5 {
    /*Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().*/
    public static void main(String[] args) {
        int num;
        System.out.println("Ingrese un numero entero");
        Scanner leer = new Scanner(System.in);
        num = leer.nextInt();
        int doble = num * 2;
        System.out.println("El doble de " + num + " es " + doble);
        int triple = num * 3;
        System.out.println("El triple de " + num + " es " + triple);
        double raiz = Math.sqrt(num);
        System.out.println("La raiz de " + num + " es " + raiz );
        
    }    
}
