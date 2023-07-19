
package entidades;


public class Guante extends Dispositivo {
    
    public Repulsor repulsor;

    public Guante(float consumoEnergia) {
        super(consumoEnergia);
    }

    public Guante(Repulsor repulsor, float consumoEnergia) {
        super(consumoEnergia);
        this.repulsor = repulsor;
    }


    public Repulsor getRepulsor() {
        return repulsor;
    }

    public void setRepulsor(Repulsor repulsor) {
        this.repulsor = repulsor;
    }


    @Override
    public String toString() {
        return "Guante{" + "repulsor=" + repulsor +  '}';
    }
    
    
}
