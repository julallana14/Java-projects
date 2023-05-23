package Servicios;

import Entidades.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PaisServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    TreeSet<Pais> listaPaises;
    
    public TreeSet<Pais> crearPaises() {
        String ans;
         listaPaises = new TreeSet<>((p1,p2) -> p1.getNombre().compareTo(p2.getNombre())); //Lambda para comparar y no usar el implement en la clase
        //TreeSet<Persona> lista = new TreeSet<>(Comparator.comparing(Persona::getNombre).thenComparing(Persona::getEdad)); 
// En el caso de querer comparar mas de un atriburo se escribe de esta forma con el .thenComparing
        do {
            System.out.println("Ingrese el nombre del país");
            String name = leer.next();
            listaPaises.add(new Pais(name));
            System.out.println("¿Desea guardar otro país o desea salir? (g/s)");
            ans = leer.next();
        } while (!"s".equalsIgnoreCase(ans));
        return listaPaises;
    }
    
    public void mostrarPaises(Set <Pais> p){
        System.out.println("Lista de países:");
        for (Pais country : p) {
            System.out.println("-------------");
            System.out.println(country.getNombre());
        }
    }

    public void eliminarPais(Set<Pais> p) {
        int cont = 0;
        boolean eliminado = false;
        System.out.println("Ingrese un país a eliminar");
        String nomPais = leer.next();
         Pais p1 = new Pais(nomPais);
        
        Iterator<Pais> it = p.iterator();
        while (it.hasNext()) {
            Pais aux = it.next();
            if (aux.getNombre().equalsIgnoreCase(p1.getNombre())) {
                it.remove();
                eliminado = true;
                break;
            } 
        }

        if (!eliminado) {
            System.out.println("No se ha encontrado el país");
        } else {
            mostrarPaises(p);

            }
        }
    }

