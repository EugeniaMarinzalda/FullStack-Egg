
package Estancia.entidades;

import java.time.LocalDate;


public class Casas {
    private int id_casa;
    private String calle;
    private int numero; 
    private String cod_postal;
    private String ciudad;
    private String pais;
    private LocalDate fecha_desde;
    private LocalDate fecha_hasta;
    private int tiempo_min;
    private int tiempo_max;
    private double precio_hab;
    private String tipo_vivienda;

    public Casas() {
    }

    public Casas(int id_casa, String calle, int numero, String cod_postal, String ciudad, String pais, LocalDate fecha_desde, LocalDate fecha_hasta, int tiempo_min, int tiempo_max, double precio_hab, String tipo_vivienda) {
        this.id_casa = id_casa;
        this.calle = calle;
        this.numero = numero;
        this.cod_postal = cod_postal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
        this.tiempo_min = tiempo_min;
        this.tiempo_max = tiempo_max;
        this.precio_hab = precio_hab;
        this.tipo_vivienda = tipo_vivienda;
    }

    public int getId_casa() {
        return id_casa;
    }

    public void setId_casa(int id_casa) {
        this.id_casa = id_casa;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCod_postal() {
        return cod_postal;
    }

    public void setCod_postal(String cod_postal) {
        this.cod_postal = cod_postal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public LocalDate getFecha_desde() {
        return fecha_desde;
    }

    public void setFecha_desde(LocalDate fecha_desde) {
        this.fecha_desde = fecha_desde;
    }

    public LocalDate getFecha_hasta() {
        return fecha_hasta;
    }

    public void setFecha_hasta(LocalDate fecha_hasta) {
        this.fecha_hasta = fecha_hasta;
    }

    public int getTiempo_min() {
        return tiempo_min;
    }

    public void setTiempo_min(int tiempo_min) {
        this.tiempo_min = tiempo_min;
    }

    public int getTiempo_max() {
        return tiempo_max;
    }

    public void setTiempo_max(int tiempo_max) {
        this.tiempo_max = tiempo_max;
    }

    public double getPrecio_hab() {
        return precio_hab;
    }

    public void setPrecio_hab(double precio_hab) {
        this.precio_hab = precio_hab;
    }

    public String getTipo_vivienda() {
        return tipo_vivienda;
    }

    public void setTipo_vivienda(String tipo_vivienda) {
        this.tipo_vivienda = tipo_vivienda;
    }
    
    
    
}
