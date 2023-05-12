
package Service;

import g11_ejer2.entidades.Jugador;
import g11_ejer2.entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
 */
 
public class ServiceJugador {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Jugador j = new Jugador();
    Revolver r = new Revolver ();
    ServiceRevolver sr = new ServiceRevolver ();
    ArrayList <Jugador> Jugadores = new ArrayList();

    //en ronda
    public boolean disparo(Revolver r){
        //System.out.println("Disparo" +sr.mojar() );
        if (sr.mojar()==true) {
            System.out.println("Jugador eliminado. desde disparo");
            j.setMojado(true);
            return true;
        } else {
           sr.siguienteChorro(); 
            System.out.println("Usted se ha salvado. Siguiente Jugador. desde disparo");
            return false;
        }
    }
    
//en crear lista
    public Jugador crearJugador(int numero){
        String Jugador = "Jugador N° ";
        String nombre = Jugador.concat(String.valueOf(numero));
        return new Jugador (numero,nombre,false);
    } 
//desde el main    
    public ArrayList <Jugador> crearLista(){
        System.out.println("Ingrese la cantidad de jugadores (Entre 1 y 6)");
        int cant = sc.nextInt();
        if (cant>6 || cant<1) {
            cant=6;
            System.out.println("Cantidad erronea. Se inicia en 6 jugadores.");
        }
        int numero = 1;
        do {
            Jugadores.add(crearJugador(numero));
            numero++;
            cant--;
        } while (cant>0);
        System.out.println("Los jugadores son: ");
        System.out.println(Jugadores.toString());
        return Jugadores;
    }
}
