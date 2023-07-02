
package Estancia.persistencia;

import Estancia.entidades.Familias;


public class FamiliasDAO extends DAO {
    public void agregarFamilia(Familias familia) throws Exception{
        try {
            conectarBase();
            if (familia==null) {
                throw new Exception ("Dato invalido");
            }
            String sql = "INSERT INTO familias VALUES (" + familia.getId_familia() + ",'" + familia.getNombre() + "'," 
                + familia.getEdad_min() +","+ familia.getEdad_max()+"," + familia.getNum_hijos()+ ",'"+
                familia.getEmail()+ "',"+ familia.getId_casa_familia()+ ")"  ;  
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
        
    }
}
