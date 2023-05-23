
package g12_teorico;

import g12_teorico.Entidades.NewClass;

/**
 Vamos a crear una interfaz con un método abstracto. Luego desde el main intentaremos instanciar
un objeto a partir de la interfaz
 */
public class G12_Teorico2 {

    public static void main(String[] args) {
        NewClass c1 = new NewClass ();
        c1.usarInterfaz();
        
        NewClass c2 = new NewClass ();
        c2.saludar();
    }
    
}
