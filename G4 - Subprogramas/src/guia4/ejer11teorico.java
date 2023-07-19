/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author EUGE
 */
public class ejer11teorico{

    /**Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la
transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la secuencia de caracteres (termine en '.')");
        String frase = leer.nextLine();
        System.out.println("La secuencia es " + reemplazo (frase)); 
        //invoca a la funcion desde print line
    }
    public static String reemplazo(String frase) {
        String reemplazo = ""; //inicio
        for (int i = 0; i < frase.length(); i++) {
            char A = frase.charAt(i); // char para un solo caracter- evalua cada posicion de la variable
            switch (A) {
                case 'a':
                    reemplazo+="@";
                    break;
                case 'e':
                    reemplazo+="#";
                    break;
                case 'i':
                    reemplazo+="$";
                    break;
                case 'o':
                    reemplazo+="%";
                    break;
                case 'u':
                    reemplazo+="*";
                    break;
                default: 
                    reemplazo += A; 
                    break;
            }
        }
        return reemplazo;
    }
    
}  
/*public static void main(String[] args) {
  String frase;
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese una cadena de caracteres:");
        frase = read.nextLine();
        
        System.out.println("La frase ingresada es: " + frase);
        String convertion = frase2(frase);
        System.out.println("La frase modificada es: " + convertion );
    }

    public static String frase2(String frase) {
        
        String newfrase = frase.replace("a","@");
        String newfrase2 = newfrase.replace("e", "#");
        String newfrase3 = newfrase2.replace("i", "$");
        String newfrase4 = newfrase3.replace("o", "%");
        String newfrase5 = newfrase4.replace("u", "*");
        
        return newfrase5;
    }
}
*/