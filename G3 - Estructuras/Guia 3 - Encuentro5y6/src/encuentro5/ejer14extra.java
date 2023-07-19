/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro5;

import java.util.Scanner;

/**
 *Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de
familias y para cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias.
 * @author EUGE
 */
public class ejer14extra {
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de familias");
        Scanner leer = new Scanner(System.in);
        int fam = leer.nextInt();
        int sumHijos = 0;
        int contador=0;
        int sumEdad = 0;
        while (contador<fam) {
            System.out.println("Ingrese la cantidad de hijos");
            int hijos = leer.nextInt();
            contador = contador + 1;
            sumHijos= sumHijos + hijos;
            int contHijo=1;
            while(contHijo<hijos) {
                System.out.println("Ingrese la edad del hijo " + contHijo);
                int edad = leer.nextInt();
                sumEdad = sumEdad + edad;
                contHijo = contHijo + 1;
            }
        }
        System.out.println("El promedio de hijos es " + sumHijos/fam);
        System.out.println("El promedio de la edad de los hijos es " + sumEdad/sumHijos);
    }
}
