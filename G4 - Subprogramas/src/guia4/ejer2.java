/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.
 * @author EUGE
 */
public class ejer2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        int N = leer.nextInt();
        String cont;
            do{
                for (int i = 0; i < N; i++) { 
                    nombre(N);
                    edad(N); 
                }
                System.out.println("Quieres seguir mostrando personas (Si/No)");
                cont = leer.next(); 
            } while (cont.equalsIgnoreCase("Si"));
    }
public static String nombre(int N) {
    System.out.println("Ingrese el nombre de la persona");
    Scanner leer = new Scanner(System.in);
    String nombre = leer.nextLine();
    return nombre;
}

public static int edad(int N) {
    System.out.println("Ingrese la edad");
    Scanner leer = new Scanner(System.in);
    int edad = leer.nextInt();
    if (edad>19) {
        System.out.println("Es mayor de edad");
    } else {
        System.out.println("Es menor de edad"); 
    }
    return edad;
}
}

/* otro
public static void main(String[] args) {
        String nombre;
        int edad;
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre");
        nombre = read.next();
        while (!(nombre.equals("NO"))) {
            System.out.println("Ingrese la edad de la persona");
            edad = read.nextInt();
            if (retorno(edad) == true) {
                System.out.println(nombre + " es mayor de edad");
            } else {
                System.out.println(nombre + " es menor de edad");
            }
            System.out.println("Ingrese el nombre");
            nombre = read.next();
        }

    }

    public static boolean retorno(int edad) {
        boolean respuesta;

        if (edad > 18) {
            respuesta = true;
        } else {
            respuesta = false;
        }
        return respuesta;
    }
}
*/

