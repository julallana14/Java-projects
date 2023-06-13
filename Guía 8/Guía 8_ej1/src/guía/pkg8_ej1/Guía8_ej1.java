
package guía.pkg8_ej1;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;
import java.util.Scanner;


public class Guía8_ej1 {

    
    public static void main(String[] args) {
         CuentaBancariaServicio cbs = new CuentaBancariaServicio();
         CuentaBancaria cb = cbs.crearCuenta();
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         int opc;
        
         do {
        System.out.println("----------MENÚ----------");
        System.out.println("1- Ingresar dinero");
        System.out.println("2- Retirar dinero ");
        System.out.println("3- Extracción rápida");
        System.out.println("4- Consultar saldo");
        System.out.println("5- Consultar datos");
        System.out.println("6- Salir");
            opc = leer.nextInt();
             switch (opc) {
                 case 1:
                     cbs.ingresarDinero(cb);
                     break;
                 case 2:
                     cbs.retirar(cb);
                     break;
                 case 3:
                     cbs.extraccionRapida(cb);
                     break;
                 case 4:
                     cbs.consultarSaldo(cb);
                     break;
                 case 5:
                     cbs.consultarDatos(cb);
                     break;
                 case 6:
                     System.out.println("Saliendo...");
                     break;
                 default:
                     System.out.println("Respuesta no válida");
                     break;
             }
            
        } while (opc != 6);
        

    }
    
}
