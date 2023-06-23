
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");


    public Persona crearPersona() {
        System.out.println("Ingrese el nombre");
        String nombre = leer.next();
        System.out.println("Ingrese la edad");
        int edad = leer.nextInt();
        System.out.println("Ingrese el sexo: H / M / O");
        String sexo = leer.next();
        if ("H".equalsIgnoreCase(sexo) || "M".equalsIgnoreCase(sexo) || "O".equalsIgnoreCase(sexo)) {
            sexo = sexo;
        } else {
            System.out.println("Ingrese una opción correcta: H / M / O");
        }
        System.out.println("Ingrese el peso");
        double peso = leer.nextDouble();
        System.out.println("Ingrese la altura");
        double altura = leer.nextDouble();
        return new Persona (nombre, edad, sexo, peso, altura);
    }
    
    public boolean esMayorDeEdad(Persona p) {
        
        if (p.getEdad() > 17) {
            System.out.println("La persona es mayor de edad");
            return p.getEdad() > 17;
        } else {
            System.out.println("La persona es menor de edad");
            return p.getEdad() > 17;
        }
    }

    public int calcularIMC(Persona p) {
        double imc;
        imc = p.getPeso() / Math.pow(p.getAltura(), 2);
        if (imc < 20) {
            System.out.println("Esta persona está por debajo de su peso ideal");
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            System.out.println("Esta persona está en su peso ideal");
            return 0;
        } else if (imc > 25) {
            System.out.println("Esta persona tiene sobrepeso");
            return 1;
        }
        return 0;
    }
    
    
    
}
