/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
17 si es primo.
 * @author EUGE
 */
public class ejer4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num = leer.nextInt();
        if (primo(num)) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }
    }
    public static boolean primo (int num) {
        for (int i = 2; i < num; i++) {
            if (num%i == 0) {
                return false;
            }
        }
        return true;
    }
}
