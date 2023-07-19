
package libreria;

import java.util.Scanner;
import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;

public class G16_ejer1 {

   
    public static void main(String[] args) throws Exception {
        AutorServicio AS = new AutorServicio();
        LibroServicio LS = new LibroServicio();
        EditorialServicio ES = new EditorialServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int choice;
        boolean salir = true;
        do {
            System.out.println("Menu");
            System.out.println("1-Búsqueda de un Autor por nombre"); 
            System.out.println("2-Búsqueda de un libro por ISBN.");
            System.out.println("3-Búsqueda de un libro por Título.");
            System.out.println("4-Búsqueda de un libro/s por nombre de Autor."); 
            System.out.println("5-Búsqueda de un libro/s por nombre de Editorial.");
            System.out.println("6-Alta de un Libro"); 
            System.out.println("7-Alta de un Autor"); 
            System.out.println("8-Alta de una Editorial"); 
            System.out.println("9-Baja de un Libro"); 
            System.out.println("10-Baja de un Autor");
            System.out.println("11-Baja de una Editorial"); 
            System.out.println("12-Modificación de un Libro");
            System.out.println("13-Modificación de un Autor");
            System.out.println("14-Modificación de una Editorial");
            System.out.println("15-Mostrar Libros");
            System.out.println("16-Mostrar todos los Autores");
            System.out.println("17-Mostrar Editoriales");
            System.out.println("18-Salir");
            choice = leer.nextInt();
            while (choice < 1 || choice > 18) {
                System.out.println("El valor ingresado no corresponde a ninguna opción, intente nuevamente");
                choice = leer.nextInt();
            }
            
            switch (choice) {
                case 1:
                    AS.buscarxNombre();
                    Thread.sleep(3000);
                    break;
                case 2:
                    LS.buscarISBN();
                    Thread.sleep(3000);
                    break;
                case 3:
                    LS.buscarTitulo();
                    Thread.sleep(3000);
                    break;
                case 4:
                    LS.buscarAutor();
                    Thread.sleep(3000);
                    break;
                case 5:
                    LS.buscarEditorial();
                    Thread.sleep(3000);
                    break;
                case 6:
                    LS.crearLibro();
                    Thread.sleep(3000);
                    break;
                case 7:
                    AS.crearAutorControl();
                    Thread.sleep(3000);
                    break;
                case 8:
                    ES.crearEditorial();
                    Thread.sleep(3000);
                    break;
                case 9:
                    LS.baja();
                    Thread.sleep(3000);
                    break;
                case 10:
                    AS.eliminarAutor();
                    Thread.sleep(3000);
                    break;
                case 11:
                    ES.baja();
                    Thread.sleep(3000);
                    break;
                case 12:
                    LS.modificarLibro();
                    Thread.sleep(3000);
                    break;
                case 13:
                    AS.modificarAutor();
                    Thread.sleep(3000);
                    break;
                case 14:
                    ES.modificacion();
                    Thread.sleep(3000);
                    break;
                case 15:
                    LS.mostrarLibros();
                    Thread.sleep(3000);
                    break;
                case 16:
                    AS.mostrarAutores();
                    Thread.sleep(3000);
                    break;
                case 17:
                    ES.listar();
                    Thread.sleep(3000);
                    break;
            }
        } while (choice != 18);
        
        System.out.println("Gracias por utilizar el sistema");

    }
    
}
