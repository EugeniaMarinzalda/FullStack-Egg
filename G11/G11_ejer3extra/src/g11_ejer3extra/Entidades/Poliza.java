
package g11_ejer3extra.Entidades;

import g11_ejer3extra.Enumeradores.FormaPago;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * c. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
muchos a uno o de muchos a muchos.
 */
public class Poliza {
    
    
    private Cliente cliente;
    private Vehiculo Vehiculo;
    private int poliza;
    private String tipoCobertura;
    private Date fechaIni, fechaFin;  
    private boolean granizo;
    private double montoTotal, montoGranizo;
    private ArrayList <Cuota> cuotas;  
    

    public Poliza() {
    }

    public Poliza(Cliente cliente, Vehiculo Vehiculo, String tipoCobertura, int poliza, ArrayList<Cuota> cuotas, double montoTotal, double montoGranizo, Date fechaIni, Date fechaFin, boolean granizo) {
        this.cliente = cliente;
        this.Vehiculo = Vehiculo;
        this.tipoCobertura = tipoCobertura;
        this.poliza = poliza;
        this.cuotas = cuotas;
        this.montoTotal = montoTotal;
        this.montoGranizo = montoGranizo;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.granizo = granizo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return Vehiculo;
    }

    public void setVehiculo(Vehiculo Vehiculo) {
        this.Vehiculo = Vehiculo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public int getPoliza() {
        return poliza;
    }

    public void setPoliza(int poliza) {
        this.poliza = poliza;
    }

    public ArrayList<Cuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(ArrayList<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public double getMontoGranizo() {
        return montoGranizo;
    }

    public void setMontoGranizo(double montoGranizo) {
        this.montoGranizo = montoGranizo;
    }

    public Date getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    @Override
    public String toString() {
        return cliente + "\n"+ Vehiculo + "\nPoliza{ Numero= " + poliza + ", tipo Cobertura=" + tipoCobertura + ", fecha Ini=" + fechaIni + ", fecha Fin=" + fechaFin + ", granizo=" + granizo + ", monto Total=" + montoTotal + " y monto Granizo=" + montoGranizo + "." + "\n" + cuotas + '}';
    }

    

}
