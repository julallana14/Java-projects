
package Main;

import Dominio.Edificio;
import Entidades.Edificios.EdificioDeOficinas;
import Entidades.Edificios.Polideportivo;
import Servicios.edificioServicio;
import java.util.ArrayList;
import java.util.List;

public class MainEdificios {

    
    public static void main(String[] args) {
        edificioServicio ef = new edificioServicio();
        List<Edificio> edificios = new ArrayList();
        List<Edificio> polideportivos = new ArrayList();
        
        Polideportivo poli1 = ef.crearPoli();
        Polideportivo poli2 = ef.crearPoli();
        EdificioDeOficinas edificioOficinas1 = ef.crearEdificioDeOficinas();
        EdificioDeOficinas edificioOficinas2 = ef.crearEdificioDeOficinas();
        edificios.add(poli1);
        edificios.add(poli2);
        edificios.add(edificioOficinas1);
        edificios.add(edificioOficinas2);
        
        polideportivos.add(poli1);
        polideportivos.add(poli2);
        int techados = 0, abiertos = 0;
        
        if (poli1.getInstalacion().equalsIgnoreCase("techado")) {
            techados++;
        } else if (poli1.getInstalacion().equalsIgnoreCase("abierto")) {
            abiertos++;
        }
        
        if (poli2.getInstalacion().equalsIgnoreCase("techado")) {
            techados++;
        } else if (poli2.getInstalacion().equalsIgnoreCase("abierto")) {
            abiertos++;
        }
        
        System.out.println("------SUPERFICIE Y VOLUMEN ------");
        for (Edificio aux : edificios) {
            if (aux.equals(poli1)) {
            System.out.println("Superficie del polideportivo 1: "+aux.calcularSuperficie());
            System.out.println("Volumen del polideportivo 1: " +aux.calcularVolumen());
                System.out.println("-------------------------");
            } else if (aux.equals(poli2)){
                System.out.println("Superficie del polideportivo 2: "+aux.calcularSuperficie());
                System.out.println("Volumen del polideportivo 2: " +aux.calcularVolumen());
                System.out.println("-------------------------");
            } else if (aux.equals(edificioOficinas1)){
                System.out.println("Superficie del edificio de oficinas 1: "+aux.calcularSuperficie());
                System.out.println("Volumen del edificio de oficinas 1: " +aux.calcularVolumen());
                System.out.println("-------------------------");
            } else if (aux.equals(edificioOficinas2)){
                System.out.println("Superficie del edificio de oficinas 2: "+aux.calcularSuperficie());
                System.out.println("Volumen del edificio de oficinas 2: " +aux.calcularVolumen());
                System.out.println("-------------------------");
            }
        }
        System.out.println(" ");
        System.out.println("------POLIDEPORTIVOS------");
        System.out.println("Hay " + techados + " polideportivo(s) techados y " + abiertos + " polideportivo(s) abiertos");
        System.out.println(" ");
        System.out.println("------EDIFICIO DE OFICINAS 1 ------");
        edificioOficinas1.cantPersonas();
        System.out.println("------EDIFICIO DE OFICINAS 2 ------");
        edificioOficinas2.cantPersonas();
    }

}
