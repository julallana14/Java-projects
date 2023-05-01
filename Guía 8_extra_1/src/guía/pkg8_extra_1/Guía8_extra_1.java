/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía.pkg8_extra_1;

import Entidades.Raices;
import Servicio.RaicesServicio;

/**
 *
 * @author Usuario
 */
public class Guía8_extra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Raices r = new Raices(1, -5, 6);
        RaicesServicio rs = new RaicesServicio();
        
        System.out.println("El discriminante es: " + rs.getDiscriminante(r));
        rs.calcular(r);
    }
    
}
