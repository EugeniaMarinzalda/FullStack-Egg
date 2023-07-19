
package entidades;


public class Generador {
 
    private float cargaMaxima;
    private float energiaGenerada;

    public Generador() {
        this.cargaMaxima = Float.MAX_VALUE;
        this.energiaGenerada = 0.0f;
    }

    public float getCargaMaxima() {
        return cargaMaxima;
    }

    public float getEnergiaGenerada() {
        return energiaGenerada;
    }

    public void setCargaMaxima(float cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public void setEnergiaGenerada(float energiaGenerada) {
        this.energiaGenerada = energiaGenerada;
    }

    
    public void consumirEnergia(float cantidad) {
        energiaGenerada -= cantidad;
    }

    @Override
    public String toString() {
        return "Generador{" + "cargaMaxima=" + cargaMaxima + ", energiaGenerada=" + energiaGenerada + '}';
    }
     
    
}
