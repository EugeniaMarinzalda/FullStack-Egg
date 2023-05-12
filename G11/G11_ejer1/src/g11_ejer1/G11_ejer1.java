
package g11_ejer1;

import g11_ejer1.entidades.Perro;
import g11_ejer1.entidades.Persona;

/**
 *
 * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
public class G11_ejer1 {

   
    public static void main(String[] args) {
        Persona p1 = new Persona ();
        Persona p2 = new Persona ();
        Perro dog1 = new Perro ();
        Perro dog2 = new Perro ();
        
        p1.setNombre("Carlos");
        p1.setApellido("Diaz");
        p1.setEdad(23);
        p1.setDocumento("2234234");
        p1.setPerro(dog1);
        
        dog1.setNombre("Lolo");
        dog1.setRaza("caniche");
        dog1.setEdad(5);
        dog1.setTamaño(45);
        
        p2.setNombre("Maria");
        p2.setApellido("Diaz");
        p2.setEdad(45);
        p2.setDocumento("3428944");
        p2.setPerro(dog2);
        
        dog2.setNombre("Chiquito");
        dog2.setRaza("bulldog");
        dog2.setEdad(1);
        dog2.setTamaño(23);

        System.out.println(p1);
        System.out.println(p2);
    }
    
}
