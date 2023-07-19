/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA5;

import java.util.Scanner;

/**
 *Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
de equipo y define su tipo de dato de tal manera que te permita alojar sus
nombres más adelante.
 * @author EUGE
 */
public class ejer13teorico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de compañeros");
        int tam = leer.nextInt();
        String compa[];
        compa = new String[tam];
        for (int i = 0; i < tam; i++) {
            System.out.println("Ingrese el nombre");  
            compa[i] = read.nextLine();
        }
        for (int i = 0; i < tam; i++) {
            System.out.println("[" + compa[i] + "]");
        }
    }
}
