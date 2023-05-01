/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e5_ej_practicos_4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class E5_ej_practicos_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase");
        frase = leer.nextLine();
        if ("a".equals(frase.substring(0,1))){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
    
}
