
package Servicios;

import Entidades.Persona;
import java.util.Scanner;
import java.util.Date;

public class PersonaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
public Persona crearPersona(){
    System.out.println("Ingrese el nombre de la persona");
    String nom = leer.next();
    System.out.println("Ingrese la fecha de nacimiento: día, mes y año");
    int dia = leer.nextInt();
    int mes = leer.nextInt();
    int año = leer.nextInt();
    Date fechaNacimiento = new Date(año-1900,mes-1,dia);
    System.out.println(fechaNacimiento);
    return new Persona(nom, fechaNacimiento);
}

public int calcularEdad(Persona p){
   Date fechaAct = new Date();
   int dif = fechaAct.getYear() - p.getNacimiento().getYear();
    System.out.println("Su edad es: " + dif);
    return dif;
}

public boolean menorQue(Persona p){
    System.out.println("Ingrese una edad para comprobar si la persona es menor al número ingresado");
    int num = leer.nextInt();
    return calcularEdad(p) < num;
}

public void mostrar(Persona p){
    System.out.println("Nombre: " + p.getNombre());
    System.out.println("Fecha de nacimiento: " + p.getNacimiento());
    System.out.println("Edad: " + calcularEdad(p));
}
}

