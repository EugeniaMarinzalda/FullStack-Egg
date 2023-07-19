/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro4;

import java.util.Scanner;

/**
 *
 * @author EUGE
 */
public class ejerc9teorico {
    /*
    Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        int num;
        int i = 0;
        
        do { i++;
            System.out.println("Introduce el numero " + i + ":");
            num = leer.nextInt();
            
            if (num==0) {
                System.out.println("Se capturó el numero cero");
                break;
            }   else if (num > 0) {
                    suma += num;
        }}while(i<20);
        
            System.out.println("La suma de los numeros es " + suma );
            }        
        }
