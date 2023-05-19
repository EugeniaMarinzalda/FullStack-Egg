/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import g11_ejer3extra.Entidades.Cliente;
import g11_ejer3extra.Entidades.Poliza;
import g11_ejer3extra.Entidades.Vehiculo;
import g11_ejer3extra.Entidades.Cuota;
import g11_ejer3extra.Enumeradores.FormaPago;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Service {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
 
    private ArrayList <Cuota> cuotas = new ArrayList ();
    private ArrayList <Poliza> polizas = new ArrayList ();
    private Poliza p = new Poliza();
    
    
    public Cliente añadirCliente(){
        System.out.println("Datos del cliente");
        System.out.println("--------------------");
        System.out.println("Ingrese el nombre");
        String nombre = sc.next();
        System.out.println("Ingrese el apellido");
        String apellido = sc.next();
        System.out.println("Ingrese el documento");
        String docu = sc.next();
        System.out.println("Ingrese el correo electronico");
        String email = sc.next();
        System.out.println("Ingrese el domicilio");
        String domicilio = sc.next();
        System.out.println("Ingrese el telefono");
        String tel = sc.next();
        return new Cliente (nombre,apellido,docu,email,domicilio,tel);
      
    }
        
    public Vehiculo añadirVehiculo(){
        System.out.println("Ingrese los datos del vehiculo");
        System.out.println("--------------------");
        System.out.println("Ingrese la marca");
        String marca = sc.next();
        System.out.println("Ingrese el modelo");
        String modelo = sc.next();
        System.out.println("Ingrese el motor");
        String motor = sc.next();
        System.out.println("Ingrese el chasis");
        String chasis = sc.next();
        System.out.println("Ingrese el color");
        String color = sc.next();
        System.out.println("Ingrese el tipo");
        String tipo = sc.next();
        System.out.println("Ingrese el año");
        int anio = sc.nextInt();
        return new Vehiculo (marca,  modelo,  motor,  chasis,  color,  tipo,  anio);
     
    }
   
     /*
    Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.)
    */
    public Poliza llenarPoliza(Cliente c, Vehiculo v){
        
        System.out.println("Ingrese los datos de la poliza");
        System.out.println("--------------------");
        System.out.println("Numero de poliza:");
        int poliza = sc.nextInt();
        
        System.out.println("Fecha de Inicio");
        System.out.println("Dia");
        int dia = sc.nextInt();
        System.out.println("Mes");
        int mes = sc.nextInt();
        System.out.println("Año");
        int anio = sc.nextInt();
        Date fechaIni = new Date (anio-1900,mes-1,dia);
        
        System.out.println("Fecha de fin de Poliza");
        System.out.println("Dia");
        int diaFin = sc.nextInt();
        System.out.println("Mes");
        int mesFin = sc.nextInt();
        System.out.println("Año");
        int anioFin = sc.nextInt();
        Date fechaFin = new Date (anioFin-1900,mesFin-1,diaFin);
        calcularCuota();
        
        
        System.out.println("Ingrese el monto total asegurado");
        double montoTotal = sc.nextDouble();
        System.out.println("Tipo de cobertura");
        String tipoCobertura = sc.next();
        System.out.println("Incluye granizo?(si/no)");
        String gra = sc.next();
        boolean granizo;
        if (gra.equalsIgnoreCase("si")) {
            granizo=true;
        } else {
            granizo=false;
        }
        double montoGranizo;
        if (granizo) {
            System.out.println("Monto maximo asegurado por granizo");
            montoGranizo = sc.nextDouble();
        } else {
            montoGranizo = 0;
        }

        return new Poliza( c,v,tipoCobertura,  poliza, cuotas, montoTotal,  montoGranizo,  fechaIni,  fechaFin,  granizo);
    }
    
   public void añadirPoliza(Poliza pol){
       polizas.add(pol);
   }
 
    public void calcularCuota(){
        
        System.out.println("Ingrese la cantidad de cuotas");
        int cant = sc.nextInt();
        for (int i = 0; i < cant; i++) {
            int nroCuota = i+1;
            System.out.println("Ingrese el monto de la cuota " + (i+1));
            double montoCuota = sc.nextDouble();
            System.out.println("La cuota esta pagada?");
            String resp = sc.next();
            boolean pagada = false;
            if (resp.equalsIgnoreCase("si")) {
                pagada = true;
            } else {
                pagada = false;
            }
            Date vencimiento = new Date ();
            FormaPago forma = FormaPago.pendiente;
            if (!pagada) {
                System.out.println("Ingrese el dia de vencimiento de la cuota");
                int dia = sc.nextInt();
                System.out.println("Ingrese el mes de vencimiento de la cuota");
                int mes = sc.nextInt();
                System.out.println("Ingrese el año de vencimiento de la cuota");
                int anio = sc.nextInt();
                vencimiento = new Date(anio-1900, mes-1, dia);
                forma = FormaPago.pendiente;

            } else {
                int opc;
                do {
                    System.out.println("Ingrese la forma de pago");
                    System.out.println("Forma de pago: 1-Efectivo/2-Debito/3-Credito");
                    opc = sc.nextInt();
                    FormaPago [] formasdePago = FormaPago.values();
                    forma = formasdePago [opc-1];
                } while (opc>3 || opc<1);
            }

            Cuota c = new Cuota( nroCuota,  montoCuota,  pagada,  vencimiento,  forma);
            cuotas.add(c);
        }
        
    }
    
    public void eliminarPoliza(){
        System.out.println("Ingrese el numero de poliza que desea eliminar");
        int nroPoliza = sc.nextInt();
        int conta = 0;
        for (Poliza aux : polizas) {
            if (nroPoliza == aux.getPoliza()) {
                System.out.println("Los datos de la poliza son:");
                System.out.println("Cliente:");
                System.out.println(aux.getCliente());
                System.out.println("Vehiculo:");
                System.out.println(aux.getVehiculo());
                System.out.println("Desea eliminar (Si para confirmar)");
                String opc = sc.next();
                conta++;
                if (opc.equalsIgnoreCase("si")) {
                    polizas.remove(aux);
                    System.out.println("Poliza eliminada");
                    break;
                } else {
                    System.out.println("No se elimino la poliza");
                }
            }
        }
        if (conta==0) {
            System.out.println("No se encontro la poliza");
        }
    }
    
    public void mostrarPoliza(){
        System.out.println("Las polizas vigentes son: ");
        System.out.println(polizas.toString());
    }
    public void mostrarClientes(){
        System.out.println("Los clientes activos son: ");
        for (Poliza aux : polizas) {
            System.out.println(aux.getCliente());
        }
    }
    public void mostrarVehiculos(){
        System.out.println("Los vehiculos activos son: ");
        for (Poliza aux : polizas) {
            System.out.println(aux.getVehiculo());
        }
    }
}
