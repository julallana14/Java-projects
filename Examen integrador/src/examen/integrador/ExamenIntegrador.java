
package examen.integrador;

import Entidades.Estudiante;
import Servicios.EstudianteServicio;


public class ExamenIntegrador {

    
    public static void main(String[] args) {
        EstudianteServicio es = new EstudianteServicio();
        Estudiante e1 = es.crearEst();
        Estudiante e2 = es.crearEst();
        Estudiante e3 = es.crearEst();
        Estudiante e4 = es.crearEst();
        Estudiante e5 = es.crearEst();
        Estudiante e6 = es.crearEst();
        Estudiante e7 = es.crearEst();
        Estudiante e8 = es.crearEst();
        
        Estudiante ar [] = {e1, e2, e3, e4 ,e5, e6, e7, e8};
        
        double notas = 0;
        int cont = 0;
        //con el prox for saco la suma de todas las notas para desp sacar el promedio
        for (int i = 0; i < 8; i++) {
            notas += ar[i].getNota();
        }
        
        double promedio = notas / 8;
        System.out.println("El promedio de notas del curso es de: " + promedio + "%");
       
         String nom [] = new String[8];
         //ahora relleno otro vector solo con los nombres de esos alumnos cuya nota es superior al promedio y lo muestro
        System.out.println("Lista de alumnos cuya nota final es superior al promedio");
         for (int i = 0; i < 8; i++) {
             if (ar[i].getNota() > promedio) {
            nom[i] = ar[i].getNombre();
                 System.out.println(nom[i]);
             }
        }
 
        
    }
    
}
