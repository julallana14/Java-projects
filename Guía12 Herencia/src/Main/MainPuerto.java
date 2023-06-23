
package Main;

import Servicios.PuertoService;

public class MainPuerto {

    
    public static void main(String[] args) {
        PuertoService ps = new PuertoService();
        ps.crearFecha();
        ps.alquilarBarco();
    }

}
