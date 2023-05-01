
package Entidades;

import java.util.Scanner;


public class Cuenta {
    public int saldo;
    public String titular;
    Scanner leer = new Scanner(System.in);
    
    public int retirarDinero(){
        saldo = 10000;
        titular = "Julieta Lallana";
        System.out.println("¿Cuánto dinero desea retirar?");
        int dinero = leer.nextInt();
        saldo -= dinero;
        System.out.println("Su saldo es de: " + saldo);
        return saldo;
    }
}
