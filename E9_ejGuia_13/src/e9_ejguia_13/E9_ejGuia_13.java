/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e9_ejguia_13;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class E9_ejGuia_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String equipo[ ] = new String[5];
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++){
            System.out.println("Introduzca el nombre del miembro " + i + " del equipo");
            equipo [i] = leer.nextLine();
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("El nombre del miembro  " + i + " es: " + equipo[i] );
        }
    }
    
}
