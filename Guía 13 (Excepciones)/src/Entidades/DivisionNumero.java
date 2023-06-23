
package Entidades;

import java.util.Scanner;

public class DivisionNumero {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void convertirNum(String num_a, String num_b) {
    int num1 = Integer.parseInt(num_a);
    int num2 = Integer.parseInt(num_b);
    double division = num1 / num2;
        System.out.println("La división es: " + division);
    }
    
}
