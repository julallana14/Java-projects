/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e10_ej6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class E10_ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [] [] matriz = new int [3] [3];
        System.out.println("Ingrese valores del 1 al 9");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
        //sumo las filas
        int f0 = 0,f1 = 0,f2 = 0,c0 = 0,c1 = 0,c2 = 0,d1 = 0,d2 = 0;
                
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (i) {
                    case 0:
                        f0 = f0 +  matriz[i][j];
                        break;
                    case 1:
                        f1 = f1 + matriz[i][j];
                        break;
                    case 2:
                        f2 = f2 + matriz[i][j];
                }
            }
        }
        //sumo las columnas
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (j) {
                    case 0:
                        c0 = c0 + matriz[i][j];
                        break;
                    case 1:
                        c1 = c1 + matriz[i][j];
                        break;
                    case 2:
                        c2 = c2 + matriz[i][j];
                }
            }
        }
        //sumo las diagonales
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                     d1 = d1 + matriz[i][j];
                    } 
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i+j == matriz.length-1) {
                    d2 = d2 + matriz[i][j];
                    } 
            }
        }
        
        boolean filas = false, columnas = false, diagonales = false;
        if (f0 == f1 && f1 == f2 && f2 == f0) {
            filas = true;
        }
        if (c0 == c1 && c1 == c2 && c2 == c0) {
                columnas = true;
            }
         if (d1 == d2) {
                    diagonales = true;
                }
 
        if (filas == true && columnas == true && diagonales == true) {
            System.out.println("La matriz es mágica");
        } else {
            System.out.println("La matriz no es mágica");
        }
        
    }
    
}
