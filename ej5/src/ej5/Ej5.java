/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, doble, triple, cuadrada;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        num = leer.nextInt();
        doble = num * 2;
        triple = num * 3;
        cuadrada = (int) Math.sqrt(num);
        System.out.println("El doble es: " + doble + "\n" + "el triple es: " + triple + "\n"
                + "la raíz cuadrada es: " + cuadrada );
        System.out.println("");
                
    }
    
}
