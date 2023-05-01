/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ej2 {
    public static void main(String[] args) {
        String nombre;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese su nombre");
        nombre = leer.next();
        System.out.println("Su nombre es: " + nombre);
}
}
