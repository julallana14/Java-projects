
package Entidades;

import java.util.HashMap;

public class Tienda {
private HashMap<String,Double> producto;

    public Tienda() {
        producto = new HashMap();
    }

    public Tienda(HashMap<String, Double> producto) {
        this.producto = producto;
    }

    public HashMap<String, Double> getProducto() {
        return producto;
    }

    public void setProducto(HashMap<String, Double> producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
//        sb.append("Tienda{");
        sb.append("producto=").append(producto);
        sb.append('}');
        return sb.toString();
    }

    
}
