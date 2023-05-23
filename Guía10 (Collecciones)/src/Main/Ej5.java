
package Main;

import Entidades.Pais;
import Servicios.PaisServicio;
import java.util.TreeSet;

public class Ej5 {

    
    public static void main(String[] args) {
        PaisServicio ps = new PaisServicio();
        TreeSet<Pais> lista = ps.crearPaises();
        ps.mostrarPaises(lista);
        ps.eliminarPais(lista);
    }

}
