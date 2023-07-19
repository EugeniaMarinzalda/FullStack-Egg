
package g10_ejer3extra;

import g10_ejer3extra.entidad.Libro;
import java.util.HashSet;
import java.util.Scanner;

/*
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
sus datos y los seteandolos en el Libro.
Despues, ese Libro se guarda en el conjunto y
se le pregunta al usuario si quiere crear otro Libro o no.

La clase Librería contendrá además los siguientes métodos:
• Constructor por defecto.
• Constructor con parámetros.
• Métodos Setters/getters




*/
public class G10_ejer3extra {
    private static HashSet <Libro> conjLibro = new HashSet();
    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {
        boolean flat = true;
        do {
            System.out.println("Menu \n1-Cargar Libro \n2-Prestar Libro \n3-Devolver Libro \n4-Mostrar libros \n5-Salir");
            int opc = leer.nextInt();
            switch (opc) {
                case 1:
                    crearLibro();
                    break;
                case 2:
                    prestamo();
                    break;
                case 3:
                    devolucion();
                    break;
                case 4:
                    mostrar();
                    break;
                case 5:
                    System.out.println("Gracias por utilizar el servicio");
                    flat = false;
                    break;
                default:
                    throw new AssertionError();
            }
            
        } while (flat);
        
    }
    public static void crearLibro(){
        String opc = "";
        do{
           Libro l = new Libro ();
            System.out.println("Ingrese el titulo del libro: ");
            l.setTitulo(leer.next());
            System.out.println("Ingrese el autor del libro: ");
            l.setAutor(leer.next());
            System.out.println("Ingrese la cantidad de ejemplares del libro: ");
            l.setCantidad(leer.nextInt());
            System.out.println("Ingrese la cantidad de ejemplares prestados ");
            int Prestados = leer.nextInt();
            l.setPrestados(Prestados);
            conjLibro.add(l);
            System.out.println("Desea agregar otro libro. Si para continuar");
            opc = leer.next();
            
        }  while (opc.equalsIgnoreCase("si"));
    }
    /*
    • Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
método. El método se incrementa de a uno, como un carrito de compras, el
atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
que no queden ejemplares disponibles para prestar. Devuelve true si se ha
podido realizar la operación y false en caso contrario.
    */
    public static boolean prestamo(){
        System.out.println("Ingrese el nombre del titulo que desea prestar");
        String nomBuscar = leer.next();
        for (Libro aux : conjLibro) {
            if (aux.getTitulo().equals(nomBuscar) && (aux.getCantidad()>aux.getPrestados())) {
                aux.setPrestados(aux.getPrestados()+1);
                System.out.println("Se presto el libro. Quedan " + (aux.getCantidad()-aux.getPrestados()) + " libros en stock");
                return true;
            }
        }
        System.out.println("No se pudo prestar el libro");
        return false;
    }
    /*
    • Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
El método decrementa de a uno, como un carrito de compras, el atributo
ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
vez que se produzca la devolución de un libro. No se podrán devolver libros
donde que no tengan ejemplares prestados. Devuelve true si se ha podido
realizar la operación y false en caso contrario.
    */
    public static boolean devolucion(){
        System.out.println("Ingrese el titulo del nombre que desea devolver");
        String nombre = leer.next();
        for (Libro aux : conjLibro) {
            if (aux.getTitulo().equalsIgnoreCase(nombre) && (0<aux.getPrestados())) {
                aux.setPrestados(aux.getPrestados()-1);
                System.out.println("El libro fue devuelto correctamente. Hay en stock " + (aux.getCantidad()-aux.getPrestados()) + " libros");
                return true;
            }
        }
        System.out.println("No se pudo devolver el libro");
        return false;
    }
    /*
    • Método toString para mostrar los datos de los libros.
    */
    public static void mostrar(){
        System.out.println("Los libros en stock son:");
        System.out.print(conjLibro.toString());
        /*
        System.out.println("---------------");
        System.out.println("Lista de libros");
        int i=1;
        for(Libro lib: libreria ){
            System.out.println("\t " + i + " " + lib);
            i++;
        }
        */
    }
}

/*
  a  Todos
System.out.println("---------------");
        System.out.println("Lista de libros");
        int i=1;
        for(Libro lib: libreria ){
            System.out.println("\t " + i + " " + lib);
            i++;
        }
public class LibroServicio {
    private HashSet<Libro> libreria= new HashSet();
    private final Scanner leer= new Scanner(System.in).useDelimiter("\n"); 
    
    public void crearLibro(){
        String respuesta;
        do{
            System.out.println("Ingrese titulo del libro");
            String titulo= leer.next();
            System.out.println("Ingrese autor");
            String autor= leer.next();
            System.out.println("Ingrese numero de ejemplares disponibles");
            int ejemplares= leer.nextInt();
             
            libreria.add(new Libro(titulo,autor,ejemplares));
            
            System.out.println("¿Desea seguir agregando? - si/no");
            respuesta= leer.next();
            
        }while(respuesta.equalsIgnoreCase("si"));


    }
    public void mostrar(){
        System.out.println("---------------");
        System.out.println("Lista de libros");
        int i=1;
        for(Libro lib: libreria ){
            System.out.println("\t " + i + " " + lib);
            i++;
        }
    }
    
    public boolean prestamo(){
        System.out.println("Ingrese el titulo del libro que necesita");
        String libro= leer.next();
        
        for(Libro lib: libreria){
            if(libro.equalsIgnoreCase(lib.getTitulo())){
                
               if(lib.getNejemplares()>0){
                   lib.setNejemplares(lib.getNejemplares()-1);
                   lib.setNprestados(lib.getNprestados()+1);
                   
                   return true;
                   
                   
               }else{
                   return false;
               }
                
            } 
            
        }
            
       
         return false;
        
        
        
        
       
    }
    
   public boolean devolucion(){
       System.out.println("¿Qué libro desea devolver?");
       String libro= leer.next();
       
        for(Libro lib: libreria){
            if(libro.equalsIgnoreCase(lib.getTitulo())){
                
               if(lib.getNprestados()>0){
                   lib.setNejemplares(lib.getNejemplares()+1);
                   lib.setNprestados(lib.getNprestados()-1);
                   
                   return true;
                   
                   
               }else{
                   return false;
               }
                
            } 
       
       
        }
       
       
       
       
    return false;
    
   }
   }

ENTIDAD 
public class Libro {
    private String titulo, autor;
    private int nejemplares, nprestados;

    public Libro(String titulo, String autor, int nejemplares, int nprestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.nejemplares = nejemplares;
        this.nprestados = nprestados;
    }

    public Libro(String titulo, String autor, int nejemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.nejemplares = nejemplares;
    }


    public Libro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNejemplares() {
        return nejemplares;
    }

    public void setNejemplares(int nejemplares) {
        this.nejemplares = nejemplares;
    }

    public int getNprestados() {
        return nprestados;
    }

    public void setNprestados(int nprestados) {
        this.nprestados = nprestados;
    }
    
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", nejemplares=" + nejemplares + ", nprestados=" + nprestados + '}';
    }
}
SERVICIO
LibroServicio ls= new LibroServicio();
       ls.crearLibro();
       // System.out.println(ls.prestamo());
        if(ls.prestamo()){
            System.out.println("Se ha prestado un ejemplar");
        }else{
            System.out.println("No queda stock del libro");
        }
        ls.mostrar();
        
        System.out.println( ls.devolucion());
      
        ls.mostrar();
*/