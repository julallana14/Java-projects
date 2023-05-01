/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e9_ej_3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class E9_ej_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tam = leer.nextInt();
        int vector[] = new int[tam];
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        
        for (int i = 0; i < tam; i++) {
            vector[i] = (int) (Math.random() * 11111);
            int num = vector[i];
            String cad = String.valueOf(num);
            switch (cad.length()) {
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
            }
        }
        for (int i = 0; i < tam; i++) {
            System.out.println("El vector es: " + vector[i]);
        }
        
        System.out.println("Números de 1 dígito: " + cont1) ;
        System.out.println("Números de 2 dígitos: " + cont2);
        System.out.println("Números de 3 dígitos: " + cont3);
        System.out.println("Números de 4 dígitos: " + cont4);
        System.out.println("Números de 5 dígitos: " + cont5);
    }
    
}
