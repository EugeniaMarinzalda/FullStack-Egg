
package g13_ejercicios.entidades;

public class ClaseA {
    public void metodoA() throws MioException {   // indico que el metodo lanza exceptiones
        System.out.println("sentencia_a1");
        System.out.println("sentencia_a2");
            try {
                if (false) {
                   throw new MioException(); 
                }
                System.out.println("sentencia_a3");
                System.out.println("sentencia_a4");
                
                
            } catch (MioException e){  
                System.out.println("sentencia_a6");
            }
        System.out.println("sentencia_a5");
    }
    
    /*
    EJERCICIO 6
    a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
    a1
    a2
    a6
    a5
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
    a1
    a2
    a3
    a4
    a5
    */
    
}
