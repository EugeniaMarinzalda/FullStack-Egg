package encuentro5;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*     *
*     *
* * * *
 * @author EUGE
 */
public class ejer8 {
    public static void main(String[] args) {
        //hecho por euge
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del cuadrado");
        int tam = leer.nextInt();
        for (int i = 0; i < tam; i++) {
           //System.out.println("*"); 
            for (int j = 0; j < tam; j++) {
                if (i==0 || i==tam-1) {
                    System.out.print("*");
                } else if ( j==0 || j==tam-1){ 
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");    
        }
    }
}
/* de maby diaz
public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero");
        int num = leer.nextInt();
        
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i>1 && i<num && j>1 && j<num) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println(" ");
        }
        
    }\
*/