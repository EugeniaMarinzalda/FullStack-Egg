
package g11_ejerteo2;

import g11_ejerteo2.entidades.Equipo;
import g11_ejerteo2.entidades.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

public class G11_ejerTeo2 {

   /* Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.*/
    public static ArrayList<Jugador> listaJugadores = new ArrayList();
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {

        System.out.println("Ingrese el nombre del Equipo");
        String nombre = leer.next();
        
        System.out.println("Ingrese cantidad de jugadores");
        int cant = leer.nextInt();
        
        for (int i = 0; i < cant; i++) {
            Jugador j1 = new Jugador();
            System.out.println("Ingrese el nombre");
            j1.setNombre(leer.next());
            System.out.println("Ingrese el apellido");
            j1.setApellido(leer.next());
            System.out.println("Ingrese la posicion");
            j1.setPosicion(leer.next());
            System.out.println("Ingrese el numero");
            j1.setNumero(leer.nextInt());
            listaJugadores.add(j1);
        }
        
        Equipo equi = new Equipo(listaJugadores,nombre);
         
        System.out.println(equi);
        
        
        
    }
    
}
