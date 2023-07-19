package encuentro5;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Crear un programa que dado un número determine si es par o impar.
 * @author EUGE
 */
public class ejer1 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero");
        Scanner leer = new Scanner(System.in);
        float num = leer.nextInt();
        if (num%2 == 0) {
            System.out.println("El numero ingresado es par");
        } else {
            System.out.println("El numero ingresado es impar");
        }
    }
}
