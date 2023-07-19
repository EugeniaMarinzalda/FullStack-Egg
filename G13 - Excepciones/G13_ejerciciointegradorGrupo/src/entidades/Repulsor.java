
package entidades;

public class Repulsor {
    public int consumoEnergia;

    public Repulsor() {
    }

    public Repulsor(int consumoEnergia) {
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
        return "Repulsor{" + "consumoEnergia=" + consumoEnergia + '}';
    }
    
                                
}
