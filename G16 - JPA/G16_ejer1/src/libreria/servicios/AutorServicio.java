/*
Esta clase tiene la responsabilidad de llevar adelante las funcionalidades necesarias para
administrar autores (consulta, creación, modificación y eliminación).
1-Búsqueda de un Autor por nombre"
*/
package libreria.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;


public class AutorServicio {
    
    private final Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private List<Autor> autores = new ArrayList();
    AutorDAO ADAO = new AutorDAO();
    
    public Autor crearAutor(String nombre) throws Exception{ // crear el autor con nombre por parametro
        Autor autor = new Autor();
        try {
            autor.setNombre(nombre);
            autor.setAlta(true); 
            ADAO.guardar(autor);
            System.out.println("Se ha creado el autor correctamente");
            return autor;
        } catch (Exception e) {
            System.out.println("Error:"+e.getMessage());
            return null;
        }
    }
    
    public Autor crearAutorControl() throws Exception{ // pide el nombre, valida el autor y responde
        System.out.println("Ingrese el nombre del autor");
        Autor autor;
        String nombre = sc.next();
        autores = ADAO.buscarPorNombre(nombre);
        if (autores.size()==1) {
            System.out.println("El autor es " + autores.get(0).getNombre()+ " ? si/no");
            String resp = sc.next();
            if (resp.equalsIgnoreCase("si")) {
                autor = autores.get(0);
                if (autor.isAlta()==false) {
                    autor.setAlta(true);
                    ADAO.modificar(autor);
                    System.out.println("Autor dado de alta");
                }
                return autor;
            } else {
                autor = crearAutor(nombre);
                return autor;
            }
        } else if (autores.size()>1) {
            System.out.println("Existe más de un autor con ese nombre. "
                    + "Deberá comprobar dichos nombres. ");
            return null;
        } else if (autores.size()==0){
            return crearAutor(nombre); 
        } else {
            return null;
        }
    }
    
    public Autor buscarxNombre() throws Exception{ //devuelve una lista
        System.out.println("Ingresa el nombre del autor");
        String nombre = sc.next();
        autores = ADAO.buscarPorNombre(nombre);
        //System.out.println("Su consulta arrojo " + autores.size() + " resultado/s");
        for (Autor autor : autores) {
            if (autor.isAlta()) {
                System.out.println("Id= "+autor.getId()+", Nombre= "+autor.getNombre()+".");
                return autor;
            }
        }
        if (autores.size()==0) {
            System.out.println("No se encontro el autor");
            return null;
        } else if (autores.size()==1) {
            return autores.get(0);
        } else {
            return null;
        }
    }
    
    public Autor buscarxId() throws Exception{ // solo un autor por llave primaria
        System.out.println("Ingresa el Id del autor");
        int id = sc.nextInt();
        Autor autor = ADAO.buscarPorId(id);
        if (autor.isAlta()) {
            System.out.println("Id autor= "+autor.getId()+", Nombre= "+autor.getNombre()+".");
            return autor;
        } else {
            System.out.println("El autor se ha eliminado anteriormente.");
            return null;
        }
    }

//    public Autor buscar() throws Exception{  //no se usa
//        Autor autor = null;
//        int choice;
//        do {
//            System.out.println("1-Por nombre");
//            System.out.println("2-Por id");
//            System.out.println("3-Salir");
//            choice = sc.nextInt();
//            while (choice < 1 || choice > 3) {
//                System.out.println("El valor ingresado no corresponde a ninguna opción, intente nuevamente");
//                choice = sc.nextInt();
//            }
//            switch (choice) {
//                case 1:
//                    buscarxNombre();
//                    break;
//                case 2:
//                    buscarxId();
//                    break;
//            }
//        } while (autor == null || choice==3);
//        return autor;
//    }
    
    public void modificarAutor() throws Exception{
        try {
            System.out.println("Ingrese el id del autor a modificar");
            int id = sc.nextInt();
            Autor autor = ADAO.buscarPorId(id); 
            System.out.println("Id= "+autor.getId()+", Nombre= "+autor.getNombre()+".");
            System.out.println("Este es el autor? Si/No");
            String resp = sc.next();
            if (resp.equalsIgnoreCase("si")) {
                System.out.println("Ingrese el nuevo nombre");
                autor.setNombre(sc.next());
                ADAO.modificar(autor);
            } else {
                System.out.println("No se encontro el autor");
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminarAutor() throws Exception{
        try {
            System.out.println("Ingrese el id del autor a eliminar");
            int id = sc.nextInt();
            Autor autor = ADAO.buscarPorId(id); 
            System.out.println("Id= "+autor.getId()+", Nombre= "+autor.getNombre()+".");
            System.out.println("Este es el autor? Si/No");
            String resp = sc.next();
            if (resp.equalsIgnoreCase("si")) {
                autor.setAlta(false);  //no se elimina sino que se da de baja
                ADAO.modificar(autor);
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void mostrarAutores() throws Exception{
        try {
            autores = ADAO.listarTodos();
            for (Autor autor : autores) {
                System.out.println("Id autor= "+autor.getId()+", Nombre= "+autor.getNombre()+".");
            } 
        } catch (Exception e) {
            throw e;
        }
    }
}
