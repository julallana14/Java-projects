
package Main;

import Entidades.Pelicula;
import Servicios.PeliculaServicio;
import java.util.List;

public class Ej4 {

    
    public static void main(String[] args) {
        PeliculaServicio ps = new PeliculaServicio();
        List <Pelicula> listaPelis = ps.crear();
        System.out.println("Lista de todas las películas");
        ps.mostrarAll(listaPelis);
        System.out.println(" ");
        ps.mostrarMayorUnaHora(listaPelis);
        System.out.println(" ");
        ps.DuracMayorAMenor(listaPelis);
        System.out.println(" ");
        ps.DuracMenorAMayor(listaPelis);
        System.out.println(" ");
        ps.TituloAlfa(listaPelis);
        System.out.println(" ");
        ps.DirectorAlfa(listaPelis);
    }

}
