/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía.pkg8_ej3;

import Entidades.Persona;
import Servicios.PersonaServicio;

public class Guía8_ej3 {

    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        boolean [] mayorEdad = new boolean[4];
        int [] imc = new int[4];
        //En las lineas 18,21,24 y 27 creo los objectos persona
        Persona p = ps.crearPersona();
        mayorEdad [0] = ps.esMayorDeEdad(p);
        imc [0] = ps.calcularIMC(p);
        Persona p2 = ps.crearPersona();
        mayorEdad [1] = ps.esMayorDeEdad(p2);
        imc [1] = ps.calcularIMC(p2);
        Persona p3 = ps.crearPersona();
        mayorEdad [2] = ps.esMayorDeEdad(p3);
        imc [2] = ps.calcularIMC(p3);
        Persona p4 = ps.crearPersona();
        mayorEdad [3] = ps.esMayorDeEdad(p4);
        imc [3] = ps.calcularIMC(p4);
        int deb = 0, id = 0, sob = 0;
        
        for (int i = 0; i < 4; i++) {
            if (imc [i] < 20) {
                deb += 1;
            } else if (imc [i] >= 20 && imc[i] <= 25){
                id += 1;
            } else if (imc[i] > 25){
                sob += 1;
            }
        }
        
        System.out.println("La cantidad y el porcentaje de personas debajo de su peso ideal es de: " + deb + " persona(s) = "+ deb*100/4 + "%");
            System.out.println("La cantidad y el porcentaje de personas en su peso ideal es de: " + id + " persona(s) = " + id*100/4 + "%");
            System.out.println("La cantidad y el porcentaje de personas con sobrepeso es de: " + sob + " persona(s) = " + sob*100/4 + "%");
            
            int may=0, men=0; 
            for (int j = 0; j < 4; j++) {
                if (mayorEdad[j]) {
                    may += 1;
                } else if (mayorEdad[j] == false) {
                    men += 1;
                }
            }
            
            System.out.println("La cantidad y el porcentaje de personas mayores de edad es de: " + may + " persona(s) = " + may*100/4 + "%");
            System.out.println("La cantidad  y el porcentaje de personas menores de edad es de: " + men + " persona(s) = " + men*100/4 + "%");
    } 
}
