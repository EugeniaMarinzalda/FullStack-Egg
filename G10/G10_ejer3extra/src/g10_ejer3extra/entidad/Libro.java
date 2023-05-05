
package g10_ejer3extra.entidad;

import java.util.Objects;

/*
Para ello, se debe crear una clase llamada Libro que guarde la
información de cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
*/
public class Libro {
    private String Titulo;
    private String Autor;
    private Integer Cantidad;
    private Integer Prestados;

    public Libro() {
    }

    public Libro(String Titulo, String Autor, Integer Cantidad, Integer Prestados) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Cantidad = Cantidad;
        this.Prestados = Prestados;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public Integer getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Integer Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Integer getPrestados() {
        return Prestados;
    }

    public void setPrestados(Integer Prestados) {
        this.Prestados = Prestados;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.Titulo);
        hash = 29 * hash + Objects.hashCode(this.Autor);
        hash = 29 * hash + Objects.hashCode(this.Cantidad);
        hash = 29 * hash + Objects.hashCode(this.Prestados);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.Titulo, other.Titulo)) {
            return false;
        }
        if (!Objects.equals(this.Autor, other.Autor)) {
            return false;
        }
        if (!Objects.equals(this.Cantidad, other.Cantidad)) {
            return false;
        }
        if (!Objects.equals(this.Prestados, other.Prestados)) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "Libro{" + "Titulo=" + Titulo + ", Autor=" + Autor + ", Cantidad=" + Cantidad + ", Prestados=" + Prestados + '}';
    }
    
}
