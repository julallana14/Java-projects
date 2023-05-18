
package Servicios;

import Entidades.Estudiante;
import java.util.Scanner;

public class EstudianteServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
public Estudiante crearEst(){
    System.out.println("Ingrese el nombre del estudiante");
    String nom = leer.next();
    System.out.println("Ingrese la nota final");
    double nota = leer.nextDouble();
    return new Estudiante(nom, nota);
}

public double  promedio(Estudiante e[]){
    double notas = 0;
    for (int i = 0; i < 8; i++) {
    notas += e[i].getNota();
    }
    double promedio = notas/8;
    
    return promedio;
}
    
public String [] mayorPromedio(Estudiante e[]){ 
        int cont = 0;
        for (int i = 0; i < 8; i++) {
            if (e[i].getNota() > promedio(e)) {
                cont++;
            }
        }
        String nom[] = new String[cont];
        for (int i = 0; i < nom.length; i++) {
            if (e[i].getNota() > promedio(e)) {
                nom[i] = e[i].getNombre();
            }
        }
        return nom;
}

public void mostrar(Estudiante e[]){
    System.out.println("Los estudiantes con una nota mayor al promedio son");
//        for (String mayorPromedio : mayorPromedio(e)) {
//            System.out.println("*" + mayorPromedio);
//        }
        for (int i = 0; i < mayorPromedio(e).length; i++) {
            System.out.println("*" + mayorPromedio(e)[i]);
    }
}
}



