/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        System.out.println("Mayúscula: " + frase.toUpperCase());
        System.out.println("Minúscula: " +frase.toLowerCase());
    }
    
}
