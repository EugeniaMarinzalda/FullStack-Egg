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
        String ImputUser;
        int largo, invalidas, validas;
        invalidas = validas = 0;
        Boolean empiezaX, terminaO,isEOF;
        isEOF = true;
        do{
            System.out.println("Ingrese la cadena");
            ImputUser = leer.next();
            largo = ImputUser.length();
            
            if (largo > 5 || largo < 1 ) {
                invalidas = invalidas + 1;
                
            }
            else { 
                if ("X".equals(ImputUser.substring(0,1)) && "O".equals(ImputUser.substring(4,5))) {    
                 validas = validas + 1;   
                } else {
                    invalidas = invalidas + 1;
                }
            if ("&&&&&".equals(ImputUser)) {
                isEOF = false;
                invalidas = invalidas - 1;
            }    
            }
        
        } while (isEOF);
        System.out.println("La cantidad de entradas correctas fueron " + validas);
        System.out.println("La cantidad de entradas incorrectas fueron " + invalidas );
    }
    
    
}
