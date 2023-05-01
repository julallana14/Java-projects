/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e5_ej_practicos3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class E5_ej_practicos3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase o palabra");
        frase = leer.nextLine();
        if (frase.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
    
}
