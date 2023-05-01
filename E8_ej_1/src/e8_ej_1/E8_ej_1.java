/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e8_ej_1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class E8_ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int num1 = leer.nextInt();
         int num2 = leer.nextInt();
        
        System.out.println("Elija una opción");
        System.out.println("1. Sumar \n 2. Restar \n 3. Multiplicar \n 4. Dividir");
        int opc = leer.nextInt();
        switch (opc) {
            case 1:
                sumar(opc,num1,num2);
                break;
            case 2:
                restar(opc,num1,num2);
                break;
            case 3:
                multiplicar(opc,num1,num2);
                break;
            case 4:
                double div = dividir(opc,num1,num2);
                break;
        }
    }
    public static int sumar(int opc, int num1, int num2) {
        int suma;
        suma = num1 + num2;
         System.out.println("La suma es: " + suma);
        return suma;
    }
    
     public static int restar(int opc, int num1, int num2) {
        int resta;
        resta = num1 - num2;
        System.out.println("La resta es: " + resta);
        return resta;
    }
     
      public static int multiplicar(int opc, int num1, int num2) {
        int mult;
        mult = num1 * num2;
        System.out.println("La multiplicación es: " + mult);
        return mult;
    }
      
       public static double dividir(int opc, int num1, int num2) {
        double division;
       division = num1 / num2;
       System.out.println("La división es: " + division);
        return division;
    }
}
