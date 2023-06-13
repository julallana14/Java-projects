
package Main;

import Dominio.Electrodomestico;
import Entidades.Ej_electrodomestico.Lavadora;
import Entidades.Ej_electrodomestico.Televisor;
import java.util.ArrayList;
import java.util.List;


public class MainElectrodomestico {

    
    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora(37, 1000, "azul", "C", 75);
        Lavadora lavadora2 = new Lavadora(20, 1000, "rojo", "A", 50);
        Televisor televisor = new Televisor(38, true, 1000, "negro", "D", 20);
        Televisor televisor2 = new Televisor(60, false, 1000, "gris", "B", 30);
        List <Electrodomestico> electrodomesticos = new ArrayList();
        electrodomesticos.add(lavadora);
        electrodomesticos.add(lavadora2);
        electrodomesticos.add(televisor);
        electrodomesticos.add(televisor2);
        
            double precioTotal =0;
        for (Electrodomestico auxElect : electrodomesticos) {
            auxElect.precioFinal();
            precioTotal += auxElect.getPrecio();
        }
        System.out.println("El precio total de todos los electrodomésticos es de $ " + precioTotal);
    }

}
