
package Main;

import Entidades.Alumno;
import Servicios.AlumnoServicio;
import java.util.List;

public class Ej3 {

    
    public static void main(String[] args) {
        AlumnoServicio as = new AlumnoServicio();
        List <Alumno> lis = as.crear();
        as.notaFinal(lis);
        for (Alumno aux : lis) {
            System.out.println(aux.toString());
        }
    }

}
