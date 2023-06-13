
package Main;

import Servicios.Libros;
import java.util.ArrayList;
import java.util.Scanner;

public class NewMain {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Libros libro = new Libros();
        ArrayList <String> listaLibros =  libro.crearLista();
        libro.mostrar(listaLibros);


















//creo la lista
//        ArrayList <String> libros = new ArrayList();
//        String nombre, opc;
//        
//        do {
//        System.out.println("Ingrese el nombre del libro");
//            nombre = leer.next();
//            //le agrego el nombre del libro a la lista
//            libros.add(nombre);
//            System.out.println("¿Desea agregar otro libro? (s/n)");
//            opc = leer.next();
//        } while (!"n".equalsIgnoreCase(opc));
//    
//        //muestro la lista
//        System.out.println("La lista de libros es:");
//        for (String aux : libros) {
//            System.out.println(aux);
//        }
    
    }

}
