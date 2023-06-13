package Main;

import Entidades.Ej1.Perro;
import Entidades.Ej1.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Persona> personas = new ArrayList();
        ArrayList<Perro> perros = new ArrayList();
        Perro perroNull = new Perro();

        Persona persona1 = new Persona("Guido", "Rann", 32, 35182566, perroNull);
        Persona persona2 = new Persona("Julieta", "Lallana", 24, 41828423, perroNull);
        Persona persona3 = new Persona("Hernán", "Rann", 28, 39856741, perroNull);
        Persona persona4 = new Persona("Candela", "Lallana", 30, 34523156, perroNull);
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);

        Perro perro1 = new Perro("Chiquita", "mestiza", 5, "chico");
        Perro perro2 = new Perro("Negra", "mestiza", 15, "grande");
        Perro perro3 = new Perro("Zoe", "mestiza", 13, "mediano");
        Perro perro4 = new Perro("Odie", "mestiza", 11, "grande");
        perros.add(perro1);
        perros.add(perro2);
        perros.add(perro3);
        perros.add(perro4);
  
        for (Persona aux : personas) {
            boolean perroEncontrado = false;
            System.out.println(aux.getNombre() + ", ¿Qué perro desea adoptar?");

            for (Perro aux2 : perros) {
                System.out.println(aux2.getNombre());
            }
            String opc = leer.next();
            System.out.println(" ");

            for (Perro aux3: perros) {
                Perro perroAux = new Perro();
                
//                if (opc.equalsIgnoreCase(aux3.getNombre())) {
//                    perroEncontrado = true;
//                    if (aux3.isAdoptado()) {
//                        System.out.println("El perro ha sido adoptado");
//                    } else {
//                        aux.setPerro(aux3);
//                        aux3.setAdoptado(true);
//                        perros.remove(aux3);
//                        System.out.println("Felicitaciones! Has adoptado a " + aux3.getNombre());
//                        break;
//                    }
//                }
                
                if (opc.equalsIgnoreCase(aux3.getNombre())) {
                    if (!aux3.isAdoptado()) {
                    aux.setPerro(aux3);
                    aux3.setAdoptado(true);
                    perroAux = aux3;
                    perroAux.setAdoptado(true);
                    perros.remove(aux3);
                    break;
                    }
                } else if (perroAux.isAdoptado()) {
                    System.out.println("El nombre ingresado no se encuentra en la lista de perros o ya fue adoptado");
                } 
                
            }           
        }
                    

//        for (int i = 0; i < personas.size(); i++) {
//            System.out.println("El perro de la persona " + personas.get(i).getNombre() + " es " + personas.get(i).getPerro().toString() );
//        }

        System.out.printf("El perro de la persona %s es %s \n", personas.get(0).getNombre(), personas.get(0).getPerro().toString());
        System.out.printf("El perro de la persona %s es %s \n", personas.get(1).getNombre(), personas.get(1).getPerro().toString());
        System.out.printf("El perro de la persona %s es %s \n", personas.get(2).getNombre(), personas.get(2).getPerro().toString());
        System.out.printf("El perro de la persona %s es %s \n", personas.get(3).getNombre(), personas.get(3).getPerro().toString());
    }

}
