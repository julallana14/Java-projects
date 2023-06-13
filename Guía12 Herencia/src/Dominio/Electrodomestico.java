package Dominio;

import java.util.Scanner;

public class Electrodomestico {

    protected double precio = 1000;
    protected String color;
    protected String consumoEnergetico;
    protected double peso;

    public Electrodomestico() {

    }

    public Electrodomestico(double precio, String color, String consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void comprobarConsumoEnergetico() {
        String[] letras = {"A", "B", "C", "D", "E", "F"};
        boolean letraCorrecta = false;
        for (int i = 0; i < 6; i++) {
            if (consumoEnergetico.equals(letras[i])) {
                letraCorrecta = true;
            }
        }
        if (!letraCorrecta) {
            consumoEnergetico = "F";
        }
    }

    public void comprobarColor() {
        String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
        boolean colorCorrecto = false;
        for (int i = 0; i < 5; i++) {
            if (color.equalsIgnoreCase(colores[i])) {
                colorCorrecto = true;
            }
        }
        if (!colorCorrecto) {
            color = "blanco";
        }
    }

    public void crearElectrodomestico() {
//        String colorUsuario = leer.next();
//        color = colorUsuario;
        comprobarColor();
      //  System.out.println("color: "+color);
        
//        System.out.println("Ingrese el consumo energético con una letra entre A y F");
//        String letra = leer.next();
//        consumoEnergetico = letra;
        comprobarConsumoEnergetico();
      //  System.out.println("consumo " +consumoEnergetico);
        
//        System.out.println("Ingrese el peso");
//        double pesoUsuario = leer.nextDouble();
//        peso = pesoUsuario;
       // System.out.println("peso "+peso);
    }
    
    public void precioFinal() {
        switch (consumoEnergetico) {
            case "A" -> precio += 1000;
            case "B" -> precio += 800;
            case "C" -> precio += 600;
            case "D" -> precio += 500;
            case "E" -> precio += 300;
            case "F" -> precio += 100;
        }
        if (peso >= 1 && peso <= 19 ) {
            precio += 100;
        } else if (peso >= 20 && peso <= 49) {
            precio += 500;
        } else if (peso >= 50 && peso <= 79){
            precio += 800;
        } else if (peso > 80){
            precio += 1000;
        }
         System.out.println("El precio final es de $ " + precio);
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
    

}
