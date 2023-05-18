
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlumnoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
     
    public List<Alumno> crear(){
        List <Alumno> al = new ArrayList();
        String ans = " ", nom;
        int n;
        do {
            System.out.println("Ingrese el nombre del alumno ");
            nom = leer.next();
            List <Integer>notas = new ArrayList();
            System.out.println("Ingrese las 3 notas");
            for (int i = 0; i < 3; i++) {
                n = leer.nextInt();
                notas.add(n);
            }
            al.add(new Alumno (nom, notas));
            System.out.println("¿Desea crear otro alumno? (s/n)");
            ans = leer.next();
        } while (!"n".equalsIgnoreCase(ans));
        return al;
}
    
    public void notaFinal(List <Alumno> al){
        System.out.println("Ingrese el nombre del alumno para calcular la nota final");
        String nombre = leer.next();
        double notaF = 0;
        for (Alumno aux : al) {
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                for (Integer nota : aux.getNotas()) {
                    notaF+= nota;
                }
            }
        }
        System.out.println("La nota final de " + nombre + " es: " + notaF / 3);
    }
}
