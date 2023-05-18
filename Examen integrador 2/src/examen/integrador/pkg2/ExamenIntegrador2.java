
package examen.integrador.pkg2;

import Entidades.Estudiante;
import Servicios.EstudianteServicio;

public class ExamenIntegrador2 {

    
    public static void main(String[] args) {
        EstudianteServicio es = new EstudianteServicio();
//        Estudiante e1 = es.crearEst();
//        Estudiante e2 = es.crearEst();
//        Estudiante e3 = es.crearEst();
//        Estudiante e4 = es.crearEst();
//        Estudiante e5 = es.crearEst();
//        Estudiante e6 = es.crearEst();
//        Estudiante e7 = es.crearEst();
//        Estudiante e8 = es.crearEst();
        
        Estudiante ar [] = new Estudiante [8];
        for (int i = 0; i < 8; i++) {
            ar[i] = es.crearEst();
        }
        System.out.println("El promedio de notas de todo el curso es de: " + es.promedio(ar));
        es.mostrar(ar);
 
    }

}
