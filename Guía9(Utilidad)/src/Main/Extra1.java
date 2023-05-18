
package Main;

import java.util.Scanner;

public class Extra1 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String [] meses = {"enero", "febero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = meses[3];
        String mes;
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas");
            mes = leer.next();
        do {
            if (mes.equals(mesSecreto)) {
                System.out.println("¡Ha acertado!");
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes");
                mes = leer.next();
            }
        } while (!mes.equals(mesSecreto));
        System.out.println("Felicitaciones! Ha adivinado el mes secreto" );
    }
    

}
