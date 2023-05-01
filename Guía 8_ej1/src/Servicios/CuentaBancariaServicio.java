
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;


public class CuentaBancariaServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public CuentaBancaria crearCuenta(){
        System.out.println("Ingrese el número de cuenta");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese su DNI");
        long dniCliente = leer.nextLong();
        System.out.println("Ingrese su saldo actual");
        double saldoActual = leer.nextDouble();
        return new CuentaBancaria(numeroCuenta,dniCliente,saldoActual);
    }
    
    public double ingresarDinero(CuentaBancaria cb){
        System.out.println("Ingrese la cantidad de dinero a depositar");
        double deposito = leer.nextDouble();
        double total = cb.getSaldoActual() + deposito;
        cb.setSaldoActual(total);
        return deposito;
    }
    
    public double retirar(CuentaBancaria cb){
        System.out.println("Ingrese la cantidad de dinero a retirar");
        double retirar = leer.nextDouble();
        if (cb.getSaldoActual() < retirar) {
            System.out.println("No hay suficiente dinero en la cuenta para retirar ese monto. Lo máximo que se va a retirar es de: $"
                    + cb.getSaldoActual());
            cb.setSaldoActual(0);
            return retirar;
        }else {
            System.out.println("Retirando $" + retirar + "de su cuenta...");
            double total2 = cb.getSaldoActual() - retirar;
            cb.setSaldoActual(total2);
            System.out.println("Su saldo actual es de: $" + cb.getSaldoActual());
            return retirar;
        }
    }
    
    public void extraccionRapida (CuentaBancaria cb){
        System.out.println("Solo se puede extraer el 20% de su sueldo");
        double exrap = leer.nextDouble();
        if (exrap == (20*cb.getSaldoActual()) / 100) {
            System.out.println("Extrayendo el 20%...");
            double exraptot = cb.getSaldoActual() - exrap;
            cb.setSaldoActual(exraptot);
        }else {
            if (exrap > (20*cb.getSaldoActual()) / 100) {
                System.out.println("El monto es mayor al 20%");
            } else {
                System.out.println("El monto es menor al 20%");
            }
        }
    }
    
    public void consultarSaldo (CuentaBancaria cb){
        System.out.println("Su saldo actual es de: $ " + cb.getSaldoActual());
    }
    
    public void consultarDatos(CuentaBancaria cb){
        System.out.println("Su número de cuenta es: " + cb.getNumeroCuenta());
        System.out.println("Su DNI es: " + cb.getDniCliente());
        System.out.println("Su saldo actual es de: $" + cb.getSaldoActual());
    }
}
