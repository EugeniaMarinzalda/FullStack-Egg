
package g12_ejer4extra;

import entidades.Estudiante;
import entidades.Persona;
import entidades.PersonalServicio;
import entidades.Profesor;
import enumeradores.Cursos;
import enumeradores.EstadoCivil;
import enumeradores.Seccion;
import java.util.ArrayList;
import java.util.Scanner;

public class G12_ejer4extra {

    /*
    Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de
información debe gestionar esta aplicación:
• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.
• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
• En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
• Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
continuación, debe programar las clases definidas en las que, además de los constructores,
hay que desarrollar los métodos correspondientes a las siguientes operaciones:
• Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.
    */
    
     
    
    public static void main(String[] args) {
        ArrayList <Persona> Personas = crearPersona();
        
        System.out.println("Bienvenidos al servicio de Autogestión");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("Ingrese su condición");
            System.out.println("1-Estudiante");
            System.out.println("2-Profesor");
            System.out.println("3-Personal de Servicio");
            System.out.println("4-Mostrar lista");
            System.out.println("5-Salir");
            choice = leer.nextInt();
            while (choice < 1 && choice > 5) {
                System.out.println("El valor ingresado no corresponde a ninguna opción, intente nuevamente");
                choice = leer.nextInt();
            }
            switch (choice) {
                case 1:
                    menuAlumno(Personas);
                    break;
                case 2:
                    menuProfe(Personas);
                    break;
                case 3:
                    menuPersonal(Personas);
                    break;
                case 4:
                    mostrarAlumnos(Personas);
                    mostrarProfes(Personas);
                    mostrarPersonal(Personas);
                    break;
            }
        } while (choice != 5);
        
        System.out.println("Gracias por utilizar el sistema");
        
        
        
    }
    
    public static void menuAlumno(ArrayList<Persona> Personas){   // static para incorporar en menu principal
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int choice;
        boolean user = true;
        boolean hacer = true;
        System.out.println("Ingrese el Usuario");
        String nombre = leer.next();
        do {   
            for (Persona aux : Personas) {
                if (aux instanceof Estudiante) {
                    Estudiante estudiante = (Estudiante) aux;
                    
                    if (estudiante.getNombre().equalsIgnoreCase(nombre)) {
                        hacer = false;
                        user = false;
                        do{
                            System.out.println("Menu");
                            System.out.println("1-Cambiar Datos Personales");
                            System.out.println("2-Cambiar de Curso");
                            System.out.println("3-Mostrar Estudiantes");
                            System.out.println("4-Salir");
                            choice = leer.nextInt();
                            while (choice < 1 && choice > 4) {
                                System.out.println("El valor ingresado no corresponde a ninguna opción, intente nuevamente");
                                choice = leer.nextInt();
                            }
 
                            switch (choice) {
                                case 1:
                                    System.out.println("Desea cambiar el estado civil?");
                                    String resp = leer.next();
                                    if(resp.equalsIgnoreCase("SI")){
                                        EstadoCivil [] estado = EstadoCivil.values();
                                        System.out.println("Ingrese su estado civil: \n1-Soltero\n2-Casado\n3-Divorciado\n4-Viudo\n5-Otro");
                                        int opc = leer.nextInt();
                                        if (opc>5 || opc<1) {
                                            opc=4;
                                        } else {
                                            opc=opc-1;
                                        }
                                        estudiante.setCivil(estado[opc]);
                                        System.out.println("Su estado civil informado es: "+ estudiante.getCivil());
                                    }   
                                    break;
                                case 2:
                                    Cursos  [] curso = Cursos.values();
                                    System.out.println("A qué curso desea cambiar?\n1-Economia\n2-Contabilidad\n3-Matematicas\n4-Sociales\n5-Lenguaje\n6-Arquitectura\n7-Psicologia\n8-Otro");
                                    int opc = leer.nextInt();
                                        if (opc>8 || opc<1) {
                                            opc=7;
                                        } else {
                                            opc=opc-1;
                                        }
                                    estudiante.setCurso(curso[opc]);
                                    System.out.println("Se ha cambiado al curso " + estudiante.getCurso());
                                    break;
                                case 3:
                                    mostrarAlumnos(Personas);
                                    break;     
                            }
                        } while (choice != 4);
                    } 
                }
            }    
            if (user) {  
                System.out.println("Usuario Incorrecto. Intente nuevamente");
                nombre = leer.next();
            } 
        }  while (hacer);    
    } 
    public static void menuProfe (ArrayList<Persona> Personas){   // static para incorporar en menu principal
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int choice;
        boolean user = true;
        boolean hacer = true;
        System.out.println("Ingrese el Usuario");
        String nombre = leer.next();
        do {   
            for (Persona aux : Personas) {
                if (aux instanceof Profesor) {
                    Profesor profe = (Profesor) aux;
                    if (profe.getNombre().equalsIgnoreCase(nombre)) {
                        hacer = false;
                        user = false;
                        do{
                            System.out.println("Menu");
                            System.out.println("1-Cambiar Datos Personales");
                            System.out.println("2-Cambiar departamento");
                            System.out.println("3-Cambiar despacho");
                            System.out.println("4-Mostrar Profesores");
                            System.out.println("5-Salir");
                            choice = leer.nextInt();
                            while (choice < 1 && choice > 5) {
                                System.out.println("El valor ingresado no corresponde a ninguna opción, intente nuevamente");
                                choice = leer.nextInt();
                            }
                            switch (choice) {
                                case 1:
                                    System.out.println("Desea cambiar el estado civil?");
                                    String resp = leer.next();
                                    if(resp.equalsIgnoreCase("SI")){
                                        EstadoCivil [] estado = EstadoCivil.values();
                                        System.out.println("Ingrese su estado civil: \n1-Soltero\n2-Casado\n3-Divorciado\n4-Viudo\n5-Otro");
                                        int opc = leer.nextInt();
                                        if (opc>5 || opc<1) {
                                            opc=4;
                                        } else {
                                            opc=opc-1;
                                        }
                                        profe.setCivil(estado[opc]);
                                        System.out.println("Su estado civil informado es: "+ profe.getCivil());
                                    }   
                                    break;
                                case 2:
                                    Cursos [] departamento = Cursos.values();
                                    System.out.println("A qué departamento desea cambiar?\n1-Economia\n2-Contabilidad\n3-Matematicas\n4-Sociales\n5-Lenguaje\n6-Arquitectura\n7-Psicologia\n8-Otro");
                                    int opc = leer.nextInt();
                                        if (opc>8 || opc<1) {
                                            opc=7;
                                        } else {
                                            opc=opc-1;
                                        }
                                    profe.setDepartamento(departamento[opc]);
                                    System.out.println("Se ha cambiado al departamento de " + profe.getDepartamento());
                                    break;
                                case 3:
                                    System.out.println("A que despacho desea cambiar?");
                                    int contador;
                                    do {
                                        int num = leer.nextInt();
                                        contador = 0;
                                        for (Persona aux1 : Personas) {
                                            if (aux1 instanceof Profesor) {
                                                Profesor profe1 = (Profesor) aux1;
                                                if (profe1.getDespacho()==num) {
                                                    contador=+1;
                                                }
                                            }
                                            if (aux1 instanceof PersonalServicio) {
                                                PersonalServicio personal2 = (PersonalServicio) aux1;
                                                if (personal2.getDespacho()==num) {
                                                    contador=+1;
                                                }
                                            }
                                        }
                                        
                                        if (contador>0) {
                                            System.out.println("Ese despacho esta ocupado. Intente con otro");
                                        } else {
                                            profe.setDespacho(num);
                                        }
                                    } while (contador>0);
                                    break;  
                                case 4:
                                    mostrarProfes(Personas);
                                    break;   
                            }
                        } while (choice != 5);
                    } 
                }
            }    
            if (user) {  
                System.out.println("Usuario Incorrecto. Intente nuevamente");
                nombre = leer.next();
            } 
        }  while (hacer);    
    } 
    public static void menuPersonal (ArrayList<Persona> Personas){   // static para incorporar en menu principal
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int choice;
        boolean user = true;
        boolean hacer = true;
        System.out.println("Ingrese el Usuario");
        String nombre = leer.next();
        do {   
            for (Persona aux : Personas) {
                if (aux instanceof PersonalServicio) {
                    PersonalServicio personal = (PersonalServicio) aux;
                    if (personal.getNombre().equalsIgnoreCase(nombre)) {
                        hacer = false;
                        user = false;
                        do{
                            System.out.println("Menu");
                            System.out.println("1-Cambiar Datos Personales");
                            System.out.println("2-Cambiar seccion");
                            System.out.println("3-Cambiar despacho");
                            System.out.println("4-Mostrar Personal de Servicio");
                            System.out.println("5-Salir");
                            choice = leer.nextInt();
                            while (choice < 1 && choice > 5) {
                                System.out.println("El valor ingresado no corresponde a ninguna opción, intente nuevamente");
                                choice = leer.nextInt();
                            }
                            switch (choice) {
                                case 1:
                                    System.out.println("Desea cambiar el estado civil?");
                                    String resp = leer.next();
                                    if(resp.equalsIgnoreCase("SI")){
                                        EstadoCivil [] estado = EstadoCivil.values();
                                        System.out.println("Ingrese su estado civil: \n1-Soltero\n2-Casado\n3-Divorciado\n4-Viudo\n5-Otro");
                                        int opc = leer.nextInt();
                                        if (opc>5 || opc<1) {
                                            opc=4;
                                        } else {
                                            opc=opc-1;
                                        }
                                        personal.setCivil(estado[opc]);
                                        System.out.println("Su estado civil informado es: "+ personal.getCivil());
                                    }   
                                    break;
                                case 2:
                                    Seccion [] seccion = Seccion.values();
                                    System.out.println("A qué sección desea cambiar?\n1-Biblioteca\n2-Decanato\n3-Secretaria\n4-Maestranza\n5-Otro");
                                    int opc = leer.nextInt();
                                        if (opc>5 || opc<1) {
                                            opc=4;
                                        } else {
                                            opc=opc-1;
                                        }
                                    personal.setSeccion(seccion[opc]);
                                    System.out.println("Se ha cambiado a la sección de " + personal.getSeccion());
                                    break;
                                case 3:
                                    System.out.println("A que despacho desea cambiar?");
                                    int contador;
                                    do {
                                        int num = leer.nextInt();
                                        contador = 0;
                                        for (Persona aux1 : Personas) {
                                            if (aux1 instanceof PersonalServicio) {
                                                PersonalServicio personal1 = (PersonalServicio) aux1;
                                                if (personal1.getDespacho()==num) {
                                                    contador=+1;
                                                }
                                            }
                                            if (aux1 instanceof Profesor) {
                                                Profesor profe2 = (Profesor) aux1;
                                                if (profe2.getDespacho()==num) {
                                                    contador=+1;
                                                }
                                            }  
                                        }
                                        if (contador>0) {
                                            System.out.println("Ese despacho esta ocupado. Intente con otro");
                                        } else {
                                            personal.setDespacho(num);
                                        }
                                    } while (contador>0);
                                    break;  
                                case 4:
                                    mostrarPersonal(Personas);
                                    break;   
                            }
                        } while (choice != 5);
                    } 
                }
            }    
            if (user) {  
                System.out.println("Usuario Incorrecto. Intente nuevamente");
                nombre = leer.next();
            } 
        }  while (hacer);    
    } 
    
      
    public static ArrayList<Persona> crearPersona(){
        ArrayList<Persona> Personas = new ArrayList();
        Estudiante e1 = new Estudiante (Cursos.Economia, "Maria Lopez", "12365478", EstadoCivil.casado);
        Personas.add(e1);
        Estudiante e2 = new Estudiante (Cursos.Lenguaje, "Juan Gonzalez", "32165498", EstadoCivil.divorciado);
        Personas.add(e2);
        Estudiante e3 = new Estudiante (Cursos.Psicologia, "Ana Gomez", "85296321", EstadoCivil.soltero);
        Personas.add(e3);
        Estudiante e4 = new Estudiante (Cursos.Contabilidad, "Jose Vega", "74963258", EstadoCivil.viudo);
        Personas.add(e4);
        Profesor p1 = new Profesor (Cursos.Lenguaje, 2010, 1, "Prof. xx", "14523698", EstadoCivil.viudo);
        Personas.add(p1);
        Profesor p2 = new Profesor (Cursos.Economia, 2012, 2, "Prof. yy", "32145698", EstadoCivil.soltero);
        Personas.add(p2);
        Profesor p3 = new Profesor (Cursos.Contabilidad, 2015, 3, "Prof. zz", "14725836", EstadoCivil.casado);
        Personas.add(p3);
        Profesor p4 = new Profesor (Cursos.Psicologia, 2020, 4, "Prof. ww", "15324698", EstadoCivil.divorciado);
        Personas.add(p4);
        PersonalServicio ps1 = new PersonalServicio (Seccion.decanato, 2011, 5, "Julian Weich", "11111111", EstadoCivil.viudo);
        Personas.add(ps1);
        PersonalServicio ps2 = new PersonalServicio (Seccion.biblioteca, 2013, 6, "Margarita Diaz", "22222222", EstadoCivil.soltero);
        Personas.add(ps2);
        PersonalServicio ps3 = new PersonalServicio (Seccion.maestranza, 2016, 7, "Osvaldo Laport", "33333333", EstadoCivil.casado);
        Personas.add(ps3);
        PersonalServicio ps4 = new PersonalServicio (Seccion.secretaria, 2021, 8, "Luciana Lopilato", "44444444", EstadoCivil.divorciado);
        Personas.add(ps4);

        return Personas;
    }
    
    public static void mostrarAlumnos(ArrayList<Persona> Personas){
               System.out.println("Estudiantes");
        for (Persona aux : Personas) {
            if (aux instanceof Estudiante) {
                System.out.println(aux);
            }
        }
    }
    public static void mostrarPersonal(ArrayList<Persona> Personas){
        System.out.println("Personal de Servicio");
        for (Persona aux : Personas) {
            if (aux instanceof PersonalServicio) {
                System.out.println(aux);
            }
        }

    }
    public static void mostrarProfes(ArrayList<Persona> Personas){
                System.out.println("Profesores");
        for (Persona aux : Personas) {
            if (aux instanceof Profesor) {
                System.out.println(aux);
            }
        }
    }
    
} 
            
      
        
    
    
    
    

