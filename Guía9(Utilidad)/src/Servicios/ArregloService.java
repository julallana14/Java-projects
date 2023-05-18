
package Servicios;

import java.util.Arrays;

public class ArregloService {
public void inicializarA(double  vA[]){
    for (int i = 0; i < 50; i++) {
        Arrays.fill(vA,i,50,(Math.random()*20));
    }
}
public void inicializarB(double  vB[]){
    for (int i = 0; i < 20; i++) {
        Arrays.fill(vB,i,20,(Math.random()*20));
    }
}

public void mostrarA(double vA[]){
        System.out.println("-------Vector A-------");
    for (int i = 0; i < 50; i++) {
        System.out.println("[" + vA[i] + "]");
    }
}
public void ordenarB (double vB []){
    Arrays.sort(vB);
    System.out.println("El vector B de mayor a menor:");
    for (int i = 19; i > 0; i--) {
        System.out.println("[" +vB[i] + "]");
    }
}
public void inicB(double vB [],double vA []){
    System.arraycopy(vA, 0, vB, 0, 10);
    for (int i = 10; i < 20; i++) {
        vB[i] = 0.5;
    }
    System.out.println("Vector B con las primeras 10 posiciones copiadas del vector A y las últimas 10 con valor 0.5");
    for (int i = 0; i < 20; i++) {
        System.out.println("[" + vB[i] + "]");
    }
}
}
