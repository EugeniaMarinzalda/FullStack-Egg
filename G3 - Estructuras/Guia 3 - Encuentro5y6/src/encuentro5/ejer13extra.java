/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro5;

import java.util.Scanner;

/**
 *Crear un programa que dibuje una escalera de números, donde cada
línea de números comience en uno y termine en el número de la línea.
Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se
ingresa el número 3:
1
12
123
 * @author EUGE
 */
public class ejer13extra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera");
        int alt = leer.nextInt();
        int repetir = 1;
        String acu = "1";
        int num =1;
        System.out.println(1);  
        while (repetir<alt) {
            num = num + 1;
            String cadenaNum = String.valueOf(num);
            acu = acu.concat(cadenaNum);
            System.out.println(acu);
            repetir=repetir + 1;
        }
    }
}
