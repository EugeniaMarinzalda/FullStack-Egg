
package g12_ejer4;

import entidades.Circulo;
import entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
public class G12_ejer4 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        //------Creacion y resultado del circulo------
        System.out.println("Ingrese el radio del circulo");
        double radio = scan.nextDouble();
        System.out.println("Ingrese el diametro del circulo");
        double diametro = scan.nextDouble();
        Circulo c = new Circulo (radio,diametro);
        System.out.println("El area del circulo es "+ c.area());
        System.out.println("El perimetro del circulo es " + c.perimetro());
        System.out.println(" ");
        
        //------Creacion y resultado del rectangulo------
        System.out.println("Ingrese la base del rectangulo");
        double base = scan.nextDouble();
        System.out.println("Ingrese la altura del circulo");
        double altura = scan.nextDouble();
        Rectangulo r = new Rectangulo (base,altura);
        System.out.println("El area del rectangulo es "+ r.area());
        System.out.println("El perimetro del rectangulo es " + r.perimetro());
        
    }
    
}
