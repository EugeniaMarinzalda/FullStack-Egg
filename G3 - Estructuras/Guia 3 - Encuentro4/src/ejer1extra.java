
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.
 * @author EUGE
 */
public class ejer1extra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tam = leer.nextInt();
        int [] vectorSuma = new int [tam];
        int suma=0;
        for (int i = 0; i < tam; i++) {
            System.out.println("Ingrese el numero en la posicion " + i );
            vectorSuma [i] = leer.nextInt();
            suma += vectorSuma[i];
        }
        System.out.println("El resultado de la suma es " + suma );
    }
}
