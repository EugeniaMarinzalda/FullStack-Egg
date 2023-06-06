
package g13_ejercicios;

import g13_ejercicios.entidades.DivisionNumero;
import g13_ejercicios.entidades.ejer2;
import java.util.Scanner;

public class G13_Ejercicios {

   
    public static void main(String[] args) {
        /*
        EJERCICIO 1 EN GUIA 8 EJERCICIO 3
        */
    
        /*EJERCICIO 2
        Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).*/
        
        ejer2 p = new ejer2();
        
        try {
            p.llenarVector();
        }  catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("índice de arreglo fuera de rango");
        }
        
       
        /*
        EJERCICIO 3
        Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
        EJERCICIO 4
        Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
        */
        DivisionNumero dn = new DivisionNumero();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero");
        String num = sc.next();
        System.out.println("Ingrese otro numero");
        String num2 = sc.next();

        try {
           int num3 = Integer.parseInt(num); 
           int num4 = Integer.parseInt(num2); 
            System.out.println(dn.division(num3, num4));
        } catch (NumberFormatException e) {
            System.out.println("No se pudo convertir la cadena en numero");
        } catch (ArithmeticException e1) {
            System.out.println("No se puede dividir por cero");
        }

        /*
        EJERCICIO 5
        Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento
        */
    }
    
}
