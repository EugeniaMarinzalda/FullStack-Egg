
package Estancia.persistencia;

import Estancia.entidades.Casas;


public class CasasDAO extends DAO {
    public void agregarCasa(Casas casa) throws Exception{
        
        try {
            conectarBase();
            if (casa==null) {
                throw new Exception ("Dato invalido");
            }
            String sql = "INSERT INTO casas VALUES (" + casa.getId_casa() + ",'" + casa.getCalle() + "'," 
                + casa.getNumero()+",'" + casa.getCod_postal()+ "','"+ casa.getCiudad()+ "','"+ casa.getPais() + "','" + casa.getFecha_desde()
                    + "','"+ casa.getFecha_hasta() + "',"+ casa.getTiempo_min()+  "," + casa.getTiempo_max()+ ","+ casa.getPrecio_hab()+ ",'"
                    + casa.getTipo_vivienda()+"')"  ;  
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
}
