
package g11_ejer3.Service;
import g11_ejer3.Enumeraciones.Palo;
import g11_ejer3.entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServiceCartas {
    /*
Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
*/
    ArrayList <Carta> maso = new ArrayList();
    ArrayList <Carta> cartasDadas = new ArrayList();
    Carta c ;
    static Scanner sc = new Scanner(System.in).useDelimiter("\n");
  
    public ArrayList <Carta> crearMaso(){
        for (Palo aux : Palo.values()) {
            for (int i = 1; i < 13; i++) {
                if (i != 8 && i !=9) {
                    c = new Carta (aux,i);
                    maso.add(c);
                }
            }
        }
        return maso;
    }
    /*
     • barajar(): cambia de posición todas las cartas aleatoriamente.
    */
     public void barajar(){
         Collections.shuffle(maso);
     }
     /*
     • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
     */
    public void  siguienteCarta() {
        if (maso.size() >0) {
            System.out.println("La siguiente cartas es: " + maso.get(0).getNumero() + " de " + maso.get(0).getPalo());
        } else {
            System.out.println("No quedan mas cartas");
        }
    }
    /*
     • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
     */
     public void darCartas(){
         System.out.println("Cuantas cartas necesita"); 
         int cantCartas = sc.nextInt();
         if (cantCartas>maso.size()) {
             System.out.println("Esta solicitando mas cartas de las que tiene la baraja");
         } else {
             for (int i = 0; i < cantCartas; i++) {
                 //System.out.println(maso.get(i));
                 cartasDadas.add(maso.get(i));
                 maso.remove(i);
             }
             System.out.println("Toma " + cantCartas + " cartas");
         }
     }
     /*
     • cartasDisponibles(): indica el número de cartas que aún se puede repartir.
     */
    public void cartasDisponibles (){
        System.out.println("Todavia se pueden repartir " + maso.size() + " cartas.");
    } 
     /*
    • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
    indicárselo al usuario
     */
     public void cartasMonton(){
         if (cartasDadas.size()==0) {
             System.out.println("No salieron cartas");
         } else {
            System.out.println("Las cartas que salieron son: ");
            System.out.println(cartasDadas.toString());
         }
 
     }
     /*
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
     */
    public void mostrarBaraja(){
         System.out.println("Las cartas que quedan en la baraja son: ");
         System.out.println(maso.toString());
     } 
}
