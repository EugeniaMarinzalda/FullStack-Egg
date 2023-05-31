
package g12_ejer1extra.entidades;

public final class aMotor extends Barco{
    /*
    Potencia en CV para barcos a motor.
    */
    private int cv;

    public aMotor(int cv) {
        this.cv = cv;
    }

    public aMotor(int cv, String matricula, int eslora, int añoFab) {
        super(matricula, eslora, añoFab);
        this.cv = cv;
    }

    public aMotor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "aMotor{" + "cv=" + cv + '}';
    }
    
    @Override
    public aMotor crearBarco() {
        Barco b = super.crearBarco();
        System.out.println("Ingrese la potencia en cv");
        int cv = sc.nextInt();
        return new aMotor(cv,b.getMatricula(),b.getEslora(),b.getAnioFab());
    }
}
