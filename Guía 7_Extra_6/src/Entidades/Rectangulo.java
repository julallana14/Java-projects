
package Entidades;

public class Rectangulo {
    private int lado1;
    private int lado2;
    
    public double calcularArea(){
        double area;
        area = lado1 * lado2;
        return area;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

}
