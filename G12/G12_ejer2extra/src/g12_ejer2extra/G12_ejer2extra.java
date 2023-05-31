
package g12_ejer2extra;

import g12_ejer2extra.entidades.Edificio;
import g12_ejer2extra.entidades.EdificioOficina;
import g12_ejer2extra.entidades.Polideportivo;
import java.util.ArrayList;
import java.util.Scanner;

public class G12_ejer2extra {

    /*
    Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
    Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
    */
    
    public static void main(String[] args) {
       System.out.println("Bienvenido"); 
       menu();
       
    }
    
    
    public static void menu() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ArrayList <Edificio> edificios = new ArrayList();
        EdificioOficina o = new EdificioOficina();
        Polideportivo p = new Polideportivo();
        int polT = 0;
        int polA = 0;
        int choice;
        do {
            showMenu();
            choice = sc.nextInt();
            while (choice < 1 && choice > 5) {
                System.out.println("El valor ingresado no corresponde a ninguna opción, intente nuevamente");
                choice = sc.nextInt();
            }
            switch (choice) {
                case 1:
                    edificios.add(o.crearOficina());
                    break;
                case 2:
                    edificios.add(p.crearEdificio());
                    break;
                case 3:
                    System.out.println(edificios.toString());
                    break;
                case 4:
                    for (Edificio aux : edificios) {
                        System.out.println(aux);
                        aux.calcularExtra();
                        if (aux instanceof Polideportivo) {
                            Polideportivo poli = (Polideportivo) aux;
                            if (poli.isTipo()) {
                                polT=+1;
                            } else {
                                polA=+1;
                            }
                            System.out.println("");
                        }
                    }
                    System.out.println("");
                    System.out.println("La cantidad de polideportivos cerrados son: " + polT);
                    System.out.println("La cantidad de polideportivos abiertos son: " + polA);
                    break;
                               
            }
        } while (choice != 5);
        
        System.out.println("Gracias por utilizar el servicio");
    }
    
    public static void showMenu() {
        System.out.println("Menu");
        System.out.println("1-Definir Edificio de Oficinas");
        System.out.println("2-Definir Polideportivo");
        System.out.println("3-Mostrar Edificios");
        System.out.println("4-Mostrar cantidad de personas");
        System.out.println("5-Salir");
    }
    
   
}
