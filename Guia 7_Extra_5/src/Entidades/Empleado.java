
package Entidades;

import java.util.Scanner;

public class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    Scanner leer = new Scanner(System.in);
    
    public void calcularAumento(){
        double aumento, por;
        System.out.println("Ingrese su edad");
        edad = leer.nextInt();
        System.out.println("Ingrese su salario actual");
        salario = leer.nextInt();
        if (edad > 30) {
            aumento = 15 * salario / 100;
            salario += aumento;
            por = 15;
        } else {
            aumento = 5 * salario / 100;
            salario += aumento;
            por = 5;
        }
        System.out.println("Su salario con el aumento de " + por + "%" + "es de: " + salario);
    }
    
}
