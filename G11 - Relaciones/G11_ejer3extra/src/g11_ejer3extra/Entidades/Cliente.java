
package g11_ejer3extra.Entidades;

/**
 *  Gestión Integral de clientes. En este módulo vamos a registrar la información personal de
cada cliente que posea pólizas en nuestra empresa. Nombre y apellido, documento, mail,
domicilio, teléfono.
 */
public class Cliente {
    private String nombre, apellido, documento, correo, domicilio, telefono;

    public Cliente(String nombre, String apellido, String documento, String correo, String domicilio, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.correo = correo;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", correo=" + correo + ", domicilio=" + domicilio + ", telefono=" + telefono + '}';
    }
    
}
