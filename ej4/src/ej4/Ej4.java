/*
 *Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
 *La fórmula correspondiente es: F = 32 + (9 * C / 5).

 */
package ej4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int gradoC;
        double gradoF;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados centígrados");
        gradoC = leer.nextInt();
        gradoF = 32 + (9 * gradoC / 5);
        System.out.println("Los grados en Fahrenheit son: " + gradoF);
    }
    
}
