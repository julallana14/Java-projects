/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {
    Cafetera caf = new Cafetera();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void llenarCafetera(Cafetera caf){
        System.out.println("Ingrese la cantidad actual");
        caf.setCantidadActual(leer.nextInt());
        caf.setCapacidadMáxima(caf.getCantidadActual());
    }
    
    public int servirTaza(Cafetera caf){
        System.out.println("Ingrese la capacidad de una taza");
        int capTaza = leer.nextInt();
        System.out.println("Ingrese la cantidad de café que desea servir en la taza de " + capTaza + "cm3");
        int cantCaf = leer.nextInt();
        int cantAc;
        
        System.out.println("Sirviendo el café....");
        if (caf.getCantidadActual() < cantCaf) {
            System.out.println("La cantidad actual de café no es suficiente para llenar la taza. Se sirvió con " + caf.getCantidadActual() + "cm3");
            caf.setCantidadActual(0);
        }else {
            System.out.println("Se ha llenado la taza");
            cantAc = caf.getCantidadActual() - cantCaf;
           caf.setCantidadActual(cantAc);
        }
        return capTaza;
    }
    
    public void vaciarCafetera(Cafetera caf){
        caf.setCantidadActual(0);
        System.out.println("Se ha vaciado la cafetera");
    }
    
    public int agregarCafe(Cafetera caf){
        System.out.println("Ingrese una cantidad de café para agregarle a la cafetera");
        int agregar = leer.nextInt();
        caf.setCantidadActual(agregar);
        System.out.println("Se ha agregado " + agregar + " de café a la cafetera");
        return agregar;
    }
}
