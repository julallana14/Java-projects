/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e6_ej_practicos_7;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class E6_ej_practicos_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena;
        int corr=0, inc=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cadena. Para terminar, escriba '&&&&&' ");
        do {
            cadena = leer.nextLine();
            if ("X".equals(cadena.substring(0,1)) && "O".equals(cadena.substring(4,5)) && 
                    !"&&&&&".equals(cadena) && cadena.length() > 0 && cadena.length() < 6){
                corr ++;
            } else if (!"&&&&&".equals(cadena)) {
                inc ++;
            }
               
        } while (!"&&&&&".equals(cadena));
       System.out.println("La cantidad de cadenas correctas es de: " + corr + "\n" +
                "La cantidad de cadenas incorrectas es de: " + inc);
       
    }
    
}
