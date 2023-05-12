
package g11_ejerteorico;

import g11_ejerteorico.entidades.Persona;
import g11_ejerteorico.entidades.dni;

/**
 *EJERCICIO PERSONA
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 * @author EUGE
 */
public class G11_ejerteorico {

  
    public static void main(String[] args) {
        dni Dni1 = new dni ();
        Persona p1 = new Persona();
        Dni1.setDNI(10000);
        Dni1.setCaracter("A");
        p1.setNroDni(Dni1);
        p1.setNombre("Jose");
        p1.setApellido("Vargaz");
        System.out.println(p1);
    }
    
}
