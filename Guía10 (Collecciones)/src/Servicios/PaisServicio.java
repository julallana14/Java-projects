package Servicios;

import Entidades.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class PaisServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public TreeSet<Pais> crearPaises() {
        String ans;
        TreeSet<Pais> paises = new TreeSet();
        do {
            System.out.println("Ingrese el nombre del país");
            String name = leer.next();
            paises.add(new Pais(name));
            System.out.println("¿Desea guardar otro país o desea salir? (g/s)");
            ans = leer.next();
        } while (!"s".equalsIgnoreCase(ans));
        System.out.println("Lista de países:");
        for (Pais country : paises) {
            System.out.println("-------------");
            System.out.println(country);
        }
        return paises;
    }

    public void eliminarPais(TreeSet<Pais> paises) {
        Iterator<Pais> it = paises.iterator();
        int cont = 0;
        System.out.println("Ingrese un país a eliminar");
        String p = leer.next();
        while (it.hasNext()) {
            Pais aux = it.next();
            if (aux.getNombre().equalsIgnoreCase(p)) {
                it.remove();
            } else {
                cont++;
            }
        }

        if (cont == paises.size()) {
            System.out.println("No se ha encontrado el país");
        } else {
            for (Pais country : paises) {
                System.out.println("-------------");
                System.out.println(country);

            }
        }
    }
}
