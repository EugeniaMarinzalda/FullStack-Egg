
package entidades;

public class Dispositivo {

    private float consumoEnergia;
    private boolean danado;
    private float intensidad;
 
    public Dispositivo (float consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
        this.danado = false;
        
    }

    public float usar(NivelIntensidad nivelIntensidad, int tiempo) {
        if (!danado) {
            float consumoTotal = consumoEnergia * nivelIntensidad.getFactorIntensidad() * tiempo;
            return consumoTotal;
        }
        return 0.0f;
    }

    public void mostrarEstado() {
        String estado = danado ? "Dañado" : "Sano";
        System.out.println("Estado del dispositivo: " + estado);
    }

    enum NivelIntensidad {
        BASICO(1.0f),
        NORMAL(2.0f),
        INTENSIVO(3.0f);

        private float factorIntensidad;

        NivelIntensidad(float factorIntensidad) {
            this.factorIntensidad = factorIntensidad;
        }

        public float getFactorIntensidad() {
            return factorIntensidad;
        }
    }  
    
    public void mostrarEstadoReactor(Armadura a) {
        float kilovatios = a.getGenerador().getEnergiaGenerada() / 3600000;
        float caballosDeFuerza = a.getGenerador().getEnergiaGenerada() / 745.7f;
        System.out.println("Estado del reactor:");
        System.out.println("Energía generada en kilovatios: " + kilovatios);
        System.out.println("Energía generada en caballos de fuerza: " + caballosDeFuerza);
    }
    
    public void mostrarEstadoBateria(Armadura a) {
        float porcentajeBateria = (a.getBateria() / a.getGenerador().getCargaMaxima()) * 100;
        System.out.println("Estado de la batería: " + porcentajeBateria + "%");
    }
    
    private void informarConsumoEnergia(float energiaConsumida,Armadura a) {
        a.getGenerador().consumirEnergia(energiaConsumida);
        a.setBateria(a.getBateria()-energiaConsumida);
    }
    
    
}    
    

