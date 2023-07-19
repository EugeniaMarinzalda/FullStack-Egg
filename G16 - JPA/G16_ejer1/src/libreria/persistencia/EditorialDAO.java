
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Editorial;


public class EditorialDAO extends DAO <Editorial>{
    
    @Override
    public void guardar(Editorial editorial) {
        super.guardar(editorial);
    }

    public void eliminar(int id) throws Exception {
        Editorial editorial = buscarPorId(id);
        super.eliminar(editorial);
    }
    
    public void modificar(Editorial editorial){
        super.editar(editorial);
    }

    public Editorial buscarPorId(int id) throws Exception {
        conectar();
        Editorial editorial = em.find(Editorial.class, id);
        desconectar();
        return editorial;
    }

    public List<Editorial> listarTodos() throws Exception {
        conectar();
        List<Editorial> editoriales = em.createQuery("SELECT e FROM Editorial e")
                .getResultList();
        desconectar();
        return editoriales;
    }
    public List<Editorial> buscarxNombre(String nombre) throws Exception {
        conectar();
        List<Editorial> editoriales = em.createQuery("SELECT e FROM Editorial e "
                + "WHERE e.nombre LIKE :nombre").setParameter("nombre","%"+nombre+
                        "%").getResultList();
        desconectar();
        return editoriales;
    }
}
