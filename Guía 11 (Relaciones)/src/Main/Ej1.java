
package Main;

import Entidades.Ej1.Perro;
import Entidades.Ej1.Persona;

public class Ej1 {

    
    public static void main(String[] args) {
        Persona persona1 = new Persona("Guido", "Rann", 15, 35182566);
        Persona persona2 = new Persona("Julieta","Lallana", 24, 41828423);
        Perro perro1 = new Perro("Chiquita", "mestiza", 5, "mediano");
        Perro perro2 = new Perro("Negra", "mestiza", 15, "grande");
        persona1.setPerro(perro1);
        persona2.setPerro(perro2);
//        System.out.println(persona1 + "tiene a " +perro1);
//        System.out.println("");
//        System.out.println(persona2 + "tiene a " + perro2);
System.out.printf("El perro de la persona %s es %s \n" , persona1.getNombre() , persona1.getPerro().toString());
System.out.printf("El perro de la persona %s es %s \n" , persona2.getNombre() , persona2.getPerro().toString());

    }

}
