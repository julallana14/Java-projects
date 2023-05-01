/*
 * Crear un programa que dado un número determine si es par o impar.

 */
package e5_ej_practicos_1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class E5_ej_practicos_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un número para determinar si es par o impar");
        num = leer.nextInt();
        if (num % 2 == 0){
            System.out.println("El número ingresado es par");
            
        } else {
            System.out.println("El número ingresado es impar");
        }
    }
    
}
