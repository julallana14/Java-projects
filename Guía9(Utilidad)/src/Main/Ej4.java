
package Main;

import Servicios.FechaService;
import java.util.Date;

public class Ej4 {

    public static void main(String[] args) {
        FechaService fs = new FechaService();
        Date fn = fs.fechaNac();
        Date fa = fs.fechaActual();
        
        fs.diferencia(fa,fn);
    }

}
