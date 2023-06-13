
package Entidades.Ej_formas;

import Interfaces.calculosFormas;

public class Circulo implements calculosFormas {
private double area;
private double perimetro;
private double radio;
private double diametro;

    public Circulo(double area, double perimetro, double radio, double diametro) {
        this.area = area;
        this.perimetro = perimetro;
        this.radio = radio;
        this.diametro = diametro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public double calcularArea() {
        return area = (Math.pow(PI *radio, 2));
    }

    @Override
    public double calcularPerimetro() {
         return perimetro = PI * diametro;
    }


}
