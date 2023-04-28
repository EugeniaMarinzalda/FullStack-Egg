/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g10_ejer3.Servicio;

import g10_ejer3.entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author EUGE
 */
public class ServiceAlumno {
    public ArrayList<Alumno> listaAlumnos;

    public ServiceAlumno() {
        this.listaAlumnos = new ArrayList<>();
    }

    public void crearAlumno() {
        boolean salir = true;
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        while(salir){
            System.out.println("Ingrese el nombre del alumno");
            String nombre = leer.next();
            Alumno alumno = new Alumno(nombre);
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota");
                Integer nota =leer.nextInt();
                
            }
        }
        
    }
}
/*
package Servicios;

import Entidades.AlumnosEntidad;
import java.util.ArrayList;
import java.util.Scanner;


public class AlumnosServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Scanner leernum = new Scanner(System.in);
    
    public AlumnosEntidad crearalumno(){
        ArrayList<Double> notas = new ArrayList();
            System.out.print("Escriba el nombre del Alumno: ");
            String nombre = leer.nextLine();
            System.out.println("Escriba 3 notas correspondientes al Alumno");
            notas.add(leernum.nextDouble());
            notas.add(leernum.nextDouble());
            notas.add(leernum.nextDouble());
        return new AlumnosEntidad(nombre, notas.get(0), notas.get(1), notas.get(2));
    }
    public double notafinal(AlumnosEntidad alumnos){
        return (alumnos.getNota() + alumnos.getNota1() + alumnos.getNota2()) / 3;
    }
}
*/