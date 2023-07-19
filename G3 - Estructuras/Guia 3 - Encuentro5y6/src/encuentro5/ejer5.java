package encuentro5;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
 * @author EUGE
 */
public class ejer5 {
    public static void main(String[] args) {
        System.out.println("Ingrese el valor limite positivo");
        Scanner leer = new Scanner(System.in);
        int limite = leer.nextInt();
        
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        int suma = num;
        int dif = limite - num;
        boolean proceso = dif !=0;
        while (proceso) {
            System.out.println("Ingrese otro numero");
            num = leer.nextInt();
            if (dif<num) {
                System.out.println("El numero " + num + " no se incluira en"
                        + " la suma ya que supera el valor limite");
                proceso = false;
            } else {                    
            suma = suma + num;
            dif = dif - num;
            }    
        }
        System.out.println("El valor de la suma es " + suma);
    }
}
/* con do puedo superar el valor limite
 do {
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            suma = suma + num;
        } while (suma<limite);
        System.out.println("El valor de la suma es " + suma );
*/
