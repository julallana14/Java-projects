
package guia7_ej2;

import Entidad.Circunferencia;
import java.util.Scanner;

public class Guia7_ej2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       Circunferencia c1 = new Circunferencia();
       c1.crearCircunferencia();
       c1.Area();
       c1.perimetro();
    }
    
}
