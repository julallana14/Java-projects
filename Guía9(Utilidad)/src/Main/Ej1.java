
package Main;
import Entidades.*;
import Servicios.*;
import java.util.Scanner;

public class Ej1 {

    
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Ej1_CadenaServicios cs = new Ej1_CadenaServicios();
        Ej1_Cadena c = new Ej1_Cadena();
        System.out.println("Ingrese una frase");
        c.setFrase(leer.next());
        int op;

        do {
            System.out.println("Ingrese la opcion que desea realizar");
            System.out.println("""
                                              1- Mostrar cantidad vocales
                                              2- Invertir frase
                                              3- Cuantas veces se encuentra tu letra
                                              4- Comparar longitud
                                              5- Unir frases
                                              6- Reemplazar letra A
                                              7- Contiene tu letra?
                                              8- Salir
                                               """);
            op = leer.nextInt();

            switch (op) {
                case 1:
                    cs.mostrarVocales(c);
                    System.out.println();
                    break;
                case 2:
                    cs.invertirFrase(c);
                    System.out.println();
                    break;
                case 3:
                    cs.vecesRepetido(c);
                    System.out.println();
                    break;
                case 4:
                    cs.compararLongitud(c);
                    System.out.println();
                    break;
                case 5:
                    cs.unirFrase(c);
                    System.out.println();
                    break;
                case 6:
                    cs.reemplazar(c);
                    System.out.println();
                    break;
                case 7:
                    if (cs.contiene(c)) {
                        System.out.println("La letra se encontró en la frase");
                    } else {
                        System.out.println("La letra NO se encontró en la frase");
                    }
                    System.out.println();
                    break;
                case 8:
                    System.out.println("Hasta pronto...");
                    System.out.println();
                    break;
                default:
                    System.out.println("Opcion no encontrada");
                    ;
                    System.out.println();
            }
        } while (op != 8);
    }

}
