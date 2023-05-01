/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e5_ej_practicos_2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class E5_ej_practicos_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        if (frase.equalsIgnoreCase("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
    
}
