
package Entidades;

public class Ej1_Cadena {
    private String frase;
    private int longitud;

    // int longitud = length(frase);
    public Ej1_Cadena() {
    }

    public Ej1_Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public int getLongitud() {
        return longitud;
    }
}
