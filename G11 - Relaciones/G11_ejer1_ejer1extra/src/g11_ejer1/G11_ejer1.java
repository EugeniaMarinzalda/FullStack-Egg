
package g11_ejer1;

import g11_ejer1.Service.Service;
import java.util.Scanner;

public class G11_ejer1 {

    public static void main(String[] args) {
  
    /*
    Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
    clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
    atributos: nombre, apellido, edad, documento y Perro.
    Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
    pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
    la clase Persona, la información del Perro y de la Persona.
    
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
    */    
    /*
     Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
    */
        Service ss = new Service ();
        ss.crearDefecto();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");  
        boolean bandera = true;

        do {
            System.out.println("Menu \n1-Desea saber que perro esta disponible para"
                + " adoptar\n2-Quieres dejar un perro para adoptar?\n3-Quieres adoptar un perro?"
                + "\n4-Quieres saber cuales son los perros adoptados?\n5-Quieres ver la lista de Personas? \n6-Salir");
            int opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Los perros son : ");
                    System.out.println(ss.Perros.toString());
                    break;
                case 2:
                    ss.agregarLista(ss.crearPerro());
                    break;
                case 3:
                    ss.agregarPersonas(ss.crearPersona());
                    break;
                case 4:
                    System.out.println(ss.PerrosAdoptados.toString());
                    break;
                case 5:
                    System.out.println("Las personas adoptantes son:");
                    System.out.println(ss.Personas.toString());
                    break;
                case 6:
                    System.out.println("Gracias por utilizar el servicio");
                    bandera = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta. Intente nuevamente");
            }
            
            
            
            
        } while (bandera);
        
    
    }
    
}
