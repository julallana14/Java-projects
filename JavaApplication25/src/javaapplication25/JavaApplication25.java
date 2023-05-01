/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JavaApplication25 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
        int num1, num2, opcion;
        String respuesta = null;
        boolean salir = false;

        do {System.out.println("Ingrese 2 numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        System.out.println("MENU");

        System.out.println("Ingrese 1 para sumarlos");
        System.out.println("Ingrese 2 para restarlos");
        System.out.println("Ingrese 3 para multiplicarlos");
        System.out.println("Ingrese 4 para dividirlos");
        System.out.println("Ingrese 5 para salir del programa");

        opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("La suma de los numeros es " + (num1 + num2));
                break;
            case 2: 
                System.out.println("La resta de los numeros es " + (num1 - num2));
                break;
            case 3: 
                System.out.println("La multiplicacion de los numeros es " + (num1 * num2));
                break;
            case 4:
                System.out.println("La division de los numeros es " + (num1 / num2));
                break;
            case 5: 
                System.out.println("Esta seguro que desea salir del Programa?");
                respuesta = leer.next();
                if ("S".equals(respuesta) || "s".equals(respuesta)){
                    salir = true;
                    System.out.println("Saliendo del Programa");
                }
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;

        } while (!"S".equals(respuesta));


    
    
    
}
