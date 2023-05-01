/*
 * Escriba un programa en el cual se ingrese un valor limite positivo, y a continuacion solicite 
numeros al usuario hasta que la suma de los numeros introducidos supere el limite inicial.
 */
package e5_ej_practicos_5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class E5_ej_practicos_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int limite,cont, num;
        Scanner leer = new Scanner(System.in);
        limite = 50;
        cont = 0;
        do {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            cont += num;
        } while (cont != limite);
                
                
    }
    
}
