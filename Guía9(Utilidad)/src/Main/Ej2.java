
package Main;

import Entidades.ParDeNumeros;
import Servicios.ParDeNumerosService;

public class Ej2 {

    
    public static void main(String[] args) {
        ParDeNumerosService pdns = new ParDeNumerosService();
        ParDeNumeros pdn = new ParDeNumeros();
        pdns.mostrarValores(pdn);
        pdns.devolverMayor(pdn);
        pdns.calcularPotencia(pdn);
        pdns.calculaRaiz(pdn);
    }

}
