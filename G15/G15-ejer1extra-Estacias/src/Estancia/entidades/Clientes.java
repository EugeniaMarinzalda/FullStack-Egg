
package Estancia.entidades;


public class Clientes {
    private int id_cliente;
    private String nombre;
    private String calle;
    private int numero;
    private String cod_postal;
    private String ciudad;
    private String pais;
    private String email;

    public Clientes() {
    }

    public Clientes(int id_cliente, String nombre, String calle, int numero, String cod_postal, String ciudad, String pais, String email) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.calle = calle;
        this.numero = numero;
        this.cod_postal = cod_postal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.email = email;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
