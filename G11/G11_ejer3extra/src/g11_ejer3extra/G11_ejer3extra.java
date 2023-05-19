
package g11_ejer3extra;

import Service.Service;
import java.util.Date;


public class G11_ejer3extra {
/*
 Te vamos a contar que te ha contratado “La Tercera Seguros”, una empresa aseguradora que brinda a sus clientes
coberturas integrales para vehículos.
Luego de un pequeño relevamiento, te vamos a pasar en limpio los requerimientos del sistema
que quiere realizar la empresa.
Debemos realizar el diagrama de clases completo, teniendo en cuenta todos los requerimientos 
    arriba descriptos. Modelando clases con atributos y sus correspondientes
relaciones.
    */
    public static void main(String[] args) {
        Service ss = new Service ();
        
        System.out.println(ss.llenarPoliza(ss.añadirCliente(),ss.añadirVehiculo()));
        
    }
    
}
