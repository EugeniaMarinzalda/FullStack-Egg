
package Estancia.servicio;

import Estancia.entidades.Estancias;
import Estancia.persistencia.EstanciasDAO;
import java.util.Collection;


public class EstanciaServicio {
    EstanciasDAO e1 = new EstanciasDAO();
    
    public Collection<Estancias> listarEstancias() throws Exception{
        try {
           
            Collection<Estancias> estanciaList = e1.listarEstancias();
            return estanciaList;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void imprimirEstancias() throws Exception {
        try {
            Collection<Estancias> estanciaList = listarEstancias();
            if (estanciaList.isEmpty()) {
                throw new Exception("No existen Estancias para imprimir");
            } else {
                for (Estancias aux : estanciaList) {
                    System.out.println(aux.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
        
    }
            
}
