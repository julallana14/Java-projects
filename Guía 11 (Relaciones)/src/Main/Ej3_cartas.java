
package Main;

import Entidades.Ej3_cartas.Baraja;
import Entidades.Ej3_cartas.Carta;
import Servicios.BarajaServicio;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej3_cartas {

    
    public static void main(String[] args) {
        BarajaServicio bs = new BarajaServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Baraja b = new Baraja();
        ArrayList <Carta> card = bs.crearBaraja(b);
        int opc = 0;
        do {
            System.out.println("""
                               -------MENÚ-------
                               1. Barajar
                               2. Mostrar siguiente carta
                               3. Mostrar las cartas disponibles
                               4. Dar cartas
                               5. Mostrar cartas que ya salieron de la baraja
                               6. Mostrar baraja completa
                               7. Salir
                               """);
            opc = leer.nextInt();
            switch (opc) {
                case 1 -> bs.barajar(b);
                case 2 -> bs.siguienteCarta(b);
                case 3 -> System.out.println(bs.cartasDisponibles(b));
                case 4 -> bs.darCartas(b);
                case 5 -> bs.cartasMonton(b);
                case 6 -> bs.mostrarBaraja(b);
                case 7 -> System.out.println("Saliendo...vuelva prontos!");
                default -> System.out.println("Ingrese una opción válida");
            }
        } while (opc != 7);
    }

}
