
package Servicios;

import Entidades.Ej_cine.Cine;
import Entidades.Ej_cine.Espectador;
import Entidades.Ej_cine.Pelicula;
import Entidades.Ej_cine.Sala;
import java.util.ArrayList;
import java.util.List;

public class CineServicio {


    public List <Espectador> crearEspectadores() {
        List<String> nombresEspectadores = new ArrayList();
        List<String> apellidosEspectadores = new ArrayList();
        List<Integer> edad = new ArrayList();
        List<Integer> dineroDisponible = new ArrayList();
        nombresEspectadores.add("Julieta");
        nombresEspectadores.add("Candela");
        nombresEspectadores.add("Guido");
        nombresEspectadores.add("Hernán");
        nombresEspectadores.add("Juan");
        nombresEspectadores.add("Matías");
        
        apellidosEspectadores.add("Lallana");
        apellidosEspectadores.add("Rann");
        apellidosEspectadores.add("Martínez");
        apellidosEspectadores.add("Di María");
        apellidosEspectadores.add("Messi");
        apellidosEspectadores.add("Lo Celso");
        int valor, dinero;
        for (int i = 0; i < 48; i++) {
            valor = (int)(Math.random()*99+1);
            edad.add(valor);
        }
        for (int i = 0; i < 48; i++) {
            dinero = (int)(Math.random()*10000+1);
            dineroDisponible.add(dinero);
        }
        List <Espectador> listaEspectadores = new ArrayList();
        for (int i = 0; i < 40; i++) {
        for (String nombreaux : nombresEspectadores) {
            for (String apellidoaux : apellidosEspectadores) {
                for (Integer edadaux : edad) {
                    for (Integer dineroaux : dineroDisponible) {
                        Espectador e = new Espectador();
                        e.setNombre(nombreaux);
                        e.setApellido(apellidoaux);
                        e.setEdad(edadaux);
                        e.setDineroDisponible(dineroaux);
                        listaEspectadores.add(e);
                    }
                }
            }
        }  
        }
        return listaEspectadores;
    }
    
    public void crearCine(Cine c) {
        Pelicula peli = new Pelicula("Harry Potter and the Prisoner of Azkaban", 139, 8, "Alfonso Cuaron");
        c.setPelicula(peli);
        c.setPrecio(1000);
    }
    
     public String[][] llenarSala(Sala s, ArrayList <Espectador> listaEs, Cine c, Pelicula p) {
        //creo una matriz nueva, la lleno de los números para las filas y las letras para las columnas
         String[][] matriz = new String [8][6];
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 6; j++) {
//                matriz[i][j] = (i+1) + "A";
//            }
//        }
        s.setSalaAsientos(matriz);
        //ahora lleno esa misma matriz con los espectadores
         for (Espectador esp : listaEs) { 
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if (s.isAsientoVacio()) {
                    if (esp.getDineroDisponible() >= c.getPrecio()) {
                        if (esp.getEdad() >= p.getEdadMinima()) {
                            matriz[i][j] = "X";
                            
                        }
                    }
         } else {
                    
                }
            }
        }
         }
        
        return s.getSalaAsientos();
    }
    
    
    
    
    
}
