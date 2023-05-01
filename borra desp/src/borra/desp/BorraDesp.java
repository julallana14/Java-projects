/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package borra.desp;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class BorraDesp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num1= leer.nextInt();
        System.out.println("Ingrese otro numero:");
        int num2= leer.nextInt();
        int opc;
        
        
        
            System.out.println("***MENU***\n"
                    +"1- Suma\n"
                    +"2- Resta\n"
                    +"3- Multiplicar\n"
                    +"4- Dividir\n ");
              opc= leer.nextInt();
            
            switch(opc){
                case 1:
                    int retornos = sumar(num1,num2);
                    System.out.println("La suma es"+retornos);
                    break;
                case 2:
                    int retornor =restar(num1,num2);
                    System.out.println("La resta es:"+retornor);
                    break;
                case 3:
                    int retornom=multiplicar(num1,num2);
                    System.out.println("La Multiplicacion es:"+retornom);
                    break;
                case 4:
                    double retornod=dividir(num1,num2);
                    System.out.println("La Division es:"+retornod);
                    break;
                default:
                    System.out.println("Opcion INCORRECTA!!");
             }
        
    }
    public static int sumar(int num1, int num2){
        int suma;
        suma= num1 + num2;
        return suma;
    }
     public static int restar(int num1, int num2){
        int resta;
        resta= num1 - num2;
        return resta;
    }
     public static int multiplicar(int num1, int num2){
        int multiplica;
        multiplica= num1 * num2;
        return multiplica;
    }
     public static double dividir(double num1, double num2){
        double divide;
        divide= num1 / num2;
        return divide;
    }
}
