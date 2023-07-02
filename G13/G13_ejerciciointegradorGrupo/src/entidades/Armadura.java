/*
En este trabajo se deberá crear en el proyecto una clase llamada Armadura que modele toda la
información y las acciones que pueden efectuarse con la Armadura de Iron Man. La armadura de
Iron Man es un exoesqueleto mecánico ficticio usado por Tony Stark cuando asume la identidad
de Iron Man. La primera armadura fue creada por Stark y Ho Yinsen, mientras estuvieron
prisioneros.
En este trabajo se deberá crear en el proyecto una clase llamada Armadura que modele toda la
información y las acciones que pueden efectuarse con la Armadura de Iron Man. La armadura de
Iron Man es un exoesqueleto mecánico ficticio usado por Tony Stark cuando asume la identidad
de Iron Man. La primera armadura fue creada por Stark y Ho Yinsen, mientras estuvieron
prisioneros.
Las armaduras de Stark se encuentran definidas por un color primario y un color secundario. Se
encuentran compuestas de dos propulsored, uno en cada bota; y dos repulsores, uno en cada
guante (los repulsores se utilizan también como armas). Tony los utiliza en su conjunto para volar.

La armadura tiene un nivel de resistencia, que depende del material con el que está fabricada, y
se mide con un número entero cuya unidad de medida de dureza es Rockwell
(https://es.wikipedia.org/wiki/Dureza_Rockwell). Todas las armaduras poseen un nivel de salud el
cual se mide de 0 a 100. Además, Tony tiene un generador, el cual le sirve para salvarle la vida en
cada instante de tiempo alejando las metrallas de metal de su corazón y también para alimentar
de energía a la armadura. La batería a pesar de estar en el pecho de Tony, es considerada como
parte de la armadura.
La armadura también posee una consola en el casco, a través de la cual JARVIS le escribe
información a Iron Man. En el casco también se encuentra un sintetizador por donde JARVIS
susurra cosas al oído de Tony. Cada dispositivo de la armadura de Iron Man (botas, guantes,
consola y sintetizador) tienen un consumo de energía asociado.
*/
package entidades;


public class Armadura {
    private String colorPrimario;
    private String colorSecundario;
    private int nivelResistencia;
    private int nivelSalud;
    private float bateria;
    private Generador generador;
    private Bota botaIzquierda;
    private Bota botaDerecha;
    private Guante guanteIzquierdo;
    private Guante guanteDerecho;
    private Casco casco;

    public Armadura() {
    }

    public Armadura(String colorPrimario, String colorSecundario, int nivelResistencia, int nivelSalud, float bateria, Generador generador, Bota botaIzquierda, Bota botaDerecha, Guante guanteIzquierdo, Guante guanteDerecho, Casco casco) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.nivelResistencia = nivelResistencia;
        this.nivelSalud = nivelSalud;
        this.bateria = bateria;
        this.generador = generador;
        this.botaIzquierda = botaIzquierda;
        this.botaDerecha = botaDerecha;
        this.guanteIzquierdo = guanteIzquierdo;
        this.guanteDerecho = guanteDerecho;
        this.casco = casco;
    }

    public Armadura(String colorPrimario, String colorSecundario, int nivelResistencia, int nivelSalud, float bateria) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.nivelResistencia = nivelResistencia;
        this.nivelSalud = nivelSalud;
        this.bateria = bateria;
    }

    
    
    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public int getNivelResistencia() {
        return nivelResistencia;
    }

    public void setNivelResistencia(int nivelResistencia) {
        this.nivelResistencia = nivelResistencia;
    }

    public int getNivelSalud() {
        return nivelSalud;
    }

    public void setNivelSalud(int nivelSalud) {
        this.nivelSalud = nivelSalud;
    }

    public float getBateria() {
        return bateria;
    }

    public void setBateria(float bateria) {
        this.bateria = bateria;
    }

    public Generador getGenerador() {
        return generador;
    }

    public void setGenerador(Generador generador) {
        this.generador = generador;
    }

    public Bota getBotaIzquierda() {
        return botaIzquierda;
    }

    public void setBotaIzquierda(Bota botaIzquierda) {
        this.botaIzquierda = botaIzquierda;
    }

    public Bota getBotaDerecha() {
        return botaDerecha;
    }

    public void setBotaDerecha(Bota botaDerecha) {
        this.botaDerecha = botaDerecha;
    }

    public Guante getGuanteIzquierdo() {
        return guanteIzquierdo;
    }

    public void setGuanteIzquierdo(Guante guanteIzquierdo) {
        this.guanteIzquierdo = guanteIzquierdo;
    }

    public Guante getGuanteDerecho() {
        return guanteDerecho;
    }

    public void setGuanteDerecho(Guante guanteDerecho) {
        this.guanteDerecho = guanteDerecho;
    }

    public Casco getCasco() {
        return casco;
    }

    public void setCasco(Casco casco) {
        this.casco = casco;
    }

    @Override
    public String toString() {
        return "Armadura{" + "colorPrimario=" + colorPrimario + ", colorSecundario=" + colorSecundario + ", nivelResistencia=" + nivelResistencia + ", nivelSalud=" + nivelSalud + ", bateria=" + bateria + ", generador=" + generador + ", botaIzquierda=" + botaIzquierda + ", botaDerecha=" + botaDerecha + ", guanteIzquierdo=" + guanteIzquierdo + ", guanteDerecho=" + guanteDerecho + ", casco=" + casco + '}';
    }
    
    
    
}
