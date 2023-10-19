package com.egg.proyectoInitializr.entidades;

import com.egg.proyectoInitializr.enums.Rol;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Entidad {

    @Id
    @GeneratedValue(generator = "uuid") //GENERAR UN ID DE MANERA AUTOMATICA // La estrategia de generación generator="uuid" crea un valor String alfanumérico aleatorio.
    //generar un id tipo de dato numérico y autoincremental, podemos utilzar la
    //anotación @GeneratedValue(strategy = GenerationType.IDENTITY).
    private String id;
    private String nombre;
    private Integer edad;
//@Temporal nos permite mapear las fechas con la base de datos de una forma simple.
    @Temporal(TemporalType.DATE)
    private Date fecha;
//@Temporal nos permite mapear las fechas con la base de datos de una forma simple.
    @Enumerated(EnumType.STRING)
    private Rol rol;

    public Entidad(String id, String nombre, Integer edad, Date fecha, Rol rol) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.fecha = fecha;
        this.rol = rol;
    }

    public Entidad() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    
}
