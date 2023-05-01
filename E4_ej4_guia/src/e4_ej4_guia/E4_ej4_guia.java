/*
 * Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del bucle 
y mostrar el mensaje "Se capturó el numero cero".  El programa deberá calcular y mostrar el resultado de 
la suma de los números leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso de la 
sentencia break.

 */
package e4_ej4_guia;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class E4_ej4_guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num,cont,suma;
        Scanner leer = new Scanner(System.in);
        cont = 0;
        suma = 0;
        do {
            num = leer.nextInt();
            cont = cont + 1;
            suma = suma + num;
            
        } while (num != 0 && cont < 20);
        if (num == 0) {
            System.out.println("Se capturó el numero cero");
        }
        System.out.println("La suma es de: " + suma);
    }       
}
