
package Main;

import Entidades.Pais;
import Servicios.PaisServicio;
import java.util.TreeSet;

public class Ej5 {

    
    public static void main(String[] args) {
        PaisServicio ps = new PaisServicio();
        TreeSet<Pais> p = ps.crearPaises();
        ps.eliminarPais(p);
    }

}
