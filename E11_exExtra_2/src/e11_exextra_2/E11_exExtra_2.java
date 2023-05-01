/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e11_exextra_2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class E11_exExtra_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int [10];
        int[] vector2 = new int [10];
        int val=0, val2=0, cont=0;
        boolean dis;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los valores del primer vector");
        for (int i = 0; i < 10; i++) {
            val = leer.nextInt();
            vector[i] = val;
        }
        System.out.println("Ingrese los valores del segundo vector");
        for (int i = 0; i < 10; i++) {
            val2 = leer.nextInt();
            vector2[i] = val2;
        }
        for (int i = 0; i < 10; i++) {
            if (vector[i] == vector2[i]) {
                cont++;
            } 
        }
        if (cont ==10) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores NO son iguales");
        }
    }
    
}
