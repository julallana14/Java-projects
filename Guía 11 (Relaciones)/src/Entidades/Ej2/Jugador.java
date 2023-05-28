
package Entidades.Ej2;

public class Jugador {
private static int id;
private String nombre;
private boolean muerto;

    public Jugador() {
        Jugador.id ++;
        this.nombre = "Jugador " + Jugador.id;
        this.muerto = false;
    }
    public boolean isMuerto() {
        return muerto;
    }

    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }

    public static int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void disparo(Revolver r) {
        if (r.matar()) {
            this.muerto = true;
        } 
        r.siguienteBala();
    }
    

}
