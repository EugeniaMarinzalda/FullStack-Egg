
package Estancia.persistencia;

import Estancia.entidades.Clientes;


public class ClientesDAO extends DAO{
    public void agregarCliente(Clientes cliente) throws Exception{
        try {
            conectarBase();
            if (cliente==null) {
                throw new Exception ("Dato invalido");
            }
            String sql = "INSERT INTO clientes VALUES (" + cliente.getId_cliente() + ",'" + cliente.getNombre() + "','" 
                + cliente.getCalle() +"',"+ cliente.getNumero()+",'" + cliente.getCod_postal()+ "','"+
                cliente.getCiudad()+ "','"+ cliente.getPais()+ "','"+ cliente.getEmail() +"')"  ;  
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
}
