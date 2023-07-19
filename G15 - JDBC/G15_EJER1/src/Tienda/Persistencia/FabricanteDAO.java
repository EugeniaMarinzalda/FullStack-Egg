
package Tienda.Persistencia;

import Tienda.Entidades.Fabricante;
import java.util.ArrayList;

public final class FabricanteDAO extends DAO{
    
    public void guardarFabricante (Fabricante fab) throws Exception{
        try {
            if (fab == null) {
                throw new Exception("Debe indicar el fabricante");
            }
            
            String sql = "INSERT INTO fabricante (nombre) "
                    + "VALUES ( '" + fab.getNombre() + "' );";

            //System.out.println(sql);
            System.out.println("Fabricante agregado exitosamente");
            insertarModificarEliminar(sql); // tiene conectar y desconectar
        } catch (Exception e) {
            desconectarBase();
            throw e;
        } 
    }
    
    public void modificarxID (Fabricante fab) throws Exception {
        try {
            if (fab == null) {
                throw new Exception("Debe indicar el Fabricante que desea modificar");
            }
            String sql = "UPDATE fabricante SET "
                    + " nombre = '" + fab.getNombre() +"'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            desconectarBase();
            throw e;
        } 
    }
    
    public void eliminarxID (int id) throws Exception {
        try {
            String sql = "DELETE FROM fabricante WHERE codigo = " + id + "";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            desconectarBase();
            throw e;
        } 
    }
    
    public Fabricante buscarFabricantePorId(int id) throws Exception {
        try {
            String sql = "SELECT * FROM fabricante WHERE codigo = " + id + "";
            consultarBase(sql);
            Fabricante fab = null;
            while (resultado.next()) {
                fab = new Fabricante();
                fab.setCodigo(resultado.getInt("codigo"));
                fab.setNombre(resultado.getString("nombre"));
                
            }
            return fab;
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    // Consulta con SQL desde main
    
      public ArrayList<Fabricante> listarSQL(String sql) throws Exception {
        try {
            consultarBase(sql);
            Fabricante fab = null;
            ArrayList<Fabricante> fabricantes = new ArrayList();
            while (resultado.next()) {
                fab = new Fabricante();
                try {
                    fab.setCodigo(resultado.getInt("codigo"));
                } catch (Exception e) {
                }
                try {
                    fab.setNombre(resultado.getString("nombre"));
                } catch (Exception e) {
                }
                fabricantes.add(fab);
            }
            desconectarBase();
            return fabricantes;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            desconectarBase();
        }
    }
}
