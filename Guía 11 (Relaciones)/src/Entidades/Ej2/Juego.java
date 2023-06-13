package Entidades.Ej2;

import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugador> listaJugadores;
    private Revolver revolver;

    public void llenarJuego(ArrayList<Jugador> listaJugadores, Revolver revolver) {
        this.listaJugadores = listaJugadores;
        this.revolver = revolver;
        revolver.cargarRevolver();
    }

    public void ronda() {
        boolean juegoCurso = false;
        int indice = 0;
        while (!juegoCurso) {
            Jugador player = this.listaJugadores.get(indice);
            player.disparo(this.revolver);
            if (player.isMuerto()) {
                juegoCurso = true;
                System.out.println(player.getNombre() + " está muerto");
            } else System.out.println("El jugador " + (indice+1) + " ha sobrevivido");
//            if (indice < listaJugadores.size()) {
//                indice++;
//            } else {
//                indice = 0;
//            }
            indice = (indice +1) % listaJugadores.size();
        }

    }
}
