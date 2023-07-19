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
public class ejerc4 {
    /*Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
*/
    public static void main(String[] args) {
        float temperatura;
        System.out.println("Ingrese la temperatura");
        Scanner leer = new Scanner(System.in);
        temperatura = leer.nextInt();
        float Fahren;
        Fahren = 32 + (9 * temperatura / 5);
        System.out.println("La temperatura es " + Fahren + " °F ");
    
        
        
        
    }  
}
