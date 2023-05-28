
package Entidades.Ej2;

public class Revolver {
private int posicionActual;
private int posicionBala;

    public void cargarRevolver() {
        this.posicionActual = (int) Math.random()*8+1;
        this.posicionBala = (int) Math.random()*8+1;
    }

    public boolean matar(){
        return this.posicionActual == this.posicionBala;
    }
    
    public void siguienteBala() {
        this.posicionActual++;
        if (this.posicionActual > 8) {
            this.posicionActual = 1;
        }
    }

//    @Override
//    public String toString() {
//        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionBala=" + posicionBala + '}';
//    }
  

}
