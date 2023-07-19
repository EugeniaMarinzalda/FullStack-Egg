/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreria;

import java.util.Scanner;
import libreria.Servicios.AutorServicio;
import libreria.Servicios.EditorialServicio;
import libreria.Servicios.LibroServicio;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;


public class Libreria {

    private static final AutorServicio auServ = new AutorServicio();
    private static final EditorialServicio edServ = new EditorialServicio();
    private static final LibroServicio liServ = new LibroServicio();
    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {
        int opcion;
        boolean salir = false;
        while(!salir){
            System.out.println("MENU LIBRERIA");

            System.out.println("1. BUSCAR AUTOR POR NOMBRE");
            System.out.println("2. BUSCAR LIBRO POR ISBN");
            System.out.println("3. BUSCAR LIBRO POR TITULO");
            System.out.println("4. BUSCAR LIBRO POR AUTOR");
            System.out.println("5. BUSCAR LIBRO POR EDITORIAL");
            System.out.println("6. INGRESAR PRODUCTO");
            System.out.println("7. INGRESAR FABRICANTE");
            System.out.println("8. EDITAR PRODUCTO");
            System.out.println("9. SALIR");
            
            System.out.println("Elija una Opción");
            opcion = leer.nextInt();
            
            switch(opcion)
            {
                case 1:
                    System.out.println("Ingrese un nombre de autor");
                    String nomA = leer.next();
                    auServ.buscarPorNombre(nomA);
                    break;
                case 2:
                    System.out.println("Ingrese el ISBN del Libro");
                    long isbn = leer.nextLong();
                    liServ.buscarPorIsbn(isbn);
                    break;
                case 3:
                    System.out.println("Ingrese el Título del Libro");
                    String tit = leer.next();
                    liServ.buscarPorTitulo(tit);
                    break;
                case 4:
                    System.out.println("Ingrese un nombre de Autor");
                    String libroA = leer.next();
                    liServ.buscarPorAutorLibro(libroA);
                    break;
                case 5:
                    System.out.println("Ingrese un nombre de la Editorial");
                    String libroE = leer.next();
                    liServ.buscarPorEditorialLibro(libroE);
                    break;
                case 6:
                    
                    break;
                case 7:
                      
                    break;
                case 8:
                    
                    break;
                case 9: 
                    System.out.println("Desea Salir de la Aplicación? S/N");
                    String res = leer.next().toLowerCase();
                    
                    if("s".equals(res)){
                        salir = true;
                        break;
                    }
                default:
                    System.out.println("Solo Números entre 1 y 9");
            }
        }
        //Autor autor3 = auServ.crearAutor(au3, al3);
        
        //auServ.listarAutor().forEach((a) -> System.out.println(a.toString()));
    }
    
}
