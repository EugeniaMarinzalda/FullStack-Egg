/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g10_ejer3.entidades;

import java.util.ArrayList;
import java.util.List;

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
public class Alumno {
    public String nombre;
    public List<Integer> nota = new ArrayList();

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public Alumno() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNota() {
        return nota;
    }

    public void setNota(List<Integer> nota) {
        this.nota = nota;
    }
    
    
}
/*
package Entidades;

import java.util.ArrayList;

public class AlumnosEntidad {

    private String nombre;
    private Double nota, nota1, nota2;
    private ArrayList<Double> notas = new ArrayList();

    public AlumnosEntidad() {
    }

    public AlumnosEntidad(String nombre, Double nota, Double nota1, Double nota2) {
        this.nombre = nombre;
        this.nota = nota;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }
    
    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }
}
*/
