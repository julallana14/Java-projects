/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e11_exextra_1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class E11_exExtra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tam = leer.nextInt();
        int suma = 0, val=0;
        int [] vector = new int[tam];
        System.out.println("Ingrese los valores del vector");
        for (int i = 0; i < tam; i++) {
             val = leer.nextInt();
             vector [i] = val;
        }
        System.out.println("-------------VECTOR--------------");
        for (int i = 0; i < tam; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        for (int i = 0; i < tam; i++) {
            suma += vector[i];
        }
        System.out.println(" ");
        System.out.println("La suma de los valores del vector es de: " + suma);
    }
    
}
