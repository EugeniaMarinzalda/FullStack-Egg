/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro5;

import java.util.Scanner;

/**
 *Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
* *
* *
* * * *
 * @author EUGE
 */
public class ejerc8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Introduzca el tamaño del cuadrado");
        num = leer.nextInt();
        
        for (int i = 0; i < num-1; i++) {
            if (i == 0 || i == num ) {
                for (int j = 0; j < num-1; j++) {
                    System.out.print("*");}
                System.out.print("");
            } else {
                for (int k = 0; k < num-1; k++) {
                    if (k==0 || k==num) {                
                        System.out.println("*");}
                    else {
                        System.out.println(" ");
                    }
                
                
                
                }
            
                
          
        }
       }
        
    }
}
/* ejerc resuelto por compas
import java.util.Scanner;

public class Ejercicio8 {

       public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);
           
           int lado;
           
           System.out.println("Ingrese el tamaño del cuadrado");
           lado = leer.nextInt();
           
           for (int a = 1; a <= lado; a++) {
               for (int b = 1; b <= lado; b++) { 
                   if (a > 1 && a < lado && b > 1 && b < lado) {
                   System.out.print("  ");
               } else {
                       System.out.print("* ");
                       }
      
               }System.out.println("");    
               
           }
     
    }
    
}
*/