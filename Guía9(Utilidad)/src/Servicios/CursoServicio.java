
package Servicios;

import Entidades.Curso;
import java.util.Arrays;
import java.util.Scanner;

public class CursoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public String [] cargarAlumnos(){
            String []al = new String[5];
            for (int i = 0; i < 5; i++) {
                int n = i + 1;
                System.out.println("Ingrese el nombre del alumno " + n);
                al[i] = leer.next();
            }
            return al;
        }
    
    public void crearCurso(String [] cargarAlumnos, Curso c){
            System.out.println("Ingrese el nombre del curso");
            c.setNombreCurso(leer.next());
            System.out.println("Ingrese la cantidad de horas por día");
            c.setCantHorasxDia(leer.nextInt());
            System.out.println("Ingrese la cantidad de días por semana");
            c.setCantDiasxSem(leer.nextInt());
            System.out.println("Ingrese el turno: mañana o tarde");
            c.setTurno(leer.next());
            System.out.println("Ingrese el precio por hora");
            c.setPrecioxHora(leer.nextInt());
            c.setAlumnos(cargarAlumnos);
            System.out.println("Nombre del curso: " + c.getNombreCurso());
            System.out.println("Turno: " + c.getTurno());
            System.out.println("Cantidad de días por semana: " + c.getCantDiasxSem());
            System.out.println("Cantidad de horas por día: " + c.getCantHorasxDia());
            System.out.println("Precio por hora: " + c.getPrecioxHora());

        }
    
    public int calcularGananciaSemanal(Curso c){
        return ((c.getCantHorasxDia() * c.getPrecioxHora()) * 5) * c.getCantDiasxSem();
    }
}
