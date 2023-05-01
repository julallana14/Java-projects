/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e10_ej5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class E10_ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [] [] matrizO = new int [3] [3];
        int [] [] matrizT = new int [3] [3];
        
        System.out.println("Ingrese los valores de la matriz original");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizO [i][j] = leer.nextInt();
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizT [j] [i] = matrizO [i] [j];
            }
        }
        System.out.println("MATRIZ ORIGINAL");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizO[i][j] + "]");
            }
            System.out.println(" ");
        }
        
        System.out.println("MATRIZ TRASPUESTA");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizT[i] [j] + "]");
            }
            System.out.println(" ");
        }
        int cont;
        cont = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizO[i][j] + matrizT[i][j] == 0 ) {
                    cont++;
                }
            }
        }
         if (cont ==9) {
                System.out.println("La matriz es antisimétrica");
            } else {
                System.out.println("La matriz no es antisimétrica");
            }
    }
    
}
