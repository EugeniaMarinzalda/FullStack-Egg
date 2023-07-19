/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro5;

import java.util.Scanner;

/**
 *Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 * @author EUGE
 */
public class ejer1extra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un tiempo en minutos");
        int minutos = leer.nextInt();
        double dias = Math.floor(minutos/1440); //para usar Math.floor debe ser clase double
        double horas = Math.floor((minutos / 60)-(dias*24));
        System.out.println("Los minutos " + (int) minutos +" equivalen a "+ (int) dias + " dias y " + (int) horas + " horas");                
    }
}
/*
Scanner leer = new Scanner(System.in);
        int num;
        float  minutos;
        
        System.out.println("Bienvenido al convertidor de minutos!\nPor favor ingrese un número para convertirlo a Dias y Horas");
        num = leer.nextInt();
        int dias = num / 1440; // 1440 minutos en un día
        int horas = (num % 1440) / 60; // 60 minutos en una hora
        int minutosRestantes = num % 60;
        System.out.println("Su número: " + num + "\nEn días y minutos es: \n" + dias + " días y " + horas + " horas y " + minutosRestantes + " minutos\n");
otro
public class Ejercicio01 {
	public static void main(String[] args) {
		double minuto = Math.floor( Math.random()*10000 );
		
		double hora = minuto / 60;
		hora = (Math.floor(hora * 100)) / 100;
		
		double dia = hora / 24;
		dia = (Math.floor(dia * 100)) / 100;
		
		System.out.println("Minutos: " + minuto + "; Horas: " + hora + "; Dia: " + dia);
	}
}
*/