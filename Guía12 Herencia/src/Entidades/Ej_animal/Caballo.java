
package Entidades.Ej_animal;

public class Caballo extends Animal {

    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
@Override
 public void Alimentarse() {
        System.out.println("El caballo " + nombre + " se alimenta de " + alimento);
    }
}
