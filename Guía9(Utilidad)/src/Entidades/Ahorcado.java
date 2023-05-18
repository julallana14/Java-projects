
package Entidades;



public class Ahorcado {
//private String pal;
private String[] palabra;
private int letrasE;
private int jugMax;

    public Ahorcado() {
    }

    public Ahorcado(int letrasE, int jugMax) {
        this.letrasE = letrasE;
        this.jugMax = jugMax;
    }

    

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasE() {
        return letrasE;
    }

    public void setLetrasE(int letrasE) {
        this.letrasE = letrasE;
    }

    public int getJugMax() {
        return jugMax;
    }

    public void setJugMax(int jugMax) {
        this.jugMax = jugMax;
    }

 


}
