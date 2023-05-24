
package service;

import g12_ejer2.entidades.Electrodomestico;
import java.util.Scanner;

/**
 *
 * 
 */
public class ServiceElectro {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    /*
    • Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
    */

    public char comprobarConsumoEnergetico(char letra){
        if (letra == 'A' || letra == 'B' || letra == 'C'|| letra == 'D' || letra == 'E' || letra == 'F' ) {
            return letra;
        } else {
            return 'F';
        }
    }
    /*
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
    */
    public String  comprobarColor(String color) {
        if (color.equals("BLANCO") || color.equals("NEGRO") || color.equals("ROJO") || color.equals("AZUL") || color.equals("GRIS")) {
            return color;
        } else {
            return "BLANCO";
        }
       
    }
    /*
    Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.

    */
    
    public Electrodomestico crearElectrodomestico() {
        double precio = 0;
        System.out.println("Ingrese el color (blanco, negro, rojo, azul y gris)");
        String color = sc.next().toUpperCase();
        color= comprobarColor(color);
        char consumo;
        do {
            System.out.println("Ingrese la categoria de consumo energetico (A-F)");
            consumo = sc.next().toUpperCase().charAt(0);
        } while ( consumo >'G' || consumo < 'A');
        comprobarConsumoEnergetico (consumo);
        
        System.out.println("Ingrese el peso");
        double peso = sc.nextDouble();
        return new Electrodomestico (precio,peso, color,consumo);
    }
    /*
    • Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
    */
    public double precioFinal(Electrodomestico e){
        e.setPrecio(1000); // base
        System.out.println("Base: " + e.getPrecio());
        
        switch (e.getConsumo()) {
            case 'A':
                e.setPrecio(e.getPrecio()+1000);
                System.out.println("Por consumo energetico: " + e.getPrecio());
                break;
            case 'B':
                e.setPrecio(e.getPrecio()+800);
                System.out.println("Por consumo energetico: " + e.getPrecio());
                break;
            case 'C':
                e.setPrecio(e.getPrecio()+600);
                System.out.println("Por consumo energetico: " + e.getPrecio());
                break;
            case 'D':
                e.setPrecio(e.getPrecio()+500);
                System.out.println("Por consumo energetico: " + e.getPrecio());
                break;
            case 'E':
                e.setPrecio(e.getPrecio()+300);
                System.out.println("Por consumo energetico: " + e.getPrecio());
                break;
            case 'F':
                e.setPrecio(e.getPrecio()+100);
                System.out.println("Por consumo energetico: " + e.getPrecio());
                break;
        }
        
        if (e.getPeso()<=19) {
            e.setPrecio(e.getPrecio()+100);
            System.out.println("Por peso: " + e.getPrecio());
        } else if (e.getPeso()<=49){
            e.setPrecio(e.getPrecio()+500);
            System.out.println("Por peso: " + e.getPrecio());
        } else if (e.getPeso()<=79){
            e.setPrecio(e.getPrecio()+800);
            System.out.println("Por peso: " + e.getPrecio());
        } else {
            e.setPrecio(e.getPrecio()+1000);
            System.out.println("Por peso: " + e.getPrecio());
        }

        return e.getPrecio();
    }
}
