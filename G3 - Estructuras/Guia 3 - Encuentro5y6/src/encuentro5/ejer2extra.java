/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro5;

/**
 *Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar.
 * @author EUGE
 */
public class ejer2extra {
    public static void main(String[] args) {
        int a = (int) (Math.random()*10); 
        int b = (int) (Math.random()*10); 
        int c = (int) (Math.random()*10); 
        int d = (int) (Math.random()*10); 
        System.out.println("Valores iniciales");
        System.out.println(" A: " + a + " B: " + b + " C: " + c + " D: " + d );
        int Aux = b;
        b = c;
        c = a;
        a = d;
        d = Aux;
        System.out.println("Valores finales");
        System.out.println(" A: " + a + " B: " + b + " C: " + c + " D: " + d );       
    }
}
/*
// Declarar e inicializar las variables A, B, C y D con valores diferentes
    int A = 10;
    int B = 20;
    int C = 30;
    int D = 40;
    
    // Mostrar los valores iniciales de las variables
    System.out.println("Valores iniciales:");
    System.out.println("A = " + A + ", B = " + B + ", C = " + C + ", D = " + D);
    
    // Utilizar una variable auxiliar para realizar los intercambios
    int aux = B;
    B = C;
    C = A;
    A = D;
    D = aux;
    
    // Mostrar los valores finales de las variables
    System.out.println("Valores finales:");
    System.out.println("A = " + A + ", B = " + B + ", C = " + C + ", D = " + D);
*/