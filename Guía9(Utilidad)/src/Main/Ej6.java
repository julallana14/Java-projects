
package Main;

import Entidades.Curso;
import Servicios.CursoServicio;

public class Ej6 {

    
    public static void main(String[] args) {
        CursoServicio cs = new CursoServicio();
        Curso c = new Curso();
        cs.cargarAlumnos();
        cs.crearCurso(args, c);
        System.out.println("Ganancia semanal: $" + cs.calcularGananciaSemanal(c));
    }

}
