
package Entidades.Edificios;

import Dominio.Edificio;

public class Polideportivo extends Edificio {
private String nombre;
private String instalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String instalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.instalacion = instalacion;
    }

    public Polideportivo(String nombre, String instalacion) {
        this.nombre = nombre;
        this.instalacion = instalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(String instalacion) {
        this.instalacion = instalacion;
    }

    

    @Override
    public double calcularSuperficie() {
        return largo * ancho;
    }

    @Override
    public double calcularVolumen() {
        return alto * largo * ancho;
    }


}
