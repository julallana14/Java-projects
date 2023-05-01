/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e11_exextra_5;

/**
 *
 * @author Usuario
 */
public class E11_exExtra_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[3] [3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 11);
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
        
        int suma=0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println("La suma de los elementos de la matriz es: " + suma);
    }
    
}
