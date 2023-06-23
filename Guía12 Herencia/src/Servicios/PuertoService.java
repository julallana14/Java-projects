package Servicios;

import Dominio.Barco;
import Entidades.Ej_puerto.Alquiler;
import Entidades.Ej_puerto.BarcoAMotor;
import Entidades.Ej_puerto.Velero;
import Entidades.Ej_puerto.YateDeLujo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class PuertoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public LocalDate crearFecha() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("ddmmyyyy");
       // String fecha = leer.next();
       LocalDate lc;
       lc =  LocalDate.parse("21062023", formato);
        return lc;
    }

    public Alquiler crearAlquiler(Barco b) {
        System.out.println("Ingrese el nombre de la persona");
        String nom = leer.next();
        System.out.println("Ingrese el DNI");
        int dni = leer.nextInt();
        System.out.println("Ingrese la fecha del alquiler");
        LocalDate alquiler = crearFecha();
        System.out.println("Ingrese la fecha de devolución");
        LocalDate devolucion = crearFecha();
        System.out.println("Ingrese la posición de amarre");
        int posicion = leer.nextInt();
        return new Alquiler(nom, dni, alquiler, devolucion, posicion, b);

    }

    public Velero crearVelero() {
        return new Velero(40, 8596, 200, 2018);
    }
    public Barco crearBarcoAMotor() {
        return new BarcoAMotor(200, 8597, 100, 2015);
    }
    public Barco crearYateDeLujo() {
        return new YateDeLujo(500, 10, 8598, 300, 2023);
    }
    
    public double calcularAlquilerVelero(Alquiler a, Velero v) {
        long diasOcupacion = ChronoUnit.DAYS.between(a.getFechaAlquiler(), a.getFechaDevolucion());
        return diasOcupacion * v.getModulo();
    }
    
    public double calcularAlquilerBarcoAMotor(Alquiler a, BarcoAMotor bam) {
        long diasOcupacion = ChronoUnit.DAYS.between(a.getFechaAlquiler(), a.getFechaDevolucion());
        return diasOcupacion * bam.getModulo();
    }
    
    public double calcularAlquilerYateDeLujo(Alquiler a, YateDeLujo ydl) {
        long diasOcupacion = ChronoUnit.DAYS.between(a.getFechaAlquiler(), a.getFechaDevolucion());
        return diasOcupacion *ydl.getModulo();
    }
    
    
    public void alquilarBarco() {
        System.out.println("""
                           ¿Qué barco desea alquilar?
                           1- Velero
                           2- Barco a motor
                           3- Yate de lujo
                           """);
        int opc = leer.nextInt();
        switch (opc) {
            case 1:
                Velero v = crearVelero();
                Alquiler a = crearAlquiler( v);
                System.out.println("El alquiler del velero cuesta: $ "+calcularAlquilerVelero(a, v));
                
                break;
            default:
                throw new AssertionError();
        }
    }
    
    
}
