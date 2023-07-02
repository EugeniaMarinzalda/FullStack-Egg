
package g13_ejercicios.entidades;


public class ClaseB {
    
    public void metodoB()throws MioException {
        System.out.println("sentencia_b1");
        try {
            if (true) {
                   throw new MioException(); 
            }
            System.out.println("sentencia_b2");
        } catch (MioException e){
           System.out.println("sentencia_b3");
        } finally {
            System.out.println("sentencia_b4");
        }
    
    }
}
/*
a)Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
sentencia_b1
sentencia_b3
sentencia_b4
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException
sentencia_b1
sentencia_b2
sentencia_b4
*/