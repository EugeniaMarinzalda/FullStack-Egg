
package Estancia.persistencia;

import Estancia.entidades.Estancias;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

public final class EstanciasDAO extends DAO {
    
    public void agregarEstancia(Estancias estancia) throws Exception{
        try {
            
            if (estancia==null) {
                throw new Exception ("Dato inválido");
            }
            String sql = "INSERT INTO estancias VALUES (" + estancia.getId_estancia() + "," + estancia.getId_cliente() + "," 
                + estancia.getId_casa() +",'"+ estancia.getNombre_huesped()+"','" + estancia.getFecha_desde()+ "','"+
                estancia.getFecha_hasta()+ "')"  ;  
            insertarModificarEliminar(sql); //tiene conectar y desconectar
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase(); // desconecta si entro al catch
        }
    }
    
    /*
    public void modificarEstancia(Estancias estancia) throws Exception {
            try {
                if (estancia == null) {
                    throw new Exception("Debe indicar la estancia que desea modificar");
                }
                String sql = "UPDATE Estancias SET "
                        + " apodo = '" + mascota.getApodo() + "' , raza = '" + mascota.getRaza() + "' , idUsuario = " + mascota.getUsuario().getId()
                        + " WHERE id = '" + mascota.getId() + "'";
                insertarModificarEliminar(sql);
            } catch (Exception e) {
                throw e;
            } finally {
                desconectarBase();
            }
        }
*/
    public void eliminarEstancia(int id) throws Exception {
        try {
            String sql = "DELETE FROM estancias WHERE id = " + id + "";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Estancias buscarEstanciasPorId(int id) throws Exception {
        try {
            String sql = "SELECT * FROM estancias WHERE id = " + id + "";
            consultarBase(sql);
            Estancias estancia = null;
            while (resultado.next()) {
                estancia = new Estancias();
                estancia.setId_estancia(resultado.getInt(1));
                estancia.setId_cliente(resultado.getInt(2));
                estancia.setId_casa(resultado.getInt(3));
                estancia.setNombre_huesped(resultado.getString(4));
                estancia.setFecha_desde(resultado.getDate(5)); 
                estancia.setFecha_hasta(resultado.getDate(6));
 
            }
            desconectarBase();
            return estancia;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Estancias> listarEstancias() throws Exception {
        try {
            String sql = "SELECT * FROM estancias ";
            consultarBase(sql);
            Estancias estancia = null;
            Collection<Estancias> estanciasList = new ArrayList();
            while (resultado.next()) {

                estancia.setId_estancia(resultado.getInt(1));
                estancia.setId_cliente(resultado.getInt(2));
                estancia.setId_casa(resultado.getInt(3));
                estancia.setNombre_huesped(resultado.getString(4));
                 estancia.setFecha_desde(resultado.getDate(5)); 
                estancia.setFecha_hasta(resultado.getDate(6));
                estanciasList.add(estancia);
            }
            desconectarBase();
            return estanciasList;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
}
