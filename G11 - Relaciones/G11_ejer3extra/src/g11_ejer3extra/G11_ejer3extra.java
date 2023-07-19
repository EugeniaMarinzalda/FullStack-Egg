
package g11_ejer3extra;

import Service.Service;
import g11_ejer3extra.Entidades.Poliza;
import java.util.Date;
import java.util.Scanner;


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
        //Poliza p;
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Bienvenido a La Tercera Seguros");
       
        boolean bandera = true;
        
        do {
            
            System.out.println("Menu \n1-Ingresar Poliza\n2-Eliminar Poliza\n3-Mostrar Polizas vigentes\n4-Mostrar Clientes activos\n5-Mostrar Automoviles\n6-Salir");
            int opc = sc.nextInt();
            switch (opc) {
                case 1:
                    Poliza p=ss.llenarPoliza(ss.añadirCliente(),ss.añadirVehiculo());
                    ss.añadirPoliza(p);
                    break;
                case 2:
                    ss.eliminarPoliza();
                    break;
                case 3:
                    ss.mostrarPoliza();
                    break;
                case 4:
                    ss.mostrarClientes();
                    break;
                case 5:
                    ss.mostrarVehiculos();
                    break;
                case 6:
                    System.out.println("Gracias por utilizar el sistema");
                    bandera = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta. Intente nuevamente");
            }
        } while (bandera);
    }
}
