/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e5_ej_practicos_6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class E5_ej_practicos_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1, num2;
        int opc;
        String resp="";
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        
        do {
            System.out.println("Elija una opción" + "\n" + 
                "MENU" + "\n" +
        "1. Sumar" + "\n" +
        "2. Restar" + "\n" +
        "3. Multiplicar" + "\n" +
        "4. Dividir" + "\n" +
        "5. Salir");
            opc = leer.nextInt();
            
            switch (opc) {
                case 1:
                    System.out.println("La suma es de: " + (num1 + num2) );
                break;
                case 2:
                    System.out.println("La resta es de: " + (num1 - num2));
                break;
                case 3:
                    System.out.println("La multiplicación es de: " + (num1 * num2));
                break;
                case 4:
                    System.out.println("La división es de: " + (num1 / num2));
                break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    resp = leer.next();
                break;
                    
        }
        } while (!"S".equals(resp));
        
    }
    
}
