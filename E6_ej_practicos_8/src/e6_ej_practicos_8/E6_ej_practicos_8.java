/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e6_ej_practicos_8;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class E6_ej_practicos_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num,i,j;
        Scanner leer = new Scanner(System.in);
        num = leer.nextInt();
        
        for (i = 1; i != num; i++) {
            for (j = 1; j != num; j++){
                if (i > 1 && i < num && j > 1 && j < num) {
                    System.out.print("");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println(" ");
        }
    }
    
}
