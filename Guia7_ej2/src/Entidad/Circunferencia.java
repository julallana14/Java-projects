
package Entidad;

import java.util.Scanner;

public class Circunferencia {
    Scanner leer = new Scanner(System.in);
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
        this.radio = 0;
    }

    public Circunferencia() {
       
    }

    public double getRadio() {
        return radio;
    }

    public double setRadio(double radio) {
        this.radio = radio;
        return radio;
    }
    
    public void crearCircunferencia(){
        System.out.println("Ingrese el radio");
        radio = leer.nextDouble();
    }
    public double Area(){
        double area;
        area = Math.PI *radio*radio;
        System.out.println("El area es: " + area);
        return area;
    }
    public double perimetro(){
        double perimetro;
        perimetro = 2*Math.PI*radio;
        System.out.println("El perímetro es: " + perimetro);
        return perimetro;
    }
}
