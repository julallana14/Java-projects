
package Entidades.Ej_formas;

import Interfaces.calculosFormas;


public class Rectangulo implements calculosFormas {
private double area;
private double perimetro;
private double base;
private double altura;

    public Rectangulo(double area, double perimetro, double base, double altura) {
        this.area = area;
        this.perimetro = perimetro;
        this.base = base;
        this.altura = altura;
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

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
       return area =  base * altura;
    }

    @Override
    public double calcularPerimetro() {
         return perimetro =(base + altura) * 2;
    }

   


}
