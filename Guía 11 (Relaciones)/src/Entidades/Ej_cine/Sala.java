
package Entidades.Ej_cine;

import java.util.List;

public class Sala {
private boolean asientoVacio = true;
private String [][] salaAsientos;
private List <Espectador> espectadores;

    public Sala() {
    }

    public Sala(boolean asientoVacio, String[][] salaAsientos, List<Espectador> espectadores) {
        this.asientoVacio = asientoVacio;
        this.salaAsientos = salaAsientos;
        this.espectadores = espectadores;
    }

    public boolean isAsientoVacio() {
        return asientoVacio;
    }

    public void setAsientoVacio(boolean asientoVacio) {
        this.asientoVacio = asientoVacio;
    }

    public String[][] getSalaAsientos() {
        return salaAsientos;
    }

    public void setSalaAsientos(String[][] salaAsientos) {
        this.salaAsientos = salaAsientos;
    }

    public List<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(List<Espectador> espectadores) {
        this.espectadores = espectadores;
    }


}
