
package Servicios;

import Entidades.Estudiante;
import java.util.Scanner;


public class EstudianteServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
    public Estudiante crearEst(){
        System.out.println("Ingrese el nombre del estudiante");
        String nombre = leer.next();
        System.out.println("Ingrese la nota final del estudiante");
        double nota = leer.nextDouble();
        return new Estudiante(nombre, nota);
    }
}
