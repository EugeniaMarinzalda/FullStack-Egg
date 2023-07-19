/*
 Esta clase tiene la responsabilidad de llevar adelante las funcionalidades necesarias para
administrar editoriales (consulta, creación, modificación y eliminación)
 */
package libreria.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import libreria.entidades.Editorial;
import libreria.persistencia.EditorialDAO;

public class EditorialServicio {
    
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private EditorialDAO EDAO = new EditorialDAO ();
    private List<Editorial> editoriales = new ArrayList();
    
    public Editorial crearEditorial(){
        try {
            System.out.println("Ingrese el nombre del editorial");
            String nombre = sc.next();            
            while (nombre.isEmpty()) {                
                System.out.println("Nombre inválido. Intente nuevamente.");
                nombre=sc.next();
            }
            editoriales = EDAO.buscarxNombre(nombre);
            if (editoriales.size()==0) {
                Editorial editorial = new Editorial();
                editorial.setNombre(nombre);
                editorial.setAlta(true);
                System.out.println("Editorial cargada satisfactoriamente");
                EDAO.guardar(editorial);
                return editorial;
            } else if (editoriales.size()==1 ) {
                System.out.println(editoriales.get(0).getNombre()+ "");
                System.out.println("La editorial ya se encuentra cargada");
                return editoriales.get(0);
            } else {
                System.out.println("Existe mas de una editorial con ese nombre. Verifique antes de continuar");
                return null;
            }
        } catch (Exception e) {
            System.out.println("Error:"+e.getMessage());
            return null;
        }
    }
    
    public Editorial buscarNombre() throws Exception{
        try {
            System.out.println("Ingrese el nombre de la editorial");
            String nombre = sc.next();
            editoriales = EDAO.buscarxNombre(nombre); 
            for (Editorial editorial : editoriales) {
                System.out.println(editorial.toString());
            }
            if (editoriales.size()==1) {
                return editoriales.get(0);
            } else {
                return null;
            }
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
            return null;
        }

    }
    
    public void baja() throws Exception{
        try {
            System.out.println("Ingrese el id de la editorial que desea eliminar");
            int id = sc.nextInt();
            Editorial editorial = EDAO.buscarPorId(id);
            if (editorial==null) {
                System.out.println("Editorial no encontrada");
            } else {
                System.out.println("La editorial es: "+ editorial.getNombre() + " Si/NO?");
                String resp = sc.next();
                if (resp.equalsIgnoreCase("si")) {
                    editorial.setAlta(false);
                    EDAO.modificar(editorial);
                    System.out.println("La baja se realizo correctamente.");
                } else {               
                    System.out.println("Id incorrecto.");
                }
            } 
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }
    
    public void modificacion() throws Exception{
        System.out.println("Ingrese el id de la editorial a modificar");
        int id = sc.nextInt();
        Editorial editorial = EDAO.buscarPorId(id);
        if (editorial == null) {
            System.out.println("La editorial no existe");
        } else {
            System.out.println("El nombre es " + editorial.getNombre() + " Si/No?");
            String resp = sc.next();
            if (resp.equalsIgnoreCase("si")) {
                System.out.println("Ingrese el nombre correcto");
                String nombre = sc.next();
                editorial.setNombre(nombre);
                editorial.setAlta(true);
                EDAO.modificar(editorial);
            } else {
                System.out.println("Id incorrecto");
            }
        }
        
    }
    
    public void listar() throws Exception{
        editoriales = EDAO.listarTodos();
        for (Editorial editorial : editoriales) {
            if (editorial.isAlta()) {
                System.out.println("Id= "+ editorial.getId()+", Nombre= "+ editorial.getNombre()+";");
            }
        }
    }
}
