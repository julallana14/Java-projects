
package Clases;

public class AdivinarNumero {
    private int num;
    private int numUsuario;
    private boolean numAdivinado;
    private boolean excep;

  
    public AdivinarNumero() {
        this.num = (int) (Math.random()*500+1);
        this.numUsuario = 0;
        this.numAdivinado = false;
        this.excep = false;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNumUsuario() {
        return numUsuario;
    }

    public void setNumUsuario(int numUsuario) {
        this.numUsuario = numUsuario;
    }

    public boolean isNumAdivinado() {
        return numAdivinado;
    }

    public void setNumAdivinado(boolean numAdivinado) {
        this.numAdivinado = numAdivinado;
    }

    public boolean isExcep() {
        return excep;
    }

    public void setExcep(boolean excep) {
        this.excep = excep;
    }
    
//    public void adivinar() {
//        int num = (int) (Math.random()*500+1);
//        int intentos = 0;
//        int numUsuario =0;
//        boolean numAdivinado = false;
//        boolean excep = false;
//        System.out.println("Adivine el número misterioso. Este está entre 1 y 500");
//        do {
//        try {
//        numUsuario = leer.nextInt();
//        if (numUsuario > num) {
//            System.out.println("Incorrecto. El número misterioso es menor al número ingresado");
//            intentos++;
//        } else if (numUsuario < num) {
//            System.out.println("Incorrecto. El número misterioso es mayor al número ingresado");
//            intentos++;
//        } else if (numUsuario == num){
//            System.out.println("¡Felicidades! Ha adivinado el número misterioso. La cantidad de intentos fueron " + intentos);
//            numAdivinado = true;
//        }
//        } catch (Exception e) {
//            System.out.println("Lo ingresado no es un número");
//            intentos++;
//            excep = true;
//        }
//        } while (!numAdivinado && !excep);
//    }
    
}
