
package Tienda.Servicios;

import Tienda.Entidades.Fabricante;
import Tienda.Persistencia.FabricanteDAO;
import java.util.ArrayList;
import java.util.Scanner;

public class FabricanteServicio {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Fabricante> fabricantes = new ArrayList();
    private FabricanteDAO fabDAO = new FabricanteDAO();
    
    public void imprimirSQL(String sql) throws Exception{
        try {
            fabricantes = fabDAO.listarSQL(sql);
            if (fabricantes.isEmpty()) {
                throw new Exception("No hay fabricantes en la lista");
            } else {
                for (Fabricante aux : fabricantes) {
                    if (aux.getCodigo()!=0) {
                        System.out.print("||Codigo:" + aux.getCodigo()+ "||");
                    }
                    if (aux.getNombre()!=null) {
                        System.out.print("||Nombre: " + aux.getNombre()+ "||");
                    }
                    System.out.println("");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
     
    public Fabricante datos(){
        
        System.out.println("Ingrese el nombre del fabricante");
        String nombre = sc.next();
        return new Fabricante(nombre);
    } 
     
    public void agregarFabricante () throws Exception{
        Fabricante prod = datos();
        try {
           fabDAO.guardarFabricante(prod); 
        } catch (Exception e) {
            throw e;
        }
    } 
    
    public ArrayList<Fabricante> codFab () throws Exception{
        try {
            String sql = "SELECT codigo FROM fabricante";
            fabricantes = fabDAO.listarSQL(sql);
            return fabricantes;
        } catch (Exception e) {
            throw e; 
        }
    }
}
