
package com.egg.biblio.servicios;

import com.egg.biblio.entidades.Autor;
import com.egg.biblio.entidades.Editorial;
import com.egg.biblio.entidades.Libro;
import com.egg.biblio.exceptions.MiException;
import com.egg.biblio.repositorios.AutorRepositorio;
import com.egg.biblio.repositorios.EditorialRepositorio;
import com.egg.biblio.repositorios.LibroRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LibroServicio {
    
    @Autowired
    private LibroRepositorio libroRepositorio;
    @Autowired
    private AutorRepositorio autorRepositorio;
    @Autowired
    private EditorialRepositorio editorialRepositorio;
    
    @Transactional
    public void crearLibro(Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial) throws MiException{
        
        validar(isbn, titulo, ejemplares, idAutor, idEditorial);
       
        Autor autor = autorRepositorio.findById(idAutor).get();
        Editorial editorial = editorialRepositorio.findById(idEditorial).get();
        
        Libro libro = new Libro();
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setEjemplares(ejemplares);
        
        libro.setAlta(new Date());
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        
        libroRepositorio.save(libro);
    }
    
    public List<Libro>listarLibros(){
        List<Libro> libros = new ArrayList();
        libros = libroRepositorio.findAll();
        return libros;
    }
    
    @Transactional
    public void modificarLibro(Long isbn, String titulo, Integer ejemplares, Date alta, String idAutor, String idEditorial) throws MiException{
      
        validar(isbn, titulo, ejemplares,idAutor, idEditorial);
        
        Optional<Libro> respuesta = libroRepositorio.findById(isbn);
        Optional<Autor> respuestaAutor = autorRepositorio.findById(idAutor);
        Optional<Editorial> respuestaEditorial = editorialRepositorio.findById(idEditorial);
       
        Autor autor = new Autor();
        Editorial editorial = new Editorial();
        
        if(respuesta.isPresent()){
            Libro libro = respuesta.get();
            libro.setTitulo(titulo);
        }
        if(respuestaAutor.isPresent()){
            autor = respuestaAutor.get();
           
        }
        if(respuestaEditorial.isPresent()){
            editorial = respuestaEditorial.get();
           
        }
        if(respuesta.isPresent()){
            Libro libro = respuesta.get();
            libro.setTitulo(titulo);
            libro.setEjemplares(ejemplares);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            libroRepositorio.save(libro);
        }
    }
    
    public void validar(Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial) throws MiException{
        if(isbn == null){
            throw new MiException("El ISBN no puede ser nulo");
        }
        if(titulo == null || titulo.isEmpty()){
            throw new MiException("El titulo no puede estar vacio o ser nulo");
        }
        if(ejemplares == null || ejemplares == 0 ){
            throw new MiException("Los ejemplares no puede ser nulos");
        }
        if(idAutor == null || idAutor.isEmpty()){
            throw new MiException("El id del autor no puede estar vacio o ser nulo");
        }
        if( idEditorial == null || idEditorial.isEmpty() ){
            throw new MiException("El id de la editorial no puede estar vacio o ser nulo");
        }
    }
 public Libro getOne(Long isbn){
        
        return libroRepositorio.getOne(isbn);
    }
}
