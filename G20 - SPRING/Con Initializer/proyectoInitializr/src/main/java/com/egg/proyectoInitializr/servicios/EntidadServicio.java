package com.egg.proyectoInitializr.servicios;

import com.egg.proyectoInitializr.entidades.Entidad;
import com.egg.proyectoInitializr.enums.Rol;
import com.egg.proyectoInitializr.repositorios.EntidadRepositorio;
import java.util.Date;
import javax.transaction.Transactional;

@Service
public class EntidadServicio {

    @Autowired
    private EntidadRepositorio entidadRepositorio;

    @Transactional()
    public Entidad guardar(String nombre, int edad, Rol rol) {
        Entidad entidad = new Entidad();
        entidad.setNombre(nombre);
        entidad.setEdad(edad);
        entidad.setRol(rol);
        entidad.setFecha(new Date());
        return entidadRepositorio.save(entidad);

    }

}
