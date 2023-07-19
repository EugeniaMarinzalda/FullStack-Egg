
package g12_ejer1extra.entidades;

import java.util.Scanner;


public class Barco {
    /*
    Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
    */
    private String matricula;
    private int eslora, anioFab;

    public Barco() {
    }

    public Barco(String matricula, int eslora, int añoFab) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFab = añoFab;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnioFab() {
        return anioFab;
    }

    public void setAnioFab(int anioFab) {
        this.anioFab = anioFab;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", año de Fab=" + anioFab + '}';
    }
    public Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Barco crearBarco(){
        System.out.println("Ingrese la matricula");
        String mat = sc.next();
        System.out.println("Los metros de eslora");
        int eslora = sc.nextInt();
        System.out.println("Ingrese el año de fabricacion");
        int anio = sc.nextInt();
        return new Barco(mat,eslora,anio);
    }
}
