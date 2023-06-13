
package Servicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Libros {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public ArrayList crearLista() {
        ArrayList <String> libros = new ArrayList();
        String nombre, opc;
        do {
        System.out.println("Ingrese el nombre del libro");
            nombre = leer.next();
            libros.add(nombre);
            System.out.println("¿Desea agregar otro libro? (s/n)");
            opc = leer.next();
        } while (!"n".equalsIgnoreCase(opc));
        return libros;
    }
    public void mostrar(ArrayList <String> libros) {
        for (String aux : libros) {
            System.out.println(aux);
        }
    }
    
    
}
    

