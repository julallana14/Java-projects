
package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PeliculaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public List<Pelicula> crear(){
        List <Pelicula> lp = new ArrayList();
        String ans;
        do {
        System.out.println("Ingrese el título de la película");
        String title = leer.next();
        System.out.println("Ingrese el director");
        String director = leer.next();
        System.out.println("Ingrese la duración");
        double duracion = leer.nextDouble();
        lp.add(new Pelicula(title, director, duracion));
            System.out.println("¿Desea crear otra película? (s/n)");
            ans = leer.next();
        } while (!"n".equalsIgnoreCase(ans));
        return lp;
    }
    
    public void mostrarAll(List <Pelicula> lp){
        for (Pelicula peli : lp) {
            System.out.println("-----------------");
            System.out.println("Título: " + peli.getTitle());
            System.out.println("Director: " + peli.getDirector());
            System.out.println("Duración: " + peli.getDuracion() + " horas");
        }
    }
    
    public void mostrarMayorUnaHora (List <Pelicula> lp){
          System.out.println("Películas cuya duración es mayor a una hora");
        for (Pelicula peli : lp) {
            if (peli.getDuracion() > 1.0) {
            System.out.println("-----------------");
            System.out.println("Título: " + peli.getTitle());
            System.out.println("Director: " + peli.getDirector());
            System.out.println("Duración: " + peli.getDuracion() + " horas");
                
            }
        }
    }
    
    public void DuracMayorAMenor(List <Pelicula> lp){
        Collections.sort(lp, (p1, p2) -> Double.compare(p2.getDuracion(), p1.getDuracion()));
        System.out.println("Películas ordenadas por su duración, de mayor a menor ");
        mostrarAll(lp);
    }
    
    public void DuracMenorAMayor(List <Pelicula> lp){
        Collections.sort(lp, (p1,p2) -> Double.compare(p1.getDuracion(), p2.getDuracion()));
        System.out.println("Películas ordenadas por su duración, de menor a mayor ");
        mostrarAll(lp);
    }
    public void TituloAlfa (List <Pelicula> lp){
        Collections.sort(lp, (p1,p2) -> p1.getTitle().compareTo(p2.getTitle()));
        System.out.println("Películas ordenadas por título alfabéticamente ");
        mostrarAll(lp);
    }
    public void DirectorAlfa (List <Pelicula> lp){
        Collections.sort(lp, (p1,p2) -> p1.getDirector().compareTo(p2.getDirector()));
        System.out.println("Películas ordenadas por director alfabéticamente ");
        mostrarAll(lp);
    }
    
}
