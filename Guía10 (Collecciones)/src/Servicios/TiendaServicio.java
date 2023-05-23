
package Servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
    
    public void agregarProductos(HashMap<String, Double> productos){
//        String ans;
//        do {
        System.out.println("Ingrese el nombre del producto");
        String nom = leer.next();
        System.out.println("Ingrese el precio");
        Double precio = leer.nextDouble();
        productos.put(nom,precio);
//            System.out.println("¿Desea agregar otro producto? (s/n)");
//            ans = leer.next();
//        } while (!"n".equalsIgnoreCase(ans));
    }
    
    public void modificarPrecio(Map<String, Double> productos){
        System.out.println("Ingrese el nombre del producto que quiere modificar");
        String llave = leer.next();
        if (productos.containsKey(llave)) {
            System.out.println("Ingrese el nuevo precio");
            double nuevoPrecio = leer.nextDouble();
            productos.put(llave, nuevoPrecio);
        }
            else  System.out.println("El producto no se encuentra en la lista");
    }
    
    public void eliminarProducto (HashMap productos){
        System.out.println("Ingrese el nombre del producto a eliminar");
        String llave = leer.next();
        if (productos.containsKey(llave)) {
            productos.remove(llave);
        } else  System.out.println("El producto no se encuentra en la lista");
    }
    
    public void mostrarProductos(Map<String, Double> productos){
        for (Map.Entry<String, Double> aux : productos.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
            System.out.println("Producto: " + key);
            System.out.println("Precio" + value);
        } 
    }
}
