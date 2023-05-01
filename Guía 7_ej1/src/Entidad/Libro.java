/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Libro {
    Scanner leer = new Scanner(System.in);
    public int ISBN;
    public String titulo;
    public String autor;
    public int páginas;

     public Libro() {
    }
    public Libro(int ISBN, String titulo, String autor, int páginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.páginas = páginas;
    }

    
    public void cargar(){
       System.out.println("Ingrese el ISBN");
       this.ISBN = leer.nextInt();
       System.out.println("Ingrese el título");
       this.titulo = leer.next();
       System.out.println("Ingrese el autor");
       this.autor = leer.next();
       System.out.println("Ingrese las páginas");
       this.páginas = leer.nextInt();
         
}
    public void mostrar(){
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Páginas: " + this.páginas);
    }
}
