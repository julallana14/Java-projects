
package Servicios;
import Entidades.Ej1_Cadena;
import java.util.Scanner;

public class Ej1_CadenaServicios {
 Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void mostrarVocales(Ej1_Cadena c) {
        int voc = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            String vowel = c.getFrase().substring(i, i + 1);
            if (vowel.equalsIgnoreCase("a") || vowel.equalsIgnoreCase("e") || vowel.equalsIgnoreCase("i") || vowel.equalsIgnoreCase("o") || vowel.equalsIgnoreCase("u")) {
                voc++;
            }
        }
        System.out.println("La frase tiene " + voc + " vocales");
    }

    public void invertirFrase(Ej1_Cadena c) {
        for (int i = c.getLongitud(); i > 0; i--) {
            String vow = c.getFrase().substring(i - 1, i);
            System.out.print(vow);
        }
        System.out.println();
    }

    public void vecesRepetido(Ej1_Cadena c) {
        System.out.println("Ingrese el caracter a buscar en la frase");
        String letra = leer.next();
        int cont = 0;

        for (int i = 0; i < c.getLongitud(); i++) {
            String l = c.getFrase().substring(i, i + 1);
            if (c.getFrase().equalsIgnoreCase(l)) {
                cont++;
            }
        }
        System.out.println("La cantidad de veces que la letra " + letra + " aparece en la frase es: " + cont);
    }

    public void compararLongitud(Ej1_Cadena c) {
        System.out.println("Ingrese una nueva frase");
        String f2 = leer.next();
        System.out.println("La longitud de la frase 1 es: " + c.getLongitud());
        System.out.println("La longitud de la nueva frase: " + f2.length());
    }

    public void unirFrase(Ej1_Cadena c) {
        System.out.println("Ingrese una nueva frase");
        String f2 = leer.next();
        System.out.println(c.getFrase() + " " + f2);
    }

    public void reemplazar(Ej1_Cadena c) {
        System.out.println("Ingrese el caracter que reemplazará la vocal a");
        String car = leer.next();
        String i = c.getFrase().replaceAll("a", car);
        System.out.println("La nueva frase es: " + i);
    }

    public boolean contiene(Ej1_Cadena c) {
        System.out.println("Ingrese la letra que desea buscar en la frase");
        String letra = leer.next();
        return c.getFrase().contains(letra);
    }
}
