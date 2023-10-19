
package com.egg.biblio.servicios;

import com.egg.biblio.entidades.Imagen;
import com.egg.biblio.exceptions.MiException;
import com.egg.biblio.repositorios.ImagenRepositorio;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImagenServicio {
    @Autowired
    private ImagenRepositorio imagenRepo;
    
    public Imagen guardar(MultipartFile archivo) throws MiException{
        if(archivo != null){
            try {
                Imagen imagen = new Imagen();
                imagen.setMime(archivo.getContentType());
                imagen.setNombre(archivo.getName());
                imagen.setContenido(archivo.getBytes());
                return imagenRepo.save(imagen);
            } catch (Exception e) {
                System.err.println(e.getMessage()); 
            }
        }
        return null;   
    }
    
      public Imagen actualizar(String idImagen,MultipartFile archivo) throws MiException{    
          if(archivo != null){
            try {
                Imagen imagen = new Imagen();
                if(idImagen != null){
                    Optional <Imagen> respuesta = imagenRepo.findById(idImagen);
                    if(respuesta.isPresent()){
                        imagen = respuesta.get();
                    }
                }
                imagen.setMime(archivo.getContentType());
                imagen.setNombre(archivo.getName());
                imagen.setContenido(archivo.getBytes());
                return imagenRepo.save(imagen);
            } catch (Exception e) {
                System.err.println(e.getMessage()); 
            }
        }
        return null;  
      }  
}
