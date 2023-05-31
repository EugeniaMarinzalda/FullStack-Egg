
package g12_ejer1extra.Service;

import g12_ejer1extra.entidades.Alquiler;
import g12_ejer1extra.entidades.Velero;
import g12_ejer1extra.entidades.YateLujo;
import g12_ejer1extra.entidades.aMotor;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ServiceAlquiler {
    
    public Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public Alquiler a;
    public Velero v;
    
    public Alquiler crearAlquiler(){
        System.out.println("Ingrese el nombre");
        String alquiler = sc.next();
        System.out.println("Ingrese el DNI");
        String DNI = sc.next();
        System.out.println("Fecha de alquiler");
        System.out.println("Ingrese el dia");
        int dia = sc.nextInt();
        System.out.println("Ingrese el mes");
        int mes = sc.nextInt();
        System.out.println("Ingrese el año");
        int anio = sc.nextInt();
        Date fechaI = new Date (anio-1900,mes-1,dia);
        System.out.println("Fecha de devolución");
        System.out.println("Ingrese el dia");
        int dia1 = sc.nextInt();
        System.out.println("Ingrese el mes");
        int mes1 = sc.nextInt();
        System.out.println("Ingrese el año");
        int anio1 = sc.nextInt();
        Date fechaD = new Date (anio1-1900,mes1-1,dia1);
        System.out.println("Ingrese la amarra");
        String lugar = sc.next();
        return new Alquiler(alquiler,DNI,fechaI,fechaD,lugar);
    }

    /*
    Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
    */
    public double precioAlquiler(Alquiler a){
        LocalDate fechaInicio = LocalDate.of(a.getFechaA().getYear(), a.getFechaA().getMonth()+1, a.getFechaA().getDate());
        LocalDate fechaDevolucion = LocalDate.of(a.getFechaD().getYear(),a.getFechaD().getMonth()+1, a.getFechaD().getDate());
        double cantDias = ChronoUnit.DAYS.between(fechaInicio, fechaDevolucion);
        double modulo = a.getBarco().getEslora()*10;
        double valor= cantDias*modulo;
        if (a.getBarco() instanceof Velero) {
            Velero aux = (Velero) a.getBarco();
            valor =+ aux.getMastil();  
        }
        if (a.getBarco() instanceof aMotor) {
            aMotor aux = (aMotor) a.getBarco();
            valor =+ aux.getCv();  
        }
        if (a.getBarco() instanceof YateLujo) {
            YateLujo aux = (YateLujo) a.getBarco();
            valor =+ aux.getCv() + aux.getCamarotes();  
        }
        return valor;
    }
    
}
