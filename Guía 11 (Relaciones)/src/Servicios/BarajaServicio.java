package Servicios;

import Entidades.Ej3_cartas.Baraja;
import Entidades.Ej3_cartas.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BarajaServicio {
private int sig;
private List <Carta> monton = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public ArrayList crearBaraja(Baraja b) {
        Integer[] numeros = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};
        String[] palos = {"basto", "copa", "espada", "oro"};
        
            for (int i = 0; i < numeros.length; i++) {
                for (int j = 0; j < palos.length; j++) {
                    Carta carta = new Carta(palos[j], numeros[i]);
                    b.getConjuntoCartas().add(carta);
                }
            }
        return b.getConjuntoCartas();
    }

    public void barajar(Baraja baraja) {
        System.out.println("Barajando...");
        Collections.shuffle(baraja.getConjuntoCartas());
    }
    
    public void siguienteCarta(Baraja baraja) {
        if (this.sig < baraja.getConjuntoCartas().size()) {
            Carta card = baraja.getConjuntoCartas().get(sig);
            System.out.println(card);
            monton.add(card);
            baraja.getConjuntoCartas().remove(this.sig);
        } else  System.out.println("No hay más cartas ");
        
    }
    
    public int cartasDisponibles(Baraja baraja) {
        return baraja.getConjuntoCartas().size();
    }
    
    public void darCartas(Baraja baraja) {
        System.out.println("Ingrese la cantidad de cartas que desea");
        int num = leer.nextInt();
        if (num < cartasDisponibles(baraja)) {
            System.out.println("Devolviendo cartas...");
            for (int i = 0; i < num; i++) {
                siguienteCarta(baraja);
                System.out.println("-----------------");
            }
        } else System.out.println("No hay suficientes cartas");
    }
    
    public void cartasMonton(Baraja baraja) {
        if (!monton.isEmpty()) {
            System.out.println("Las cartas que ya no están en la baraja son:");
            for (Carta aux : monton) {
                System.out.println(aux);
                System.out.println("-----------------");
            }
        } else System.out.println("No ha salido ninguna carta");
    }
    
    public void mostrarBaraja(Baraja baraja) {
        System.out.println("Mostrando baraja completa...");
        for (Carta aux : baraja.getConjuntoCartas()) {
            System.out.println(aux);
            System.out.println("-----------------");
        }
    }

    
    
    
}
