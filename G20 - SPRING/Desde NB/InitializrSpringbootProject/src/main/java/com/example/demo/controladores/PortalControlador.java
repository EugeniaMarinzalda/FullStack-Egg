
package com.example.demo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")  //este controlador va a escuchar los movimientos despues de la /
public class PortalControlador {
    
    @GetMapping("/")//mapea la url cuando se haya ingresado la barra
    public String index(){ //metodo que se ejecuta cuando se habre la aplicacion
        return "index.html"; // muestra la pagina
    }
    
    
}
