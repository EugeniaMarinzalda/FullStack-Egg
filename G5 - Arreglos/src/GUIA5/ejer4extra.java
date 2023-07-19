/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA5;

import java.util.Scanner;

/**
 *Los profesores del curso de programación de Egg necesitan llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. 
* Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
notas del curso.
 * @author EUGE
 */
public class ejer4extra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int alum = 2; // son 10
        double [][] matrizNotas = new double[alum][5];
        int apro = 0;
        int repro = 0;
        notas(matrizNotas,alum,apro,repro);
        mostrarNotas(matrizNotas,alum);    
    }
    public static void notas(double[][] matrizNotas, int alum, int apro, int repro) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < alum; i++) {
            System.out.println("Ingrese las notas del alumno " + (i+1) );
            double promedio = 0;
            for (int j = 0; j < 4; j++) {
                System.out.println("Ingrese la nota " + (j+1) );
                matrizNotas[i][j]=leer.nextInt();
                promedio = (matrizNotas[i][0]*0.1)+(matrizNotas[i][1]*0.15)+(matrizNotas[i][2]*0.25)+(matrizNotas[i][3]*0.5);
            }
            for (int j = 4; j < 5; j++) {
                matrizNotas[i][j] = promedio;   
            if (promedio >= 7 ) {
                    apro ++;
                } else if ( promedio < 7 ) {
                    repro++;
                }
            }
        }
        System.out.println("La cantidad de aprobados son " + apro + " alumnos");   
        System.out.println("La cantidad de reprobados son " + repro + " alumnos");   
    } 
    public static void mostrarNotas(double[][] matrizNotas, int alum) {
        for (int i = 0; i < alum; i++) {
            for (int j = 0; j < 5; j++) {
            System.out.print("[" + matrizNotas[i][j] + "]");
            }
        System.out.println(" ");    
        }
    }   
}     
   
