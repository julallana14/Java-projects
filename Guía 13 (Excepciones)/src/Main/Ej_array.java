package Main;

import Entidades.Ej2_array;

public class Ej_array {

    public static void main(String[] args) {
        Ej2_array v = new Ej2_array();
        
        try {
            System.out.println("El valor de la posición 4 es: " + v.getVector()[4]);
        } catch (Exception e) {
            System.out.println("El índice 4 no existe");
        }
    }

}
