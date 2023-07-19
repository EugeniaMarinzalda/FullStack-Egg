
package g11_ejer3extra.Entidades;

import g11_ejer3extra.Enumeradores.FormaPago;
import java.util.Date;

/**
 * d. Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
etc.).
 */
public class Cuota {
    private int nroCuota;
    private double montoCuota;
    private boolean pagada;
    private Date vencimiento;
    private FormaPago formaPago;

    public Cuota() {
    }

    public Cuota(int nroCuota, double montoCuota, boolean pagada, Date vencimiento, FormaPago formaPago) {
        this.nroCuota = nroCuota;
        this.montoCuota = montoCuota;
        this.pagada = pagada;
        this.vencimiento = vencimiento;
        this.formaPago = formaPago;
    }

    public int getNroCuota() {
        return nroCuota;
    }

    public void setNroCuota(int nroCuota) {
        this.nroCuota = nroCuota;
    }

    public double getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(double montoCuota) {
        this.montoCuota = montoCuota;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Cuota{" + "nroCuota=" + nroCuota + ", montoCuota=" + montoCuota + ", pagada=" + pagada + ", vencimiento=" + vencimiento + ", formaPago=" + formaPago + '}';
    }

   
    
}
