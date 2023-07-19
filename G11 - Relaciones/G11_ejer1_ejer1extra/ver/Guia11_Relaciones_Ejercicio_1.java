package Main;

import Entidades.Perro;
import Entidades.Persona;


public class Guia11_Relaciones_Ejercicio_1 {

    public static void main(String[] args) {
        Perro perro = new Perro();
        Perro perro2 = new Perro();
        Persona persona = new Persona();
        Persona persona2 = new Persona();
        
        perro.setNombre("Lolo");
        perro.setRaza("caniche");
        perro.setEdad(5);
        perro.setTamaño(45);
        
        perro2.setNombre("Chiquito");
        perro2.setRaza("bulldog");
        perro2.setEdad(1);
        perro2.setTamaño(23);
        
        persona.setNombre("Carlos");
        persona.setApellido("Diaz");
        persona.setEdad(23);
        persona.setDni(2234234);
        persona.setPerro(perro);
        
        persona2.setNombre("Maria");
        persona2.setApellido("Diaz");
        persona2.setEdad(45);
        persona2.setDni(3428944);
        persona2.setPerro(perro2);
        
        System.out.println(persona);
        System.out.println(persona2);
        
    }

}
