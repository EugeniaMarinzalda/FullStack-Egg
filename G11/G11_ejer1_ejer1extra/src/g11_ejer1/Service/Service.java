package g11_ejer1.Service;

import g11_ejer1.entidades.Perro;
import g11_ejer1.entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class Service {

    public static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public ArrayList<Perro> Perros = new ArrayList();
    public ArrayList<Persona> Personas = new ArrayList();
    public ArrayList<Perro> PerrosAdoptados = new ArrayList();

    public Perro crearPerro() {
        System.out.println("Ingrese el nombre");
        String nombre = sc.next();
        System.out.println("Ingrese el raza");
        String raza = sc.next();
        System.out.println("Ingrese la edad");
        int edad = sc.nextInt();
        System.out.println("Ingrese el tamaño");
        double tamaño = sc.nextDouble();
        return new Perro(nombre, raza, edad, tamaño);
    }

    public void agregarLista(Perro p) {
        Perros.add(p);
    }

    public void crearDefecto() {
        Perro dog1 = new Perro();
        Perro dog2 = new Perro();
        Perro dog3 = new Perro();
        Perro dog4 = new Perro();

        dog1.setNombre("Lolo");
        dog1.setRaza("caniche");
        dog1.setEdad(5);
        dog1.setTamaño(45);
        Perros.add(dog1);

        dog2.setNombre("Chiquito");
        dog2.setRaza("bulldog");
        dog2.setEdad(1);
        dog2.setTamaño(23);
        Perros.add(dog2);

        dog3.setNombre("Ignacio");
        dog3.setRaza("beagle");
        dog3.setEdad(14);
        dog3.setTamaño(21);
        Perros.add(dog3);

        dog4.setNombre("Roco");
        dog4.setRaza("callejero");
        dog4.setEdad(15);
        dog4.setTamaño(12);
        Perros.add(dog4);

    }

    public Persona crearPersona() {
        System.out.println("Vamos a registrar sus datos");
        System.out.println("Ingrese su nombre");
        String nombre = sc.next();
        System.out.println("Ingrese su apellido");
        String apellido = sc.next();
        System.out.println("Ingrese su documento");
        String dni = sc.next();
        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();
        int cont = 0;
        do {
            System.out.println("Ingrese el nombre del perro desea adoptar");
            String nombrePerro = sc.next();
            
            for (Perro aux : Perros) {
                if (aux.getNombre().equalsIgnoreCase(nombrePerro)) {

                    PerrosAdoptados.add(aux);
                    Perros.remove(aux);
                    System.out.println("Se comparo y esta bien");
                    cont = 0;
                    break;
                } else {
                    cont++;
                }
            }
            if (cont > 1) {
                System.out.println("Ese perro no esta en la lista. Intente nuevamente");
            }
        } while (cont > 1);
        
        return new Persona(nombre, apellido, dni, edad, PerrosAdoptados.get(PerrosAdoptados.size() - 1));

    }
    public void agregarPersonas(Persona per){
        Personas.add(per);
    }

}
