
package Main;

import Servicios.ArregloService;

public class Ej3 {

    
    public static void main(String[] args) {
        double vA [] = new double [50];
        double vB [] = new double [20];
         ArregloService as = new ArregloService();
         as.inicializarA(vA);
         as.inicializarB(vB);
         as.mostrarA(vA);
         as.ordenarB(vB);
         as.inicB(vB, vA);
    }

}
