/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e9_ej_1;

/**
 *
 * @author Usuario
 */
public class E9_ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vector[ ] = new int[100];
        
        for (int i = 1; i < 100; i++) {
            vector[i] = i;
        }
        
        for (int i = 99; i > 0; i--) {
            System.out.println("El vector es: " + vector[i]);
        }
    }
    
}
