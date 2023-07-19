
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Autor;


public final class AutorDAO extends DAO <Autor>{
    
    @Override
    public void guardar(Autor autor) {
        super.guardar(autor);
    }

    public void eliminar(int id) throws Exception {
        Autor autor = buscarPorId(id);
        super.eliminar(autor);
    }

    public Autor buscarPorId(int id) throws Exception {
        conectar();
        //Autor autor = (Autor) em.find(Autor.class, id); // otra opción
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.id = :id").setParameter("id", id).getSingleResult();
        desconectar();
        return autor;
    }

     public List buscarPorNombre(String nombre) {
       conectar();
       List <Autor> autores = em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE '%" + nombre + "%'").getResultList();
       desconectar();
       return autores;
    }
    
    public List<Autor> listarTodos() throws Exception {
        conectar();
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a")
                .getResultList();
        desconectar();
        return autores;
    }
    
    public void modificar(Autor autor){
        super.editar(autor);
    }

}
