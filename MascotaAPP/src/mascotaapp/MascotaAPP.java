
package mascotaapp;

import entidades.Mascota;
import java.util.Scanner;

public class MascotaAPP {

   
    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        Mascota m1 = new Mascota("Fernando Chiquito", "Chiquito", "Perro");
       
        m1.setNombre("Pepe Chiquito");
        m1.pasear(100);
        System.out.println(m1);
    }
    
}
