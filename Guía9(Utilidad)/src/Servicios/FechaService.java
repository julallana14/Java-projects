
package Servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Date fechaNac(){
        System.out.println("Ingrese su año de nacimiento");
        int año = leer.nextInt();
        System.out.println("Ingrese su mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese su dia de nacimiento");
        int dia = leer.nextInt();
        return new Date(año-1900, mes-1, dia);
    }
    
    public Date fechaActual(){
        return new Date();     
    }
    
    public void diferencia(Date fAct, Date fnac){
        int dif = fAct.getYear() - fnac.getYear();
        System.out.println(dif);   
    }
}
