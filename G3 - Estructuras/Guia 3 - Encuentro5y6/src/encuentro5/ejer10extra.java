/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro5;

import java.util.Scanner;

/**
 *Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 * @author EUGE
 */
public class ejer10extra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int mult = num1 * num2;
        boolean repetir = true;
        //System.out.println("num1:" + num1+ " num2:" + num2 + " multi:" + mult );
        System.out.println("Adivine el resultado de la multiplicacion entre dos numeros enteros del 0 al 9");
        do {
        int res = leer.nextInt();
        if (res == mult) {
            System.out.println("Felicitaciones! La respuesta es correcta");
            repetir = false;
        } else {
            System.out.println("Respuesta incorrecta. Intente nuevamente");
        }
        } while (repetir);
    }
}
