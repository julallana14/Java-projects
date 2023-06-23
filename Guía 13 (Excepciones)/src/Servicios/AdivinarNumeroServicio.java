
package Servicios;

import Clases.AdivinarNumero;
import java.util.Scanner;


public class AdivinarNumeroServicio {
 Scanner leer = new Scanner(System.in).useDelimiter("\n");
AdivinarNumero an = new AdivinarNumero(); 
public void adivinar(AdivinarNumero an) {
        System.out.println("Adivine el número misterioso. Este está entre 1 y 500");
        int intentos = 0;
        do {
        try {
        an.setNumUsuario(leer.nextInt());
        if (an.getNumUsuario() > an.getNum()) {
            System.out.println("Incorrecto. El número misterioso es menor al número ingresado");
            intentos++;
        } else if (an.getNumUsuario() < an.getNum()) {
            System.out.println("Incorrecto. El número misterioso es mayor al número ingresado");
            intentos++;
        } else if (an.getNumUsuario() == an.getNum()){
            System.out.println("¡Felicidades! Ha adivinado el número misterioso. La cantidad de intentos fueron " + intentos);
            an.setNumAdivinado(true);
        }
        } catch (Exception e) {
            System.out.println("Lo ingresado no es un número");
            intentos++;
            an.setExcep(true);
        }
        } while (!an.isNumAdivinado() && !an.isExcep());
    }
}
