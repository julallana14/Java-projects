
package Entidades.Ej_puerto;

import Dominio.Barco;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Alquiler {
private String nombre;
private int dni;
private LocalDate fechaAlquiler;
private LocalDate fechaDevolucion;
private int posicionAmarre;
private Barco tipoDeBarco;

    public Alquiler(String nombre, int dni, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicionAmarre, Barco tipoDeBarco) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.tipoDeBarco = tipoDeBarco;
    }

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getTipoDeBarco() {
        return tipoDeBarco;
    }

    public void setTipoDeBarco(Barco tipoDeBarco) {
        this.tipoDeBarco = tipoDeBarco;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }
    
    
    public LocalDate crearFecha() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("ddmmyyyy");
        //String fecha = leer.next();
        LocalDate fechaFormato;
       fechaFormato = LocalDate.parse("21062023", formato);
        return fechaFormato;
    }
    
}
