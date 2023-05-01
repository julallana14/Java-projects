/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e7.pkg8_ejguia_1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class E78_ejGuia_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        String nueva = frase2(frase);
        
        
    }
    public static String frase2(String frase){
        String newF = null, letra;
        int i, longi;
        
        longi = frase.length();
        for (i = 0; i < longi; i++){
            letra = frase.substring(i, i+1);
            newF = " ";
            switch (letra) {
                case "a":
                    newF = newF.concat("@");
                    break;
                case "e":
                    newF = newF.concat("#");
                    break;
                case"i":
                    newF = newF.concat("$");
                    break;
                case "o":
                    newF = newF.concat("%");
                    break;
                case "u":
                    newF = newF.concat("*");
                    break;
                default:
                    newF = newF.concat(letra);
                    break;
              
            }
            System.out.print(newF);
        }
        return newF;
    }
}
