
package g12_teorico.Entidades;

import Interfaces.InterfaceName;

public class NewClass implements InterfaceName {

    @Override
    public void usarInterfaz() {
        System.out.println("Aqui se usa la interface");
    }

    @Override
    public void saludar() {
        System.out.println("Hola mundo");
    }
    
}
