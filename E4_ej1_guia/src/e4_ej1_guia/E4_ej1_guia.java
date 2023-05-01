/*
 * Implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno de 
ellos es mayor a 25.
 */
package e4_ej1_guia;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class E4_ej1_guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el primer número entero");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número entero");
        num2 = leer.nextInt();
        
        if (num1 > 25 && num2 > 25) {
                System.out.println("Ambos números son mayores a 25");
        } else if (num1 > 25) {
            System.out.println("El primer número es mayor a 25");
        } else if (num2 > 25) {
            System.out.println("El segundo número es mayor a 25");
        } else {
            System.out.println("Ningún número es mayor a 25");
        }
    } 
    
}
