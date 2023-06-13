
package Entidades.Ej_cine;

import java.util.List;

public class Cine {

    private Pelicula pelicula;
    private Sala sala;
    private int precio;
    private List <Espectador> espectadores;

    public Cine() {
    }

    public Cine(Pelicula pelicula, Sala sala, int precio, List<Espectador> espectadores) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.precio = precio;
        this.espectadores = espectadores;
    }


    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }


    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public List<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(List<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

   
    
    
}
