
package Entidad;

import java.util.Scanner;

public class Operacion {
    private int num1;
    private int num2;
    Scanner leer = new Scanner(System.in);

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
   
    public Operacion() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

  public void crearOperacion (){
      System.out.println("Ingrese los dos números");
      num1 = leer.nextInt();
      num2 = leer.nextInt();
  }
public int sumar(){
    int suma = num1 + num2;
    System.out.println("Sumar: " + suma);
    return suma;
}
    public int restar(){
        int resta = num1 - num2;
        System.out.println("Resta: " + resta);
        return resta;
    }
    public int multiplicar(){
        int multi;
        if (num1 != 0 && num2 != 0) {
            multi = num1 * num2;
            System.out.println("Multiplicación: " + multi);
        } else {
            multi = 0;
            System.out.println("Error");
        }
        return multi;
    }
    public int dividir(){
        int division;
        if (num1 != 0 && num2 != 0) {
            division = num1 / num2;
            System.out.println("División: " + division);
        } else {
            division = 0;
            System.out.println("Error");
        }
        return division;
    }
}
