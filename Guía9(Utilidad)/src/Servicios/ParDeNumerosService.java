
package Servicios;

import Entidades.ParDeNumeros;

public class ParDeNumerosService {
public void mostrarValores(ParDeNumeros pdn){
    System.out.println("Número 1: " + pdn.getN1());
    System.out.println("Número 2: " + pdn.getN2());
}

public double devolverMayor(ParDeNumeros pdn){
    double mayor;
    if (pdn.getN1() > pdn.getN2()) {
        System.out.println("El número con mayor valor es el número 1 ");
        return mayor = pdn.getN1();
    } else {
        System.out.println("El número con mayor valor es el número 2" );
        return mayor = pdn.getN2();
    }
}

public void  calcularPotencia(ParDeNumeros pdn){
    double n1 = pdn.getN1();
    double n2 = pdn.getN2();
    int rn1 = (int) Math.round(n1);
    int rn2 = (int) Math.round(n2);
    System.out.println("Número 1 redondeado: " + rn1 + " número 2 redondeado: " + rn2);
    double  mayor, menor;
    if (rn1 > rn2) {
        mayor = rn1;
        menor = rn2;
    } else {
        mayor = rn2;
        menor = rn1;
    }
    double pot = Math.pow(mayor, menor);
    System.out.println("El resultado de elevar " + mayor + " a la potencia de " + menor + " es de: " + pot);
}

public void calculaRaiz (ParDeNumeros pdn){
    double n1 = pdn.getN1();
    double n2 = pdn.getN2();
    int rn1 = (int) Math.floor(n1);
    int rn2 = (int) Math.floor(n2);
    double  mayor, menor;
    if (rn1 > rn2) {
        mayor = rn1;
        menor = rn2;
    } else {
        mayor = rn2;
        menor = rn1;
    }
    double raiz = Math.sqrt(menor);
    System.out.println("La raíz cuadrada de " + menor + " es de: " + raiz);
}
}
