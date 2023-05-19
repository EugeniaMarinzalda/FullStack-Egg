
package g11_ejer2extra.Service;

import Entidades.Asiento;
import Entidades.Cine;
import Entidades.Espectador;
import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas).  
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío.
8 A X | 8 B X | 8 C X | 8 D | 8 E X | 8 F X
7 A X | 7 B X | 7 C X | 7 D X | 7 E | 7 F X
6 A X | 6 B X | 6 C | 6 D X | 6 E X | 6 F
5 A X | 5 B X | 5 C X | 5 D X | 5 E X | 5 F X
4 A X | 4 B X | 4 C X | 4 D X | 4 E X | 4 F X
3 A X | 3 B X | 3 C X | 3 D | 3 E X | 3 F X
2 A X | 2 B | 2 C X | 2 D X | 2 E X | 2 F
1 A X | 1 B X | 1 C X | 1 D X | 1 E X | 1 F X

 */
public class Service {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private Asiento [][] sala = new Asiento [8][6];
    private Espectador e = new Espectador();
    private ArrayList <Espectador> espectadores = new ArrayList();
    
    public void crearSala(){
        int fila = sala.length;
        for (int i = 0; i < sala.length; i++) {   //8 - numeros filas
            for (int j = 0; j < sala[0].length; j++) {    //6 - letras columnas
                 sala [i][j] = new Asiento (fila,(char)('A'+j));
            }
            fila--; 
        }
    }
    
    public void mostrarSala(){
        for (int i = 0; i < sala.length; i++) {   //8
            for (int j = 0; j < sala[0].length; j++) {    //6
                System.out.print(sala[i][j]);
            }
            System.out.println(" ");
        } 
        System.out.println(" ");
    }
    
    public Pelicula crearPelicula(){
        System.out.println("Ingrese el Titulo");
        String titulo = sc.next();
        System.out.println("Ingrese el Director");
        String director = sc.next();
        System.out.println("Ingrese el Duracion en horas");
        double duracion = sc.nextDouble();
        System.out.println("Ingrese el edad minima");
        int edadMin = sc.nextInt();
    return new Pelicula(titulo,director,duracion,edadMin);
    }
    
    public void crearEsp(int cant){
        String nombres[] = {"Fernando", "Laura", "Jose", "María","Sergio","Alberto","Gabriel","Florencia"}; // para nombres
            int j = 0;
            for (int i = 0; i < cant; i++) {
                String nombre = nombres[j];
                int edad = (int) (Math.random() * 90);
                int dinero = (int) (Math.random() * (20 - (4000 + 1)) + (4000 + 1));
                Espectador e = new Espectador(nombre,edad,dinero);
                espectadores.add(e);
                j++;
                if (j==8) {
                    j=0;
                }
            }
    }
    
    public void mostrarEsp(){
        System.out.println(espectadores.toString());
        System.out.println(espectadores.size());
    }
    
    public Cine crearCine(){
        crearSala();
        Pelicula peli = crearPelicula();
        System.out.println("Ingrese el costo de la entrada");   
        double costo = sc.nextDouble();
        return new Cine (peli,sala,costo);            
    }
    /*
    Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre.
    */
    public void asignarAsientos(){
        
    }
}


/*
 public void asignarAsientos(Ejercicio2Cine cine) {
        for (Ejercicio2Espectador espectador : lista) {
            boolean ocupado = false;
            if (espectador.getEdad() >= cine.getPelicula().getEdadMinima() && espectador.getDinero() >= cine.getPrecio()) {
                do {
                    int k = (int) (Math.random() * 8);
                    int l = (int) (Math.random() * 6);
                    if (cine.getAsientos()[k][l].getEspectador() == null) {
                        cine.getAsientos()[k][l].setEspectador(espectador);
                        ocupado = true;
                    }
                } while (!ocupado);
            } else {
                System.out.println("Lo siento, no puede entrar a la sala porque la peli no es apta para tu edad");
            }
        }
    }


*/