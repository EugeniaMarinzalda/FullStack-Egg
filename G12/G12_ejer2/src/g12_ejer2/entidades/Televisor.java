
package g12_ejer2.entidades;

public final class Televisor extends Electrodomestico {
    /*
    Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
    */
    private int resolucion;
    private boolean sintonizadorTDT ;
    
    /*
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
    */

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizadorTDT) {
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(int resolucion, boolean sintonizadorTDT, double precio, double peso, String color, char consumo) {
        super(precio, peso, color, consumo);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }
/*
    Método get y set de los atributos resolución y sintonizador TDT.
    */
    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public String toString() {
        return "Televisor=>" + super.toString() +", resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + '}';
    }

        
}
