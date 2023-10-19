
package com.example.demo.servicios;

import com.example.demo.entidades.Autor;
import com.example.demo.entidades.Editorial;
import com.example.demo.entidades.Libro;
import com.example.demo.excepciones.MiException;
import com.example.demo.repositorios.AutorRepositorio;
import com.example.demo.repositorios.EditorialRepositorio;
import com.example.demo.repositorios.LibroRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServicio {
    
    @Autowired
    private LibroRepositorio libroRepositorio;
    @Autowired
    private AutorRepositorio autorRepositorio;
    @Autowired
    private EditorialRepositorio editorialRepositorio;
    
    @Transactional
    public void crearLibro(Long isbn, String titulo, Integer Ejemplares, String idAutor, String idEditorial) throws MiException{
        
        validar(isbn, titulo, Ejemplares, idAutor, idEditorial);
        
        Autor autor= autorRepositorio.findById(idAutor).get();
        Editorial editorial = editorialRepositorio.findById(idEditorial).get();
        
        Libro libro = new Libro();
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setEjemplares(Ejemplares);
        
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        
        libroRepositorio.save(libro);
        
    }
    
    public List<Libro> listarLibros(){
        List<Libro> libros = new ArrayList();
        libros = libroRepositorio.findAll();
        return libros;
    }
    
    @Transactional
    public void modificarLibro (Long isbn, String titulo, String idAutor, String idEditorial, Integer ejemplares) throws MiException{
        
        validar(isbn, titulo, ejemplares, idAutor, idEditorial);
        
        Optional<Libro> respuesta = libroRepositorio.findById(isbn);
        Optional<Autor> respuestaAutor = autorRepositorio.findById(idAutor);
        Optional<Editorial> respuestaEditorial = editorialRepositorio.findById(idEditorial);
        
        Autor autor = new Autor();
        Editorial editorial = new Editorial();
        
        if(respuestaAutor.isPresent()){ // si esta presente, guarda la respuesta
            autor = respuestaAutor.get();
        }
        if(respuestaEditorial.isPresent()){
            editorial = respuestaEditorial.get();
        }
        
        if(respuesta.isPresent()){  // despues de que valido que esta, uso el libro y modifico los valores
            Libro libro = respuesta.get();
            libro.setTitulo(titulo);
            libro.setEjemplares(ejemplares);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            libroRepositorio.save(libro);
        }
    }
    
    private void validar(Long isbn, String titulo, Integer ejemplares , String idAutor, String idEditorial) throws MiException{
        if (isbn == null){
            throw new MiException("El ISBN no puede ser nulo");
        }
        if (titulo == null || titulo.isEmpty()){
            throw new MiException("El titulo no puede estar vacio o nulo");
        }
        if (ejemplares == null){
            throw new MiException("La cantidad de ejemplares no puede ser nulo");
        }
        if(idAutor.isEmpty() || idAutor == null){
            throw new MiException("El autor no puede ser nulo o estar vacio.");
        }
        if(idEditorial.isEmpty() || idAutor == null){
            throw new MiException("El editorial no puede ser nulo o estar vacio.");
        }
        
    }
}
