
package g10_ejer5.Service;

import entidad.Pais;
import g10_ejer5.Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;



/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. 
El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
*/
public class ServicePais {
    public HashSet<Pais> conjPais = new HashSet();
    public ArrayList <Pais> ListaPais = new ArrayList();
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearPais () {
        boolean bandera = true;
        do{
            System.out.println("Ingrese el pais");
            String nombrePais = leer.next();
            conjPais.add(new Pais (nombrePais));
            System.out.println("Quiere agregar otro país (n para salir)");
            String opc = leer.next(); 
            if (opc.equalsIgnoreCase("n")) {
                bandera = false;
            }
        } while (bandera);

    }
    public void mostrarPais(){
        System.out.println("\nLos paises del conjunto son: ");
        conjPais.forEach((aux) -> {
            System.out.print(aux+ " ");
        });
        System.out.println(" ");
    }
    /*
    Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
    */
    public void ConjOrdenado(){
        
        ListaPais = new ArrayList(conjPais);
        Collections.sort(ListaPais, Comparadores.comparadorNombre);
    }
    /*
    
    */
    public void mostrarListaPais(){
        System.out.println("\nEl conjunto ordenado alfabeticamente es: ");
        ListaPais.forEach((aux) -> {
            System.out.print(aux + " ");
        });
        System.out.println(" ");
    }
    /*
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
    */
    public void eliminarPais(){
        System.out.println("Ingrese el pais que desea eliminar");
        String paisEliminar = leer.next();
        Iterator <Pais> it = conjPais.iterator();
        int cont = 0;
        while (it.hasNext()) {
            if (it.next().getNombrePais().equalsIgnoreCase(paisEliminar)) {
                it.remove();
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("El pais no se encuentra en el conjunto");
        } else {
            System.out.println("Los paises que quedan son:");
        }
        System.out.println(conjPais);
    }  
}
