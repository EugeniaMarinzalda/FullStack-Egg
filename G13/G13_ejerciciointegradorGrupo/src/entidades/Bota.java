
package entidades;


public class Bota extends Dispositivo {
    
    public Propulsor propulsor;
    
    

    public Bota(Propulsor propulsor, float consumoEnergia) {
        super(consumoEnergia);
        this.propulsor = propulsor;
    }

    public Bota(float consumoEnergia) {
        super(consumoEnergia);
    }

    public Propulsor getPropulsor() {
        return propulsor;
    }

    public void setPropulsor(Propulsor propulsor) {
        this.propulsor = propulsor;
    }


    @Override
    public String toString() {
        return "Bota{" + "propulsor=" + propulsor +  '}';
    }
    
      /*
    Al caminar la armadura hará un uso básico de las botas y se consumirá la energía
establecida como consumo en la bota por el tiempo en el que se camine.
    */       
    public void caminar(float tiempo, Armadura a){
        System.out.println("El generador tiene : "+ a.getGenerador().getCargaMaxima());
        float energiaConsumida = 10*tiempo;
        a.getGenerador().setCargaMaxima(a.getGenerador().getCargaMaxima()-energiaConsumida); 
        System.out.println("La energia consumida es : "+ energiaConsumida);
        System.out.println("El generador tiene : "+ a.getGenerador().getCargaMaxima());
    }
    /*
    Al correr la armadura hará un uso normal de las botas y se consumirá el doble de la
energía establecida como consumo en la bota por el tiempo en el que se corra.
    */
    public void correr (float tiempo, Armadura a){
        float energiaConsumida = 20*tiempo*2;
        a.getGenerador().setCargaMaxima(a.getGenerador().getCargaMaxima()-energiaConsumida); 
    }
    
    
}
