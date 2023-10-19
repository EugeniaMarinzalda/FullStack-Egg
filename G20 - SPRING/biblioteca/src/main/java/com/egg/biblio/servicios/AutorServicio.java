package com.egg.biblio.servicios;

import com.egg.biblio.entidades.Autor;
import com.egg.biblio.exceptions.MiException;
import com.egg.biblio.repositorios.AutorRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AutorServicio {

    @Autowired
    AutorRepositorio autorRepositorio;

    @Transactional
    public void crearAutor(String nombre) throws MiException {
        validarNombre(nombre);
        Autor autor = new Autor();
        autor.setNombre(nombre);
        autorRepositorio.save(autor);
    }

    public List<Autor> listarAutores() {
        List<Autor> autores = new ArrayList();
        autores = autorRepositorio.findAll();
        return autores;
    }

    @Transactional
    public void modificarAutor(String id, String nombre) throws MiException {
        validarNombre(nombre);
        Optional<Autor> respuesta = autorRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Autor autor = respuesta.get();
            autor.setNombre(nombre);
            autorRepositorio.save(autor);
        }

    }
    public void validarNombre(String nombre) throws MiException{
        if(nombre.isEmpty() || nombre == null ){
            throw new MiException("El nombre del autor no puede estar vacio o ser nulo");
        }
    }
    public Autor getOne(String id){
        
        return autorRepositorio.getOne(id);
    }
}
