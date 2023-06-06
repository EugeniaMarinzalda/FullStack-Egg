
package g12_ejer3extra;


import entidades.Camping;
import entidades.Extrahotelero;
import entidades.Hotel;
import entidades.Hotel4;
import entidades.Hotel5;
import entidades.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator; 

/**
 Una compañía de promociones turísticas desea mantener información sobre la infraestructura
de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
acuerdo con sus posibilidades. Los alojamientos se identifican por un nombre, una dirección,
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
alojamientos: Hoteles y Alojamientos Extrahoteleros.
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
características de las distintas categorías son las siguientes:
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
será.
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
 */
public class G12_ejer3extra {

    public static void main(String[] args) {
        
        ArrayList<Hotel> hoteles = new ArrayList();
        ArrayList<Extrahotelero> extras = new ArrayList();
        
        Hotel4 h1= new Hotel4("A", "La Nona", 60,40, 60, 4, 0, "Miramar", "Aconcagua 250", "Mar chiquita", "Pablo Gimenez");
        h1.setPrecio(h1.obtenerPrecioFin());
        Hotel4 h2= new Hotel4("B", "Delicatessen", 50, 25, 50, 4, 0, "La costa", "Libertador 58", "Villa Gesel", "Antonia Gomez");
        h2.setPrecio(h2.obtenerPrecioFin());
        
        Hotel5 h3 = new Hotel5(4, 10, 3, "A", "Salinas", 200, 100, 200, 10, 0, "Sheraton", "9 de julio 9000", "Villa Carlos Paz", "Ofelio Lopez");
        h3.setPrecio(h3.obtenerPrecioFin());
        Hotel5 h4 = new Hotel5(2, 5, 1, "B", "Nido", 90, 50, 90, 6, 0, "Altos de montaña", "Calle 150", "Nono", "Martina Palomeque");
        h4.setPrecio(h4.obtenerPrecioFin());
        
        hoteles.add(h1);
        hoteles.add(h2);
        hoteles.add(h3);
        hoteles.add(h4);
        
        Camping e1 = new Camping(30, 3, true, true, 2500, "Inti huasi", "calle 53", "Icho Cruz", "Gerardo Perez");
        Camping e2 = new Camping(50, 4, false, false, 4000, "ACA", "San Martin 410", "Villa Carlos Paz", "Alejandra Martinez");
        Residencia e3 = new Residencia(20, true, false, false, 1200, "La casona", "Ascuenaga 59", "Capilla del monte", "Pedro Lopez");
        Residencia e4 = new Residencia(30, false, true, true, 2000, "Chacras", "Calle 842", "Potrero de garay", "Maria Juarez");
        
        extras.add(e1);
        extras.add(e2);
        extras.add(e3);
        extras.add(e4);

        for (Hotel aux : hoteles) {
            System.out.println(aux);
            
        }
      
        for (Extrahotelero extra : extras) {
            System.out.println(extra);
        }
        
        Collections.sort(hoteles,new Comparator<Hotel>(){ 
            @Override
            public int compare(Hotel o1, Hotel o2){
                return Float.compare(o2.getPrecio(),o1.getPrecio());
            }
            
        });
         System.out.println("\nLa lista de hoteles de mayor a menor precio es:");
        for (Hotel aux1 : hoteles) {
           
            System.out.println(aux1.getNombre()+" "+aux1.getPrecio());
        }
   
        for (Extrahotelero extra : extras) {
            if (extra instanceof Camping) {
                
                if (((Camping) extra).getRestaurante()) {
                    System.out.println("\nEl camping "+extra.getNombre() +" si tiene restaurante");
                }
                
            }else if (extra instanceof Residencia) {
                if (((Residencia) extra).getGremio()) {
                    System.out.println("\nLa residencia "+extra.getNombre()+" si tiene descuento por gremio");
                }
                
            }
        }
 
    }
    
}
