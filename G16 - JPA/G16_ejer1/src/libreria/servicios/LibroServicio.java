/*
 Esta clase tiene la responsabilidad de llevar adelante las funcionalidades necesarias para
administrar libros (consulta, creación, modificación y eliminación).

- Búsqueda de un libro por ISBN. -ok
- Búsqueda de un libro por Título. -ok
- Búsqueda de un libro/s por nombre de Autor. -ok
- Búsqueda de un libro/s por nombre de Editorial. -ok

Validar campos obligatorios.
No ingresar datos duplicados.
 */
package libreria.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.persistence.RollbackException;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencia.LibroDAO;

public class LibroServicio {
    
    private final AutorServicio AS = new AutorServicio();
    private final EditorialServicio ES = new EditorialServicio();
    private final Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private List<Libro> libros = new ArrayList();
 //   private List<Libro> librosConsulta = new ArrayList();
    private LibroDAO LDAO = new LibroDAO();

    
    
     public void crearLibro() throws Exception{    // Realiza las verificaciones antes de crear el libro
        try {
            Autor autor = AS.crearAutorControl();
            if (autor == null) {
                throw new Exception("Error al ingresar el autor");
            }

            Editorial editorial = ES.crearEditorial();
            if (editorial == null) {   //si consulta la tabla y el editorial no esta
                throw new Exception("Error al ingresar el autor");
            } 
            crearLibro(autor, editorial);
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    
    protected Libro crearLibro(Autor autor, Editorial editorial) throws Exception{
        Libro libro = new Libro();
        try {
            System.out.println("Ingrese el ISBN");
            long isbn = sc.nextLong();
            Libro libroCons = LDAO.buscarPorISBN(isbn);
            if (libroCons!=null) {
                throw new Exception("El codigo ISBN ya existe"); 
            } 
            libro.setIsbn(isbn);
            System.out.println("Ingrese el titulo");
            libro.setTitulo(sc.next());
            System.out.println("Ingrese el año de publicación");
            libro.setAnio(sc.nextInt());
            System.out.println("Ingrese la cantidad total de ejemplares");
            libro.setEjemplares(sc.nextInt()); // cantidad total
            libro.setEjemplaresPrestados(0);// ejemplares prestados
            libro.setEjemplaresRestantes(libro.getEjemplares());// ejemplares disponibles para prestar
            libro.setAlta(true);
            libro.setAutor(autor); 
            libro.setEditorial(editorial);
            System.out.println("Libro cargado correctamente");
            LDAO.guardar(libro);
            return libro;
        } catch (Exception e) {
            System.out.println("Error:"+ e.toString());
            return null;
        }
    }
    
//    public void buscarISBN() throws Exception{  //otra forma - usa mas recursos
//        libros = LDAO.listarTodos();
//        System.out.println("Ingrese el codigo ISBN del libro");
//        long isbn = sc.nextLong();
//        int id;
//        String resp;
//        for (Libro libro : libros) {
//            if (libro.getIsbn().equals(isbn)) {
//                librosConsulta.add(libro);
//            }
//        }
//        System.out.println("Su consulta arrojo " + librosConsulta.size() + " resultado/s");
//        for (Libro libro : librosConsulta) {
//            System.out.println(libro.toString());
//        }
//    }
    
    public void buscarISBN() throws Exception{
        System.out.println("Ingrese el codigo ISBN del libro");
        long isbn = sc.nextLong();
        try {
            Libro libro = LDAO.buscarPorISBN(isbn);
            if (libro == null) {
                System.out.println("Libro no encontrado");
            } else {
                System.out.println(libro.toString());
            }
        } catch (RollbackException e1) {
            System.out.println("El codigo ISBN ya se encuentra registrado");
        } catch (Exception e) {
            throw e;
        } 
        
    }
    public void buscarTitulo() throws Exception{
        System.out.println("Ingrese el titulo del libro");
        String titulo = sc.next();
        try {
            libros = LDAO.buscarPorTitulo(titulo);
            System.out.println("Se encontraron " + libros.size() + " resultados");
            for (Libro libro : libros) {
                System.out.println(libro.toString());
            }
        } catch (Exception e) {
            throw e;
        } 
        
    }
    
    public void buscarAutor() throws Exception{
        System.out.println("Ingrese el nombre del autor del libro");
        String nombreAutor = sc.next();
        try {
            libros = LDAO.buscarPorAutor(nombreAutor);
            System.out.println("Se encontraron " + libros.size() + " resultados");
            for (Libro libro : libros) {
                System.out.println(libro.toString());
            }
        } catch (Exception e) {
            throw e;
        }  
    }
    public void buscarEditorial() throws Exception{
        System.out.println("Ingrese el nombre de la editorial del libro");
        String nombreEditorial = sc.next();
        try {
            libros = LDAO.buscarPorEditorial(nombreEditorial);
            System.out.println("Se encontraron " + libros.size() + " resultados");
            for (Libro libro : libros) {
                System.out.println(libro.toString());
            }
        } catch (Exception e) {
            throw e;
        }  
    }
    
    public void baja() throws Exception{
        try {
            System.out.println("Ingrese el ISBN del libro a eliminar");
            Long ISBN = sc.nextLong();
            Libro libro = LDAO.buscarPorISBN(ISBN); 
            if (libro == null) {
                System.out.println("No se encontro el Libro");
            } else {
                System.out.println("ISBN= "+libro.getIsbn()+", Titulo= "+libro.getTitulo()+".");
                System.out.println("Este es el libro? Si/No");
                String resp = sc.next();
                if (resp.equalsIgnoreCase("si")) {
                    libro.setAlta(false);  //no se elimina sino que se da de baja
                    LDAO.modificar(libro);
                } else {
                    System.out.println("No se encontro el libro");
                }
            }
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void modificarLibro() throws Exception{
        try {
            System.out.println("Ingrese el ISBN del libro a modificar");
            Long ISBN = sc.nextLong();
            Libro libro = LDAO.buscarPorISBN(ISBN); 
            if (libro == null) {
                System.out.println("No se encontro el Libro");
            } else {
                System.out.println("ISBN= "+libro.getIsbn()+", Titulo= "+libro.getTitulo()+".");
                System.out.println("Este es el libro? Si/No");
                String resp = sc.next();
                if (resp.equalsIgnoreCase("si")) {
                    System.out.println("modificar: \n1-Titulo \n2-Autor \n3-Editorial");
                    int opc = sc.nextInt();
                    while (opc<1 || opc>3) {                        
                        System.out.println("Opcion no valida. Intente nuevamente");
                        opc = sc.nextInt();
                    }
                    switch (opc) {
                        case 1:
                            modTitulo(libro);
                            break;
                        case 2:
                            modAutor(libro);
                            break;
                        case 3:
                            modEditorial(libro);
                            break;
                    }

                } else {
                    System.out.println("No se encontro el libro");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    private void modTitulo(Libro libro){
        System.out.println("Ingrese el titulo correcto");
        String titulo = sc.next();
        libro.setTitulo(titulo);
        LDAO.modificar(libro);
        System.out.println("Titulo modificado satisfactoriamente");
    }
    
    private void modAutor(Libro libro) throws Exception{
        try {
            libro.setAutor(AS.crearAutorControl());
            LDAO.modificar(libro);
            System.out.println("Autor modificado satisfactoriamente");
        } catch (Exception e) {
            throw e;
        }
        
     
    }
    private void modEditorial(Libro libro) throws Exception{

        Editorial editorial = ES.buscarNombre();
        if (editorial==null) {
            System.out.println("Error al cargar la editorial");
        } else {
            libro.setEditorial(editorial);
            LDAO.modificar(libro);
            System.out.println("Editorial modificado satisfactoriamente");
        }
    }

    public void mostrarLibros() throws Exception{
        libros = LDAO.listarTodos();
        for (Libro libro : libros) {
            if (libro.isAlta()) {
                System.out.println(libro.toString());
            }
        }
    }
    
}
