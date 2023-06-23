package Main;

import Entidades.DivisionNumero;
import java.util.Scanner;

public class MainDivisionNumero {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        DivisionNumero ds = new DivisionNumero();
        System.out.println("Ingrese dos números");
        String num_a = leer.next();
        String num_b = leer.next();
        ds.convertirNum(num_a, num_b);

    }

}
