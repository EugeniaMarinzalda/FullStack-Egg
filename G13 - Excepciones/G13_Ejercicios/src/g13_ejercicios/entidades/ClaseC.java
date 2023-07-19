
package g13_ejercicios.entidades;

public class ClaseC {
    
    public void metodoC() throws TuException, MioException{
        System.out.println("sentencia_c1");
        try {
            if (false) {
                   throw new MioException(); 
            }
            System.out.println("sentencia_c2");
            System.out.println("sentencia_c3");
            if (true) {
                   throw new TuException(); 
            }
        } catch (MioException e){
            System.out.println("sentencia_c4");
        } catch (TuException e2){
            System.out.println("sentencia_c5");
            throw (e2);
        } finally {
            System.out.println("sentencia_c6");
        }
    }    
}
