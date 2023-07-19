
package g11_ejer3;

import g11_ejer3.Service.ServiceCartas;
import java.util.Scanner;

/**
 *Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
public class G11_ejer3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");    
        ServiceCartas b = new ServiceCartas();
        boolean hacer = true;
        b.crearMaso();
        b.barajar();
        System.out.println("Juguemos a las cartas");
        do {
            System.out.println("Que deseas hacer ? \n1-Dar Cartas \n2-Mostrar las cartas que salieron?"
                    + "\n3-Saber cual es la siguiente carta? \n4-Saber la cantidad de cartas que quedan en "
                    + "el monton? \n5-Mostrar las cartas de la baraja\n6-Salir");
            int opc = sc.nextInt();
            switch (opc) {
            case 1:
                b.darCartas();
                break;
            case 2:
                b.cartasMonton();
                break;
            case 3:
                b.siguienteCarta();
                break;
            case 4:
                b.cartasDisponibles();
                break;
            case 5:
                b.mostrarBaraja();
                break;
            case 6:    
                System.out.println("Gracias por jugar");
                hacer = false;
                break;
            default:
                System.out.println("Opcion incorrecta");
            }
        } while (hacer);
    }
}
