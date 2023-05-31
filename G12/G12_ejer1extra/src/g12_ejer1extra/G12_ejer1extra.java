
package g12_ejer1extra;

import g12_ejer1extra.Service.ServiceAlquiler;
import g12_ejer1extra.entidades.Alquiler;
import g12_ejer1extra.entidades.Barco;
import g12_ejer1extra.entidades.Velero;
import g12_ejer1extra.entidades.YateLujo;
import g12_ejer1extra.entidades.aMotor;
import java.util.Scanner;

/**
 *En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */
public class G12_ejer1extra {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ServiceAlquiler sa = new ServiceAlquiler();
        
        System.out.println("Datos del Alquiler");
        Alquiler a = sa.crearAlquiler();
        System.out.println(a);
        int opc =0;
        do {
            System.out.println("Que tipo de Barco tienes? \n1-Velero \n2-Embarcación a motor \n3-Yate de Lujo \n4-Otros");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    Velero v = new Velero();
                    a.setBarco(v.crearBarco());
                    break;
                case 2:
                    aMotor m = new aMotor();
                    a.setBarco(m.crearBarco());
                    break;
                case 3:
                    YateLujo y = new YateLujo();
                    a.setBarco(y.crearBarco());
                    break;
                case 4:
                    Barco b = new Barco();
                    a.setBarco(b.crearBarco());
                    break;
                default:
                    System.out.println("Opción incorrecta. Intente nuevamente");
            }
        } while (opc<1 || opc >4);
    
        System.out.println(a.getBarco());
        double precio = sa.precioAlquiler(a);
        System.out.println("Precio " + precio );

    }
    
}
