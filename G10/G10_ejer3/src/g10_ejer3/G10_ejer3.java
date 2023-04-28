/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g10_ejer3;

/**
 *Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 * @author EUGE
 */
public class G10_ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
/*
package Main;

import Entidades.AlumnosEntidad;
import Servicios.AlumnosServicio;
import java.util.ArrayList;
import java.util.Scanner;

public class Alumnos {

    public static void main(String[] args) {

        AlumnosServicio as = new AlumnosServicio();

        ArrayList<AlumnosEntidad> alumnos = new ArrayList();

        String opc = "s";

        ArrayList<Double> notas = new ArrayList();

        Scanner leer = new Scanner(System.in);
        Scanner leernum = new Scanner(System.in);

        while (opc.equals("s")) {
            AlumnosEntidad a1 = as.crearalumno();
            notas.add(a1.getNota());
            notas.add(a1.getNota1());
            notas.add(a1.getNota2());
            alumnos.add(a1);
            System.out.print("Desea crear otro Alumno (S/N)?: ");
            opc = leer.nextLine().toLowerCase();
        }
        boolean salir = false;
            System.out.println("Escribe el nombre del Alumno a sacar su promedio de notas");
        do {
            String nombre = leer.nextLine();
            for (int i = 0; i < alumnos.size(); i++) {
                if (alumnos.get(i).getNombre().equals(nombre)) {
                    double promedio = as.notafinal(alumnos.get(i));
                    System.out.println("El promedio final del total de notas del Alumno " + nombre + " es: " + promedio);
                    System.out.println("\n");
                    System.out.println("¿Desea buscar otro Alumno (S/N)?");
                    String opc2 = leer.next().toLowerCase();
                    if (opc2.equalsIgnoreCase("s")) {
                        System.out.println("Escribe el nombre del Alumno a sacar su promedio de notas");
                        salir = true;
                    } else {
                        System.out.println("Gracias, hasta la proxima");
                        salir = false;
                    }
                }
            }
        } while (salir);
    }
}
*/