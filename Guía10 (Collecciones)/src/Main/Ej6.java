
package Main;

import Servicios.TiendaServicio;
import java.util.HashMap;
import java.util.Scanner;

public class Ej6 {

    
    public static void main(String[] args) {
        TiendaServicio ts = new TiendaServicio();
        HashMap<String, Double> tienda = new HashMap();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opc;
        do {
        System.out.println("""
                           Bienvenidos
                           Elija la opción que desee realizar:
                           1- Agregar productos a la tienda
                           2- Modificar el precio de un producto
                           3- Eliminar un producto
                           4- Mostrar todos los productos
                           5- Salir
                           """);
        opc = leer.nextInt();
            switch (opc) {
                case 1 -> ts.agregarProductos(tienda);
                case 2 -> ts.modificarPrecio(tienda);
                case 3 -> ts.eliminarProducto(tienda);
                case 4 -> ts.mostrarProductos(tienda);
                case 5 -> System.out.println("Saliendo... vuelva prontos!");
                default -> System.out.println("Esa opción no está dentro del menú");
            }
        } while (opc != 5);
    }

}
