
package Servicios;

import Entidades.NIF;
import java.util.Scanner;

public class NIFService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public NIF crearNif(){
        System.out.println("Ingrese su DNI");
        long dni = leer.nextLong();
        int resto = (int) (dni % 23);
        System.out.println("El resto es: " + resto);
        //char vectorletra [] = new char[23];
        char [] vectorletra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S','Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        //vectorletra[1] = 'R';
        //vectorletra[2] = 'W';
        //vectorletra[3] = 'A';
        //vectorletra[4] = 'G';
        //vectorletra[5] = 'M';
        //vectorletra[6] = 'Y';
        //vectorletra[7] = 'F';
        //vectorletra[8] = 'P';
        //vectorletra[9] = 'D';
        //vectorletra[10] = 'X';
        //vectorletra[11] = 'B';
        //vectorletra[12] = 'N';
        //vectorletra[13] = 'J';
        //vectorletra[14] = 'Z';
        //vectorletra[15] = 'S';
        //vectorletra[16] = 'Q';
        //vectorletra[17] = 'V';
        //vectorletra[18] = 'H';
        //vectorletra[19] = 'L';
        //vectorletra[20] = 'C';
        //vectorletra[21] = 'K';
        //vectorletra[22] = 'E';
        char nif;
        nif = vectorletra[resto];
        return new NIF(dni, nif);
    }
    
    public void mostrar(NIF nf){
        System.out.println("El NIF es: " + nf.getDni() + "-" + nf.getLetra());
    }
}
