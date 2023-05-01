
package guía.pkg7_extra_6;

import Entidades.Rectangulo;
import java.util.Scanner;

public class Guía7_Extra_6 {

    public static void main(String[] args) {
       Rectangulo rectangulo1 = new Rectangulo();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        rectangulo1.getLado1();
        rectangulo1.getLado2();
        System.out.println("Ingrese el lado 1");
       rectangulo1.setLado1(leer.nextInt());
        System.out.println("Ingrese el lado 2");
       rectangulo1.setLado2(leer.nextInt());
        System.out.println(rectangulo1.calcularArea());
    }
    
}


