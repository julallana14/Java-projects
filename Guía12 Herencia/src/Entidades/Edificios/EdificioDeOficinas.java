
package Entidades.Edificios;

import Dominio.Edificio;

public class EdificioDeOficinas extends Edificio{
private int numOficinas;
private int cantPersonasxOficina;
private int numPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numOficinas, int cantPersonasxOficina, int numPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.cantPersonasxOficina = cantPersonasxOficina;
        this.numPisos = numPisos;
    }

    public EdificioDeOficinas(int numOficinas, int cantPersonasxOficina, int numPisos) {
        this.numOficinas = numOficinas;
        this.cantPersonasxOficina = cantPersonasxOficina;
        this.numPisos = numPisos;
    }

    @Override
    public double calcularSuperficie() {
        return largo * ancho;
    }

    @Override
    public double calcularVolumen() {
        return alto * largo * ancho;
    }
    public void cantPersonas() {
        int personasxPiso = cantPersonasxOficina;
        System.out.println("La cantidad de personas que entran por oficina es de: " + cantPersonasxOficina);
        int personasTotalEdificio = cantPersonasxOficina * numPisos;
        System.out.println("La cantidad de personas que entran en total en el edificio es de: " + personasTotalEdificio);
    }
    

}
