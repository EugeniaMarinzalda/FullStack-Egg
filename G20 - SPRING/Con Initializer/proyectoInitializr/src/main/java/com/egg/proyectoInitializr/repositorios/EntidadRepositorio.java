
package com.egg.proyectoInitializr.repositorios;

import com.egg.proyectoInitializr.entidades.Entidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface EntidadRepositorio extends JpaRepository<Entidad, String> {
    @Query("SELECT e FROM Entidad e WHERE e.nombre = :nombre")
    public Entidad buscarxNombre(@Param("nombre")String nombre);
}//qury personalizada
