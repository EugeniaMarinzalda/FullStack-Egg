/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g13_ejercicios.entidades;

import java.text.Normalizer;


/**
 *
 * @author EUGE
 */
public class ejer2 {
    
    /*
        Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
        */
        //ejercicio 2
    public void llenarVector (){
        int [] vector = new int [8];
        
        for (int i = 0; i < vector.length+1; i++) {
            vector[i]= (int) Math.random()*10;
        }

        
    }    
    
    
    
    
    
}
