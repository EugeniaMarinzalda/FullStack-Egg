
package g12_ejer1extra.entidades;

public final class Velero extends Barco{
    /*
    Número de mástiles para veleros.
    */
    private int mastil;

    public Velero() {
    }

    public Velero(String matricula, int eslora, int añoFab) {
        super(matricula, eslora, añoFab);
    }

    public Velero(int mastil, String matricula, int eslora, int añoFab) {
        super(matricula, eslora, añoFab);
        this.mastil = mastil;
    }

    public int getMastil() {
        return mastil;
    }

    public void setMastil(int mastil) {
        this.mastil = mastil;
    }

    @Override
    public String toString() {
        return "Velero{" + "mastil=" + mastil + '}';
    }

    @Override
    public Velero crearBarco() {
        System.out.println("Ingrese la cantidad de mastiles");
        int mastil = sc.nextInt();
        Barco b = super.crearBarco();
        return new Velero(mastil,b.getMatricula(),b.getEslora(),b.getAnioFab());
    }
}
