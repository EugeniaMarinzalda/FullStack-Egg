/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA5;

import java.util.Scanner;
import java.util.Arrays;


/**
 *Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
caracteres y, a medida que el usuario las va ingresando, construya una
“sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
palabras se ubicarán todas en orden horizontal en una fila que será
seleccionada de manera aleatoria. Una vez concluida la ubicación de las
palabras, rellene los espacios no utilizados con un número aleatorio del 0
al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java substring(), Length() y Math.random().
 * @author EUGE
 */
/*
public class ejer6extra {
    public static void main(String[] args) {
        String[][] matriz = new String[20][20];
        int [] vector = new int [5];
        Scanner read = new Scanner(System.in);
        String aux;
        int cont = 0;
        boolean hacer =false;
        int filas;         
 
        do {
                do{
                    filas = (int) (Math.random() * 10);
                    System.out.println(filas);
                    vector [cont] = filas;
                    for (int i = 0; i < 5; i++) {
                        if (vector[i]==filas) {
                            hacer=true;
                        } else { 
                           cont++; 
                        }
                    }
                } while (hacer);
                
            for (int i = filas; i < filas+1 ; i++) {
                System.out.println("Ingrese una palabra de entre 3 y 5 caracteres");
                aux = read.nextLine();
                if ((aux.length() >= 3) && (aux.length() <= 5)) {
                    for (int j = 0; j < aux.length(); j++) {
                        matriz[i][j] = aux.substring(j, j + 1);

                    }
                } 
            }
        } while (cont<5);
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (matriz[i][j] == null) {
                    matriz[i][j] = String.valueOf((int) (Math.random() * 10));
                }
            }
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
    }
}
*/