/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_encuentro2;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author EUGE
 */
public class Java_encuentro2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*
        String nombre = "eugenia"; 
       int edad = 32;
        
        System.out.println(nombre);
        System.out.println(edad);
        
        boolean banderita = true;
        char letra = 0;
        
        double decimal = 40.5;
        
        int numero = 48;
        double decimales = 3.55;
        boolean bandera = false;
        
        int num1 = 5;
        int num2 = 5;
        int num3 = 20;
        
        //operadores aritmeticos
        int suma = num1 + num2;
        int resta = num3 - num1;      
        double division= num1 / num2;
        //operadores de igualdad y relacion
        boolean logico = num2 < num1;
        boolean control = num3 != num1;
        //operadores unarios - no da el resulado
        int contador = num1++;
        int descontador = num2--;
                
        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + resta);
        System.out.println("La division es " + division);
        
         System.out.print("La suma es " + suma);
        System.out.print(" La resta es " + resta);
        System.out.print(" La division es " + division + " ");
        
        
        System.out.println(logico);
        System.out.println(control);
        System.out.println(contador);
        System.out.println(descontador);
        
        int numEntero = 4;
        String numCadena = String.valueOf(numEntero);
        System.out.println(numCadena);
        
        String numCadena1 = "1";
        int numEntero2 = Integer.parseInt(numCadena1);
        System.out.println(numEntero2);
        
        System.out.println("Hola Mundo");
        
        //Video encuentro 2
        //se crea una variable Scanner que se utiliza para leer datos del usuario
        Scanner leer = new Scanner(System.in);
        //se crea una variabke cadena (String) que se utiliza para leer los datos del usuario
        String nombre2;
        //muestra el mensaje por pantalla
        System.out.println("Ingresa tu nombre: ");
        //leemos el nombre de la persona en la variable nombre
        nombre2 = leer.next();
        //mostramos por consola el mensaje personalizado
        System.out.println("Hola Mundo!! Soy " + nombre2 + " y estoy programando en Java!");
*/

      String nombre;
      System.out.println("Ingrese su nombre");
      Scanner leer = new Scanner (System.in);
      nombre = leer.next();
      String nombreok;
      nombreok = toUpperCase(nombre);
      System.out.println("Hola Mundo!!! Soy " + nombreok + " y estoy programando");
        
      
      
    }
    
}
