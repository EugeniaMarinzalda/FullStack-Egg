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
  
    public ArrayList<Alumno> listaAlumno = new ArrayList<>();
    public Scanner scan = new Scanner (System.in).useDelimiter("\n");

    /*
    En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
    */
    
    public void bucle(){
        boolean salir = true;
        do{
            listaAlumno.add(crearAlumno());
            System.out.println("Quiere agregar otro alumno (n para salir)");
            String opc = scan.next();
            if (opc.equalsIgnoreCase("n")) {
                salir=false;
            }
        }while(salir);
    }
    
    public Alumno crearAlumno() {
            ArrayList<Integer> listaNotas = new ArrayList<>();
            System.out.println("Ingrese el nombre del alumno");
            String nombre = scan.next();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota " + (i+1));
                int nota =scan.nextInt();
                listaNotas.add(nota);
            }
            return new Alumno(nombre,listaNotas.get(0),listaNotas.get(1),listaNotas.get(2));  
    }
    /*
    Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
    */
    
    public void notaFinal(String name){
        boolean capture = false;
        for (Alumno aux : listaAlumno) {
            if (name.equalsIgnoreCase(aux.getNombre())) {
                double promNotas=(aux.getNota().get(0)+aux.getNota().get(1)+aux.getNota().get(2))/3;
                System.out.println("El promedio final del Alumno " + aux.getNombre()+ " es: "+ promNotas);  
                capture = true;
            } 
        }
        if (capture==false) {
            System.out.println("No se encontro el alumno.Intente nuevamente.");
        }
    }
    
    public void mostrarAlumno(){
        for (Alumno aux : listaAlumno) {
            System.out.println(aux);
        }
    }
} 
