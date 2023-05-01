/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e6_ejextra_1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class E6_ejExtra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int min, dias, horas;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los minutos para saber los días y horas");
        min = leer.nextInt();
        horas = min / 60;
        dias = horas / 24;
        if (horas >= 24) {
            System.out.println("dias " + dias);
            System.out.println("horas " + horas%24);
        } 
        
    }
    
}
