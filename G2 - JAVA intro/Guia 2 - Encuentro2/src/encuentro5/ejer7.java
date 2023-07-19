/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro5;

import java.util.Scanner;

/**
 *Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().
 * @author EUGE
 */
public class ejer7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cadena de RS232");
        String cadena = leer.nextLine();
        
        int longitud = cadena.length();
                
    }
    
}
/*
public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase, x, o;
        int longitud, c, i,intentos;
        c = 0;
        i = 0;
        intentos=0;
        do {
            intentos=intentos+1;
            System.out.println("Ingrese la cadena que empieze  en X y termine en O, con un maximo de 5 caracteres "+ "                                           Intento "+ intentos);
            frase = leer.nextLine();
            frase = frase.toUpperCase();
            longitud = frase.length();
            x = frase.substring(0, 1);
            o = frase.substring(longitud - 1, longitud);

            if (longitud <= 5 && x.equalsIgnoreCase("X") && o.equalsIgnoreCase("O")) {
                //System.out.println("&&&&&");
                c = c + 1;
               
            } else {
                
                i = i + 1;
            }

        }while (!frase.equals("&&&&&"));
        System.out.println("Cantidad de correctas " + c);
        System.out.println("Cantidad de erradas " + (i-1));    
        
    }
*/
