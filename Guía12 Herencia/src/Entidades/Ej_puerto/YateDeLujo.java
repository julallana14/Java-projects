
package Entidades.Ej_puerto;

import Dominio.Barco;

public class YateDeLujo extends Barco{
private int potencia;
private int numCamarotes;
private double modulo;

    public YateDeLujo() {
    }

    public YateDeLujo(int potencia, int numCamarotes) {
        this.potencia = potencia;
        this.numCamarotes = numCamarotes;
        this.modulo = (eslora*10) + potencia + numCamarotes;
    }

    public YateDeLujo(int potencia, int numCamarotes, int matricula, int eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.potencia = potencia;
        this.numCamarotes = numCamarotes;
        this.modulo = (eslora*10) + potencia + numCamarotes;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    public double getModulo() {
        return modulo;
    }

    public void setModulo(double modulo) {
        this.modulo = modulo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }


}
