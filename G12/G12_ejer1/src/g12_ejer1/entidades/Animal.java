
package g12_ejer1.entidades;

/**
 *
 * La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
 */
public abstract class Animal {
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String raza;
    
    /*
    Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta.
    */
    
public abstract void alimento();

}
