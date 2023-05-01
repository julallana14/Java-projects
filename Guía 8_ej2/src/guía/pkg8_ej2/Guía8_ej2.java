
package guía.pkg8_ej2;

import Entidades.Cafetera;
import Servicios.CafeteraServicio;
import java.util.Scanner;

public class Guía8_ej2 {

    public static void main(String[] args) {
        Cafetera caf = new Cafetera();
        CafeteraServicio cs = new CafeteraServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int opc;
        do {
            System.out.println("---------- MENÚ ----------");
        System.out.println("1. Llenar cafetera");
        System.out.println("2. Servir taza");
        System.out.println("3. Vaciar cafetera");
        System.out.println("4. Agregar café");
        System.out.println("5. Salir");
            opc = leer.nextInt();
        switch (opc) {
            case 1:
                cs.llenarCafetera(caf);
                break;
            case 2:
                cs.servirTaza(caf);
                break;
            case 3:
                cs.vaciarCafetera(caf);
                break;
            case 4:
                cs.agregarCafe(caf);
                break;
            case 5:
                break;
            default:
                System.out.println("Ingrese una opción correcta");
                break;
        }
        } while (opc != 5);
        
       
    }
    
}
