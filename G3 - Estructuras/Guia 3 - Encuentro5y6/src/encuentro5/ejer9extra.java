/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro5;

import java.util.Scanner;

/**
 *Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
 * @author EUGE
 */
public class ejer9extra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el dividendo");
        int divd = leer.nextInt();
        System.out.println("Ingrese el divisor");
        int divs = leer.nextInt();
        int resto = divd;
        int entero = 0;
        while (resto>divs) {
            resto=resto-divs;
            entero=entero + 1;
        }
        System.out.println("El resultado de la division por restas sucesivas de " + divd + "/" + divs + ":" + entero+ "," + resto);        
    }
}
/*
128-23=105   1
105-23=82    2
82-23=59     3
59-23=36     4
36-23=13     5 5,13 programa

5.565217 calculadora
*/