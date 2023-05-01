/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Persona {
    public class NombreClase{
        public String nombre;
        public String apodo;
        public int edad;
        public String pais;
        public Date nacimiento;

        public NombreClase(String nombre, String apodo, int edad, String pais, Date nacimiento) {
            this.nombre = nombre;
            this.apodo = apodo;
            this.edad = edad;
            this.pais = pais;
            this.nacimiento = nacimiento;
        }
        
    }
}
