
package Estancia;


import Estancia.persistencia.EstanciasDAO;
import Estancia.servicio.EstanciaServicio;
import java.util.Scanner;

public class Ejer1extraEstacias {

  
    public static void main(String[] args) throws Exception {
        EstanciaServicio es = new EstanciaServicio ();
        EstanciasDAO dao = new EstanciasDAO ();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int choice;
        String sql;
        do {
            System.out.println("Menu");
            System.out.println("1-Listar aquellas familias que tienen al menos 3 hijos y con edad máxima inferior a 10 años.");
            System.out.println("2-Casas disponibles para el periodo comprendido entre el 1 de agosto de\n" +
                "2020 y el 31 de agosto de 2020 en Reino Unido.");
            System.out.println("3-Familias cuya dirección de mail sea de Hotmail.");
            System.out.println("4-Casas disponibles a partir de una fecha dada\n" +
                "y un número de días específico.");
            System.out.println("5-Datos de todos los clientes que en algún momento realizaron una estancia y la\n" +
                "descripción de la casa donde la realizaron.");
            System.out.println("6-Listar todas las estancias que han sido reservadas por un cliente, mostrar el nombre, país y\n" +
                "ciudad del cliente y además la información de la casa que reservó. La que reemplazaría a\n" +
                "la anterior");
            System.out.println("7-Debido a la devaluación de la libra esterlina con respecto al euro se desea incrementar el\n" +
                "precio por día en un 5% de todas las casas del Reino Unido. Mostar los precios\n" +
                "actualizados.");
            System.out.println("8-Obtener el número de casas que existen para cada uno de los países diferentes.");
            System.out.println("9-Busca y listar aquellas casas del Reino Unido de las que se ha dicho de ellas (comentarios)\n" +
                "que están ‘limpias’.");
            System.out.println("10-Insertar nuevos datos en la tabla estancias verificando la disponibilidad de las fechas.");
            System.out.println("11-Salir");
            choice = leer.nextInt();
            while (choice < 1 && choice > 11) {
                System.out.println("El valor ingresado no corresponde a ninguna opción, intente nuevamente");
                choice = leer.nextInt();
            }
            switch (choice) {
                case 1:
                    try {
                        
                        dao.listarEstancias();
                    } catch (Exception e) {
                        throw e;
                    }
                    break;
                case 2:
                    //Opcion 2 aquí
                    break;
                case 3:
                    //Opcion 3 aquí
                    break;
                case 4:
                    //Opcion 4 aquí
                    break;
            }
        } while (choice != 5);
        
        System.out.println("Gracias por utilizar el sistema");
    }
    
}
