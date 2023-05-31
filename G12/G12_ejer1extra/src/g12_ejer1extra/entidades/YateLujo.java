
package g12_ejer1extra.entidades;


public final class YateLujo extends Barco{
    /*
    Potencia en CV y número de camarotes para yates de lujo.
    */
    private int cv, camarotes;

    public YateLujo() {
    }
    
    public YateLujo(int cv, int camarotes) {
        this.cv = cv;
        this.camarotes = camarotes;
    }

    public YateLujo(int cv, int camarotes, String matricula, int eslora, int añoFab) {
        super(matricula, eslora, añoFab);
        this.cv = cv;
        this.camarotes = camarotes;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        return "YateLujo{" + "cv=" + cv + ", camarotes=" + camarotes + '}';
    }
    
    @Override
    public YateLujo crearBarco() {
        Barco b = super.crearBarco();
        System.out.println("Ingrese la potencia en cv");
        int cv = sc.nextInt();
        System.out.println("Ingrese la cantidad de camarotes");
        int camarotes = sc.nextInt();     
        return new YateLujo(cv,camarotes,b.getMatricula(),b.getEslora(),b.getAnioFab());  
    }
}
