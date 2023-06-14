
package Servicios;

import Entidades.Edificios.EdificioDeOficinas;
import Entidades.Edificios.Polideportivo;
import java.util.Scanner;

public class edificioServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Polideportivo crearPoli() {
        double anchoPoli = (Math.random()*200+100);
        double largoPoli = (Math.random()*150+100);
        double altoPoli = (Math.random()*100+50);
        System.out.println("Ingrese el nombre del polideportivo");
        String nomPoli = leer.next();
        System.out.println("Ingrese el tipo de instalación (techado/abierto)");
        String instPoli = leer.next();
        String instPoliVerificada = "";
        if (instPoli.equalsIgnoreCase("techado")) {
            instPoliVerificada = instPoli;
        } else if (instPoli.equalsIgnoreCase("abierto")){
            instPoliVerificada = instPoli;
        }
        return new Polideportivo(nomPoli, instPoliVerificada, anchoPoli, altoPoli, largoPoli);
    }
    
    public EdificioDeOficinas crearEdificioDeOficinas() {
         double anchoEdi = (Math.random()*200+100);
        double largoEdi = (Math.random()*150+100);
        double altoEdi = (Math.random()*100+50);
        System.out.println("Ingrese la cantidad de pisos del edificio de oficinas");
        int pisos = leer.nextInt();
        System.out.println("Ingrese la cantidad de personas que entran en una oficina");
        int cantPersonas = leer.nextInt();
        return new EdificioDeOficinas(pisos, cantPersonas, pisos, anchoEdi, altoEdi, largoEdi);
    }
    
}
