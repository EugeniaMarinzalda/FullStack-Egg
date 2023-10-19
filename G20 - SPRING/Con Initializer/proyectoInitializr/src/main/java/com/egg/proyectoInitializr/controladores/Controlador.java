
package com.egg.proyectoInitializr.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/proyectoInitializr")
public class Controlador {
    
    @GetMapping("/home")
    public String home(){
     return "index.html";   
    }
    
 
}
