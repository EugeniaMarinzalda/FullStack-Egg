/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
 * @author EUGE
 */
public class ejer1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        Scanner cadena = new Scanner(System.in);
        boolean bandera = true; 
        do {
        System.out.println("Que operacion desea realizar \n Suma \n Resta \n Multiplicacion \n Division \n Salir" );
        String opc = cadena.nextLine();
        opc = opc.toLowerCase();
        switch (opc) {
            case "suma":
                System.out.println("El valor de la suma es " + suma(num1,num2));
                break;
            case "resta":
                System.out.println("El valor de la resta es " + resta(num1,num2));
                break;
            case "multiplicacion":
                System.out.println("El valor de la multiplicacion es " + multi(num1,num2));
                break;
            case "division":
                System.out.println("El valor de la division es " + divi(num1,num2));
                break;
            case "salir":
                System.out.println("Gracias por usar el sistema");
                bandera = false;
                break;
            default:
                System.out.println("Palabra no valida");
        }
        }while (bandera);
    }
    public static int suma(int num1,int num2) {
             int r = num1 + num2;
             return r;
}
    public static int resta(int num1,int num2) {
             int r = num1 - num2;
             return r;
}
    public static int multi(int num1,int num2) {
             int r = num1 * num2;
             return r;
}
    public static double divi(int num1,int num2) {
             double r = num1 / num2;
             return r;
}




}

/*
public class Main {
    public static void main(String[] args) {
       /*
       * Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir.
       * La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos
       * en el main.
        
        Scanner input = new Scanner(System.in);
        System.out.println("menu");
        System.out.println("1. sumar");
        System.out.println("2. restar");
        System.out.println("3. multiplicar");
        System.out.println("4. dividir");
        int ops = input.nextInt();
        System.out.println("ingrese 2 numeros");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        switch (ops){
            case (1):
                System.out.println(sumar(n1,n2));
                break;
            case(2):
                System.out.println(restar(n1,n2));
                break;
            case(3):
                System.out.println(mult(n1,n2));
                break;
            case(4):
                System.out.println(div(n1,n2));
                break;

        }

    }
    public static int sumar(int n1, int n2) {
        int r = n1 + n2;
        return r;
    }
    public static int restar(int n1, int n2) {
        int r = n1 - n2;
        return r;
    }
    public static int mult(int n1, int n2) {
        int r = n1 * n2;
        return r;
    }
    public static double div(int n1, int n2) {
        double r = n1 / n2;
        return r;
    }

}
*/