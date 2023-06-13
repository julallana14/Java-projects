
package Servicios;

import Entidades.Ej_formas.Circulo;
import Entidades.Ej_formas.Rectangulo;
import java.util.Scanner;

public class formasServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Circulo circulo() {
        System.out.println("------CÁLCULOS CIRCULO ------");
        System.out.println("Ingrese el diámetro del circulo");
        double diametro = leer.nextDouble();
        System.out.println("Ingrese el radio del circulo");
        double radio = leer.nextDouble();
        return new Circulo(0, 0, radio, diametro);
    }
    
    public Rectangulo rectangulo() {
        System.out.println("------CÁLCULOS RECTÁNGULO ------");
        System.out.println("Ingrese la base del rectángulo");
        double base = leer.nextDouble();
        System.out.println("Ingrese la altura del rectángulo");
        double altura = leer.nextDouble();
        return new Rectangulo(0, 0, base, altura);
    }
    
    
}
