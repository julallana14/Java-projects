/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Raices;

/**
 *
 * @author Usuario
 */
public class RaicesServicio {
    //(b^2)-4*a*c
    public double getDiscriminante(Raices r){
        return Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC();
    }
    
    public boolean tieneRaices(Raices r){
        return getDiscriminante(r) > 0;
    }
    
    public boolean tieneRaiz(Raices r){
        return getDiscriminante(r) ==0;
    }
    
    public void obtenerRaices(Raices r){
       double r1, r2;
        if (tieneRaices(r)) {
            r1 = (-r.getB() + Math.pow((Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC()), 0.5)) / (2 * r.getA());
            r2 = (-r.getB() - Math.pow((Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC()), 0.5)) / (2 * r.getA());
            System.out.println("Solución 1: " + r1);
            System.out.println("Solución 2: " + r2);
        } else {
            System.out.println("No tiene 2 raíces");
        }
    }
    public void obtenerRaiz(Raices r){
        if (tieneRaiz(r)) {
            System.out.println("Su única solución es: " + -r.getB() / 2 * r.getA());
        }
    }
   
    public void calcular(Raices r){
        if (tieneRaices(r)) {
            obtenerRaices(r);
        }else if (tieneRaiz(r)){
            obtenerRaiz(r);
        } else {
            System.out.println("No tiene solución");
        }
    }
}
