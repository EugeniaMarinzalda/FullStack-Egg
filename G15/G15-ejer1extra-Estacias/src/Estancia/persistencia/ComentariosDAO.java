
package Estancia.persistencia;

import Estancia.entidades.Comentarios;


public class ComentariosDAO extends DAO {
    public void agregarComentario(Comentarios comen) throws Exception{
        try {
            conectarBase();
            if (comen==null) {
                throw new Exception ("Dato invalido");
            }
            String sql = "INSERT INTO comentarios VALUES (" + comen.getId_comentario() + "," + comen.getId_casa() + ",'" 
                + comen.getComentario() +"')"  ;  
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
}
