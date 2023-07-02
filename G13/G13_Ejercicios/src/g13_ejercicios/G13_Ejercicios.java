
package g13_ejercicios;

import g13_ejercicios.entidades.ClaseA;
import g13_ejercicios.entidades.ClaseB;
import g13_ejercicios.entidades.ClaseC;
import g13_ejercicios.entidades.DivisionNumero;
import g13_ejercicios.entidades.Dos;
import g13_ejercicios.entidades.MioException;
import g13_ejercicios.entidades.Tres;
import g13_ejercicios.entidades.TuException;
import g13_ejercicios.entidades.Uno;
import g13_ejercicios.entidades.ejer2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class G13_Ejercicios {

   
    public static void main(String[] args) throws MioException, TuException {
        /*
        EJERCICIO 1 EN GUIA 8 EJERCICIO 3
        */
    
        /*EJERCICIO 2
        Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
        
        ejer2 p = new ejer2();
        
        try {
            p.llenarVector();
        }  catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("índice de arreglo fuera de rango");
        }
        */
       
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
        System.out.println("Ingrese un numero");
        try {
            int num5 = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Error al ingresar los datos");
        }
         */
        
        /*
        EJERCICIO 5     ------------------------------------ falta terminar
        Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento
        
        
        int intento = 0;
        System.out.println("Ingrese un numero del 1 al 500");
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        double numAs = Math.random()*500;
        int numA = (int) numAs;
        System.out.println(numA);
        int numU = 0;
            do {
                try {
                    numU = sc.nextInt();
                    intento++;
                    if (numA==numU) {
                        intento--;
                        System.out.println("Felicitaciones! Adivinante el numero");
                    } else if (numA>numU){
                        System.out.println("El numero es mayor. Intenta de nuevo.");
                    } else if (numA<numU){
                        System.out.println("En numero es menor. Intenta de nuevo.");
                    } else { 
                        System.out.println("Intente nuevamente");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error en los datos ingresados");
                    intento++;
                    sc.next();
                }    
            } while (numA!=numU);
            System.out.println("Cantidad de intentos fallidos: " + intento);
            
        
        /*
            public class Ejercicio5 {

    public static void main(String[] args) {
        
        int numAdivinar= (int)(Math.random()*10);
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("intenta adivinar en numero:");
        int rta=0;
        int cont= 0;
        do {
        try{
            rta= sc.nextInt();
            cont++;
            if(rta<numAdivinar){
                System.out.println("ES MAYOR. Intenta de nuevo");
            }
            else if( rta>numAdivinar){
                System.out.println("ES MENOR. Intenta de nuevo");
            }
            else {
                System.out.println("Felicidades adivinaste el numero en el intento: "+ cont);
            }
        }catch (Exception e){
            System.out.println("error al ingresar el dato");
            cont++;
            continue;
            
        }
        } while (rta!=numAdivinar);
            
        }
    }
            */
        /*
        EJERCICIO 6
        Dado el método metodoA de la clase A, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
        
        ClaseA a = new ClaseA();
        a.metodoA();
        */
        
        /*
        EJERCICIO 7
        Dado el método metodoB de la clase B, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
        
        ClaseB B = new ClaseB();
        B.metodoB();
        */
        
        /*
        EJERCICIO 8
        Indique que se mostrará por pantalla cuando se ejecute cada una de estas clases:
        
        Uno B = new Uno();
        int num = B.metodo();
        try ok
        Valor final del try:44
        Valor final del finally: 45
        Valor antes del return: 46
        try mal
        Valor final del catch:43
        Valor final del finally: 44
        Valor antes del return: 45
        
        Dos d = new Dos();
        try{
            System.out.println ( d.metodo()) ;
        } catch(Exception e) {
            System.err.println ( " Excepcion en metodo ( ) " ) ;
            e.printStackTrace();
        }
//        Valor final del catch: 43
//        Valor final del finally: 44
//        Valor antes del return: 45
//        45
        
        Tres t = new Tres();
        try{
            System.out.println( t.metodo ( ) ) ;
        } catch(Exception e) {
            System.err.println("Excepcion en metodo ( ) " ) ;
            e.printStackTrace();
        }
//        Valor final del finally:2 // el catch tambien tiene un formato invalido
//        Excepcion en metodo ( ) 
//        java.lang.NumberFormatException: For input string: "W"
//	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
//	at java.lang.Integer.parseInt(Integer.java:580)
//	at java.lang.Integer.parseInt(Integer.java:615)
//	at g13_ejercicios.entidades.Tres.metodo(Tres.java:13)
//	at g13_ejercicios.G13_Ejercicios.main(G13_Ejercicios.java:197)
        
        */

        /*EJERCICIO 9
        Dado el método metodoC de la clase C, indique:
    a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
            sentencia_c1
            sentencia_c4
            sentencia_c6
    b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
            sentencia_c1
            sentencia_c2
            sentencia_c3
            sentencia_c6
    c) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción TuException? ver -----
            sentencia_c1
            sentencia_c2
            Exception in thread "main" g13_ejercicios.entidades.TuException
            sentencia_c3
            sentencia_c5
            sentencia_c6
        
       */
        ClaseC c = new ClaseC();
        c.metodoC();
        
        
        
        
    }
    
}
