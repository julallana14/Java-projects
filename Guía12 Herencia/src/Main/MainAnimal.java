
package Main;

import Entidades.Ej_animal.Animal;
import Entidades.Ej_animal.Caballo;
import Entidades.Ej_animal.Gato;
import Entidades.Ej_animal.Perro;

public class MainAnimal {

    
    public static void main(String[] args) {
        Animal perro1 = new Perro("Negra", "pollito", 20, "mestizo");
        perro1.Alimentarse();
        Animal perro2 = new Perro("Odie", "croquetas", 11, "mestizo");
        perro2.Alimentarse();
        Animal gato = new Gato("Gorda", "Catchow", 5, "Siames");
        gato.Alimentarse();
        Animal caballo = new Caballo("Duncan", "heno", 3, "morgan");
        caballo.Alimentarse();
        
    }

}
