
package Main;

import Entidades.Ej2.Juego;
import Entidades.Ej2.Jugador;
import Entidades.Ej2.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej2 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Juego game = new Juego();
        ArrayList <Jugador> listaPlayers = new ArrayList();
        Revolver r = new Revolver();
        String opc;
        
        System.out.println("Bienvenido al juego de la ruleta rusa!");
        do {
            System.out.println("Creando jugador...");
        Jugador player = new Jugador();
        listaPlayers.add(player);
            System.out.println("¿Desea crear otro jugador? (s/n)");
            opc = leer.next();
        } while (!"n".equalsIgnoreCase(opc));
        game.llenarJuego(listaPlayers, r);
        game.ronda();
    }
}
