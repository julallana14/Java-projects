
package guía.pkg8_extra_2;


import Entidades.NIF;
import Servicios.NIFService;


public class Guía8_extra_2 {


    public static void main(String[] args) {
        NIFService nfs = new NIFService();
        NIF nf = nfs.crearNif();
       nfs.mostrar(nf);
    }
    
}
