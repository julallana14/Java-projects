/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e4_ej5_guia;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class E4_ej5_guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num,i,j;
        Scanner leer = new Scanner(System.in);
        
        for (j = 0; j < 4; j++) {
            num = leer.nextInt();
            if (num > 0 && num < 21){
                System.out.print(num);
            }
            for (i = 0;i < num; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
}
