
package Entidades.Ej_electrodomestico;

import Dominio.Electrodomestico;
import java.util.Scanner;

public class Lavadora extends Electrodomestico {
protected int carga;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Lavadora() {
    }

    public Lavadora( int carga, double precio, String color, String consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        crearElectrodomestico();
//        System.out.println("Ingrese la carga de la lavadora");
//        int cargaUsuario = leer.nextInt();
//        carga = cargaUsuario;
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
        
        if (carga > 30) {
            precio += 500;
        } 
        System.out.println("El precio final de la lavadora es de $ " + precio);
    }

    
    
    
}
