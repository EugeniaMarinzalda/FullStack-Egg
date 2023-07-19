
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Libro;


public class LibroDAO extends DAO <Libro>{
    
    @Override
    public void guardar(Libro libro) {
        super.guardar(libro);
    }

    public void eliminar(long isbn) throws Exception {
        Libro libro = buscarPorISBN(isbn);
        super.eliminar(libro);
    }

    public Libro buscarPorISBN(long isbn) throws Exception {
        conectar();
        Libro libro = em.find(Libro.class, isbn);
        desconectar();
        return libro;
    }
    public List<Libro> buscarPorTitulo(String titulo) throws Exception {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.titulo "
                + "LIKE :titulo1").setParameter("titulo1", titulo).getResultList();
        desconectar();
        return libros;
    }
    
    public List<Libro> buscarPorAutor(String nombreA) throws Exception {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l JOIN l.autor a WHERE a.nombre "
                + "LIKE :nombreA").setParameter("nombreA","%"+nombreA+"%").getResultList();
        desconectar();
        return libros;
    }
    public List<Libro> buscarPorEditorial(String nombreE) throws Exception {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l JOIN l.editorial e WHERE e.nombre "
                + "LIKE :nombreE").setParameter("nombreE","%"+nombreE+"%").getResultList();
        desconectar();
        return libros;
    }

    public List<Libro> listarTodos() throws Exception {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l")
                .getResultList();
        desconectar();
        return libros;
    }

    public void modificar(Libro libro){
        super.editar(libro);
    }
}
