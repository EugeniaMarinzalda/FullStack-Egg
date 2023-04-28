
package G10_ejer1.servicePerro;

import G10_ejer1.entidad.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServicePerro {
    private ArrayList<String> RazaPerro = new ArrayList();
    private Scanner scan = new Scanner(System.in).useDelimiter("\n");
    /*
    Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
    */
    public Perro crearPerro(){
        System.out.println("Ingrese el nombre del perro");
        String name = scan.next();
        System.out.println("Ingrese la raza del perro");
        String dog = scan.next();
        return new Perro(dog,name);
    }
    public void guardarRaza(Perro p){
        RazaPerro.add(p.getRaza());
    }
    /*
    después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
    */
    public void menu(){
        boolean exit = true;
        do{
            guardarRaza(crearPerro());
            System.out.println("Quiere registrar otro perro? N para salir");
            String opc = scan.next();
            if (opc.equalsIgnoreCase("n")) {
                exit=false;
            }
        }while(exit);
        mostrarRazaPerro();
    }
    public void mostrarRazaPerro(){
        System.out.println("Las razas de perro son:");
        for (String perro : RazaPerro) {
            System.out.println(perro);
        }
    }   
    /*
    Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada. - perro = raza de perro
    */
    public void buscarRazaPerro(){
        boolean flag = true;
        System.out.println("Que raza de perro desea eliminar?");
        String raza = scan.next();
        Iterator<String> it= RazaPerro.iterator();
        while(it.hasNext()){
            String aux = it.next();
            if (raza.equals(aux)) {
                flag=false;
                it.remove();
            } 
        }
        if (flag) {
            System.out.println("Esa raza de perro no se encontro");
        }
    }
}
