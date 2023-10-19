
package com.egg.biblio.repositorios;

import com.egg.biblio.entidades.Libro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepositorio extends JpaRepository<Libro,Long>{
    
    @Query ("SELECT l FROM Libro l WHERE l.titulo= :titulo")
    public Libro buscarxTitulo(@Param("titulo") String titulo);
    
    @Query ("SELECT l FROM Libro l WHERE l.autor.nombre= :nombre")
    public List<Libro> buscarxAutor(@Param("nombre") String nombre);
}
