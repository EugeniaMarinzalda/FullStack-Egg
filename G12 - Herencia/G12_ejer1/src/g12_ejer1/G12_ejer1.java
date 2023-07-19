
package g12_ejer1;


import Services.ServiceCaballo;
import Services.ServiceGato;
import Services.ServicePerro;
import g12_ejer1.entidades.Animal;
import g12_ejer1.entidades.Gato;
import g12_ejer1.entidades.Perro;


public class G12_ejer1 {
/*
    Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
    */
    public static void main(String[] args) {
        ServicePerro sp = new ServicePerro();
        ServiceGato sg = new ServiceGato();
        ServiceCaballo sc = new ServiceCaballo();
        
        
        Animal perro1 = new Perro ("Stich", "Carnivoro",15,"Doberman");
        sp.alimento(perro1);
        
        Animal perro2 = new Perro ("Teddy", "Croquetas",10,"Chihuahua");
        sp.alimento(perro2);
        
        Animal gato1 = new Gato ("Pelusa", "Galletas",15,"Siames");
        sg.alimento(gato1);
        
        Animal caballo1 = new Gato ("Spark", "Pasto",25,"Fino");
        sc.alimento(caballo1);
        
    }
    
}
