/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e9_ej_4;

/**
 *
 * @author Usuario
 */
public class E9_ej_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] [] matriz = new int [4] [4];
        int [] [] matrizT = new int [4] [4];
        //relleno la matriz original con números random
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 11);
            }
        }
        //muesto la matriz original
        System.out.println("Matriz original:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matriz [i][j] + "]");
            }
            System.out.println(" ");
        }
        //relleno la matriz traspuesta con los valores de la matriz original pero invertidos
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizT [j] [i] = matriz [i] [j];
            }
        }
        //muestro la matriz traspuesta
        System.out.println("Matriz traspuesta:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matrizT [i] [j] + "]");
            }
            System.out.println(" ");
        }
    }
    
}
