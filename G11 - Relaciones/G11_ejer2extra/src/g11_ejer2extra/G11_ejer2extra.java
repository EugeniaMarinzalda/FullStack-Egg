
package g11_ejer2extra;

import Entidades.Cine;
import g11_ejer2extra.Service.Service;
import java.util.Scanner;

/**
 *
Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre.
Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de
cada asiento o solo las X y espacios vacíos.
 */
public class G11_ejer2extra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Service s = new Service ();
        Cine c = new Cine ();
        c = s.crearCine();
        int cantidad=0;
        do{
            System.out.println("Ingrese la cantidad de espectadores");
            cantidad = sc.nextInt();
            if (cantidad >48) {
                System.out.println("Hay mas espectadores que asientos.");
                System.out.println("Seran asignados por orden de llegada y si pueden ingresar a la sala.");
            }
        } while (cantidad<0);
        s.crearEsp(cantidad);
        s.mostrarEsp();
        s.asignarAsientos(c);
        s.mostrarSala();
    }
    
}
