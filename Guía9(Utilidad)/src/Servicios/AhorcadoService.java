
package Servicios;

import Entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void crearJuego(Ahorcado a){
        System.out.println("Ingrese la cantidad de jugadas máxima");
        a.setJugMax(leer.nextInt());
        System.out.println("Ingrese la palabra");
        String pal = leer.next();
        String [] vaux = new String[pal.length()]; 
        for (int i = 0; i < vaux.length; i++) {
        String let = pal.substring(i, i+1);
        vaux[i] = let;
        }
        a.setPalabra(vaux);
}
    
    public int buscarLetra(Ahorcado a){
        System.out.println("Ingrese una letra a buscar");
        String letra = leer.next();
        int cont = 0;
        for (int i = 0; i < a.getPalabra().length; i++) {
            if (letra.equalsIgnoreCase(a.getPalabra()[i])) {
                cont++;
            } 
        }
        if (cont > 0) {
                System.out.println("La letra pertenece a la palabra");
        } else {
                System.out.println("La letra no pertenece a la palabra");
                a.setJugMax(-1);
        }
         a.setLetrasE(cont);
         return cont;
    }
    
    public int longitud (Ahorcado a){
        System.out.println("La longitud de la palabra a buscar es: " + a.getPalabra().length);
        return a.getPalabra().length;
    }
    
    public boolean encontradas(Ahorcado a){
        System.out.println("Letras encontradas: " + a.getLetrasE());
        System.out.println("Letras faltantes: " + (a.getPalabra().length - a.getLetrasE()));
        return buscarLetra(a) > 0;
        
    }
    
    public int intentos(Ahorcado a){
        System.out.println("Le quedan " + a.getJugMax() + " intentos");
        return a.getJugMax();
    }
    
    public void juego (Ahorcado a){
        crearJuego(a);
        do {
        buscarLetra(a);
        longitud(a);
        encontradas(a);
        intentos(a);
        } while (intentos(a) < a.getJugMax() || a.getLetrasE() < a.getPalabra().length);
        if (intentos(a) > a.getJugMax()) {
            System.out.println("Se ha quedado sin intentos :(");
        } else {
        System.out.println("Ha descubierto toda la palabra!");
        Arrays.toString(a.getPalabra());
    }
        //if (a.getLetrasE() == a.getPalabra().length) {
            
        //}
    }
}
