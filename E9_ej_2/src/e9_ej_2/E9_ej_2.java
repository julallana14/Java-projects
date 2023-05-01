/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e9_ej_2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class E9_ej_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int num = leer.nextInt();
        int vector[] = new int[num];
        int cont = 0;
        
        for (int i = 0; i < num; i++) {
            vector[i] = (int) (Math.random() * 11);
        }
        
        for (int i = 0; i < num; i++) {
            System.out.println("El vector es: " + vector[i]);
        }
        System.out.println("¿Qué valor desea buscar dentro del vector?");
        int buscar = leer.nextInt();
        
        for (int i = 0; i < num; i++) {
            if (vector[i] == buscar) {
                System.out.println("La posición del valor es de: " + i);
                cont++;
            } 
            
        }
        if (cont > 0) {
                    System.out.println("El valor se repite: " + cont + "veces");
                }
    }
    
    
}
