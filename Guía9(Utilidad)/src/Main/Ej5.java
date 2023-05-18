
package Main;

import Entidades.Persona;
import Servicios.PersonaService;

public class Ej5 {

    public static void main(String[] args) {
        PersonaService ps = new PersonaService();
        Persona p = ps.crearPersona();
        ps.calcularEdad(p);
        if (ps.menorQue(p)) {
            System.out.println("La persona es menor");
        } else System.out.println("La persona es mayor");
        ps.mostrar(p);
    }

}
