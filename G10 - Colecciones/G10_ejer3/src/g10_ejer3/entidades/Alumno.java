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

 * @author EUGE
 */
public class Alumno {
    private String nombre;
    private List<Integer> nota = new ArrayList();

    public Alumno() {
    }

    public Alumno(String nombre, int nota1, int nota2, int nota3) {
        this.nombre = nombre;
        nota.add(nota1);
        nota.add(nota2);
        nota.add(nota3);
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

    @Override
    public String toString() {
        return "Alumno{" + "Nombre= " + nombre + ", Nota= " + nota + '}';
    }
}
