/*
 * Escriba un programa que valide si una nota esta entre 0 y 10, sino esta entre 0 y 10 
la nota se pedirá de nuevo hasta que la nota sea correcta.

 */
package e4_ej3_guia;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class E4_ej3_guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una nota");
        nota = leer.nextInt();
        
        while (nota < 0 || nota > 10) {
            System.out.println("La nota no está entre 0 y 10. Ingrese de nuevo");
            nota = leer.nextInt();
    
        }
        System.out.println("Nota correcta");
    }
    
}
