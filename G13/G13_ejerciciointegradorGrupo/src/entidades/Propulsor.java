
package entidades;


public class Propulsor {
    public int consumoEnergia;

    public Propulsor() {
    }

    public Propulsor(int consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public int getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(int consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    @Override
    public String toString() {
        return "Propulsor{" + "consumoEnergia=" + consumoEnergia + '}';
    }
    
    
}
