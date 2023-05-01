/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e11_exextra_3;

/**
 *
 * @author Usuario
 */
public class E11_exExtra_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int [7];
        int[] vecN;
        vecN = new int [7] =  rellena(vector);
        
    
    }
    public static int[] rellena(int [] vector) {
        int[] vec = new int [7];
        for (int i = 0; i < 7; i++) {
            vector[i] = (int) (Math.random() * 11);
            vec[i] = vector[i];
        }
        return vec;
    }  
}
