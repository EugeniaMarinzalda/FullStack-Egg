/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro3;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author EUGE
 */
public class ejerc3 {
    /*Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
    */
    public static void main(String[] args) {
       String frase;
       System.out.println("Ingrese una frase");
       Scanner leer = new Scanner(System.in); 
       frase = leer.nextLine(); 
       String mayuscula = frase.toUpperCase();
       String minuscula = frase.toLowerCase();
       
       System.out.println("La frase en mayusculas es " + mayuscula);
       System.out.println("La frase en minusculas es " + minuscula);
        
        
        
        
    }   
}
