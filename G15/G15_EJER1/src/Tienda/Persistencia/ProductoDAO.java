
package Tienda.Persistencia;

import Tienda.Entidades.Producto;
import java.util.ArrayList;

public final class ProductoDAO extends DAO {
    
    public void guardarProducto (Producto prod) throws Exception{
        try {
            if (prod == null) {
                throw new Exception("Debe indicar el producto");
            }
            
            String sql = "INSERT INTO Producto (nombre, precio, codigo_fabricante) "
                    + "VALUES ( '" + prod.getNombre() + "' , " + prod.getPrecio() + " ," + prod.getCodigoFabricante() + " );";

            //System.out.println(sql);
            System.out.println("Producto agregado exitosamente");
            insertarModificarEliminar(sql); // tiene conectar y desconectar
        } catch (Exception e) {
            desconectarBase();
            throw e;
        } 
    }
    
    public void modificarxID (Producto prod) throws Exception {
        try {
            if (prod == null) {
                throw new Exception("Debe indicar el producto que desea modificar");
            }
            String sql = "UPDATE producto SET "
                    + " nombre = '" + prod.getNombre() + "' , precio = " + prod.getPrecio() + " , codigo_fabricante = " + prod.getCodigoFabricante()
                    + " WHERE codigo = '" + prod.getCodigo() + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            desconectarBase();
            throw e;
        } 
    }
    
    public void eliminarxID (int id) throws Exception {
        try {
            String sql = "DELETE FROM producto WHERE codigo = " + id + "";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            desconectarBase();
            throw e;
        } 
    }
    
    public Producto buscarProductoPorId(int id) throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE codigo = " + id + "";
            consultarBase(sql);
            Producto prod = null;
            while (resultado.next()) {
                prod = new Producto();
                prod.setCodigo(resultado.getInt(1));
                prod.setNombre(resultado.getString(2));
                prod.setPrecio(resultado.getDouble(3));
                prod.setCodigoFabricante(resultado.getInt(4));
            }
            return prod;
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    // a) Lista el nombre de todos los productos que hay en la tabla producto.
    public ArrayList<Producto> listarProd() throws Exception {
        try {
            String sql = "SELECT * FROM producto ";
            consultarBase(sql);
            Producto prod = null;
            ArrayList<Producto> productos = new ArrayList();
            while (resultado.next()) {
                prod = new Producto();
                prod.setCodigo(resultado.getInt(1));
                prod.setNombre(resultado.getString(2));
                prod.setPrecio(resultado.getDouble(3));
                prod.setCodigoFabricante(resultado.getInt(4));
                productos.add(prod);
            }
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    // b) Lista los nombres y los precios de todos los productos de la tabla producto.
    
    public ArrayList<Producto> listarNombyPrec() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto ";
            consultarBase(sql);
            Producto prod = null;
            ArrayList<Producto> productos = new ArrayList();
            while (resultado.next()) {
                prod = new Producto();
                prod.setNombre(resultado.getString(1));
                prod.setPrecio(resultado.getDouble(2));
                productos.add(prod);
            }
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    // Consulta con SQL desde main
    
      public ArrayList<Producto> listarSQL(String sql) throws Exception {
        try {
            consultarBase(sql);
            Producto prod = null;
            ArrayList<Producto> productos = new ArrayList();
            while (resultado.next()) {
                prod = new Producto();
                try {
                    prod.setCodigo(resultado.getInt("codigo"));
                } catch (Exception e) {
                }
                try {
                    prod.setNombre(resultado.getString("nombre"));
                } catch (Exception e) {
                }
                try {
                    prod.setPrecio(resultado.getDouble("precio"));
                } catch (Exception e) {
                }
                try {
                    prod.setCodigoFabricante(resultado.getInt("codigo_fabricante"));
                } catch (Exception e) {
                }
                productos.add(prod);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            desconectarBase();
        }
    }
}
