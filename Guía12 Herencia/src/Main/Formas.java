
package Main;

import Entidades.Ej_formas.Circulo;
import Entidades.Ej_formas.Rectangulo;
import Servicios.formasServicio;

public class Formas {

    
    public static void main(String[] args) {
        formasServicio fs = new formasServicio();
        Circulo c = fs.circulo();
        System.out.println("El área del circulo es: " + c.calcularArea());
        System.out.println("El perímetro del circulo es: " + c.calcularPerimetro());
        Rectangulo r = fs.rectangulo();
        System.out.println("El área del rectángulo es: " + r.calcularArea());
        System.out.println("El perímetro del rectángulo es: " + r.calcularPerimetro());
    }

}
