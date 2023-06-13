
package Entidades.Ej3_cartas;

import java.util.ArrayList;

public class Baraja {
private ArrayList <Carta> conjuntoCartas = new ArrayList();

    public Baraja() {
    }
     public Baraja(ArrayList conjuntoCartas) {
        this.conjuntoCartas = conjuntoCartas;
    }

    public ArrayList<Carta> getConjuntoCartas() {
        return conjuntoCartas;
    }

    public void setConjuntoCartas(ArrayList<Carta> conjuntoCartas) {
        this.conjuntoCartas = conjuntoCartas;
    }
     
}
