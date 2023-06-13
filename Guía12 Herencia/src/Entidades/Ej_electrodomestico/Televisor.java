
package Entidades.Ej_electrodomestico;

import Dominio.Electrodomestico;
import java.util.Scanner;

public class Televisor extends Electrodomestico{
protected double resolucion;
protected boolean sintonizadorTDT;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Televisor() {
    }

    public Televisor(double resolucion) {
        this.resolucion = resolucion;
        this.sintonizadorTDT = false;
    }

    public Televisor(double resolucion, boolean sintonizadorTDT, double precio, String color, String consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor() {
        crearElectrodomestico();
//        System.out.println("Ingrese las pulgadas del televisor");
//        double pulgadas = leer.nextDouble();
//        resolucion = pulgadas;
//        System.out.println("¿El televisor tiene sintonizador TDT? (si/no)");
//        String opc = leer.next();
//        if (opc.equalsIgnoreCase("si")) {
//            sintonizadorTDT = true;
//        }
    }
    
    @Override
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
        
        if (resolucion > 40) {
            precio += (30*precio) /100;
        }
        if (sintonizadorTDT) {
            precio += 500;
        }
         System.out.println("El precio final del televisor es de $ " + precio);
    }

    @Override
    public String toString() {
        return "Televisor{" + "resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + '}';
    }

}
