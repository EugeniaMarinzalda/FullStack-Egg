/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro5;

import java.util.Scanner;

/**
 *Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano.
 * @author EUGE
 */
public class ejer4extra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 10");
        int romano = leer.nextInt();
        
        switch (romano) {
            case 1:
                System.out.println("El equivalente de "+ romano + " en numero romano es I ");
                break;
            case 2:
                System.out.println("El equivalente de "+ romano + " en numero romano es II ");
                break;
            case 3:
                System.out.println("El equivalente de "+ romano + " en numero romano es III ");
                break;
            case 4:
                System.out.println("El equivalente de "+ romano + " en numero romano es IV ");
                break;
            case 5:
                System.out.println("El equivalente de "+ romano + " en numero romano es V ");
                break;
            case 6:
                System.out.println("El equivalente de "+ romano + " en numero romano es VI ");
                break;
            case 7:
                System.out.println("El equivalente de "+ romano + " en numero romano es VII ");
                break;
            case 8:
                System.out.println("El equivalente de "+ romano + " en numero romano es VII ");
                break;
            case 9:
                System.out.println("El equivalente de "+ romano + " en numero romano es IX ");
                break;
            case 10:
                System.out.println("El equivalente de "+ romano + " en numero romano es X ");
                break;
            default:
                System.out.println("No haz ingresado un numero del 1 al 10 ");
                break;
                
        }
    }
}
