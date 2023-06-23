
package Main;

import Clases.AdivinarNumero;
import Servicios.AdivinarNumeroServicio;

public class MainAdivinar {

    
    public static void main(String[] args) {
        AdivinarNumeroServicio ans = new AdivinarNumeroServicio();
        AdivinarNumero an = new AdivinarNumero();
        ans.adivinar(an);
    }

}
