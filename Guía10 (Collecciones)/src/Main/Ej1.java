
package Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ej1 {
//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
//programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
//salir, se mostrará todos los perros guardados en el ArrayList.
    
    public static void main(String[] args) {
        ArrayList<String> razas = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese razas de perro");
        int cant = 5;
        String r;
        for (int i = 0; i < cant; i++) {
            r = leer.next();
            razas.add(r);
        }
        System.out.println("Desea guardar otro perro o desea salir? (g/s)");
        String ans = leer.next();
        String ra = " ";
        if (ans.equalsIgnoreCase("g")) {
            ra = leer.next();
            razas.add(ra);
        } else  {
            for (String raza : razas) {
                System.out.println(razas);
            }
        }
        
        Iterator<String> it = razas.iterator();
        int cont = 0;
        System.out.println("Ingrese una raza a eliminar");
        String raz = leer.next();
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equalsIgnoreCase(raz)) {
            //if (it.next().equalsIgnoreCase(raz)) {
                it.remove();
            } else {
                cont++;
        }
        }
        
        for (String raza : razas) {
            System.out.println(razas);
        }
        
        if (cont > 5) {
                System.out.println("No se ha encontrado esa raza");
        }
    }

}
