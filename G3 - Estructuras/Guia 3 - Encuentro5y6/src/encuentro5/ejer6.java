package encuentro5;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.
 * @author EUGE
 */
public class ejer6 {
    public static void main(String[] args) {
        System.out.println("Ingrese dos numero positivos");
        Scanner leer = new Scanner(System.in);
        float num1 = leer.nextInt();
        float num2 = leer.nextInt();
        boolean hacer = true;        
        do {            
            System.out.println("Menu");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija Opción");
            int opcion = leer.nextInt();            
            switch  (opcion) {
                case 1:
                    System.out.println("El valor de la suma es " + (num1+num2) );
                    break;
                case 2:
                    System.out.println("El valor de la resta es " + (num1-num2) );
                    break;
                case 3:
                    System.out.println("El valor de la multiplicacion es " + (num1*num2) );
                    break;
                case 4:
                    System.out.println("El valor de la division es " + (num1/num2) );
                    break;
                case 5:
                    System.out.println("Esta seguro que quiere abandonar? (S/N) ");
                        String confirma = leer.next();
                        confirma = confirma.toUpperCase();
                        if (confirma.equals("S")) {
                            hacer = false;
                        }
            }
        } while (hacer);
    }
}
/* otro
case 5:
                     
                     System.out.println("Está seguro que desea salir?");
                     System.out.println("S para si o N para no");
                     String yesNo = input.next();
                     while (!"S".equals(yesNo) && !"N".equals(yesNo)){
                         System.out.println("Opcion incorrecta, por favor elija "
                                 + "S para si o N para no");
                         yesNo = input.next();
                     }
                     confirm = yesNo;
                     break;
                     
                     
                     
             default:
                 System.out.println("La opción ingresada no es correcta");
                 confirm = "N";
                 break;
         }
    
    
    }while(confirm.equalsIgnoreCase("N"));
case 5:
                    System.out.println(" ");
                    System.out.println("Esta seguro que desea salir?");
                    System.out.println("S para Si o N para No");
                    String rta = leer.next();
                    
                    log = rta.equalsIgnoreCase("S");      
                
            }          
            System.out.println("  ");        
        } while(log != true);
*/