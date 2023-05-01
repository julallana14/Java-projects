/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e7.pkg8_ejguia_2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class E78_ejGuia_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        EsMultiplo(num1, num2);
    }
    public static void EsMultiplo(int num1, int num2) {
        if (num2 % num1 == 0) {
            System.out.println("El segundo número es múltiplo del primero");
            
        }else {
            System.out.println("El segundo número NO es múltiplo del primero");
        }
    }
}
