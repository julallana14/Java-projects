
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class NewClass {
    public static void main(String[] args) {
        String nombre;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su nombre");
        nombre = leer.next();
        System.out.println("Su nombre es: " + nombre);
        
    }
    
}
