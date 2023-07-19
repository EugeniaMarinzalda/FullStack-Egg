/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g11_ejerteorico.entidades;

/**
 *
 * @author EUGE
 */
public class dni {
    private Integer DNI;
    private String caracter;

    public dni() {
    }

    public dni(Integer DNI, String caracter) {
        this.DNI = DNI;
        this.caracter = caracter;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }

    @Override
    public String toString() {
        return "dni{" + "DNI=" + DNI + ", caracter=" + caracter + '}';
    }

    
}
