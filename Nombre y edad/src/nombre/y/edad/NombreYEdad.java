/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombre.y.edad;

/**
 *
 * @author Usuario
 */
public class NombreYEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = "Julieta";
        int edad = 23;
        System.out.println("Mi nombre es " + nombre);
        System.out.println("Mi edad es " + edad);
        
        int num1,num2,suma;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        num1 = leer.nextlnt();
        System.out.println("Ingrese el segundo número");
        num2 = leer.nextlnt();
        suma = num1 + num2;
        System.out.println("La suma de los primeros dos números es de: " + suma);
    }
    
}
