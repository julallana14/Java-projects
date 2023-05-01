/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, suma;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        num2 = leer.nextInt();
        suma = num1 + num2;
        System.out.println("La suma es de: " + suma);
                
    }
    
}
